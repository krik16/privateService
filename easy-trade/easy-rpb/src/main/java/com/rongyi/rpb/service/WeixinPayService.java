package com.rongyi.rpb.service;

import java.util.Map;

import org.json.JSONException;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;
import com.rongyi.easy.rpb.vo.WeixinQueryOrderParamVO;
import com.rongyi.rpb.common.pay.weixin.model.RefundQueryResData;
import com.rongyi.rpb.common.pay.weixin.model.RefundResData;

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
	 * @param totalFee
	 * @param payNo
	 * @param timeStart
	 * @param timeExpire
	 * @return
	 */
	public abstract Map<String, Object> getAppWeXinSign(String payNo, double totalFee,String timeStart,String timeExpire);

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
	 * @param paymentEntityVO
	 * @param hisPayEntity
	 */
	public abstract boolean messageToRefund(PaymentEntityVO paymentEntityVO, PaymentEntity hisPayEntity);

	/**
	 * 
	 * 微信退款
	 * 
	 * @param payNo 历史付款单号
	 * @param totalFee 历史付款单总额
	 * @param refundFee 退款总额
	 * @param newPayNo 付款单号
	 * @param tradeType 交易类型（0:购买 1:退款 2:打款给卖家 3:提现 4:异常支付 5:重复支付 6：重复支付退款）
	 */
	public abstract Map<String,Object>  weixinRefund(String payNo, double refundFee, double totalFee, String newPayNo,Integer tradeType);

	public void savePaymentLogInfo(RefundResData refundResData, Integer tradeType);

	public abstract String getResultMessage(String message);

	public abstract String getPennyByMoney(double totalFee);

	/**
	 * 微信关闭订单
	 */
	public abstract void closeOrder(String payNo);

	/**
	 * @Description: 查询订单
	 * @param tradeNo 交易流水号
	 * @param payNo 付款单号
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年8月10日下午2:28:05
	 **/
	public abstract WeixinQueryOrderParamVO queryOrder(String tradeNo,String payNo);

	/**	
	 * @Description: 微信定时批量退款 
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年8月27日上午10:38:00
	 **/
	public void batchTriggerWeixinRefund();
	
	/**	
	 * @Description: 微信退款结果查询 
	 * @param tradeNo 是微信系统为每一笔支付交易分配的订单号，通过这个订单号可以标识这笔交易，它由支付订单API支付成功时返回的数据里面获取到。建议优先使用
     * @param payNo 商户系统内部的订单号,tradeNo 、payNo 二选一，如果同时存在优先级：tradeNo>payNo
     * @param refundNo 商户系统内部的退款单号，商户系统内部唯一，同一退款单号多次请求只退一笔
     * @param refundNo、payNo 、tradeNo 三个参数必填一个，如果同时存在优先级为：refundNo>tradeNo>payNo
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月9日上午11:18:18
	 **/
	public RefundQueryResData refundQuery(String tradeNo,String payNo,String refundNo);
}