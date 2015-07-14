package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import base.BaseTest;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.RefundReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.RefundService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ReverseReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ReverseService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayQueryReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayQueryService;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayReqData;
import com.rongyi.rpb.common.util.orderSign.weixinSign.scan.ScanPayService;
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

	// @Test
	public void testSelectByPrimaryKey() {
		// weixinPayService.getWeixinRefund("1000001898510594" ,0.01, 0.01);
		List<PaymentEntity> list = paymentService.selectByPayNoAndTradeType("1000000239630150", 0);
		if (list == null || list.size() == 0 || !list.get(0).getStatus().equals(2)) {
			System.err.println(111);
		}
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

	 @Test
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
	// @Test
	public void testWinxinScanQuery() {
		try {
			ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData("1009290229201506250300791418", "1000001753309557");
			ScanPayQueryService scanPayQueryService = new ScanPayQueryService();
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

}
