package com.rongyi.rpb.service.impl;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.util.orderSign.weixinSign.RequestHandler;
import com.rongyi.rpb.common.util.orderSign.weixinSign.client.ClientResponseHandler;
import com.rongyi.rpb.common.util.orderSign.weixinSign.client.TenpayHttpClient;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.MD5Util;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.WXUtil;
import com.rongyi.rpb.common.v3.weixin.model.ReverseReqData;
import com.rongyi.rpb.common.v3.weixin.model.ScanPayQueryReqData;
import com.rongyi.rpb.common.v3.weixin.service.PayQueryService;
import com.rongyi.rpb.common.v3.weixin.service.ReverseService;
import com.rongyi.rpb.common.v3.weixin.service.UnifiedorderService;
import com.rongyi.rpb.common.v3.weixin.util.Util;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PCWebPageAlipayService;
import com.rongyi.rpb.service.PaymentItemService;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.RpbEventService;
import com.rongyi.rpb.service.WeixinPayService;
import com.rongyi.rss.rpb.OrderNoGenService;

/**
 * @Author: 柯军
 * @Description: 微信支付
 * @datetime:2015年4月23日上午10:07:12
 * 
 **/
@Service
public class WeixinPayServiceImpl extends BaseServiceImpl implements WeixinPayService {

	@Autowired
	PCWebPageAlipayService pcWebPageAlipayService;

	@Autowired
	PaymentLogInfoService paymentLogInfoService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	OrderNoGenService orderNoGenService;

	@Autowired
	PaymentItemService paymentItemService;

	@Autowired
	RpbEventService rpbEventService;

	@Autowired
	Sender sender;

	private static final Logger LOGGER = LoggerFactory.getLogger(WeixinPayServiceImpl.class);

	@Override
	public Map<String, Object> getAppWeXinSign(String payNo, double total_fee) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BigDecimal totalFee = new BigDecimal(total_fee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
			UnifiedorderService unifiedorderService = new UnifiedorderService();
			map = unifiedorderService.getAppWeXinSign(payNo, totalFee.intValue(), "容易网商品");
			map.put("timestamp", WXUtil.getTimeStamp());
			map.put("code", 0);
			map.put("totlePrice", total_fee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public Map<String, Object> weixinRefundMessage(MessageEvent event, PaymentEntityVO paymentEntityVO, String payNo) {
		Map<String, Object> messageMap = new HashMap<String, Object>();
		messageMap.put("timestamp", DateUtil.getCurrDateTime().getTime());
		messageMap.put("source", Constants.SOURCETYPE.RPB);
		messageMap.put("type", event.getType());
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("orderDetailNum", paymentEntityVO.getOrderDetailNumArray());
		bodyMap.put("paymentId", payNo);
		bodyMap.put("orderNum", paymentEntityVO.getOrderNum());
		bodyMap.put("totalPrice", paymentEntityVO.getAmountMoney());
		messageMap.put("body", JSONObject.fromObject(bodyMap));
		return messageMap;
	}

	@Override
	public boolean validateIsWeixinPay(MessageEvent event) {
		PaymentEntityVO paymentEntityVO = paymentService.bodyToPaymentEntity(event.getBody(), null);
		PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntityVO.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
				Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);// 根据退款单记录中的订单号找到对应的历史付款单记录（用来查找付款交易流水号）
		if (paymentEntity == null)
			return false;
		return true;
	}

	@Override
	public Map<String, Object> getRefundMessageMap(MessageEvent event) {

		PaymentEntityVO paymentEntityVO = paymentService.bodyToPaymentEntity(event.getBody(), null);
		PaymentEntity paymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntityVO.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
				Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1);
		if (messageToRefund(paymentEntityVO, paymentEntity)) {
			return weixinRefundMessage(event, paymentEntityVO, paymentEntity.getPayNo());
		}
		return null;
	}

