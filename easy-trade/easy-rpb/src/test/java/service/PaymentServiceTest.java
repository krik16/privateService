package service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import base.BaseTest;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.rpb.service.AliPaymentService;
import com.rongyi.rpb.service.PaymentItemService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rss.coupon.RoaCouponOrderService;

public class PaymentServiceTest extends BaseTest {

	@Autowired
	PaymentService paymentService;

	@Autowired
	RoaCouponOrderService roaCouponOrderService;
	
	@Autowired
	PaymentItemService paymentItemService;

	@Autowired
	AliPaymentService aliPaymentService;
	
	// @Test
	public void testSelectPageListBySearch() {
		Map<String, Object> searchValueMap = null;
		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("currpage", 1);
		List<PaymentEntityVO> list = null;
		list = paymentService.selectPageListBySearch(searchValueMap);
		Assert.assertEquals(list.size(), 10);

		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("payNo", "1000002015101592");
		list = paymentService.selectPageListBySearch(searchValueMap);
		Assert.assertEquals(1, list.size());

		searchValueMap = new HashMap<String, Object>();
		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("orderNum", "1000001119347726");
		list = paymentService.selectPageListBySearch(searchValueMap);
		Assert.assertEquals(1, list.size());

		searchValueMap = new HashMap<String, Object>();
		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("status", "0");
		list = paymentService.selectPageListBySearch(searchValueMap);
		System.err.println("status is 0 count=" + list.size());

		searchValueMap = new HashMap<String, Object>();
		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("tradeType", "0");
		list = paymentService.selectPageListBySearch(searchValueMap);
		System.err.println("tradeType is 0 count=" + list.size());

	}

	// @Test
	public void testSelectPageListCountBySearch() {
		long count = 0;
		Map<String, Object> searchValueMap = null;
		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("payNo", "1000002015101592");
		count = paymentService.selectPageListCountBySearch(searchValueMap);
		Assert.assertEquals(1, count);

		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("orderNum", "1000001119347726");
		count = paymentService.selectPageListCountBySearch(searchValueMap);
		Assert.assertEquals(1, count);

		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("status", "0");
		count = paymentService.selectPageListCountBySearch(searchValueMap);
		System.err.println("status is 0 count=" + count);

		searchValueMap = new HashMap<String, Object>();
		searchValueMap.put("tradeType", "0");
		count = paymentService.selectPageListCountBySearch(searchValueMap);
		System.err.println("tradeType is 0 count=" + count);

	}

	// @Test
	public void testInsertByOrderDetailNum() {
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setPayNo("0001");
		paymentService.insertByOrderDetailNum(paymentEntity, "001,002");
	}

	// @Test
	public void testSelectByPrimaryKey() {
		PaymentEntity paymentEntity = paymentService.selectByPrimaryKey("80");
		System.err.println(paymentEntity.getPayNo());
	}

	// @Test
	public void testGetSendMessage() {

		System.err.println("支付宝网页支付");
		MessageEvent rpbEvent = getRpbEvent("rob", "1");
		paymentService.getSendMessage(rpbEvent);

		System.err.println("支付宝APP支付");
		MessageEvent rpbEvent1 = getRpbEvent("rob", "3");
		paymentService.getSendMessage(rpbEvent1);

		System.err.println("微信支付");
		MessageEvent rpbEvent2 = getRpbEvent("rob", "5");
		paymentService.getSendMessage(rpbEvent2);

		System.err.println("买家申请退款");
		MessageEvent rpbEvent3 = getRpbEvent("osm", "2");
		paymentService.getSendMessage(rpbEvent3);

		System.err.println("打款给卖家");
		MessageEvent rpbEvent4 = getRpbEvent("osm", "1");
		paymentService.getSendMessage(rpbEvent4);

		// System.err.println("支付时价格为0");
		// RpbEvent rpbEvent5 = getRpbEvent("rob", "1");
		// Map<String, Object> bodyMap = (Map<String,
		// Object>)rpbEvent5.getBody();
		// bodyMap.put("totalPrice","0");
		// paymentService.getSendMessage( rpbEvent5);

	}

	// @Test
	public void testValidateOrderNumExist() {
		PaymentEntity paymentEntity = paymentService.validateOrderNumExist("1000000126496953,1000000272983889", 1, 1);
		System.err.println("payNo=" + paymentEntity.getPayNo());
	}

	@SuppressWarnings("unchecked")
	// @Test
	public void testInsertOrderMessage() {
		PaymentEntityVO paymentEntityVO = null;
		MessageEvent rpbEvent = getRpbEvent("rob", "1");
		Map<String, Object> bodyMap = (Map<String, Object>) rpbEvent.getBody();
		bodyMap.put("orderNum", "1000000232029904");
		paymentEntityVO = paymentService.insertOrderMessage(rpbEvent);
		Assert.assertEquals(paymentEntityVO.getPayNo(), "1000001352472469");
		bodyMap.put("orderNum", "000001");
		paymentEntityVO = paymentService.insertOrderMessage(rpbEvent);
		Assert.assertEquals(paymentEntityVO.getOrderNum(), "000001");

	}

	// @Test
	public void testGetOrderNumStrsByPayNo() {
		paymentService.getOrderNumStrsByPayNo("1000000028153019");
	}

//	@Test
	public void testInsert() {
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setOrderNum("11111");
		paymentEntity.setCreateTime(new Date());
		paymentService.insert(paymentEntity);
	}

//	@Test
	public void testRoaCouponOrder() {
		roaCouponOrderService.findOneByOrderNo("");
	}

//	@Test
	public void testSelectItemByPaymentId(){
		List<PaymentItemEntity> list = paymentItemService.selectByPaymentId(2171);
		System.err.println(list.get(0).getDetailNum());
	}
	
	@Test
	public void testQueryOrder(){
		System.err.println(aliPaymentService.queryOrder("1000001063768572","2015080700001000480061032614").toString());	
	}
	
	public MessageEvent getRpbEvent(String soruce, String type) {
		MessageEvent event = new MessageEvent();
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("orderDetailNum", "");
		bodyMap.put("orderNum", "1000000232029904");
		bodyMap.put("totalPrice", "0.01");
		bodyMap.put("title", "test");
		event.setBody(JSONObject.fromObject(bodyMap));
		event.setSource(soruce);
		event.setTarget("rpb");
		event.setTimestamp(Long.valueOf("1428565002336"));
		event.setType(type);
		return event;
	}

}
