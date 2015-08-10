package com.rongyi.osm.knowledge;

import java.math.BigDecimal;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import net.sf.json.JSONArray;






import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rongyi.easy.malllife.common.util.JsonUtil;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.OrderEventType;
import com.rongyi.core.constant.OrderEventType.EventErrorCode;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.easy.integral.constant.ActionType;
import com.rongyi.easy.integral.constant.ItemType;
import com.rongyi.easy.integral.constant.ScoreRuleEnum;
import com.rongyi.easy.integral.vo.IntegralRecordVO;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderEventEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.osm.constant.CashCouponStatus;
import com.rongyi.osm.constant.OrderFormStatus;
//import com.rongyi.osm.constant.OsmLogEntity;
//import com.rongyi.osm.constant.OsmLogEntity;
import com.rongyi.osm.mq.SpringAmqpSender;
import com.rongyi.osm.service.ApplicationFormServiceImpl;
import com.rongyi.osm.service.OrderDetailFormService;
import com.rongyi.osm.service.OrderFormService;
import com.rongyi.osm.service.PaymentActionService;
import com.rongyi.osm.service.coupon.CouponStatusService;
import com.rongyi.osm.service.mcmc.McmcStockService;
import com.rongyi.rss.integral.IntegralService;
import com.rongyi.rss.mallshop.order.ROAOrderService;
import com.rongyi.osm.knowledge.OrderPriceResetEvent;

import net.sf.json.JSONObject;