	@Override
	public boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity) {
		LOGGER.info("申请退款，退款单号-->" + hisPayEntity.getPayNo() + ",退款订单号-->" + hisPayEntity.getOrderNum());
		String newPayNo = paymentService.getPayNo();
		boolean result = weixinRefund(hisPayEntity.getPayNo(), paymentEntityVO.getAmountMoney().doubleValue(), hisPayEntity.getAmountMoney().doubleValue(), newPayNo);
		PaymentEntity paymentEntity = new PaymentEntity();
		BeanUtils.copyProperties(paymentEntityVO, paymentEntity);
		paymentEntity.setPayNo(newPayNo);
		paymentEntity.setTradeType(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1);
		paymentEntity.setCreateTime(DateUtil.getCurrDateTime());
		paymentEntity.setFinishTime(DateUtil.getCurrDateTime());
		paymentEntity.setPayChannel(hisPayEntity.getPayChannel());
		if (result)
			paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
		else {
			paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS0);
			LOGGER.info("微信退款失败,生成支付款记录，但未生成付款成功事件！");
		}
		paymentService.insertByOrderDetailNum(paymentEntity, paymentEntityVO.getOrderDetailNumArray());
		return result;
	}

	@Override
	public boolean weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo) {
		try {
			LOGGER.info("原付款单号-->" + payNo + ",付款总金额-->" + totalFee + ",退款单号-->" + newPayNo + ",退款金额-->" + refundFee);
			RequestHandler reqHandler = new RequestHandler(null, null);
			TenpayHttpClient httpClient = new TenpayHttpClient();
			// -----------------------------
			// 设置请求参数
			// -----------------------------
			reqHandler.init();
			reqHandler.setKey(ConstantUtil.PayWeiXin.PARTNER_KEY);
			reqHandler.setGateUrl(ConstantUtil.PayWeiXin.REFUND_URL);
			// -----------------------------
			// 设置接口参数
			// -----------------------------
			reqHandler.setParameter("service_version", ConstantUtil.PayWeiXin.VERSION);
			reqHandler.setParameter("partner", ConstantUtil.PayWeiXin.PARTNER);
			reqHandler.setParameter("out_trade_no", payNo);
			reqHandler.setParameter("out_refund_no", pcWebPageAlipayService.getBatchNo(null));
			reqHandler.setParameter("total_fee", getPennyByMoney(totalFee));
			reqHandler.setParameter("refund_fee", getPennyByMoney(refundFee));
			reqHandler.setParameter("op_user_id", ConstantUtil.PayWeiXin.PARTNER);
			// 操作员密码,MD5处理
			reqHandler.setParameter("op_user_passwd", MD5Util.MD5Encode(ConstantUtil.PayWeiXin.PASSWORD, ConstantUtil.PayWeiXin.ENCODE_GBK));
			// -----------------------------
			// 设置请求返回的等待时间
			httpClient.setTimeOut(5);
			// // 设置ca证书
			String classesPath = this.getClass().getClassLoader().getResource("").getFile();
			classesPath += "cret";
			httpClient.setCaInfo(new File(classesPath + "/cacert.pem"));
			// 设置个人(商户)证书
			LOGGER.info("证书目录=" + ConstantUtil.CRET_DIRECTORY);
			httpClient.setCertInfo(new File(ConstantUtil.CRET_DIRECTORY), ConstantUtil.PayWeiXin.PARTNER);
			// 设置发送类型POST
			httpClient.setMethod(ConstantUtil.PayWeiXin.METHOD_POST);
			// 设置请求内容
			String requestUrl;
			requestUrl = reqHandler.getRequestURL();
			httpClient.setReqContent(requestUrl);
			return getRescontent(httpClient, newPayNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private boolean getRescontent(TenpayHttpClient httpClient, String newPayNo) {
		try {
			ClientResponseHandler resHandler = new ClientResponseHandler();
			// 后台调用
			if (httpClient.call()) {
				// 设置结果参数
				resHandler.setContent(httpClient.getResContent());
				resHandler.setKey(ConstantUtil.PayWeiXin.PARTNER_KEY);
				// 获取返回参数
				String retcode = resHandler.getParameter("retcode");
				// 判断签名及结果
				if (resHandler.isTenpaySign() && "0".equals(retcode)) {
					return doResult(resHandler, newPayNo);
				} else {
					// 错误时，返回结果未签名，记录retcode、retmsg看失败详情。
					LOGGER.info("验证签名失败或业务错误,错误消息：" + resHandler.getParameter("retmsg"));
				}
			} else {
				// 有可能因为网络原因，请求已经处理，但未收到应答。
				LOGGER.info("后台调用通信失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * 退款状态 refund_status 4，10：退款成功。 3，5，6：退款失败。 8，9，11:退款处理中。 1，2:
	 * 未确定，需要商户原退款单号重新发起。 7：转入代发，退款到银行发现用户的卡作废或者冻结了，导致原路退款银行卡失败
	 * ，资金回流到商户的现金帐号，需要商户人工干预，通过线下或者财付通转账的方式进行退款。
	 */
	private boolean doResult(ClientResponseHandler resHandler, String newPayNo) {
		boolean result = false;// 微信退款接口处理结果
		String refundStatus = resHandler.getParameter("refund_status");
		if ("4".equals(refundStatus) || "10".equals(refundStatus)) {
			LOGGER.info("退款成功,退款状态为-->" + refundStatus);
			savePaymentLogInfo(resHandler, newPayNo);
			result = true;
		} else if ("8".equals(refundStatus) || "9".equals(refundStatus) || "11".equals(refundStatus)) {
			LOGGER.info("退款处理中,退款状态为-->" + refundStatus);
			savePaymentLogInfo(resHandler, newPayNo);
			result = true;
		} else if ("3".equals(refundStatus) || "5".equals(refundStatus) || "6".equals(refundStatus)) {
			LOGGER.info("退款失败,退款状态为-->" + refundStatus);
		} else
			LOGGER.info("退款结果未知，退款状态为-->" + refundStatus);

		return result;
	}

	@Override
	public void savePaymentLogInfo(ClientResponseHandler resHandler, String newPayNo) {
		PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
		paymentLogInfo.setNotifyTime(DateUtil.getCurrDateTime());
		paymentLogInfo.setSign(resHandler.getParameter("sign"));
		paymentLogInfo.setSignType("MD5");
		paymentLogInfo.setTradeMode("1");
		paymentLogInfo.setTransactionId(resHandler.getParameter("out_refund_no"));
		paymentLogInfo.setOutTradeNo(newPayNo);
		paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
		paymentLogInfo.setTrade_no(resHandler.getParameter("transaction_id"));
		paymentLogInfo.setResult(getResultMessage(resHandler.getParameter("retmsg")));
		paymentLogInfo.setTotal_fee(Double.valueOf(resHandler.getParameter("refund_fee")) / 100);// 微信金额单位为分，转换为元
		paymentLogInfo.setReplayFlag(3);
		paymentLogInfo.setBuyer_id(resHandler.getParameter("recv_user_id"));
		paymentLogInfo.setBuyer_email(resHandler.getParameter("reccv_user_name"));
		paymentLogInfo.setBuyer_type(0);// 买家账号
		paymentLogInfo.setEventType(4);
		// TODO 增加trade_type值

		paymentLogInfoService.insert(paymentLogInfo);
	}

	@Override
	public String getResultMessage(String message) {
		if (StringUtils.isNotEmpty(message))
			return message;
		else
			return "success";
	}

	@Override
	public String getPennyByMoney(double totalFee) {
		BigDecimal bgTotalFee = new BigDecimal(totalFee + "").multiply(new BigDecimal(100)).setScale(0, BigDecimal.ROUND_HALF_UP);
		return bgTotalFee.toString();
	}

	@Override
	public void closeOrder(String payNo) {
		try {
			ReverseService reverseService = new ReverseService();
			ReverseReqData reverseReqData = new ReverseReqData(null, payNo);
			String response = reverseService.request(reverseReqData);
			if (response.contains("CDATA[SUCCESS]")) {
				paymentService.deleteByPayNo(payNo);
				LOGGER.info("微信撤销订单成功，删除系统中支付单号-->" + payNo + " 付款记录");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("微信撤销订单失败，付款单号-->" + payNo);
		}
	}

	@Override
	public WeixinQueryOrderParamVO queryOrder(String tradeNo, String payNo) {
		WeixinQueryOrderParamVO weixinQueryOrderParamVO = new WeixinQueryOrderParamVO();
		try {
			PayQueryService payQueryService = new PayQueryService();
			ScanPayQueryReqData scanPayQueryReqData = new ScanPayQueryReqData(tradeNo, payNo);
			String result = payQueryService.request(scanPayQueryReqData);
			LOGGER.info("微信订单查询结果-->" + result);
			return (WeixinQueryOrderParamVO) Util.getObjectFromXML(result, WeixinQueryOrderParamVO.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return weixinQueryOrderParamVO;
	}

	// public static String orderquery(String out_trade_no) {
	// DefaultHttpClient httpclient = new DefaultHttpClient();
	// String result = null;
	// try {
	// String access_token = AccessTokenRequestHandler.getAccessToken();
	// String url = ConstantUtil.PayWeiXin.QUERY_URL + access_token;
	// JSONObject jsonObject = new JSONObject();
	// jsonObject.put("appid", ConstantUtil.PayWeiXin.APP_ID);
	// String timestamp = Long.toString(System.currentTimeMillis() / 1000);
	// jsonObject.put("timestamp", timestamp);
	// jsonObject.put("sign_method", "sha1");
	// String sign = "out_trade_no=" + out_trade_no + "&partner=" +
	// ConstantUtil.PayWeiXin.PARTNER + "&key=" +
	// ConstantUtil.PayWeiXin.PARTNER_KEY;
	// sign = MD5Util.MD5Encode(sign, "utf-8");
	// sign = sign.toUpperCase();
	// String packageStr = "out_trade_no=" + out_trade_no + "&partner=" +
	// ConstantUtil.PayWeiXin.PARTNER + "&sign=" + sign;
	// jsonObject.put("package", packageStr);
	// SortedMap<String, String> prePayParams = new TreeMap<String, String>();
	// prePayParams.put("appid", ConstantUtil.PayWeiXin.APP_ID);
	// prePayParams.put("appkey", ConstantUtil.PayWeiXin.APP_KEY);
	// prePayParams.put("package", packageStr);
	// prePayParams.put("timestamp", timestamp);
	// String app_signature = Sha1Util.createSHA1Sign(prePayParams);
	// jsonObject.put("app_signature", app_signature);
	// HttpPost httpost = new HttpPost(url);
	// StringEntity postEntity = new StringEntity(jsonObject.toString(),
	// "UTF-8");
	// httpost.setEntity(postEntity);
	// HttpResponse response = httpclient.execute(httpost);
	// HttpEntity entity = response.getEntity();
	// result = EntityUtils.toString(entity, "UTF-8");
	// } catch (Exception e) {
	// e.printStackTrace();
	// } finally {
	// httpclient.close();
	// }
	// return result;
	// }

	@Override
	public void batchTriggerWeixinRefund() {
		List<String> failList = new ArrayList<String>();
		List<PaymentEntity> list = paymentService.selectByTradeTypeAndRefundRejected(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE1, Constants.PAYMENT_PAY_CHANNEL.PAY_CHANNEL1,
				Constants.REFUND_REJECTED.REFUND_REJECTED0, Constants.PAYMENT_STATUS.STAUS0);
		for (PaymentEntity paymentEntity : list) {
			PaymentEntity oldPaymentEntity = paymentService.selectByOrderNumAndTradeType(paymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,
					paymentEntity.getPayChannel());
			if (weixinRefund(oldPaymentEntity.getPayNo(), paymentEntity.getAmountMoney().doubleValue(), oldPaymentEntity.getAmountMoney().doubleValue(), paymentEntity.getPayNo())) {
				paymentEntity.setStatus(Constants.PAYMENT_STATUS.STAUS2);
				paymentService.updateByPrimaryKeySelective(paymentEntity);
				String target = Constants.SOURCETYPE.OSM;
				String orderDetailNum = "";
				if (Constants.ORDER_TYPE.ORDER_TYPE_1 == oldPaymentEntity.getOrderType()) {
					target = Constants.SOURCETYPE.COUPON;
					List<PaymentItemEntity> itemList = paymentItemService.selectByPaymentId(paymentEntity.getId());
					orderDetailNum = paymentItemService.getDetailNum(itemList);
				}
				MessageEvent event = rpbEventService.getMessageEvent(paymentEntity.getPayNo(), paymentEntity.getOrderNum(), orderDetailNum, paymentEntity.getPayChannel().toString(), null,
						Constants.SOURCETYPE.RPB, target, PaymentEventType.REFUND);
				sender.convertAndSend(event);
			} else {
				failList.add(paymentEntity.getPayNo());
			}
		}
		if (failList.isEmpty())
			LOGGER.info("微信批量退款成功！");
		else
			LOGGER.info("微信批量退款失败单号-->" + failList.toString());
	}
}
