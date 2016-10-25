package service;

import base.BaseTest;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.pay.weixin.model.*;
import com.rongyi.rpb.common.pay.weixin.service.RefundService;
import com.rongyi.rpb.common.pay.weixin.service.ReverseService;
import com.rongyi.rpb.common.pay.weixin.service.UnifiedorderService;
import com.rongyi.rpb.common.pay.weixin.util.Configure;
import com.rongyi.rpb.common.pay.weixin.util.HttpsRequest;
import com.rongyi.rpb.common.pay.weixin.util.MD5;
import com.rongyi.rpb.common.pay.weixin.util.RandomStringGenerator;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.WeixinConfigService;
import com.rongyi.rpb.service.WeixinPayService;
import com.rongyi.rpb.unit.WeixinPayUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class WeixinPayServiceTest extends BaseTest {

	@Autowired
	WeixinPayService weixinPayService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	WeixinConfigService weixinConfigService;
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
			ScanPayReqData scanPayReqData = new ScanPayReqData("130417670294720780", "容易网商品", "test", "1000001753309557", 1, "123", "127.0.0.1", "", "", "",null);
			String response = scanPayService.request(scanPayReqData,null);
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

			WeixinQueryOrderParamVO weixinQueryOrderParamVO = weixinPayService.queryOrder(null, "10000017533095571",null);
			System.err.println(weixinQueryOrderParamVO.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testWinxinScanRefund() {
		try {
			RefundService refundService = new RefundService();
			RefundReqData refundReqData = new RefundReqData("1009290229201506250300791418", "1000001753309557", "123", "1234567890", 1, 1, "1220588601",null);
			String response = refundService.request(refundReqData,null);
			System.err.println(response);
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
		 System.err.println(weixinPayService.queryOrder("1009290941201509100838184587",null,null));
	}
	
//	@Test
	public void testCloseOrder(){
		weixinPayService.closeOrder("1231",null);
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

//	 @Test
//	 public void testGetWeixinPaySign() {
//		Map<String, Object> map = weixinPayService.getAppWeXinSign("1000001111211", 1d,"","");
//		System.err.println(map.toString());
//	}

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
	
	@Test
	@Description("微信退款查询")
	public void testRefundQuery(){
		weixinPayUnit.checkRefundQueryResult(null, null, "0011939128576122600",null);

	}

	@Test
	public void testgetWeXinPaySign(){
//		payNo=0011957252096104310,total_fee=0.01，timeStart=2016-01-19 10:43:05,timeExpire=2016-01-19 11:00:05,orderType=0
//		weixinPayService.getAppWeXinSign("0011957252096104310",0.01,"2016-01-19 10:43:05","2016-01-19 11:00:05",0);
	}


	@Test
	public void testRefundNotifyThird(){
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setOrderNum("100113");
		paymentEntity.setAmountMoney(new BigDecimal(100000.00));
		paymentEntity.setPayNo("0061300156160135507");
		weixinPayService.refundNotifyThird(paymentEntity);
	}

	@Test
	public void testRedBack(){
//openId		oljTBs3jTQyXgDzxzpXrsoRGZkF4
//		Integer weixinMchId,String mchBillno, String sendName,String reOpenid,
// int totalAmount,String wishing,
//				String actName,String remark
//		weixinPayUnit.sendRedPack(2, "12321231", "rongyiwang", "oljTBs3jTQyXgDzxzpXrsoRGZkF4", 100, "thank", "fuli", "test");
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

	@Test
	public void testRedPack() throws Exception{
//		initSDKConfiguration("","","","","");

		RedPackReqData bean = new RedPackReqData();
		bean.setNonce_str(RandomStringGenerator.getRandomStringByLength(32));
		bean.setMch_billno(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())+new Random().nextInt(10));
		bean.setMch_id("1307525901");
		bean.setWxappid("wx749527272cae4b9b");
		bean.setSend_name("商户名称");
		bean.setRe_openid("oljTBs3jTQyXgDzxzpXrsoRGZkF4");
		bean.setTotal_amount(100);//金额分
		bean.setTotal_num(1);//发送人数
		bean.setWishing("红包祝福语");
		bean.setClient_ip("活动名称");
		bean.setAct_name("java");
		bean.setRemark("备注");

		bean.setSign(getSign(bean));
		Configure configure = weixinConfigService.initConfigure(2);

		HttpsRequest https = new HttpsRequest();
		String rets = https.sendPost("https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack", bean,configure);
		System.out.println(rets);
	}

	public static String getSign(Object o) throws IllegalAccessException {
		ArrayList<String> list = new ArrayList<String>();
		Class cls = o.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
			if (f.get(o) != null && f.get(o) != "") {
				list.add(f.getName() + "=" + f.get(o) + "&");
			}
		}
		int size = list.size();
		String [] arrayToSort = list.toArray(new String[size]);
		Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i ++) {
			sb.append(arrayToSort[i]);
		}
		String result = sb.toString();
		result += "key=" + "b24aaabb1ea8a155c4572570cd260313";
		result = MD5.MD5Encode(result).toUpperCase();
		return result;
	}
}
