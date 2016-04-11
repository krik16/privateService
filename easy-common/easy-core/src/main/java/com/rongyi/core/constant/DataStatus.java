package com.rongyi.core.constant;

/**
 * 数据状态基础接口
 * Created by liulei on 2016/2/26.
 */
public interface DataStatus {
	/** 数据状态：正常、有效 **/
    public static final int STATUS_OK 		= 1;
    /** 数据状态：删除、无效 **/
    public static final int STATUS_DELETE 	= 0;
    /** 数据状态：无效 **/
    public static final int STATUS_INVALID 	= STATUS_DELETE;
}
