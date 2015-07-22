package com.rongyi.osm.knowledge;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.kie.api.runtime.ClassObjectFilter;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;

@Component
public class ClockUpdater extends Thread {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource(name = "ksession")
	private KieSession kSession;

	private static int limit = 0;

	private FactHandle handle;
	private Clock clock;

	public void initialize() {
		clock = new Clock();
		clock.setCurrentDate(getCurrentDate());

		handle = kSession.insert(clock);
	}

	public void run() {
		while (true) {
			try {
				sleep(10 * 1000);
			} catch (InterruptedException e) {
				logger.error("Thread has been interrupted, break the clock update loop ...");
				break;
			} catch (Exception e) {
				// Pass
			}

			logger.info("Update Clock Fact : " + clock.getCurrentDate() + "  (total: " + kSession.getFactCount() + ")"
					+ "  (order count: " + kSession.getObjects(new ClassObjectFilter(OrderFormEntity.class)).size()
					+ ")" + "  (detail count: "
					+ kSession.getObjects(new ClassObjectFilter(OrderDetailFormEntity.class)).size() + ")"
					+ "  (appeal count: "
					+ kSession.getObjects(new ClassObjectFilter(ApplicationFormEntity.class)).size() + ")"
					+ "  (pay action count: " + kSession.getObjects(new ClassObjectFilter(PaymentAction.class)).size()
					+ ")");
			clock.setCurrentDate(getCurrentDate());
			kSession.update(handle, clock);
		}

	}

	private long getCurrentTime() {
		return kSession.getSessionClock().getCurrentTime();
	}

	private Date getCurrentDate() {
		return new Date(getCurrentTime());
	}

	/**
	 * 压力测试备用
	 */
	@SuppressWarnings("unused")
	private void generateStressTestMessage() {
		int i = 0;
		while (limit < 100000 && i < 1000) {
			i++;
			String orderNoStr = "TEST" + StringUtils.leftPad((Integer.toString(limit + i)), 8, "0");
			StringBuilder sb = new StringBuilder("{\"timestamp\":");
			sb.append(System.currentTimeMillis());
			sb.append(",\"body\":{\"order\":{\"addressId\":\"551276e2e4b01f10793edda3\",\"buyerComment\":\"压力测试模拟订单\",\"buyerId\":\"51f9eb5c31d65584ab00f563\",\"createAt\":null,\"disconntFee\":0,\"expressFee\":0,\"expressInfoId\":\"\",\"id\":0,\"isComment\":0,\"nextStatusTime\":null,\"orderNo\":\"");
			sb.append(orderNoStr);
			sb.append("\",\"orderSource\":1,\"orderType\":0,\"paymentIdList\":\"\",\"status\":\"\",\"statusHoldMs\":0,\"statusRoute\":\"\",\"totalAmount\":0.05,\"weidianId\":\"124\"},\"orderDetailNum\":\"\",\"orderDetailList\":[");
			for (int j = 0; j < 5; j++) {
				sb.append("{\"appealId\":0,\"appealTimes\":0,\"commodityMid\":\"550b8b99e4b0f4e962b0e2b1\",\"commoditySpecMid\":\"550b8b99e4b0f4e962b0e2b0\",\"couponId\":0,\"id\":0,\"isJudged\":0,\"isRefunded\":0,\"orderItemNo\":\"");
				sb.append(orderNoStr);
				sb.append("s");
				sb.append(j);
				sb.append("\",\"orderNo\":\"");
				sb.append(orderNoStr);
				sb.append("\",\"paymentIdList\":\"\",\"quantity\":1,\"realAmount\":0.01,\"refundAmount\":0,\"refundTimes\":0,\"status\":\"\",\"unitPrice\":0.01}");
				if (j < 4)
					sb.append(",");
			}
			sb.append("],\"orderNum\":\"");
			sb.append(orderNoStr);
			sb.append("\"},\"source\":\"0001\",\"type\":\"1\"}");
			try {
				BaseEvent event = EventFactory.buildEventFromString(sb.toString(), null, null);
				kSession.insert(event);
			} catch (Exception e) {

			}
		}
	}
}
