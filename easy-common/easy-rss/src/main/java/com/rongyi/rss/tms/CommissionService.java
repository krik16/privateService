package com.rongyi.rss.tms;

import com.rongyi.core.bean.ResponseData;
import com.rongyi.easy.tms.vo.v2.CommissionVO;

import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/26 10:22
 **/
public interface CommissionService {

    /**
     * 返佣
     * @param commissionVO 请求参数对象
     * @return ResponseData
     */
    ResponseData addCommission(CommissionVO commissionVO);

    /**
     * 摩店返佣列表查询（推广/首单）
     * @param params 请求参数对象
     * @return ResponseData
     */
    ResponseData getCommissionList(Map<String, Object> params);

    /**
     * 摩店返佣详情查询（推广/首单）
     * @param id 佣金id
     * @return ResponseData
     */
    ResponseData getCommissionInfo(Integer id);
}
