package com.rongyi.rpb.web.controller.v5;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.util.AliAppPayNotify;
import com.rongyi.rpb.common.util.orderSign.webPageAlipay.alipay.util.AlipayNotify;
import com.rongyi.rpb.common.util.orderSign.weixinSign.ResponseHandler;
import com.rongyi.rpb.common.util.orderSign.weixinSign.util.XMLUtil;
import com.rongyi.rpb.constants.ConstantUtil;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.PaymentLogInfoService;
import com.rongyi.rpb.service.PaymentService;
import com.rongyi.rpb.service.WebPageAlipayService;
import com.rongyi.rpb.web.controller.BaseController;

/**
 * @author kejun 包含支付宝网页支付： 1.进入收银台之前页面，2.支付宝支付成功回调接口，3.支付宝支付失败接口
 */
@Controller
@RequestMapping(value = "/v5/WebPageAlipay")
public class WebPageAlipayController extends BaseController {

	protected static final Logger LOGGER = Logger.getLogger(WebPageAlipayController.class);

	@Autowired
	private WebPageAlipayService webPageAlipayService;

	@Autowired
	private PaymentLogInfoService paymentLogInfoService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	Sender sender;

	/**
	 * @Description: 支付宝页面支付，接收APP前台传来订单号进行支付宝网页支付相关操作（测试使用）
	 * @param orderId
	 * @param model
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月26日下午6:24:31
	 **/
	@RequestMapping("/zhifubaoRepay.htm")
	public String zhifubaoRepayTest(@RequestParam String orderId, Model model) {
		PaymentEntity paymentEntity = new PaymentEntity();
		paymentEntity.setPayNo(orderId);
		paymentEntity.setOrderNum(orderId);
		paymentEntity.setTradeType(0);
		paymentEntity.setOrderType(0);
		paymentService.insert(paymentEntity);
		String total_fee = "0.01";
		String itemName = "容易2015-03-25";
		try {
			Map<String, Object> map = webPageAlipayService.getToken(orderId, total_fee, itemName);
			model.addAttribute("content", map.get("sHtmlText"));
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return "zhifu";
	}

	/**
	 * @Description: 支付宝网页支付回调接口
	 * @param request
	 * @param model
	 * @param sign
	 * @param result
	 * @param out_trade_no
	 * @param trade_no
	 * @param request_token
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月26日下午6:24:16
	 **/
	@RequestMapping("/call_back.htm")
	public String callBack(HttpServletRequest request, Model model, String sign, String result, String out_trade_no, String trade_no, String request_token) {
		LOGGER.info("支付宝手机网页同步通知开始-->");
		try {
			Map<String, String> verifyMap = beforeVerify(request);
			if (!AlipayNotify.verifyReturn(verifyMap)) {
				LOGGER.info("支付宝网页支付同步通知-->支付宝验证签名不通过，返回消息不是支付宝发出的合法消息!");
				return "zhifuFail";
			}
			String orderNums = paymentService.getOrderNumStrsByPayNo(out_trade_no);
			// Sender.Notification notification = new Sender.Notification();
			// sender.addOrderNotification(orderNums, notification);
			List<PaymentEntity> list = paymentService.selectByPayNoAndTradeType(out_trade_no, 0);
			if (list != null && !list.isEmpty() && list.get(0).getStatus() != Constants.PAYMENT_STATUS.STAUS2) {
				paymentService.updateListStatusBypayNo(out_trade_no, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2);// 修改付款单状态
				paymentLogInfoService.paySuccessToMessage(out_trade_no, orderNums, list.get(0).getOrderType(), PaymentEventType.PAYMENT);

			}
			// if (!notification.isNotified()) {
			// notification.await(2000);
			// }
			// if (notification.isNotified()) {
			// LOGGER.info("osm同步返回通知订单号:" + orderNums);
			// if ("success".equals(result)) {
			// model.addAttribute("content", "支付成功");
			// } else {
			// model.addAttribute("content", "支付成功但是没有返回Result信息！");
			// }
			// }
			LOGGER.info("<---支付宝手机网页同步通知结束 ");
			return "zhifuSuccess";
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return "zhifuFail";
	}

	/**
	 * @Description: 手机网页支付成功通知
	 * @param request
	 * @param model
	 * @param notify_data
	 * @param sign
	 * @Author: 柯军
	 * @datetime:2015年6月26日下午6:24:05
	 **/
	@SuppressWarnings("unchecked")
	@RequestMapping("/notify_url.htm")
	public void notify(HttpServletRequest request, Model model, String notify_data, String sign) {
		Map<String, String> verifyMap = beforeVerify(request);
		if (!AlipayNotify.verifyNotify(verifyMap)) {
			LOGGER.info("支付宝网页支付异步通知-->支付宝验证签名不通过，返回消息不是支付宝发出的合法消息!");
			return;
		}
		PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
		try {
			Map<String, Object> map = XMLUtil.doXMLParse(notify_data);
			if (map.get("out_trade_no") != null) {
				PaymentLogInfo result = paymentLogInfoService.selectByOutTradeNo(map.get("out_trade_no").toString());
				if (result != null)
					return;
				if (!validateTradeStatus(map.get("trade_status").toString()))
					return;
				LOGGER.info("支付宝手机网页支付异步通知开始-->");
				paymentLogInfo.setNotifyId(map.get("notify_id").toString());
				if (map.get("buyer_email") != null)
					paymentLogInfo.setBuyer_email(map.get("buyer_email").toString());
				if (map.get("buyer_id") != null)
					paymentLogInfo.setBuyer_id(map.get("buyer_id").toString());
				if (map.get("notify_time") != null)
					paymentLogInfo.setNotifyTime(DateUtil.stringToDate(map.get("notify_time").toString()));
				if (map.get("notify_type") != null)
					paymentLogInfo.setNotifyType(map.get("notify_type").toString());
				if (map.get("out_trade_no") != null)
					paymentLogInfo.setOutTradeNo(map.get("out_trade_no").toString());
				if (map.get("gmt_payment") != null)
					paymentLogInfo.setTimeEnd(DateUtil.stringToDate(map.get("gmt_payment").toString()));
				if (map.get("total_fee") != null)
					paymentLogInfo.setTotal_fee(Double.valueOf(map.get("total_fee").toString()));
				if (map.get("trade_no") != null)
					paymentLogInfo.setTrade_no(map.get("trade_no").toString());
				paymentLogInfo.setTradeMode("1");
				paymentLogInfo.setReplayFlag(2);
				paymentLogInfo.setRequest_time(DateUtil.getCurrDateTime());
				paymentLogInfo.setBuyer_type(0);// 买家
				paymentLogInfo.setEventType(1);
				paymentLogInfo.setResult(map.get("trade_status").toString());
				paymentLogInfoService.insertPayNotify(paymentLogInfo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, PaymentEventType.PAYMENT);
				LOGGER.info("<--支付宝手机网页支付异步通知结束");
				model.addAttribute("content", "支付成功");
			}
		} catch (Exception e) {
			LOGGER.error("支付成功变更订单状态出错，错误原因：");
			e.printStackTrace();
		}
	}

	/**
	 * @Description: 手机APP支付通知
	 * @param request
	 * @param model
	 * @param notify_time
	 * @param notify_type
	 * @param notify_id
	 * @param sign_type
	 * @param sign
	 * @param out_trade_no
	 * @param trade_no
	 * @param buyer_id
	 * @param buyer_email
	 * @param total_fee
	 * @param trade_status
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月26日下午6:23:55
	 **/
	@RequestMapping("/app/notify_url.htm")
	public String appNotify(HttpServletRequest request, Model model, String notify_time, String notify_type, String notify_id, String sign_type, String sign, String out_trade_no, String trade_no,
			String buyer_id, String buyer_email, String total_fee, String trade_status) {
		PaymentLogInfo result = paymentLogInfoService.selectByNotifyId(notify_id);
		if (result != null)
			return null;
		if (!validateTradeStatus(trade_status))
			return null;
		Map<String, String> verifyMap = beforeVerify(request);
		if (!AliAppPayNotify.verify(verifyMap)) {
			LOGGER.info("支付宝手机APP支付异步通知-->支付宝验证签名不通过，返回消息不是支付宝发出的合法消息!");
			return null;
		}
		LOGGER.info("支付宝手机APP支付异步通知开始-->");
		PaymentLogInfo paymentLogInfo = getPaymentLogInfo(trade_no, out_trade_no, notify_id, notify_type, DateUtil.getCurrDateTime(), sign, sign_type, 0, 0, total_fee, buyer_email, buyer_id,
				Constants.REPLAY_FLAG.REPLAY_FLAG0);
		paymentLogInfoService.insertPayNotify(paymentLogInfo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, PaymentEventType.APP);
		LOGGER.info("<--支付宝手机APP支付异步通知结束");
		return "appwebpage/notify";
	}

	/**
	 * @Description: 微信支付异步通知
	 * @param model
	 * @param request
	 * @param response
	 * @param bank_type
	 * @param discount
	 * @param fee_type
	 * @param input_charset
	 * @param notify_id
	 * @param out_trade_no
	 * @param product_fee
	 * @param sign
	 * @param sign_type
	 * @param time_end
	 * @param total_fee
	 * @param trade_mode
	 * @param trade_state
	 * @param transaction_id
	 * @param transport_fee
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月26日下午6:23:41
	 **/
	@RequestMapping("/weixin/notify_url.htm")
	public String weixinNotify(Model model, HttpServletRequest request, HttpServletResponse response, String bank_type, String discount, String fee_type, String input_charset, String notify_id,
			String out_trade_no, String product_fee, String sign, String sign_type, String time_end, String total_fee, String trade_mode, String trade_state, String transaction_id,
			String transport_fee) {
		if (!"0".equals(trade_state))
			return null;
		ResponseHandler resHandler = new ResponseHandler(request, response);
		resHandler.setKey(ConstantUtil.PayWeiXin.PARTNER_KEY);
		if (!resHandler.isTenpaySign()) {
			LOGGER.info("微信支付异步通知-->微信验证签名不通过，返回消息不是财付通发出的合法消息!");
			return null;
		}
		try {
			PaymentLogInfo result = paymentLogInfoService.selectByOutTradeNo(out_trade_no);
			if (result != null)
				return null;
			LOGGER.info("微信支付异步通知开始-->");
			PaymentLogInfo paymentLogInfo = getPaymentLogInfo(transaction_id, out_trade_no, notify_id, null, DateUtil.getCurrDateTime(), sign, sign_type, 0, 0, total_fee, null, null,
					Constants.REPLAY_FLAG.REPLAY_FLAG3);
			paymentLogInfoService.insertPayNotify(paymentLogInfo, Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2, PaymentEventType.WEIXIN_PAY);
			LOGGER.info("<--微信支付异步通知结束");
		} catch (Exception e) {
			LOGGER.error(e);
		}

		return "appwebpage/notify";
	}

	/**
	 * 支付失败时支付宝端回调接口
	 * 
	 * @return 支付失败页面
	 */
	@RequestMapping("/merchant_url.htm")
	public String merchant_url() {
		return "zhifuFail";
	}

	/**
	 * 验证支付宝通知结果之前封装验证所需数据
	 * 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static Map<String, String> beforeVerify(HttpServletRequest request) {
		Map<String, String> verifyMap = new HashMap<String, String>();
		Map<String, String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = iter.next();
			String[] values = requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			verifyMap.put(name, valueStr);
		}
		return verifyMap;
	}

	private PaymentLogInfo getPaymentLogInfo(String tradeNo, String outTradeNo, String notifyId, String notifyType, Date notifyTime, String sign, String signType, Integer buyerType,
			Integer eventType, String totalFee, String buyerEmail, String buyerId, Integer replayFlag) {
		PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
		paymentLogInfo.setTrade_no(tradeNo);// 交易流水号
		paymentLogInfo.setOutTradeNo(outTradeNo);
		paymentLogInfo.setNotifyId(notifyId);
		paymentLogInfo.setNotifyType(notifyType);
		paymentLogInfo.setNotifyTime(notifyTime);
		paymentLogInfo.setNotifyTime(DateUtil.getCurrDateTime());
		paymentLogInfo.setReplayFlag(replayFlag);
		paymentLogInfo.setSign(sign);
		paymentLogInfo.setTradeMode("1");
		paymentLogInfo.setSignType(signType);
		paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
		paymentLogInfo.setBuyer_type(buyerType);// 买家账号
		paymentLogInfo.setEventType(eventType);
		paymentLogInfo.setTotal_fee(Double.valueOf(totalFee) / 100);// 微信金额单位为分
		paymentLogInfo.setResult("success");
		paymentLogInfo.setBuyer_email(buyerEmail);
		paymentLogInfo.setBuyer_id(buyerId);
		return paymentLogInfo;
	}

	/**
	 * @Description: 验证支付宝订单状态
	 * @param tradeStatus
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年4月24日上午10:47:02
	 **/
	private boolean validateTradeStatus(String tradeStatus) {
		LOGGER.info("支付宝订单状态：" + tradeStatus);
		return "TRADE_SUCCESS".equals(tradeStatus) || "TRADE_FINISHED".equals(tradeStatus);
	}
}
