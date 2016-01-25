/**
 * @Copyright (C),上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年6月4日下午2:55:06
 * @Description: TODO
 *
 **/
package com.rongyi.rss.rpb;

import java.util.List;
import java.util.Map;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.domain.PaymentLogInfo;
import com.rongyi.easy.rpb.domain.WeixinMch;
import com.rongyi.easy.rpb.vo.PayAccountUseTotal;
import com.rongyi.easy.rpb.vo.PaymentParamVO;
import com.rongyi.easy.rpb.vo.QueryOrderParamVO;

/**
 * @Author: 柯军
 * @Description: 支付账单系统接口
 * @datetime:2015年6月4日下午2:55:06
 *
 **/

public interface IRpbService {
	/**
	 * @Description: 根据付款单id验证打款账号是否被禁用
	 * @param paymentIds 多个付款单号用逗号隔开
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年6月4日下午3:46:18
	 **/
	Map<Integer,String> validateAccount(String paymentIds) throws Exception;

	/**
	 * @Description: 根据交易流水号查询对应的付款记录
	 * @param tradeNo
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年6月11日下午3:48:36
	 **/
	PaymentLogInfo selectByTradeNo(String tradeNo);

	/**
	 * @Description: 收到操作微信退款
	 * @param id
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年7月12日下午1:12:12
	 **/
	Map<String, Object> operateWeixinRefund(Integer id);

	/**
	 * @Description: 订单支付完成后前端收到支付成功同步通知后端完成支付（更改支付状态） 
	 * @param orderNo
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年7月30日上午9:48:46
	 **/
	Map<String,Object> paySuccessNotify(String orderNo,Double totalAmount);


	/**
	 * @Description: 查询订单
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月7日下午1:39:56
	 **/
	QueryOrderParamVO queryOrder(Map<String,Object> map);

	/**
	 * @Description: 查询订单在第三方系统中状态
	 * @param tradeNo//交易流水号
	 * @param payNo//付款单号
	 * @param payChannel//付款方式(0:支付宝，1:微信)
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月11日下午4:50:55
	 **/
	boolean queryOrderPayStatus(String tradeNo, String payNo, Integer payChannel,Integer weixinMchId);

	/**
	 * @Description: 查询支付账号购买次数
	 * @param map//给定count参数查询大于该count的所有账号
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月12日上午11:46:46
	 **/
	List<PayAccountUseTotal> selectPayAccountUseTotal(Map<String, Object> map);


	/**
	 * @Description: 获取支付签名
	 * @param event
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月24日下午5:46:02
	 **/
	Map<String, Object> getPaySign(MessageEvent event);

	/**
	 * @Description: 查询付款记录
	 * @param orderNum
	 * @param tradeType
	 * @param status
	 * @param payChannel
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月26日上午9:55:55
	 **/
	PaymentEntity selectByOrderNumAndTradeType(String orderNum, Integer tradeType, Integer status,Integer payChannel);

	/**
	 * @Description: 拒绝/同意 微信退款 
	 * @param paymentId
	 * @param refundRejected
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年8月28日上午10:38:48
	 **/
	Map<String,Object> weixinRefundRejected(Integer paymentId,Integer refundRejected);

	/**
	 * @Description: 付款/退款操作前验证是否付款操作条件 
	 * @param ids
	 * @param operateType
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年9月1日下午2:44:13
	 **/
	Map<String,Object> validatePayHtml(String[] ids,Integer operateType);

	/**
	 * @Description: 生成付款
	 * @param paymentParamVO
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年9月28日下午1:32:47
	 **/
	Map<String,Object> generatePayment(PaymentParamVO paymentParamVO);

	/**
	 * @Description: 更新付款单状态
	 * @param ids
	 * @param status
	 * @param tradeType
	 * @Author:  柯军
	 * @datetime:2015年10月14日下午6:33:40
	 **/
	void updatePaymentStatus(String[] ids,Integer status,Integer tradeType);

	/**
	 * Description: 取消/同意 异常支付
	 * @param paymentId Integer
	 * @param refundRejected Integer
	 * Author:  柯军
	 * datetime:2015年8月28日上午10:38:48
	 **/

	Map<String,Object> exceCancelPay(Integer paymentId,Integer refundRejected);

	/**
	 * Description: 根据公众号和商场ID查询微信公众支付账号信息
	 * @param publicCode String
	 * @param mallId String
	 * Author:  柯军
	 **/

	WeixinMch selectByParam(String publicCode,String mallId);

	/**
	 *  Description:插入商家公众号相关信息
	 *  @param weixinMch WeixinMch
	 *  Author: kejun
	 **/
	ResponseData insertWeiXinMch(WeixinMch weixinMch);

	/**
	 *  Description:更新商家公众号相关信息
	 *  @param weixinMch WeixinMch
	 *  Author: kejun
	 **/
	ResponseData updateWeixinMch(WeixinMch weixinMch);



}
