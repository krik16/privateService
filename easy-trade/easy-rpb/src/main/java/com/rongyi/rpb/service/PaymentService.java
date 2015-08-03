package com.rongyi.rpb.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.rpb.domain.PaymentEntity;
import com.rongyi.easy.rpb.vo.PaymentEntityVO;

/**
 * @Author: 柯军
 * @Description: 付款单
 * @datetime:2015年4月23日上午10:03:11
 * 
 **/
public interface PaymentService {

	/**
	 * 分页数据显示
	 * 
	 * @param searchValueMap
	 * @return
	 */
	public abstract List<PaymentEntityVO> selectPageListBySearch(Map<String, Object> searchValueMap);

	/**
	 * 分页数据总条数
	 * 
	 * @param searchValueMap
	 * @return
	 */
	public abstract Long selectPageListCountBySearch(Map<String, Object> searchValueMap);

	/**
	 * 根据osm传入的数据插入数据库，如果存在多个子订单则分多条插入
	 * 
	 * @param paymentEntity
	 * @param orderDetailNum
	 */
	public abstract void insertByOrderDetailNum(PaymentEntity paymentEntity, String orderDetailNum);

	/**
	 * rpbEvent body中业务数据转换为ParmentEntityVO
	 * 
	 * @param body
	 * @param type
	 * @return
	 */
	public abstract PaymentEntityVO bodyToPaymentEntity(Object body, String type);

	/**
	 * 多个订单生成一个付款单号
	 * 
	 * @author kejun 2015年3月27日
	 * @param paymentEntityVO
	 * @return
	 */
	public abstract List<PaymentEntity> getPaymemtsByMoreOrderNum(PaymentEntityVO paymentEntityVO);

	/**
	 * 根据付款单号获取所有订单号（多个订单号用逗号分隔）
	 * 
	 * @param payNo
	 * @return
	 */
	public abstract String getOrderNumStrsByPayNo(String payNo);

	public abstract List<PaymentEntity> selectByPayNo(String payNo);

	/**
	 * 生成mq同步通知信息
	 * 
	 * @param message
	 * @return
	 */
	public abstract Map<String, Object> getSendMessage(MessageEvent event);

	/**
	 * 订单事件插入数据库，返回生成的付款单号（可能存在多条订单对应同一个付款单号，最终支付使用的是付款单号）
	 * 
	 * @param event
	 * @return
	 */
	public abstract PaymentEntityVO insertOrderMessage(MessageEvent event);

	/**
	 * 验证订单号是否存在，如果已存在则是重复提交订单，直接返回直接生成的订单号(此处只有前端ROB支付时才需验证)
	 * 
	 * @param orderNum
	 * @return 返回时null是证明不存在
	 */
	public abstract PaymentEntity validateOrderNumExist(String orderNum, Integer payChannel, Integer tradeType);

	/**
	 * 商品价格为0时特殊处理
	 * 
	 * @author kejun 2015年4月2日
	 * @param message
	 * @return
	 */
	public abstract Map<String, Object> getZeroSendMessage(MessageEvent event,Map<String, Object> messageMap, PaymentEntityVO paymentEntityVO);

	public abstract String getTitle(String orderNum);

	public abstract List<PaymentEntity> selectByPayNoAndTradeType(String payNo, Integer tredeType);

	public abstract Map<String, String> insert(PaymentEntity paymentEntity);

	public abstract PaymentEntity selectByPrimaryKey(String id);

	public abstract List<PaymentEntity> selectByOrderNum(String orderNum,Integer tradeType);

	public abstract PaymentEntity selectByOrderNumAndTradeType(String orderNum, int tradeType, int status);
	

	public abstract int updateByPrimaryKeySelective(PaymentEntity paymentEntity);

	/**
	 * @Description: 提现申请生成待付款记录
	 * @param event
	 * @Author: 柯军
	 * @datetime:2015年5月20日上午11:53:17
	 **/
	public abstract PaymentEntity insertDrawApply(MessageEvent event);

	public abstract Map<String, Object> getBodyMap(String payNo, String orderNum, String orderDetailNum, String source, String target, String type);

	public abstract List<PaymentEntity> updateListStatusBypayNo(String payNo, Integer tradeTsype, Integer status);

	public abstract void deleteByPayNo(String payNo);
	
	/**	
	 * @Description: 根据订单号和退款批量单号查询 
	 * @param orderNum
	 * @param batchNo
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年8月3日下午4:56:12
	 **/
	public abstract PaymentEntity selectByOrderNumAndBatchNo(String orderNum,String batchNo);

}
