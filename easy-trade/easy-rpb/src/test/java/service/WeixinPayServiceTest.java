package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import base.BaseTest;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.util.orderSign.weixinSign.AccessTokenRequestHandler;
import com.rongyi.rpb.common.util.orderSign.weixinSign.client.TenpayHttpClient;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.RandomStringGenerator;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.RefundReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.RefundService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ReverseReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ReverseService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayQueryReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayQueryService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.Signature;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.WeixinPayService;

public class WeixinPayServiceTest extends BaseTest{

	@Autowired
	WeixinPayService weixinPayService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	Sender sender;

	 @Test
	public void testSelectByPrimaryKey() {
		// weixinPayService.getWeixinRefund("1000001898510594" ,0.01, 0.01);
		List<PaymentEntity> list = paymentService.selectByPayNoAndTradeType("1000001597030813", 0);
			System.err.println(list.toArray().toString());
	}

	// @Test
	public void testGetWeixinRefund_new() {
		// weixinPayService.getWeixinRefund_new("1220588601201504086010224597",
		// "1000000572383071", "101220111", 1, 1);
	}

	// @Test
	public void testGetWeixinRefund() {
		weixinPayService.weixinRefund("1000000364118778", 0.02, 0.02, "1000000364111231");
		// weixinPayService.getAppWeXinSign("1000000197371298", 0.01);
	}

//	 @Test
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
		sender.convertSendAndReceive("coupon_order_queue", map);
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
			ScanPayReqData scanPayReqData = new ScanPayReqData("130417670294720780", "容易网商品", "test", "1000001753309557", 1, "123", "127.0.0.1", "", "", "");
			String response = scanPayService.request(scanPayReqData);
			System.err.println(response);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * @Description: 测试查询微信扫码支付订单
	 * @Author: 柯军
	 * @datetime:2015年6月25日下午1:57:08
	 **/
//	 @Test
	public void testWinxinScanQuery() {
		try {
//			ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData("1009290229201506250300791418","1000001753309557");
			ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData("1220588601201508126069022737","1000001707022561");
			ScanPayQueryService scanPayQueryService = new ScanPayQueryService();
//			System.err.println(scanPayQueryReqData.toString());
			String response = scanPayQueryService.request(scanPayQueryReqData);
			System.err.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testWinxinScanRefund() {
		try {
			RefundService refundService = new RefundService();
			RefundReqData refundReqData = new RefundReqData("1009290229201506250300791418", "1000001753309557", "123", "1234567890", 1, 1, "1220588601", "CNY");
			String response = refundService.request(refundReqData);
			System.err.println(response);
		} catch (Exception e) {
		}
	}

	/**
	 * 微信撤销订单
	 */
//	@Test
	public void testWeixinReverse() {
		try {
			ReverseService reverseService = new ReverseService();
			ReverseReqData reverseReqData = new ReverseReqData(null, "1000001640303291");
			String response = reverseService.request(reverseReqData);
			System.err.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
//	@Test
	public void testQueryOrder(){
		TenpayHttpClient httpClient = new TenpayHttpClient("UTF-8");
		httpClient.setReqContent("https://api.mch.weixin.qq.com/pay/orderquery");
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("appid", "wxf379a9c3029f1f15");
        map.put("mch_id", "1220588601");
        map.put("transaction_id", "1220588601201508116025541515");
        /*map.put("out_trade_no","1000001768287279");*/
        //随机字符串，不长于32 位
        String nonce_str = RandomStringGenerator.getRandomStringByLength(32);
        map.put("nonce_str",nonce_str);
        //根据API给的签名规则进行签名
        String sign = Signature.getSign(map);
//        map.put("sign", sign);
//		String postDataXML = xStreamForRequestPostData.toXML(map);

        String postDataXML = "<xml>"
        		+ "<appid>wxf379a9c3029f1f15</appid>"
        		+ "<mch_id>1220588601</mch_id>"
        		+ "<nonce_str>"+nonce_str+"</nonce_str>"
        	/*	+ "<out_trade_no>1000001768287279</out_trade_no>"*/
        		+ "<transaction_id>1220588601201508116025541515</transaction_id>"
        		+ "<sign>"+sign+"</sign>"
        		+ "</xml>";
		boolean bool = httpClient.callHttpPost("https://api.mch.weixin.qq.com/pay/orderquery", postDataXML);
		System.err.println("bool="+bool);
		String resContent = httpClient.getResContent();
		System.err.println(resContent);
	}

	@Test
	public void testQueryOrder2(){
		 System.err.println(ConstantUtil.CRET_DIRECTORY);
		System.err.println(weixinPayService.queryOrder("10000002315977421").getRet_code());
		
		
	}
	
}
