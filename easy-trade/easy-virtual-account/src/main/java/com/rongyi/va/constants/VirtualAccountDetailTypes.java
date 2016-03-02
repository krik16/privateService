/** 
* @Title: VirtualAccountDetailStatus.java 
* @Package com.rongyi.va.constants 
* @Description: 账户明细项目类型
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月11日 下午9:06:21 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.va.constants;

/**
 * @author ZhengYl
 *
 */
public interface VirtualAccountDetailTypes {
	/** 账户明细项目类型（1 返佣，2 奖金 ，3 支付款，4 罚款，5 提现） */
	
	/** 交易返佣 */
	public static final int COMMISSION = 1;
	
	/** 奖金 */
	public static final int BONUS = 2;
	
	/** 支付款 */
	public static final int PAYMENT = 3;
	
	/** 罚款 */
	public static final int FINE = 4;
	
	/** 提现 */
	public static final int WITHDRAW = 5;
	
	/** 优惠券返佣*/
	public static final int COUPON_COMMISSION = 6;

	/**
	 * 推广返佣
	 */
	 int EXTEND_COMMISSION=7;

	/**
	 * 首单返佣
	 */
	int FIRST_COMMISSION=8;
}
