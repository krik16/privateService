package com.rongyi.osm.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext*.xml")
public class OrderFormServiceTest {
	
	@Autowired
	private OrderFormService orderFormService;
	
	@Autowired
	private OrderDetailFormService orderDetailFormService;
	
	@Autowired
	private ApplicationFormServiceImpl applicationFormService;
	
	@Autowired
	private OrderEventService orderEventService;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testOrderEventService() {
//		OrderEventEntity event = new OrderEventEntity();
//		
//		event.setCreateAt(new Date());
//		event.setDetail("用户付款");
//		event.setOrderNo("ORDER0001");
//		event.setOrigStatus("待付款");
//		event.setStatus("待发货");
//		event.setType("用户付款");
//		
//		int id = orderEventService.insertAndGetId(event);
//		
//		System.out.println("Insert ID: " + id);
	}
	
	@Test
	public void testApplicationFormService() {
//		ApplicationFormEntity app = new ApplicationFormEntity();
//		
//		app.setBuyerId("BUYER0001");
//		app.setAppealComment("HELLO, I HAVE NO IDEA.");
//		app.setAppealResult("HAHA");
//		app.setCreateAt(new Date());
//		app.setExpressInfoId("KDSF0001");
//		app.setAgentComment("HAHA Hello");
//		app.setAgentCreateAt(new Date());
//		app.setOrderItemNo("ORDER0001S001");
//		app.setOrderNo("ORDER0001");
//		app.setPicUrls("NO PICS");
//		app.setRefundReasonId(0L);
//		app.setRefundTypeId(0L);
//		app.setEndAt(new Date());
//		app.setSellerTime(new Date());
//		app.setWeidianId("WEIDIAN0001");
//		
//		int id = applicationFormService.insertAndGetId(app);
//		
//		System.out.println("Insert ID: " + id);
//		
//		applicationFormService.updateAll(app);
	}

	@Test
	public void testOrderFormServiceAndOrderDetailFormService() {
//		String ORDER_NUM_TEST = "ORDER0001";
//		String ORDER_DETAIL_NUM_TEST = "ORDER0001S001";
//		
//		// Test Insert OrderFormEntity
//		OrderFormEntity order = new OrderFormEntity();
//		order.setAddressId("ADDRESS0001");
//		order.setBuyerId("BUYER00001");
//		order.setBuyerComment("多放辣");
//		order.setCreateAt(new Date());
//		order.setDisconntFee(new BigDecimal(20));
//		order.setNextStatusTime(DateUtil.addHours(new Date(), 24));
//		order.setIsComment(0);
//		order.setExpressInfoId("WL0001");
//		order.setOrderNo(ORDER_NUM_TEST);
//		order.setOrderSource(1);
//		order.setOrderType(1);
//		order.setPaymentIdList(null);
//		order.setExpressFee(new BigDecimal(20));
//		order.setStatusHoldMs(1000 * 60 * 60 * 24L);
//		order.setStatus(OrderFormStatus.UNPAID);
//		order.setStatusRoute(null);
//		order.setTotalAmount(new BigDecimal(100));
//		order.setWeidianId("WEIDIAN0001");
//
//		OrderDetailFormEntity orderDetail = new OrderDetailFormEntity();
//		orderDetail.setAppealTimes(0);
//		orderDetail.setAppealId(1);
//		orderDetail.setCommodityMid("SHANGPIN0001");
//		orderDetail.setIsJudged(0);
//		orderDetail.setOrderItemNo(ORDER_DETAIL_NUM_TEST);
//		orderDetail.setOrderNo(order.getOrderNo());
//		orderDetail.setQuantity(10);
//		orderDetail.setRealAmount(new BigDecimal(3));
//		orderDetail.setRefundTimes(0);
//		orderDetail.setRefundAmount(new BigDecimal(0));
//		orderDetail.setCommoditySpecMid("GUIGE0001");
//		orderDetail.setStatus(OrderDetailFormStatus.NORMAL);
//		orderDetail.setIsRefunded(0);
//		orderDetail.setUnitPrice(new BigDecimal(5));
//		
//		ArrayList<OrderDetailFormEntity> orderDetailEntities = new ArrayList();
//		OrderDetailFormEntity[] orderDetailFormEntityList = new OrderDetailFormEntity[1];
//		orderDetailEntities.add(orderDetail);
//		orderDetailFormEntityList[0] = orderDetail;
//		
//		// 插入订单和子订单
//		orderFormService.insert(order, orderDetailFormEntityList);
//		
//		OrderFormEntity savedOrder = orderFormService.selectByOrderNum(order.getOrderNo());
//		assertNotNull(savedOrder);
//		
//		order.setStatus("HELLO");
//		order.setStatusRoute("<1, 1>");
//		orderFormService.updateStatus(order);
//		order.setStatus("WORLD");
//		order.setStatusRoute("<1, 1000>|<2, 1001>|<3, 1002>|<4, 1003>");
//		orderFormService.updateStatus(order);
//		
//		savedOrder = orderFormService.selectByOrderNum(order.getOrderNo());
//		
//		System.out.println(savedOrder.getStatus());
//		
//		System.out.println(order.getTotalAmount());
//		order.setDisconntFee(new BigDecimal(50));
//		orderFormService.updateTotalPrice(order);
//		System.out.println(order.getTotalAmount());
//		
//		orderFormService.updateStatusAndLogisticsBillIdWithTime(order);
//		orderFormService.updateStatusAndPaymentIdWithTime(order);
//		orderFormService.updateStatusWithTime(order);
//		
//		order.setPaymentIdList("1");
//		orderFormService.updatePaymentIdByOrderNum(order.getOrderNo(), "1,2");
//		
//		savedOrder = orderFormService.selectByOrderNum(order.getOrderNo());
//		
//		System.out.println("PaymentID: " + savedOrder.getPaymentIdList());
//		
//		orderDetailFormService.updateStatus(orderDetail);
//		
//		orderDetailFormService.updateStatusRefundAdult(orderDetail);
//		
//		orderDetailFormService.updatePaymentIdByOrderNum(orderDetail.getOrderItemNo(), "1,2,3,4");
//		
//		List<OrderDetailFormEntity> ret = orderDetailFormService.selectOrderDetailListByParentNum(order.getOrderNo());;
//		
//		for (Object obj: ret) {
//			System.out.println(obj);
//		}
//		
//		List<OrderFormEntity> orderList = orderFormService.selectNonClosedOrder(0, 1000);
//		for (Object obj: orderList) {
//			System.out.println(obj);
//		}
	}
	
	@Test
	public void testOrderFormServiceSelect() {
//		List<OrderFormEntity> ret = orderFormService.selectNonClosedOrder(0, 1000);
//		
//		for (OrderFormEntity obj: ret) {
//			System.out.println(obj);
//		}
	}
}
