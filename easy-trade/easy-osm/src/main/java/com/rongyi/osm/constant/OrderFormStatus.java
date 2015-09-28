package com.rongyi.osm.constant;

public interface OrderFormStatus {
	/* 订单未付款状态 */
	public static final String UNPAID = "1";
	
	/* 订单待发货状态 */
	public static final String TO_SHIPPED = "2";
	
	/* 订单已发货状态 */
	public static final String SHIPPED = "3";
	
	/* 订单确认收货状态 */
	public static final String CONFIRM_RECEIPT = "4";
	
	/* 订单关闭状态 */
	public static final String CLOSED = "5";
	
	/* 评论状态 */
	public static final String TO_COMMENT = "6";
	
	/* 评论关闭状态 */
	public static final String COMMENT_CLOSED = "7";
}
