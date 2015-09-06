package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

import base.BaseTest;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.util.orderSign.weixinSign.client.TenpayHttpClient;
import com.rongyi.rpb.common.v3.weixin.model.RefundQueryReqData;
import com.rongyi.rpb.common.v3.weixin.model.RefundReqData;
import com.rongyi.rpb.common.v3.weixin.model.RefundResData;
import com.rongyi.rpb.common.v3.weixin.model.ReverseReqData;
import com.rongyi.rpb.common.v3.weixin.model.ScanPayReqData;
import com.rongyi.rpb.common.v3.weixin.model.ScanPayService;
import com.rongyi.rpb.common.v3.weixin.service.RefundQueryService;
import com.rongyi.rpb.common.v3.weixin.service.RefundService;
import com.rongyi.rpb.common.v3.weixin.service.ReverseService;
import com.rongyi.rpb.common.v3.weixin.service.UnifiedorderService;
import com.rongyi.rpb.common.v3.weixin.util.RandomStringGenerator;
import com.rongyi.rpb.common.v3.weixin.util.Signature;
import com.rongyi.rpb.common.v3.weixin.util.Util;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.WeixinPayService;

public class WeixinPayServiceTest extends BaseTest {

	@Autowired
	WeixinPayService weixinPayService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	Sender sender;

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
		weixinPayService.weixinRefund("1000000384208367", 0.01, 0.01, "10000003840682312");
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

			WeixinQueryOrderParamVO weixinQueryOrderParamVO = weixinPayService.queryOrder(null, "10000017533095571");
			System.err.println(weixinQueryOrderParamVO.toString());
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
	// @Test
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

	// @Test
	public void testQueryOrder() {
		TenpayHttpClient httpClient = new TenpayHttpClient("UTF-8");
		httpClient.setReqContent("https://api.mch.weixin.qq.com/pay/orderquery");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("appid", "wxf379a9c3029f1f15");
		map.put("mch_id", "1220588601");
		map.put("transaction_id", "1220588601201508116025541515");
		/* map.put("out_trade_no","1000001768287279"); */
		// 随机字符串，不长于32 位
		String nonce_str = RandomStringGenerator.getRandomStringByLength(32);
		map.put("nonce_str", nonce_str);
		// 根据API给的签名规则进行签名
		String sign = Signature.getSign(map);
		// map.put("sign", sign);
		// String postDataXML = xStreamForRequestPostData.toXML(map);

		String postDataXML = "<xml>" + "<appid>wxf379a9c3029f1f15</appid>" + "<mch_id>1220588601</mch_id>" + "<nonce_str>" + nonce_str + "</nonce_str>"
		/* + "<out_trade_no>1000001768287279</out_trade_no>" */
		+ "<transaction_id>1220588601201508116025541515</transaction_id>" + "<sign>" + sign + "</sign>" + "</xml>";
		boolean bool = httpClient.callHttpPost("https://api.mch.weixin.qq.com/pay/orderquery", postDataXML);
		System.err.println("bool=" + bool);
		String resContent = httpClient.getResContent();
		System.err.println(resContent);
	}

	// @Test
	public void testQueryOrder2() {
		System.err.println(ConstantUtil.CRET_DIRECTORY);
		// System.err.println(weixinPayService.queryOrder("10000002315977421").getRet_code());
	}

	// @Test
	@Rollback(false)
	public void testBatchRefund() {
		weixinPayService.batchTriggerWeixinRefund();
	}

	// @Test
	public void testgetPaySignV3() {
		try {
			UnifiedorderService unifiedorderService = new UnifiedorderService();
			unifiedorderService.getAppWeXinSign("100000000011", 1, "test");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// @Test
	public void testGetWeixinPaySign() {
		Map<String, Object> map = weixinPayService.getAppWeXinSign("1000001111211", 1d);
		System.err.println(map.toString());
	}

//	@Test
	public void testRefundV3() {
		try {
			RefundService refundService = new RefundService();
			RefundReqData refundReqData = new RefundReqData(null, "1000001463574454", null, "1234131231231", 1, 1, ConstantUtil.PayWeiXin_V3.PARTNER, null);
			String result = refundService.request(refundReqData);
			System.err.println("result=" + result);
			RefundResData refundResData = (RefundResData) Util.getObjectFromXML(result, RefundResData.class);
			System.err.println(refundResData.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
	public void testRefundV3_2() {
		try {
			testRefund_result();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Description("微信退款查询")
	public void testRefundQuery(){
		try{
		RefundQueryService refundQueryService = new RefundQueryService();
		RefundQueryReqData refundQueryReqData = new RefundQueryReqData("1220588601201508316278769187",null, null, null, null);
		String result = refundQueryService.request(refundQueryReqData);
		System.err.println("result"+result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

	public void testRefund_result() throws Exception {
		RefundReqData refundReqData = new RefundReqData(null, "1000001463574454", null, "1234131231231", 1, 1, "1220588601", null);
		SortedMap<Object, Object> parameters = new TreeMap<Object, Object>();
		parameters.put("appid", refundReqData.getAppid());
		parameters.put("mch_id", refundReqData.getMch_id());
		parameters.put("nonce_str", refundReqData.getNonce_str());
		// 在notify_url中解析微信返回的信息获取到 transaction_id，此项不是必填，详细请看上图文档
		parameters.put("transaction_id", refundReqData.getTransaction_id());
		parameters.put("out_trade_no", refundReqData.getOut_trade_no());
		parameters.put("out_refund_no", refundReqData.getOut_refund_no()); // 我们自己设定的退款申请号，约束为UK
		parameters.put("total_fee", refundReqData.getTotal_fee().toString()); // 单位为分
		parameters.put("refund_fee", refundReqData.getRefund_fee().toString()); // 单位为分
		parameters.put("op_user_id", refundReqData.getOp_user_id());
		// String sign = createSign("utf-8", parameters);
		parameters.put("sign", refundReqData.getSign());

		String reuqestXml = getRequestXml(parameters);
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		FileInputStream instream = new FileInputStream(new File("F:\\etc\\rongyi\\easy-rpb-cert\\1220588601.pfx"));// 放退款证书的路径
		try {
			keyStore.load(instream, refundReqData.getMch_id().toCharArray());
		} finally {
			instream.close();
		}

		SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, refundReqData.getMch_id().toCharArray()).build();
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null, SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
		CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
		try {

			HttpPost httpPost = new HttpPost("https://api.mch.weixin.qq.com/secapi/pay/refund");// 退款接口

			System.out.println("executing request" + httpPost.getRequestLine());
			StringEntity reqEntity = new StringEntity(reuqestXml);
			// 设置类型
			reqEntity.setContentType("application/x-www-form-urlencoded");
			httpPost.setEntity(reqEntity);
			CloseableHttpResponse response = httpclient.execute(httpPost);
			try {
				HttpEntity entity = response.getEntity();

				System.out.println("----------------------------------------");
				System.out.println(response.getStatusLine());
				if (entity != null) {
					System.out.println("Response content length: " + entity.getContentLength());
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(entity.getContent(), "UTF-8"));
					String text;
					while ((text = bufferedReader.readLine()) != null) {
						System.out.println(text);
					}

				}
				EntityUtils.consume(entity);
			} finally {
				response.close();
			}
		} finally {
			httpclient.close();
		}
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
