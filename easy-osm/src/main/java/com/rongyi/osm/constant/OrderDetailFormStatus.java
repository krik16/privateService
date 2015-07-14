package com.rongyi.osm.constant;

/**
 * 子订单状态常量
 * @author 
 */
public interface OrderDetailFormStatus {
	
	/** 正常状态：表示和大单状态一致 **/
	public static final String NORMAL = "0";

    /** 待退款 */
    public static final String TO_REFUND = "1";
    
    /** 已关闭 */
    public static final String CLOSED = "2";
    
    /** 维权中 */
    public static final String ON_ADULTS = "3";
}
