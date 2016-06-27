package com.rongyi.settle.constants;

/**
 * @Description 分账信息常量
 * @author wudi
 * @date 2016年6月27日 上午11:26:42
 */
public class DivideAccountConstant {

	/**
	 * 分账订单：1-商品订单，2-卡券订单
	 */
	public static final Integer ORDER_TYPE_PRODUCT = 1;
	public static final Integer ORDER_TYPE_TRADE = 2;
	
	/**
	 * 订单数量，默认初始化一笔
	 */
	public static final Integer ORDER_NUM = 1;
	
	/**
	 * 卡券订单商品数量，默认一个
	 */
	public static final Integer UNIT_NUM = 1;
	
	/**
	 * 账单批次号默认序号
	 */
	public static final Integer BILL_BATCH_NO_DEFAULT = 1;
}
