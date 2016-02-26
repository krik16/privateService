package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.easy.tms.vo.v2.SalesCommissionVO;

import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:47
 **/
public interface SalesCommissionService {

    void insert(SalesCommission salesCommission);

    /**
     * 佣金列表
     * @param map
     * @return
     */
    List<SalesCommissionVO> findCommissionList(Map<String, Object> map);

    /**
     * 佣金总条数
     * @param map
     * @return
     */
    int countCommission(Map<String, Object> map);
}
