package com.rongyi.rpb.web.controller.v5;

import com.rongyi.core.common.util.DateUtil;
import com.rongyi.core.constant.PaymentEventType;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentItemEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.vo.PayNotifyVO;
import com.rongyi.rpb.constants.Constants;
import com.rongyi.rpb.mq.Sender;
import com.rongyi.rpb.service.*;
import com.rongyi.rpb.web.controller.BaseController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LiuChao 2014年8月26日16:17 支付宝网页支付API。 包含支付宝网页支付：
 *         1.进入收银台之前页面，2.支付宝支付成功回调接口，3.支付宝支付失败接口
 */
@Controller
@RequestMapping(value = "/v5/PCWebPageAlipay")
public class PCWebPageAlipayController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(PCWebPageAlipayController.class);

	@Autowired
	private PCWebPageAlipayService pcWebPageAlipayService;

	@Autowired
	private PaymentLogInfoService paymentLogInfoService;

	@Autowired
	RpbEventService rpbEventService;

	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentItemService paymentItemService;

	@Autowired
	Sender sender;

	/**
	 * 单条操作
	 * 
	 * @author kejun 2015年3月24日
	 * @param paymentId
	 * @param model
	 * @return
	 */
	@RequestMapping("/zhifubaoRepay.htm")
	public String webPageAlipay(@RequestParam String paymentId, Model model) {

		LOGGER.info("pc端单条支付开始-->");
		try {
			PaymentEntity paymentEntity = paymentService.selectByPrimaryKey(paymentId);
			Map<String, Object> map = new HashMap<String, Object>();
			if (Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE2 == paymentEntity.getTradeType()) {// 打款给卖家
				map = pcWebPageAlipayService.getOnePayInfo(paymentEntity.getPayNo(), paymentEntity.getAmountMoney().toString(), "13564452580", "柯军", "test");
			} else {// 退款给客户
				PaymentEntity hisPayEntity = paymentService.selectByOrderNumAndTradeType(paymentEntity.getOrderNum(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0, Constants.PAYMENT_STATUS.STAUS2,null);// 根据退款单记录中的订单号找到对应的历史付款单记录（用来查找付款交易流水号）
				PaymentLogInfo paymentLogInfo = paymentLogInfoService.selectByOutTradeNo(hisPayEntity.getPayNo(),hisPayEntity.getTradeType());
				if (paymentLogInfo != null)
					map = pcWebPageAlipayService.getRefunInfo(paymentEntity, "1", paymentEntity.getAmountMoney().toString(), paymentLogInfo.getTrade_no(), "协商退款");
				else
					LOGGER.info("退款失败，历史付款单记录查找不存，请确认订单号:" + paymentEntity.getOrderNum() + "付款记录是否存在！");
			}
			model.addAttribute("content", map.get("sHtmlText"));
		} catch (Exception e) {
			LOGGER.error(e);
		}
		LOGGER.info("<--pc端单条支付开始");
		return "payManager/zhifu";
	}

	/**
	 * 批量操作
	 * 
	 * @author kejun 2015年4月1日
	 * @param ids
	 * @param type
	 * @param model
	 * @return
	 */
	@RequestMapping("/zhifubaoBatchPay.htm")
	public String zhifubaoBatchPay(@RequestParam String ids, @RequestParam Integer type, Model model) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			List<Map<String, Object>> buyerList = null;
			String[] idArray = ids.substring(1).split(",");
			if (Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE2 == type) {
				buyerList = pcWebPageAlipayService.getBatchPayBuyerMessage(idArray, "test");
				map = pcWebPageAlipayService.getBatchPayInfo(buyerList);
			} else {
				buyerList = pcWebPageAlipayService.getBatchRefundBuyerMessage(idArray, "test");
				map = pcWebPageAlipayService.getBatchRefunInfo(buyerList);
			}
			model.addAttribute("content", map.get("sHtmlText"));
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return "payManager/zhifu";
	}

	/**
	 * 支付宝打款成功通知
	 * 
	 * @author kejun 2015年3月25日
	 * @param model
	 * @param notify_id
	 * @param sign_type
	 * @param sign
	 * @param batch_no
	 * @param pay_user_id
	 * @param pay_user_name
	 * @param pay_account_no
	 * @param success_details
	 * @return
	 */
	@RequestMapping("/pay_notify_url.htm")
	public String notifyPay(Model model, String notify_time, String notify_type, String notify_id, String sign_type, String sign, String batch_no, String pay_user_id, String pay_user_name,
			String pay_account_no, String success_details) {
		PaymentLogInfo result = paymentLogInfoService.selectByNotifyId(notify_id);
		if (result != null)
			return null;
		LOGGER.info("支付宝打款成功异步通知开始-->");
		LOGGER.info("返回结果:" + success_details);
		List<PaymentEntity> allList = new ArrayList<PaymentEntity>();
		String[] detailList = success_details.split("\\|");
		if (detailList != null && detailList.length > 0) {
			for (String details : detailList) {
				PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
				parsPayDetail(paymentLogInfo, details);
				paymentLogInfo.setNotifyId(notify_id);
				paymentLogInfo.setNotifyType(notify_type);
				paymentLogInfo.setNotifyTime(DateUtil.stringToDate(notify_time));
				paymentLogInfo.setReplayFlag(2);
				paymentLogInfo.setResult("success");
				paymentLogInfo.setSign(sign);
				paymentLogInfo.setTradeMode("1");
				paymentLogInfo.setSignType(sign_type);
				paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
				paymentLogInfo.setEventType(2);
				paymentLogInfo.setBuyer_type(1);
				paymentLogInfoService.insertGetId(paymentLogInfo);
				List<PaymentEntity> paymentList = paymentService.updateListStatusBypayNo(paymentLogInfo.getOutTradeNo(), null, Constants.PAYMENT_STATUS.STAUS2);// 修改打款状态(提现或打款给卖家)
				if (paymentList != null && !paymentList.isEmpty())
					allList.add(paymentList.get(0));
			}
		}
		if (!allList.isEmpty() && allList.get(0).getTradeType().equals(Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE3)) {
			paySuccessToMessage(allList);
		}
		LOGGER.info("<--支付宝打款成功异步通知结束");
		return "payManager/notify";
	}

	/**
	 * @Description: 支付成功发送通知消息
	 * @param
	 * @param
	 * @Author: 柯军
	 * @datetime:2015年5月21日上午11:53:11
	 **/
	public void paySuccessToMessage(List<PaymentEntity> list) {
		List<PayNotifyVO> payNotifylist = new ArrayList<PayNotifyVO>();
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		for (PaymentEntity paymentEntity : list) {
			PayNotifyVO payNotifyVO = new PayNotifyVO();
			payNotifyVO.setDrawNo(paymentEntity.getOrderNum());
			payNotifyVO.setTradeNo(paymentEntity.getPayNo());
			payNotifylist.add(payNotifyVO);
		}
		bodyMap.put("drawApplyList", payNotifylist);
		MessageEvent event = new MessageEvent();
		event.setSource(Constants.SOURCETYPE.RPB);
		event.setTarget(Constants.SOURCETYPE.TMS);
		event.setTimestamp(DateUtil.getCurrDateTime().getTime());
		event.setType(PaymentEventType.PAY_NOTIFY);
		event.setBody(bodyMap);
		sender.convertAndSend(event);
	}

	private PaymentLogInfo parsPayDetail(PaymentLogInfo paymentLogInfo, String details) {
		String[] detail = details.split("\\^");
		if (detail != null) {
			if (detail.length > 0)
				paymentLogInfo.setOutTradeNo(detail[0]);// 订单号是流水号8位之后的值
			if (detail.length > 1)
				paymentLogInfo.setBuyer_email(detail[1]);
			if (detail.length > 3)
				paymentLogInfo.setTotal_fee(Double.valueOf(detail[3]));
			if (detail.length > 6)
				paymentLogInfo.setTrade_no(detail[6]);
		}
		return paymentLogInfo;
	}

	/**
	 * 支付宝退款成功回调
	 * 
	 * @author kejun 2015年3月25日
	 * @param model
	 * @param notify_time
	 * @param notify_type
	 * @param notify_id
	 * @param sign_type
	 * @param sign
	 * @param batch_no
	 * @param success_num
	 * @param result_details
	 * @return
	 */
	@RequestMapping("/refund_notify_url.htm")
	public String notifyRefund(Model model, String notify_time, String notify_type, String notify_id, String sign_type, String sign, String batch_no, String success_num, String result_details) {
		PaymentLogInfo result = paymentLogInfoService.selectByNotifyId(notify_id);
		if (result != null)
			return "payManager/notify";
		LOGGER.info("返回结果：" + result_details+",批量单号-->"+batch_no);
		if (!validateTradeStatus(result_details)) {
			LOGGER.info("该订单状态支付宝不允许退款，退款状态未变更，退款事件记录未生成！");
			return "payManager/notify";
		}
		LOGGER.info("支付宝退款成功异步通知开始-->");
		String[] batchDetail = result_details.split("#");
		if (batchDetail != null) {
			try {
				for (int i = 0; i < batchDetail.length; i++) {
					PaymentLogInfo paymentLogInfo = new PaymentLogInfo();
					String[] details = batchDetail[i].split("\\^");
					if (details != null) {
						paymentLogInfo.setTrade_no(details[0]);// 交易流水号
						paymentLogInfo.setTotal_fee(Double.valueOf(details[1]));
						paymentLogInfo.setTransactionId(batch_no);
						paymentLogInfo.setNotifyId(notify_id);
						paymentLogInfo.setNotifyType(notify_type);
						paymentLogInfo.setNotifyTime(DateUtil.stringToDate(notify_time));
						paymentLogInfo.setReplayFlag(2);
						paymentLogInfo.setResult(details[2]);
						paymentLogInfo.setSign(sign);
						paymentLogInfo.setTradeMode("1");
						paymentLogInfo.setSignType(sign_type);
						paymentLogInfo.setTimeEnd(DateUtil.getCurrDateTime());
						paymentLogInfo.setBuyer_type(0);// 买家账号
						paymentLogInfo.setEventType(3);
						PaymentEntity refundPaymentEntity =  getPaymentByPayTradeNo(paymentLogInfo.getTrade_no(),batch_no);
						if (refundPaymentEntity != null) {
							paymentLogInfo.setTradeType(refundPaymentEntity.getTradeType());
							paymentLogInfo.setOutTradeNo(refundPaymentEntity.getPayNo());
							paymentLogInfoService.insertGetId(paymentLogInfo);
							LOGGER.info("更改退款项状态 0--->2,退款单号=" + refundPaymentEntity.getPayNo());
							paymentService.updateListStatusBypayNo(refundPaymentEntity.getPayNo(), refundPaymentEntity.getTradeType(), Constants.PAYMENT_STATUS.STAUS2);// 修改打款状态
							refundNotifyMq(refundPaymentEntity);
						}else{
							LOGGER.info("订单不存在，退款状态更新失败.交易流水号-->"+paymentLogInfo.getTrade_no()+",批量单号-->"+batch_no);
						}
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		LOGGER.info("<--支付宝退款成功异步通知结束");
		return "payManager/notify";
	}

	/**
	 * @Description: 支付宝退款通知成功后发送退款成功消息到订单系统
	 * @param refundPaymentEntity
	 * @Author: 柯军
	 * @datetime:2015年7月12日上午10:22:20
	 **/
	private void refundNotifyMq(PaymentEntity refundPaymentEntity) {
		Map<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("orderNum", refundPaymentEntity.getOrderNum());
		bodyMap.put("totalPrice", refundPaymentEntity.getAmountMoney());
		bodyMap.put("paymentId", refundPaymentEntity.getPayNo());
		List<PaymentItemEntity> itemList = paymentItemService.selectByPaymentId(refundPaymentEntity.getId());
		bodyMap.put("orderDetailNum", paymentItemService.getDetailNum(itemList));
		MessageEvent event = new MessageEvent();
		if (Constants.ORDER_TYPE.ORDER_TYPE_1 == refundPaymentEntity.getOrderType())// 优惠券订单退款
			event.setTarget(Constants.SOURCETYPE.COUPON);
		else
			// 商品订单
			event.setTarget(Constants.SOURCETYPE.OSM);
		event.setSource(Constants.SOURCETYPE.RPB);
		event.setTimestamp(DateUtil.getCurrDateTime().getTime());
		event.setType(PaymentEventType.REFUND);
		event.setBody(bodyMap);
		sender.convertAndSend(event);
	}

	/**
	 * @Description: 
	 *               退款成功根据交易流水号获得付款记录，根据付款记录中付款单号可获得支付订单号，支付订单号和退款订单号相同，根据订单号获得退款单号
	 * @param tradeNo
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月26日下午5:45:59
	 **/
	private PaymentEntity getPaymentByPayTradeNo(String tradeNo,String batchNo) {
	PaymentEntity refundPaymentEntity = null;
	PaymentLogInfo oldPaymentLogInfo = paymentLogInfoService.selectByPayTradeNo(tradeNo);
	List<PaymentEntity> paymentEntityList = paymentService.selectByPayNoAndTradeType(oldPaymentLogInfo.getOutTradeNo(), Constants.PAYMENT_TRADE_TYPE.TRADE_TYPE0);
	if (paymentEntityList != null && !paymentEntityList.isEmpty()) {
		refundPaymentEntity = paymentService.selectByOrderNumAndBatchNo(paymentEntityList.get(0).getOrderNum(), batchNo);
	}
	return refundPaymentEntity;
}

	/**
	 * 支付失败时支付宝端回调接口
	 * 
	 * @return 支付失败页面
	 */
	@RequestMapping("/merchant_url.htm")
	public String merchantUrl() {
		return "zhifuFail";
	}

	/**
	 * @Description: 验证支付宝订单状态
	 * @param tradeStatus
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年4月24日上午10:47:02
	 **/
	private boolean validateTradeStatus(String tradeResult) {
		return tradeResult.contains("TRADE_SUCCESS") || tradeResult.contains("SUCCESS");
	}
}
