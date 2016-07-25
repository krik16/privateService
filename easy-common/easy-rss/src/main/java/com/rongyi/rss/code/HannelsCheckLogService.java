package com.rongyi.rss.code;

import com.rongyi.easy.code.HannelsCheckLogParam;

/**
 * Created by shaozhou on 2016/7/4.
 */
public interface HannelsCheckLogService {
    /**
     * 审核不通过/作废 推广码插入日志
     * @param param
     * @return
     */
    int insertLog(HannelsCheckLogParam param);
}