@Component
public class OrderUtil {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "ksession")
	private KieSession kSession;

	@Autowired
	private SpringAmqpSender mSender;

	@Autowired
	private McmcStockService stockService;

	@Autowired
	private CouponStatusService couponStatusService;

	@Autowired
	private OrderFormService orderFormService;

	@Autowired
	private OrderDetailFormService orderDetailFormService;

	@Autowired
	private ApplicationFormServiceImpl applicationFormService;

	@Autowired
	private PaymentActionService paymentActionService;

	@Autowired
	private ROAOrderService roaOrderService;

	@Autowired
	private IntegralService integralService;

	/**
	 * 用于停止定时器的最大时间（2038年1月1日 00:00:00）
	 */
	private Date maxDate = DateUtil.stringToDate("2038-1-1 00:00:00");

	/**
	 * 更新现金券状态
	 *
	 * @param orderDetailList 子订单集合      
	 * @param status 新状态
	 * @return
	 */
	public boolean setCouponStatus(OrderDetailFormEntity[] orderDetailList, int status, String guideId) {
		boolean result = true;
		try {
			for (OrderDetailFormEntity orderDetail : orderDetailList) {
				String couponId = orderDetail.getCouponId();
				if (couponId == null || couponId.isEmpty()) {
					continue;
				} else {
					// 已领用 ->> 已使用
					if (!(couponStatusService.getCouponStatusByCode(couponId) == CashCouponStatus.OCCUPIED)
							&& status == CashCouponStatus.USED) {
						logger.error("现金券状态 1 -> 2 错误， Id: " + couponId + "  当前状态："
								+ couponStatusService.getCouponStatusByCode(couponId));
						result = false;
						break;
					}

					// 已使用 ->> 已领用
					if (!(couponStatusService.getCouponStatusByCode(couponId) == CashCouponStatus.USED)
							&& status == CashCouponStatus.OCCUPIED) {
						logger.error("现金券状态 2 -> 1 错误， Id: " + couponId + "  当前状态："
								+ couponStatusService.getCouponStatusByCode(couponId));
						result = false;
						break;
					}

					result = couponStatusService.setCouponStatusByCode(couponId, status, orderDetail.getOrderNo(),
							Integer.parseInt(guideId));
					if (!result)
						break;
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			result = false;
		}

		return result;
	}

	/**
	* @Title: calculateDiscount
	* @Description: 由于前端计算折扣时没有计入优惠券金额，故在修改价格时补上
	* @param  orderDetailList
	* @param  origDiscount
	* @return BigDecimal
	* @throws
	*/
	public BigDecimal calculateDiscount(OrderDetailFormEntity[] orderDetailList, BigDecimal origDiscount, OrderFormEntity order) {
		logger.info("Start to recalculateDiscount");
		BigDecimal newDiscount = new BigDecimal(origDiscount.doubleValue());
		logger.info("origDiscount value: " + origDiscount.doubleValue());
		
		for (Object entity : orderDetailList) {
			OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
			//退款的子订单优惠券不计入
			if (orderDetail.getIsRefunded().intValue() > 0)
				continue;

			String couponId = orderDetail.getCouponId();
			if (!(couponId == null || couponId.isEmpty())) {
				Double couponAmount = couponStatusService.getDiscountByCode(couponId);
				if (couponAmount != null) {
					newDiscount = newDiscount.subtract(new BigDecimal(couponAmount));
				}
			}
		}
		
		//减去积分
		if(order.getDiscountInfo().length()>0 && order.getDiscountInfo()!=null){
			Map map = JsonUtil.getMapFromJson(order.getDiscountInfo());
			if (map.get("score") != null  && Integer.parseInt(map.get("score").toString()) > 0) {
				Map<String, Object> mapObject=getMapByJson(ScoreRuleEnum.SCORE_ORDER_SUB.getCode());
				double scoreExchangeMoney= Double.parseDouble(mapObject.get("scoreExchangeMoney").toString());
				Double scoreInt = Double.parseDouble(map.get("score").toString()) * scoreExchangeMoney;
				BigDecimal score = new BigDecimal(scoreInt);
				newDiscount = newDiscount.subtract(score);
				//总价小于零的情况
				newDiscount = newDiscount.compareTo(new BigDecimal(0)) < 0 ? new BigDecimal(0) : newDiscount;
			}
		}
		
		return newDiscount;
	}

	/**
	 * 计算订单的总价 总价 = (子订单价格总和 - 折扣 - 券抵扣金额) >= 0  + 运费（运费永不打折）
	 * 子订单价格 = (子订单实价 - 券抵扣金额) >= 0
	 *
	 * @param order
	 * @param orderDetailList
	 */
	public BigDecimal calculateTotalPrice(OrderFormEntity order, OrderDetailFormEntity[] orderDetailList) {
		BigDecimal total = new BigDecimal(0);
		BigDecimal cashCouponDiscount = new BigDecimal(0); //优惠券总金额
		JSONObject jsonObject=new JSONObject();
		if(!StringUtils.isEmpty(order.getDiscountInfo())){
			 jsonObject=JSONObject.fromObject(order.getDiscountInfo());
		}
		
		// 计算子订单实际价格总和
		for (Object entity : orderDetailList) {
			OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
			BigDecimal detailTotal = orderDetail.getRealAmount();
			String couponId = orderDetail.getCouponId();
			if (!(couponId == null || couponId.isEmpty())) {
				Double couponAmount = couponStatusService.getDiscountByCode(couponId);
				cashCouponDiscount =cashCouponDiscount.add(new BigDecimal(couponAmount));
				if (couponAmount != null) {
					detailTotal = detailTotal.subtract(new BigDecimal(couponAmount));
				}
			}
			// 子单原价 - 现金券 > 0
			if (detailTotal.compareTo(new BigDecimal(0)) > 0) {
				total = total.add(detailTotal);
			}

			// 退款成功 减去退款金额
			if (orderDetail.getIsRefunded().intValue() > 0) {
				total = total.subtract(orderDetail.getRefundAmount());
			}
		}
		jsonObject.put("cashCouponDiscount", cashCouponDiscount);
		order.setDiscountInfo(jsonObject.toString());

		// 减去折扣
		if (order.getDisconntFee() != null) {
			total = total.subtract(order.getDisconntFee());
		}
		
		

		//总价小于零的情况
		total = total.compareTo(new BigDecimal(0)) < 0 ? new BigDecimal(0) : total;

		// 加上邮费
		if (order.getExpressFee() != null) {
			total = total.add(order.getExpressFee());
		}

		// 减去积分
		if(order.getDiscountInfo()!=null  && order.getDiscountInfo().length()>0){
			Map map = JsonUtil.getMapFromJson(order.getDiscountInfo());
			if (map.get("score") != null  && Integer.parseInt(map.get("score").toString()) > 0) {
				Map<String, Object> mapObject=getMapByJson(ScoreRuleEnum.SCORE_ORDER_SUB.getCode());
				double scoreExchangeMoney= Double.parseDouble(mapObject.get("scoreExchangeMoney").toString());
				Double scoreInt = Double.parseDouble(map.get("score").toString()) * scoreExchangeMoney;
				BigDecimal score = new BigDecimal(scoreInt);
				total = total.subtract(score);
				//总价小于零的情况
				total = total.compareTo(new BigDecimal(0)) < 0 ? new BigDecimal(0) : total;
			}
		}
		return total;
	}
	
	
	/**
	* C2C卖家修改价格后折扣的计算
	* 若修改价格大于原始总价，则折扣 = 0，返回false；
	* 否则，折扣 = 原始总价 - 修改价格，返回true；
	* （原始总价 = 子订单原始价格之和）
	* @param newPrice 修改价格
	* @param order 大订单
	* @param orderDetailList 子订单列表
	* @return 修改价格是否合法（不可大于原始总价）
	*/
	public boolean orderSetDiscount(BigDecimal newPrice, OrderFormEntity order,
			OrderDetailFormEntity[] orderDetailList) {
		BigDecimal totalAmount = new BigDecimal(0);
		for (OrderDetailFormEntity detail : orderDetailList) {
			totalAmount = totalAmount.add(detail.getRealAmount());
		}
		// 判断原始总价和新价格大小
		if (newPrice.compareTo(totalAmount) <= 0) {
			order.setDisconntFee(totalAmount.subtract(newPrice));
			return true;
		} else {
			order.setDisconntFee(new BigDecimal(0));
			return false;
		}
	}

	/**
	* 计算子订单佣金总和，并向tms发送待审核佣金信息
	* @param orderDetailList
	* @return
	*/
	public void postCommission(OrderFormEntity order) {
		// for c2c only
		if (order.getGuideId() == null)
			return;

		// get all order detail
		OrderDetailFormEntity[] orderDetailList = this.queryGetOrderDetailList(order.getOrderNo());

		// calc total commission
		BigDecimal total = new BigDecimal(0);
		for (OrderDetailFormEntity entity : orderDetailList) {
			if (entity.getCommodityCommission() != null) {
				total = total.add(entity.getCommodityCommission());
			}
		}

		// construct new commission event
		CommissionPostEvent commission = new CommissionPostEvent();
		commission.setOrderNo(order.getOrderNo());
		commission.setGuideId(order.getGuideId());
		commission.setCommissionAmount(total);
		commission.setBuyerId(order.getBuyerId());

		// post commission
		if (total.compareTo(new BigDecimal(0)) > 0) {
			mSender.sendEvent(commission);
			logger.info("[CommissionPostEvent] 订单: " + order.getOrderNo() + " 佣金进入审核系统: " + total + " 元");
		} else {
			logger.debug("[CommissionPostEvent] 订单: " + order.getOrderNo() + " 佣金为0");
		}
	}

	public long getCurrentTime() {
		return kSession.getSessionClock().getCurrentTime();
	}

	public Date getCurrentDate() {
		return new Date(getCurrentTime());
	}

	public Date getDateFromTime(long time) {
		return new Date(time);
	}

	public Date getDateInFuture(long interval) {
		return new Date(getCurrentTime() + interval);
	}

	public OrderEventEntity createOrderEventEntity(String orderNum, String originalStatus, String detail, String status,
			String type) {
		OrderEventEntity entity = new OrderEventEntity();
		entity.setCreateAt(getCurrentDate());
		entity.setDetail(detail);
		entity.setOrderNo(orderNum);
		entity.setOrigStatus(originalStatus);
		entity.setStatus(status);
		entity.setType(type);
		return entity;
	}

	public void orderChangeStatus(OrderFormEntity order, String nextStatus, int eventId) {
		String originalStatus = order.getStatus();
		String originalStatusRoute = order.getStatusRoute();
		StringBuffer statusRoute = new StringBuffer();

		if (originalStatusRoute != null && !originalStatusRoute.isEmpty()) {
			statusRoute.append(originalStatusRoute);
			statusRoute.append("|");
		}

		statusRoute.append("<" + originalStatus + "," + eventId + ">");

		order.setStatusRoute(statusRoute.toString());
		order.setStatus(nextStatus);
	}

	/**
	 * 用于停止定时器的最大时间（2099年12月31日）
	 *
	 * @return
	 */
	public Date getMaxDate() {
		return maxDate;
	}

	/**
	 * 停止订单计时器
	 *
	 * @param order
	 */
	public void stopOrderTimer(OrderFormEntity order) {
		if (order.getNextStatusTime() != maxDate) {
			order.setStatusHoldMs(order.getNextStatusTime().getTime() - getCurrentTime());
			order.setNextStatusTime(maxDate);
		}
	}

	/**
	 * 恢复订单计时器
	 *
	 * @param order
	 */
	public void resumeOrderTimer(OrderFormEntity order) {
		if (order.getNextStatusTime() == maxDate) {
			order.setNextStatusTime(getDateInFuture(order.getStatusHoldMs()));
		}
	}

	/**
	 * 获取最新一条退款维权记录
	 *
	 * @param appList
	 * @return
	 */
	public ApplicationFormEntity getLastRefundRefusedApplicationForm(ArrayList<ApplicationFormEntity> appList) {
		if (appList.isEmpty()) {
			return null;
		}
		ApplicationFormEntity resultApp = appList.get(0);
		for (ApplicationFormEntity app : appList) {
			if (app.getCreateAt().after(resultApp.getCreateAt())) {
				resultApp = app;
			}
		}

		return resultApp;
	}

	public <T> Collection<T> commonQuery(String query, String variable, Class<T> c, Object... args) {
		synchronized (kSession) {
			Collection<T> results = new ArrayList<T>();
			QueryResults qResults = kSession.getQueryResults(query, args);
			for (QueryResultsRow qrr : qResults) {
				@SuppressWarnings("unchecked")
				T result = (T) qrr.get(variable);
				results.add(result);
			}
			return results;
		}
	}

	public OrderFormEntity queryGetOrder(String orderNum) {
		QueryResults results = kSession.getQueryResults("getOrder", orderNum);

		for (QueryResultsRow row : results) {
			return (OrderFormEntity) row.get("order");
		}

		return null;
	}

	public OrderDetailFormEntity queryGetOrderDetail(String orderDetailNum) {
		QueryResults results = kSession.getQueryResults("getOrderDetail", orderDetailNum);

		for (QueryResultsRow row : results) {
			return (OrderDetailFormEntity) row.get("orderDetail");
		}

		return null;
	}

	public OrderDetailFormEntity[] queryGetOrderDetailList(String orderNum) {
		QueryResults results = kSession.getQueryResults("getOrderDetailList", orderNum);

		if (results.size() == 0) {
			return new OrderDetailFormEntity[0];
		}

		OrderDetailFormEntity[] list = new OrderDetailFormEntity[results.size()];
		int i = 0;
		for (QueryResultsRow row : results) {
			list[i] = (OrderDetailFormEntity) row.get("orderDetail");
			i++;
		}

		return list;
	}

	public ApplicationFormEntity queryGetApplication(Integer appId) {
		QueryResults results = kSession.getQueryResults("getApplication", appId);

		for (QueryResultsRow row : results) {
			return (ApplicationFormEntity) row.get("application");
		}

		return null;
	}

	public PaymentAction queryPaymentAction(String orderNum, String orderDetailNum) {
		QueryResults results = kSession.getQueryResults("getPaymentAction", orderNum, orderDetailNum);

		for (QueryResultsRow row : results) {
			return (PaymentAction) row.get("action");
		}

		return null;
	}

	/**
	 * 发送事件给指定的组件
	 *
	 * @param event 待发送事件
	 */
	public void sendEvent(BaseEvent event) {
		event.setTimestamp(getCurrentTime());
		mSender.sendEvent(event);
	}

	/**
	* 发送mq响应消息
	*
	* @param event 响应时间
	* @param state 响应ErrorCode
	* @param message 响应消息文字
	*/
	public void sendResponse(UserEvent event, int state, String message) {
		sendEvent(event.buildResponseEvent(state, message));
	}

	public void sendCheckedResponse(UserEvent event, String requiredOrderStatus) {
		int state;
		OrderFormEntity order = queryGetOrder(event.getOrderNo());

		if (order == null) {
			state = EventErrorCode.REQUEST_ORDER_NOT_EXITS;
		} else if (event.getType().equals(OrderEventType.PLACE_ORDER)) {
			// 买家下单, 订单居然已经存在了？错误！
			state = EventErrorCode.REQUEST_ORDER_EXISTS;
		} else if (!order.getStatus().equals(requiredOrderStatus)) {
			state = EventErrorCode.REQUEST_ORDER_INVALID_STATUS;
		} else if (getCurrentTime() > order.getNextStatusTime().getTime()) {
			state = EventErrorCode.REQUEST_TIMEOUT;
		} else {
			state = EventErrorCode.FAILED;
		}

		sendResponse(event, state, getErrorCodeName(state));
	}

	public void sendCheckedResponse(UserEvent event, String[] requiredOrderStatus, String[] requiredOrderDetailStatus) {
		int state = EventErrorCode.FAILED;
		OrderFormEntity order = queryGetOrder(event.getOrderNo());

		if (order == null) {
			state = EventErrorCode.REQUEST_ORDER_NOT_EXITS;
		} else {
			OrderDetailFormEntity orderDetail = queryGetOrderDetail(event.getOrderItemNo());
			if (orderDetail == null) {
				state = EventErrorCode.REQUEST_ORDERDETAIL_NOT_EXITS;
			} else {
				boolean foundError = false;

				if (requiredOrderStatus != null && requiredOrderStatus.length > 0) {
					boolean found = false;

					// 匹配订单状态
					for (String required : requiredOrderStatus) {
						if (order.getStatus().equals(required)) {
							found = true;
							break;
						}
					}

					if (!found) {
						state = EventErrorCode.REQUEST_ORDER_INVALID_STATUS;
						foundError = true;
					}
				}

				if (!foundError && requiredOrderDetailStatus != null && requiredOrderDetailStatus.length > 0) {
					boolean found = false;

					// 匹配子订单状态
					for (String required : requiredOrderDetailStatus) {
						if (orderDetail.getStatus().equals(required)) {
							found = true;
							break;
						}
					}

					if (!found) {
						state = EventErrorCode.REQUEST_ORDERDETAIL_INVALID_STATUS;
					}
				}
			}
		}

		sendResponse(event, state, getErrorCodeName(state));
	}

	public void decreaseStock(OrderFormEntity order) {
		OrderDetailFormEntity[] list = queryGetOrderDetailList(order.getOrderNo());

		if (list == null) {
			logger.warn("No Sub Order found for OrderNum=" + order.getOrderNo());
			return;
		}

		for (OrderDetailFormEntity entity : list) {
			stockService.decreaseStock(entity.getCommodityMid(), entity.getCommoditySpecMid(), entity.getQuantity());
		}
	}

	public void decreaseStock(OrderDetailFormEntity[] list) {
		if (list == null) {
			logger.warn("Sub Order List is NULL");
			return;
		}

		for (OrderDetailFormEntity entity : list) {
			stockService.decreaseStock(entity.getCommodityMid(), entity.getCommoditySpecMid(), entity.getQuantity());
		}
	}

	public void decreaseStock(OrderDetailFormEntity orderDetail) {
		stockService.decreaseStock(orderDetail.getCommodityMid(), orderDetail.getCommoditySpecMid(),
				orderDetail.getQuantity());
	}

	public void increaseStock(OrderFormEntity order) {
		OrderDetailFormEntity[] list = queryGetOrderDetailList(order.getOrderNo());

		if (list == null) {
			logger.warn("No Sub Order found for OrderNum=" + order.getOrderNo());
			return;
		}

		for (OrderDetailFormEntity entity : list) {
			stockService.increaseStock(entity.getCommodityMid(), entity.getCommoditySpecMid(), entity.getQuantity());
		}
	}

	public void increaseStock(OrderDetailFormEntity orderDetail) {
		stockService.increaseStock(orderDetail.getCommodityMid(), orderDetail.getCommoditySpecMid(),
				orderDetail.getQuantity());
	}

	public void sendUserEvent(String type, String orderNum) {
		UserEvent event = new UserEvent();
		event.setOrderNo(orderNum);
		event.setOrderItemNo(null);
		event.setType(type);
		event.setSource("osm");
		event.setTarget("osm_event_listener");

		sendEvent(event);
	}

	public void execKill() {
		try {
			Process pid = null;
			String[] cmd = { "/bin/sh", "-c", "/usr/local/kill_osm.sh" };
			pid = Runtime.getRuntime().exec(cmd);
			logger.info("Success to execute >>>>>>>>>" + pid.toString());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	public void reloadOrder(String orderNum) {
		OrderFormEntity order = queryGetOrder(orderNum);

		if (order == null) {
			// 检查数据库
			order = orderFormService.selectByOrderNum(orderNum);
			if (order == null || order.getStatus() == OrderFormStatus.CLOSED) {
				return;
			}

			kSession.insert(order);

			List<OrderDetailFormEntity> list = orderDetailFormService.selectOrderDetailListByParentNum(orderNum);
			for (OrderDetailFormEntity item : list) {
				kSession.insert(item);
				ApplicationFormEntity app = applicationFormService.selectById(item.getAppealId());
				if (app != null) {
					kSession.insert(app);
				}
			}
		} else {
			OrderFormEntity orderNew = orderFormService.selectByOrderNum(orderNum);
			if (orderNew == null) {
				FactHandle handle = kSession.getFactHandle(order);
				kSession.delete(handle);
				OrderDetailFormEntity[] list = queryGetOrderDetailList(orderNum);
				if (list == null) {
					return;
				}
				for (OrderDetailFormEntity item : list) {
					ApplicationFormEntity app = queryGetApplication(item.getAppealId());
					if (app != null) {
						kSession.delete(kSession.getFactHandle(app));
					}
					kSession.delete(kSession.getFactHandle(item));
				}
			} else {
				FactHandle handle = kSession.getFactHandle(order);
				kSession.update(handle, orderNew);

				OrderDetailFormEntity[] list = queryGetOrderDetailList(orderNum);
				if (list == null || list.length == 0) {
					List<OrderDetailFormEntity> detailList = orderDetailFormService
							.selectOrderDetailListByParentNum(orderNum);
					for (OrderDetailFormEntity item : detailList) {
						kSession.insert(item);
						ApplicationFormEntity app = applicationFormService.selectById(item.getAppealId());
						if (app != null) {
							kSession.insert(app);
						}
					}
					return;
				}
				for (OrderDetailFormEntity item : list) {
					ApplicationFormEntity app = queryGetApplication(item.getAppealId());
					ApplicationFormEntity appNew = applicationFormService.selectById(item.getAppealId());
					if (app != null) {
						if (appNew != null) {
							kSession.update(kSession.getFactHandle(app), appNew);
						} else {
							kSession.delete(kSession.getFactHandle(app));
						}
					}

					OrderDetailFormEntity itemNew = orderDetailFormService.selectByOrderNum(item.getOrderNo());
					if (itemNew != null) {
						kSession.update(kSession.getFactHandle(item), itemNew);
					} else {
						kSession.delete(kSession.getFactHandle(item));
					}
				}
			}
		}
	}

	/**
	* @Title: saveOrUpdatePaymentAction
	* @Description: 保存PaymentAction到Redis
	* @param paymentAction
	* @return void
	* @throws
	*/
	public void saveOrUpdatePaymentAction(PaymentAction paymentAction) {
		paymentActionService.setPA(paymentAction);
	}

	/**
	* @Title: dropPaymentAction
	* @Description: 删除Redis中的PaymentAction
	* @param orderNo 大订单号
	* @param orderDetailNo 子订单号
	* @return void
	* @throws
	*/
	public void dropPaymentAction(String orderNo, String orderDetailNo) {
		paymentActionService.del("payment.id." + orderNo + orderDetailNo);
	}

	/**
	 * 将订单交易金额打款到虚拟账户中
	 *
	 * @author ZhengYl
	 * @date 2015年5月27日 下午3:31:20
	 * @param order 待发送订单
	 */
	public void orderPayToVirtualAccount(OrderFormEntity order, OrderDetailFormEntity[] orderDetailList) {
		if (order.getGuideId() != null) {
			BigDecimal total = new BigDecimal(0);

			// 计算子订单实际价格总和
			for (Object entity : orderDetailList) {
				OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
				total = total.add(orderDetail.getRealAmount());

				// 退款成功 减去退款金额
				if (orderDetail.getIsRefunded().intValue() > 0) {
					total = total.subtract(orderDetail.getRefundAmount());
				}
			}

			// 减去折扣
			if (order.getDisconntFee() != null) {
				total = total.subtract(order.getDisconntFee());
			}

			//总价小于零的情况
			total = total.compareTo(new BigDecimal(0)) < 0 ? new BigDecimal(0) : total;

			// 加上邮费
			if (order.getExpressFee() != null) {
				total = total.add(order.getExpressFee());
			}

			logger.info("[Virtual Account]打款到虚拟账户Id: " + order.getGuideId() + ", 订单: " + order.getOrderNo() + ", 金额: "
					+ total + " 元");
			VirtualAccountDetailEntity accountDetail = new VirtualAccountDetailEntity();
			accountDetail.setUserId(order.getGuideId());
			accountDetail.setAmount(total);
			accountDetail.setSign(1);
			accountDetail.setRemark("Order Pay: " + order.getOrderNo());
			accountDetail.setItemType(VirtualAccountEventType.PAYMENT);

			try {
				Map<String, Object> body = new HashMap<String, Object>();
				body.put("userId", order.getGuideId());
				body.put("detail", accountDetail);

				BaseEvent event = new BaseEvent();
				event.setBody(JSONObject.fromObject(body));
				event.setSource(Constants.MQRequestParam.REQUEST_QUEUENAME_OSM);
				event.setTimestamp((new Date()).getTime());
				event.setType(VirtualAccountEventTypeEnum.ACCOUNT_POST.getCode());
				event.setTarget(Constants.MQRequestParam.REQUEST_QUEUENAME_VA);

				mSender.sendEvent(event);
			} catch (Exception e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}

		}
	}

	/**
	 * 买家在订单完成时获取积分
	 * 
	 * @author ZhengYl
	 * @date 2015年7月16日 下午1:09:30 
	 * @param order
	 */
	public void buyerScoreObtain(OrderFormEntity order, OrderDetailFormEntity[] orderDetailList) {
		if (order.getTotalAmount().compareTo(new BigDecimal(0)) > 0) {
			logger.info(order.getOrderNo() + " : 订单完成增加积分");
			IntegralRecordVO scoreVO = new IntegralRecordVO();

			scoreVO.setSourceType(2);
			scoreVO.setAction(1);
			scoreVO.setType(9);
			scoreVO.setOrder_sn(order.getOrderNo());
			scoreVO.setEvent_id(order.getOrderNo());
			scoreVO.setPay_money(order.getTotalAmount());
			scoreVO.setUser_id(order.getBuyerId());
			String commodityIds = "";
			for (Object entity : orderDetailList) {
				OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
				commodityIds += orderDetail.getCommodityMid();
			}
			scoreVO.setComment_id(commodityIds);
			try {
				integralService.addOrSubScore(scoreVO);
			} catch (Exception e) {
				logger.error(e.getMessage());
				e.printStackTrace();
			}
		}

	}

	/**
	 * 买家延迟未支付发送消息提醒
	 * 
	 * @author ZhengYl
	 * @date 2015年7月10日 上午11:33:39 
	 * @param buyerId
	 * @param orderNo
	 */
	public void sendPaymentAlertMsg(String buyerId, String orderNo) {
		try {
			ObjectId buyerObjId = new ObjectId(buyerId);
			roaOrderService.sendBodyByOrderEventType(buyerObjId, orderNo, OrderEventType.PAYMENT_DELAY_ALERT);
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}
	}

	// /////////////////////////////////////////////////////////////////////////////////////////

	private String getErrorCodeName(int errorCode) {
		String[] errorCodeList = { "操作成功", "操作失败", "订单状态不正确", "请求超时", "订单已存在", "订单不存在或者为关闭状态", "子订单不存在", "子订单状态不正确", };

		if (errorCode < 0 || errorCode >= errorCodeList.length) {
			return null;
		}

		return errorCodeList[errorCode];
	}
	
	
	// /////////////////////////////////////////////////////////////////////////////////////////  
		// 判断用户是否使用积分支付
		public boolean createOrder(OrderFormEntity order,OrderDetailFormEntity[] orderDetailList) {
			if(order.getDiscountInfo()!=null && order.getDiscountInfo().length()>0){ 
				Map<String, Object> mapObject = JsonUtil.getMapFromJson(order.getDiscountInfo());
				if (mapObject.get("score") != null && Integer.parseInt(mapObject.get("score").toString()) > 0) {
					IntegralRecordVO integralRecordVO = setIntegralRecordVOInfo(order,orderDetailList);
					// 下单时验证前端传送积分抵扣金额
					if (integralRecordVO.getType() == ScoreRuleEnum.SCORE_ORDER_SUB.getCode()) {
						Map<String, Object> mapScoreExchangeMoney=getMapByJson(ScoreRuleEnum.SCORE_ORDER_SUB.getCode());
						double scoreExchangeMoney= Double.parseDouble(mapScoreExchangeMoney.get("scoreExchangeMoney").toString());
						BigDecimal scoreDeductionMoney = new BigDecimal(Double.parseDouble(mapObject.get("score").toString()) * scoreExchangeMoney); // 积分抵扣金额，100积分兑换1RMB
						BigDecimal pageScoreDeductionMoney = new BigDecimal(Double.parseDouble(mapObject.get("scoreDeduction").toString())); // 前端传送积分抵扣金额
						if (scoreDeductionMoney.compareTo(pageScoreDeductionMoney) != 0) {
							logger.info("该积分与积分抵扣金额不一致");
							return false;
						}
					}
					// 扣积分
					if (scoreOperation(integralRecordVO)) {
						return true;
					} else {
						return false;
					}
				}else{
					return true;// 没有使用积分支付
				}
			}else {
				// 没有使用积分支付
				return true;
			}
		}

		public IntegralRecordVO setIntegralRecordVOInfo(OrderFormEntity order,
				OrderDetailFormEntity[] orderDetailList) {
			
			IntegralRecordVO integralRecordVO = new IntegralRecordVO();
			// CLOSED卖家订单关闭,TO_SHIPPED卖家超时未发货,UNPAID买家超时未支付
			if (order.getStatus().equals(OrderFormStatus.CLOSED)|| order.getStatus().equals(OrderFormStatus.TO_SHIPPED)|| order.getStatus().equals(OrderFormStatus.UNPAID)) {
				integralRecordVO.setAction(ActionType.ACTION_ADD); // 操作类型 家超时未支付
				integralRecordVO.setType(ScoreRuleEnum.SCORE_PAY_TIMEOUT_ROLLBACK.getCode()); // 操作详情:超时未支付
				integralRecordVO.setEvent_id(order.getBuyerId()+ActionType.ACTION_ADD+ScoreRuleEnum.SCORE_PAY_TIMEOUT_ROLLBACK.getCode()+System.currentTimeMillis());
			} else {
				integralRecordVO.setAction(ActionType.ACTION_SUB); // 操作类型 买家下单
				integralRecordVO.setType(ScoreRuleEnum.SCORE_ORDER_SUB.getCode()); // 操作详情:下单
				integralRecordVO.setEvent_id(order.getBuyerId()+ActionType.ACTION_SUB+ScoreRuleEnum.SCORE_ORDER_SUB.getCode()+System.currentTimeMillis());
			}
			if (order.getStatus().equals(OrderFormStatus.CLOSED)){
				integralRecordVO.setReason("卖家关闭订单");
			}else if(order.getStatus().equals(OrderFormStatus.TO_SHIPPED)){
				integralRecordVO.setReason("卖家超时未发货");
			}else if(order.getStatus().equals(OrderFormStatus.UNPAID)){
				integralRecordVO.setReason("买家超时未支付");
			}else{
				integralRecordVO.setReason("买家下单");
			}
			
			integralRecordVO.setUser_id(order.getBuyerId()); // 买家
			if(!StringUtils.isEmpty(order.getDiscountInfo())){
				Map<String, Object> mapObject = JsonUtil.getMapFromJson(order.getDiscountInfo());
				if(mapObject.get("score")!=null && Integer.parseInt(mapObject.get("score").toString())>0){
					integralRecordVO.setUse_score(Integer.parseInt(mapObject.get("score").toString())); // 积分 
					integralRecordVO.setScore_deduction(new BigDecimal(mapObject.get("scoreDeduction").toString()));  //积分抵扣金额
				}
			}
			integralRecordVO.setOrder_sn(order.getOrderNo());//订单号
			BigDecimal totalMoney = new BigDecimal(0);// 原结算金额
			BigDecimal deductionMoney = new BigDecimal(0); // 优惠金额
			String commodityMid="";
			// 计算红包，原结算金额
			for (Object entity : orderDetailList) {
				OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
				commodityMid=orderDetail.getCommodityMid()+",";
				totalMoney = totalMoney.add(orderDetail.getRealAmount());// 原结算金额
				String couponId = orderDetail.getCouponId(); // 优惠code
				if (!(couponId == null || couponId.isEmpty())) {
					Double couponAmount = couponStatusService.getDiscountByCode(couponId); // 优惠抵扣金额
					if (couponAmount != null) {
						deductionMoney = deductionMoney.add(new BigDecimal(couponAmount));
					}
				}
			}
//			integralRecordVO.setPay_money(calculateTotalPrice(order,orderDetailList));// 实际支付金额
			integralRecordVO.setTotal_money(totalMoney); // 原结算金额
			integralRecordVO.setPreferential_deduction(deductionMoney); // 优惠抵扣金额
			
			if(commodityMid!=null && commodityMid.length()>1){
				integralRecordVO.setItem_id(commodityMid.substring(0,commodityMid.length()-1));//商品编号
				integralRecordVO.setItem_type(ItemType.ITEM_PRODUCT+"");//商品
			}
			
			if(order.getExpressFee()!=null){
				integralRecordVO.setPost_money(order.getExpressFee()); //邮费
			}else{
				integralRecordVO.setPost_money(new BigDecimal(0));//邮费
			}
			
			logger.info("setIntegralRecordVO------>"+new JSONArray().fromObject(integralRecordVO).toString());
			return integralRecordVO;
		}
		
		
		

		// 积分操作
		public boolean scoreOperation(IntegralRecordVO integralRecordVO) {
			// 调用dobbu接口真正扣积分
			JSONObject jSONObject = integralService.addOrSubScore(integralRecordVO);
			Map<String,Object> keyMap = JsonUtil.getMapFromJson(jSONObject.toString());
			if (keyMap.get("errno") != null && Integer.parseInt(keyMap.get("errno").toString()) == 0) {
				return true;
			} else {
				return false;
			}
		}

		//还原积分
		public boolean subtractScore(OrderFormEntity order) {
			List<OrderDetailFormEntity> list = orderDetailFormService.selectOrderDetailListByParentNum(order.getOrderNo());
			OrderDetailFormEntity[] orderDetailList=list.toArray(new OrderDetailFormEntity[list.size()]);
			IntegralRecordVO integralRecordVO = setIntegralRecordVOInfo(order,orderDetailList);
			// 扣积分
			if (scoreOperation(integralRecordVO)) {
				return true;
			} else {
				return false;
			}
		}
		//获取积计算的相关参数(积分抵扣金额，积分支付占实际支付的10%)
		public Map<String, Object> getMapByJson(Integer scoreRuleEnum){
			Map<String, Object> resultMap = new HashMap<String, Object>();
			JSONObject json = integralService.getRuleByType(scoreRuleEnum);
			if (json != null && json.get("rule_expression") != null) {
				JSONObject ruleExpression = (JSONObject) json.get("rule_expression");
				if (ruleExpression != null && ruleExpression.get("scoreExchangeMoney") != null) {
					resultMap.put("scoreExchangeMoney", ruleExpression.get("scoreExchangeMoney"));
					resultMap.put("limit", ruleExpression.get("limit"));
					resultMap.put("moneyExchangeScore", ruleExpression.get("moneyExchangeScore"));

				}
			}
			return resultMap;
		}
		
		
		
		/**
		 * 判断积分是否大于订单价格的10%
		 * 
		 * @param discountInfo
		 * @param discount
		 * @return
		 * @throws Exception
		 */
		public void returnScore(OrderFormEntity order,OrderDetailFormEntity[] orderDetailList,OrderPriceResetEvent event)throws Exception {
			logger.info("rule_expressionreturnScore---start----");
			JSONObject jsonObject=new JSONObject();
			if(!StringUtils.isEmpty(order.getDiscountInfo())){
				 jsonObject=JSONObject.fromObject(order.getDiscountInfo());
			}
			if(!StringUtils.isEmpty(order.getDiscountInfo())){
				 jsonObject=JSONObject.fromObject(order.getDiscountInfo());
				if ( jsonObject.get("score") != null && StringUtils.isNotBlank(jsonObject.get("score").toString())) {
					Map<String, Object> scoreMap = getMapByJson(ScoreRuleEnum.SCORE_ORDER_SUB.getCode());
					if (scoreMap != null && scoreMap.get("scoreExchangeMoney") != null) {
						logger.info("rule_expression--->"+scoreMap.toString());
						double scoreExchangeMoney = Double.parseDouble(scoreMap.get("scoreExchangeMoney").toString()); //积分兑换金额参数
						BigDecimal ratio = new BigDecimal(scoreMap.get("limit").toString());//判断积分支付是否大于订单价格的10%参数
						BigDecimal cashCouponDiscount = new BigDecimal(0); //优惠券总金额
						// 计算红包，原结算金额
						for (Object entity : orderDetailList) {
							OrderDetailFormEntity orderDetail = (OrderDetailFormEntity) entity;
							String couponId = orderDetail.getCouponId(); // 优惠code
							if (!(couponId == null || couponId.isEmpty())) {
								Double couponAmount = couponStatusService.getDiscountByCode(couponId); // 优惠抵扣金额
								if (couponAmount != null) {
									cashCouponDiscount = cashCouponDiscount.add(new BigDecimal(couponAmount));
								}
							}
						}
						logger.info("cashCouponDiscount-------"+cashCouponDiscount);
						//修改后的价格10%
						BigDecimal ratioOrderPrice =event.getOrderPrice().multiply(ratio);
						if(ratioOrderPrice.compareTo(event.getOrderPrice().subtract(cashCouponDiscount))>0){
							int returnScore=0;//返还积分
							
							//是否使用红包
							if(cashCouponDiscount.compareTo(new BigDecimal(0))>0){
								//当订单结算金额由于用户使用其他优惠后被抵扣到结算金额小于原订单价格的10%后，该订单的可用积分上限即为剩余结算金额换算出的积分数
								//减去红包
								BigDecimal subtractCoupon=event.getOrderPrice().subtract(cashCouponDiscount); 
								if(subtractCoupon.compareTo(ratioOrderPrice)<0){
									returnScore=(Integer.parseInt(jsonObject.get("score").toString())-subtractCoupon.intValue()) > 0 ? (Integer.parseInt(jsonObject.get("score").toString())-subtractCoupon.intValue()):0;
								}else{
									returnScore=(Integer.parseInt(jsonObject.get("score").toString())-ratioOrderPrice.intValue()) > 0 ? (Integer.parseInt(jsonObject.get("score").toString())-ratioOrderPrice.intValue()):0;
								}
							}else{
								//积分关联到订单，用户若使用积分抵扣，则按照订单不使用任何优惠形式时的结算金额的10%作为该订单的可用积分上限
								returnScore=ratioOrderPrice.intValue();
							}
							if(returnScore>0){
								//返还积分
								jsonObject.put("score", returnScore);
								jsonObject.put("scoreDeduction", returnScore * scoreExchangeMoney);
								order.setDiscountInfo(jsonObject.toString());
								logger.info("returnScore-------"+returnScore);
								logger.info("returnScore------start-");
								if(!subtractScore(order)){
									throw new Exception("积分归还失败");
								}
								logger.info("returnScore------end-");
							}
						}else{
							throw new Exception("积分抵扣金额支付上限为10%");
						}
					} 
				}
			}
		}
}
