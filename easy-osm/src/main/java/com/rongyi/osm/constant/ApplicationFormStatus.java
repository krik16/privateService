package com.rongyi.osm.constant;

public interface ApplicationFormStatus {
	/** 状态 1申请退款 2商家拒绝处理 3已退款  4申请维权 5维权中 6维权结束 */
	
	/** 申请退款 */
	public static final int REFUND_REQUESTING = 1;
	
	/** 商家拒绝 */
	public static final int REFUND_REFUSED = 2;
	
	/** 已退款 */
	public static final int REFUNDED = 3;
	
	/** 申请维权 */
	public static final int APPEAL_REQUESTING = 4;
	
	/** 维权中 */
	public static final int APPEALING = 5;
	
	/** 结束 */
	public static final int APPEALED = 6;
	
	/** 买家放弃 */
	public static final int REFUND_CANNEL = 7;
	
	/** 买家放弃维权 */
	public static final int APPEAL_CANCEL = 8;
	
	/** 维权由于同意退款而终止时的固定说明 */
	public static final String APPEAL_ENDED_BY_REFUNDING_RESULT = "维权由于卖家同意退款而终止";
	
}
