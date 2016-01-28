package service;

import base.BaseTest;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.pay.weixin.model.*;
import com.rongyi.rpb.common.pay.weixin.service.RefundService;
import com.rongyi.rpb.common.pay.weixin.service.ReverseService;
import com.rongyi.rpb.common.pay.weixin.service.UnifiedorderService;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.WeixinPayService;
import com.rongyi.rpb.unit.WeixinPayUnit;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.*;

public class WeixinPayServiceTest extends BaseTest {

	@Autowired
	WeixinPayService weixinPayService;

	@Autowired
	PaymentService paymentService;
//
//	@Autowired
//	Sender sender;

	@Autowired
	@Qualifier("weixinPayUnit")
	WeixinPayUnit weixinPayUnit;
	// @Test
	public void testSelectByPrimaryKey() {
		// weixinPayService.getWeixinRefund("1000001898510594" ,0.01, 0.01);
		List<PaymentEntity> list = paymentService.selectByPayNoAndTradeType(null, 0);
		System.err.println(list.toArray().toString());
	}

	// @Test
	public void testGetWeixinRefund_new() {
		// weixinPayService.getWeixinRefund_new("1220588601201504086010224597",
		// "1000000572383071", "101220111", 1, 1);
	}

	// @Test
	public void testGetWeixinRefund() {
//		weixinPayService.weixinRefund("1000000384208367", 0.01, 0.01, "10000003840682312");
		// weixinPayService.getAppWeXinSign("1000000197371298", 0.01);
	}

	// @Test
	public void testMessageToRefund() {
		String body = "{\"title\":\"饮料\",\"orderDetailNum\":\"\",\"orderNum\":\"1000000050790901\",\"type\":\"3\",\"totalPrice\":0.01}";
		MessageEvent rpbEvent = new MessageEvent();
		rpbEvent.setBody(body);
		weixinPayService.validateIsWeixinPay(rpbEvent);
	}

