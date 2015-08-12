package com.rongyi.rpb.service;

import java.util.Map;

import org.json.JSONException;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.util.orderSign.weixinSign.client.ClientResponseHandler;

/**
 * @Author: 柯军
 * @Description: 微信支付
 * @datetime:2015年4月23日上午10:07:12
 * 
 **/
public interface WeixinPayService {

	/**
	 * 获取微信支付签名
	 * 
	 * @author kejun 2015年4月2日
	 * @param total_fee
	 * @param payNo
	 * @return
	 * @throws JSONException
	 */
	public abstract Map<String, Object> getAppWeXinSign(String payNo, double total_fee) throws JSONException;

	/**
	 * 验证是否是微信退款，是则返回true
	 * 
	 * @param event
	 * @return
	 */
	public abstract boolean validateIsWeixinPay(MessageEvent event);

	/**
	 * @Description: 获取微信退款发送消息
	 * @param event
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月9日下午4:42:39
	 **/
	public abstract Map<String, Object> getRefundMessageMap(MessageEvent event);

	/**
	 * mq接收微信退款消息
	 * 
	 * @param rpbEvent
	 */
	public abstract boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity);

	/**
	 * 
	 * 微信退款
	 * 
	 * @param payNo历史付款单号
	 * @param total_fee历史付款单总额
	 * @param refund_fee退款总额
	 *            (不大于付款总额)
	 * @param newPayNo付款单号
	 */
	public abstract boolean weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo);

	public abstract void savePaymentLogInfo(ClientResponseHandler resHandler, String newPayNo);

	public abstract String getResultMessage(String message);

	public abstract String getPennyByMoney(double totalFee);

	/**
	 * 微信关闭订单
	 */
	public abstract void closeOrder(String payNo);

	/**
	 * @Description: 查询订单
	 * @param payNo付款单号
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月10日下午2:28:05
	 **/
	public abstract WeixinQueryOrderParamVO queryOrder(String payNo);

}