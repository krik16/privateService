package com.rongyi.osm.mq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.OrderEventType;
import com.rongyi.easy.osm.entity.OrderDetailFormEntity;
import com.rongyi.easy.osm.entity.OrderFormEntity;
import com.rongyi.osm.constant.OrderDetailFormStatus;
import com.rongyi.osm.constant.OrderFormStatus;
import com.rongyi.osm.knowledge.UserEvent;
 /**
 */
public class MessageTest {

	@Autowired
	private MessageReceiver msgReceiver;

	@Autowired
	private MessageSender msgSender;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testCreateOrder() {
		String ORDER_NUM_TEST = "ORDER0001";
		String ORDER_DETAIL_NUM_TEST = "ORDER0001S001";

		// Test Insert OrderFormEntity
		OrderFormEntity order = new OrderFormEntity();
		order.setAddressId("ADDRESS0001");
		order.setBuyerId("BUYER00001");
		order.setBuyerComment("多放辣");
		order.setCreateAt(new Date());
		order.setDisconntFee(new BigDecimal(20));
		order.setNextStatusTime(DateUtil.addHours(new Date(), 24));
		order.setIsComment(0);
		order.setExpressInfoId("WL0001");
		order.setOrderNo(ORDER_NUM_TEST);
		order.setOrderSource(1);
		order.setOrderType(1);
		order.setPaymentIdList(null);
		order.setExpressFee(new BigDecimal(20));
		order.setStatusHoldMs(1000 * 60 * 60 * 24L);
		order.setStatus(OrderFormStatus.UNPAID);
		order.setStatusRoute(null);
		order.setTotalAmount(new BigDecimal(100));
		order.setWeidianId("WEIDIAN0001");

		OrderDetailFormEntity orderDetail = new OrderDetailFormEntity();
		orderDetail.setAppealTimes(0);
		orderDetail.setAppealId(1);
		orderDetail.setCommodityMid("SHANGPIN0001");
		orderDetail.setIsJudged(0);
		orderDetail.setOrderItemNo(ORDER_DETAIL_NUM_TEST);
		orderDetail.setOrderNo(order.getOrderNo());
		orderDetail.setQuantity(10);
		orderDetail.setRealAmount(new BigDecimal(3));
		orderDetail.setRefundTimes(0);
		orderDetail.setRefundAmount(new BigDecimal(0));
		orderDetail.setCommoditySpecMid("GUIGE0001");
		orderDetail.setStatus(OrderDetailFormStatus.NORMAL);
		orderDetail.setIsRefunded(0);
		orderDetail.setUnitPrice(new BigDecimal(5));

		ArrayList<OrderDetailFormEntity> orderDetailList = new ArrayList<OrderDetailFormEntity>();
		orderDetailList.add(orderDetail);

		UserEvent event = new UserEvent();
		event.setType(OrderEventType.PLACE_ORDER);
		event.setSource("rob");
		event.setTarget("osm");
		event.setTimestamp(System.currentTimeMillis());
		event.updateBody();
		Map<String, Object> body = (Map<String, Object>) event.getBody();
		body.put("order", order);
		body.put("orderDetailList", orderDetailList);

		System.out.println(event.toString());
	}

}
