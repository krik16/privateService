package com.rongyi.osm.knowledge;

import java.util.List;

import javax.annotation.Resource;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.rpc.RpcException;
import com.rongyi.easy.gcc.Configurations;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.osm.listener.OSMStandbyStatus;
import com.rongyi.osm.mq.SpringAmqpSender;
import com.rongyi.osm.service.ApplicationFormServiceImpl;
import com.rongyi.osm.service.OrderDetailFormService;
import com.rongyi.osm.service.OrderEventService;
import com.rongyi.osm.service.OrderFormService;
import com.rongyi.osm.service.PaymentActionService;
import com.rongyi.osm.service.gcc.GCCSettingsService;

@Component
public class RuleProcessor extends Thread {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "ksession")
	private KieSession kSession;

	@Autowired
	private OrderFormService orderFormService;

	@Autowired
	private OrderDetailFormService orderDetailFormService;

	@Autowired
	private OrderEventService orderEventService;

	@Autowired
	private ApplicationFormServiceImpl applicationFormService;

	@Autowired
	private GCCSettingsService gccSettingsService;

	@Autowired
	private PaymentActionService paymentActionService;

	@Autowired
	private OrderUtil orderUtil;

	@Autowired
	private SessionUtil sessionUtil;
	
	@Autowired
	private SpringAmqpSender msgSender;

	@Autowired
	private ClockUpdater clockUpdater;

	@Autowired
	private OSMStandbyStatus osmStandbyStatus;

	@Resource(name="workListener")
	private SimpleMessageListenerContainer msgContainer;
	
	@Resource(name = "syncInsertListener")
	private SimpleMessageListenerContainer syncMsgInsertContainer;

	@Resource(name = "syncUpdateListener")
	private SimpleMessageListenerContainer syncMsgUpdateContainer;
	
	@Resource(name = "syncDeleteListener")
	private SimpleMessageListenerContainer syncMsgDeleteContainer;
	
	private boolean running = true;

	public void initialize() {
		try {
			Configurations conf = gccSettingsService.getLatestConfigurations();

			// 转换单位
			// 配置中的时间单位是秒，而OSM用毫秒比较方便
			conf.setApealCountMax(conf.getApealCountMax() * 1000);
			conf.setCommodityCommitWaitMax(conf.getCommodityCommitWaitMax() * 1000);
			conf.setCommodityDeliverWaitMax(conf.getCommodityDeliverWaitMax() * 1000);
			conf.setOrderCloseWaitMax(conf.getOrderCloseWaitMax() * 1000);
			conf.setPaymentWaitMax(conf.getPaymentWaitMax() * 1000);
			conf.setRefundCountMax(conf.getRefundCountMax() * 1000);
			conf.setSubOrderRefundWaitMax(conf.getSubOrderRefundWaitMax() * 1000);
			conf.setOfficialJudgementWaitMax(conf.getOfficialJudgementWaitMax() * 1000);
			conf.setCommentCloseWaitMax(conf.getCommentCloseWaitMax() * 1000);
			
			// 设置全局变量
			kSession.setGlobal("logger", LoggerFactory.getLogger("OSMLogger"));
			kSession.setGlobal("orderFormService", orderFormService);
			kSession.setGlobal("orderDetailFormService", orderDetailFormService);
			kSession.setGlobal("orderEventService", orderEventService);
			kSession.setGlobal("applicationFormService", applicationFormService);
			kSession.setGlobal("orderConfig", conf);
			kSession.setGlobal("orderUtil", orderUtil);
			kSession.setGlobal("sessionUtil", sessionUtil);
			kSession.setGlobal("msgSender", msgSender);
		} catch (RpcException e) {
			e.printStackTrace();
			logger.error(">>>>>>>>>>无法获得配置中心服务：" + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(">>>>>>>>>>Error in initializing session：" + e.getMessage());
		}

		// 读取数据库未关闭订单信息
		try {
			logger.info("Load non closed Order and OrderDetail information into working memeory...");
			loadNonClosedOrderFromDB();
			logger.info(kSession.getFactCount() + " Facts loaded!");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Load Order ：" + e.getMessage());
		}
	}

	public void run() {
		logger.info("Drools Fusion Engine is starting to fire Rules...");

		// master mode, or after master's dead converting to master mode...
		clockUpdater.initialize();
		clockUpdater.start();
	
		// shutdown the sync listener
		syncMsgInsertContainer.shutdown();
		syncMsgUpdateContainer.shutdown();
		syncMsgDeleteContainer.shutdown();
		// startup the event listener
		msgContainer.start();
		
		while (running) {
			try {
				logger.info("Engine Starting...");
				
				// Start Engine
				kSession.fireUntilHalt(new AgendaFilter() {

					public boolean accept(Match match) {
						for (Object obj : match.getObjects()) {
							if (obj instanceof UserEvent) {
								UserEvent event = (UserEvent) obj;
								if (event.isFired()) {
									return false;
								} else {
									event.setFired();
									return true;
								}
							}
						}
						return true;
					}

				});

				logger.info("Engine Stopped...");
			} catch (Exception e) {
				e.printStackTrace();
				logger.info("KieSession Failed：" + e.getMessage());
			}
		}
	}

	public void halt() {
		running = false;
		kSession.halt();
	}

	public long getCurrentTime() {
		return kSession.getSessionClock().getCurrentTime();
	}

	private void loadNonClosedOrderFromDB() {
		int range = 1000;
		int start = 0;
		int count = 0;

		do {
			List<OrderFormEntity> orderList = orderFormService.selectNonClosedOrder(start, range);
			count = orderList.size();
			for (OrderFormEntity order : orderList) {
				kSession.insert(order);
				logger.info("Loading ... [OrderNo=" + order.getOrderNo() + " Status=" + order.getStatus() + "]");

				List<OrderDetailFormEntity> orderDetailList = orderDetailFormService
						.selectOrderDetailListByParentNum(order.getOrderNo());
				for (OrderDetailFormEntity orderDetail : orderDetailList) {
					kSession.insert(orderDetail);
					logger.info("  Loading... [OrderNo=" + orderDetail.getOrderNo() + " Status="
							+ orderDetail.getStatus() + "]");
					if (orderDetail.getAppealId() != null && orderDetail.getAppealId() > 0) {
						Object obj = applicationFormService.selectById(orderDetail.getAppealId());
						kSession.insert(obj);
					}
				}
			}
			start += range;
		} while (count == range);
		// long scount = kSession.getFactCount();
		// logger.info("After loading history, the facts count is: " + scount);

		// 插入未关闭的Payment Action
		List<PaymentAction> paList = paymentActionService.getAllPA();
		if (paList != null && paList.size() > 0) {
			for (Object obj : paList) {
				kSession.insert(obj);
			}
		}
	}
}