	// @Test
	public void testGetWeixinPay() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("test", "test");
//		sender.convertSendAndReceive("coupon_order_queue", map);
		// System.err.println(weixinPayService.getAppWeXinSign("10000011111",
		// 0.01));
	}

	/**
	 * @Description: 测试微信扫码支付
	 * @Author: 柯军
	 * @datetime:2015年6月25日下午1:56:05
	 **/
	// @Test
	public void testWinxinScan() {
		ScanPayService scanPayService;
		try {
			scanPayService = new ScanPayService();
			// Date timeExpire = DateUtil.getDaysInPast(new Date(), 1);
			// ScanPayReqData scanPayReqData = new
			// ScanPayReqData("130341714831840336", "容易网商品", "test",
			// "1000001753309557", 1, "123", "127.0.0.1", "20150625121010",
			// "20150625122010", "");
//			ScanPayReqData scanPayReqData = new ScanPayReqData("130417670294720780", "容易网商品", "test", "1000001753309557", 1, "123", "127.0.0.1", "", "", "");
//			String response = scanPayService.request(scanPayReqData);
//			System.err.println(response);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * @Description: 测试查询微信扫码支付订单
	 * @Author: 柯军
	 * @datetime:2015年6月25日下午1:57:08
	 **/
	// @Test
	public void testWinxinQuery() {
		try {
			// ScanPayQueryReqData scanPayQueryReqData = new
			// ScanPayQueryReqData("1009290229201506250300791418","1000001753309557");
			// ScanPayQueryReqData scanPayQueryReqData = new
			// ScanPayQueryReqData("1220588601201508126069022737",
			// "1000001707022561");
			// PayQueryService scanPayQueryService = new PayQueryService();
			// // System.err.println(scanPayQueryReqData.toString());
			// String response =
			// scanPayQueryService.request(scanPayQueryReqData);
			// System.err.println(response);

			WeixinQueryOrderParamVO weixinQueryOrderParamVO = weixinPayService.queryOrder(null, "10000017533095571",1);
			System.err.println(weixinQueryOrderParamVO.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testWinxinScanRefund() {
		try {
			RefundService refundService = new RefundService();
//			RefundReqData refundReqData = new RefundReqData("1009290229201506250300791418", "1000001753309557", "123", "1234567890", 1, 1, "1220588601", "CNY",1);
//			String response = refundService.request(refundReqData);
//			System.err.println(response);
		} catch (Exception e) {
		}
	}

	/**
	 * 微信撤销订单
	 */
	// @Test
	public void testWeixinReverse() {
		try {
			ReverseService reverseService = new ReverseService();
			ReverseReqData reverseReqData = new ReverseReqData(null, "1000001640303291",null);
			String response = reverseService.request(reverseReqData,null);
			System.err.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


//	 @Test
	public void testQueryOrder() {
		 System.err.println(weixinPayService.queryOrder("1009290941201509100838184587",null,1));
	}
	
//	@Test
	public void testCloseOrder(){
		weixinPayService.closeOrder("1231",1);
	}
	 

	// @Test
	@Rollback(false)
	public void testBatchRefund() {
		weixinPayService.batchTriggerWeixinRefund();
	}

	 @Test
	public void testgetPaySignV3() {
		try {
			UnifiedorderService unifiedorderService = new UnifiedorderService();
//			unifiedorderService.getAppWeXinSign("1000000000211", 1, "test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testGetWeixinPaySign() {
//		Map<String, Object> map = weixinPayService.getAppWeXinSign("1000001111211", 1d,"","");
//		System.err.println(map.toString());
	}

//	@Test
//	public void testRefundV3() {
//		try {
//			RefundService refundService = new RefundService();
//			RefundReqData refundReqData = new RefundReqData(null, "1000001463574454", null, "1234131231231", 1, 1, ConstantUtil.PayWeiXin_V3.MCH_ID, null);
//			String result = refundService.request(refundReqData);
//			System.err.println("result=" + result);
//			RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
//			System.err.println(refundResData.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
//	@Test
	@Description("微信退款查询")
	public void testRefundQuery(){
		weixinPayUnit.checkRefundQueryResult(null, null, "0120288450816163215",1);

	}

	@Test
	public void testGetSign(){
//		payNo='0011518921216145847', totalFee=5000, body='容易网商品', orderType=1, timeStart
//				='2016-01-15 16:26:33', timeExpire='2016-01-15 16:41:33', appId='wxb0af59268c136d7d', openId='ofnj5s65nQk275rH2kQR4-CKHb1M'

//		{payNo='0011552743936151554', totalFee=15000, body='容易网商品', orderType=1, timeStart='2016-01-18 11:49:54', timeExpire='2016-01-18 12:04:54', appId='wxb0af59268c136d7d', openId='o0BDmjojF2JiWrcfhX6YLxP-w5kk'}
//		String timeStart = DateUtil.dateToString(DateUtil.getCurrDateTime());
		String timeStart ="2016-01-27 16:49:54";
//		String timeExpire = DateUtil.dateToString(DateUtil.addTime(DateUtil.getCurrDateTime(), 15, Calendar.MINUTE));
		String timeExpire = "2016-01-27 18:04:54";
		PaySignData paySignData = new PaySignData();
		paySignData.setTotalFee(15000);
		paySignData.setBody("容易网商品");
//		paySignData.setMallId("10");
//		paySignData.setOpenId("oljTBsyqrfuR9OxUsVURM56noPzY");
		paySignData.setOpenId("o0BDmjppq_rgjfZMdpSU5rPA-CFo");
		paySignData.setOrderType(0);
		paySignData.setPayNo("001276971084814022126");
		paySignData.setTimeStart(timeStart);
		paySignData.setTimeExpire(timeExpire);
		paySignData.setWeixinPayType(1);
		paySignData.setAppId("wxb0af59268c136d7d");
		Map map = weixinPayUnit.getWeXinPaySign(paySignData);
		System.err.println("map="+map.toString());
	}

	@Test
	public void testgetWeXinPaySign(){

		PaySignData paySignData = new PaySignData();
			paySignData.setPayNo("00127731097260142231122");
			paySignData.setTotalFee(1);
			paySignData.setBody("s");
			paySignData.setOrderType(0);
			paySignData.setOpenId("oljTBsyqrfuR9OxUsVURM56noPzY");
			paySignData.setAppId("wx749527272cae4b9b");
//			paySignData.setTimeStart("2016-01-27 14:22:14");
//			paySignData.setTimeExpire("2016-01-27 15:22:14");
		weixinPayService.getAppWeXinSign(paySignData);
	}


	public static String getRequestXml(SortedMap<Object, Object> parameters) {
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		Set es = parameters.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			if ("attach".equalsIgnoreCase(k) || "body".equalsIgnoreCase(k) || "sign".equalsIgnoreCase(k)) {
				sb.append("<" + k + ">" + "<![CDATA[" + v + "]]></" + k + ">");
			} else {
				sb.append("<" + k + ">" + v + "</" + k + ">");
			}
		}
		sb.append("</xml>");
		return sb.toString();
	}
}
