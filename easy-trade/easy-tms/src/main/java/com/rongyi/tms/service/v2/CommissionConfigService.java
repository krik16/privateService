package com.rongyi.tms.service.v2;

import com.rongyi.easy.tms.entity.v2.CommissionConfig;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:47
 **/
public interface CommissionConfigService {

    void  insert(CommissionConfig commissionConfig);

    void update(CommissionConfig commissionConfig);

    CommissionConfig selectById(Integer id);

    List<CommissionConfig> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize);

    /**
     *  查询是否有符合佣金增加条件的配置
     * @param type 返佣类型
     * @param inviteType 邀请人类型
     * @param registerType 注册人类型
     * @param effectTime 配置有效日期
     * @return CommissionConfig
     */
    CommissionConfig selectByTypes(Integer type,Integer inviteType,Integer registerType,Date effectTime);


}
