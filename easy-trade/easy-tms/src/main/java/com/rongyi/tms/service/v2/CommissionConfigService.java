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

    Integer selectPageCount(Map<String,Object> map);

    /**
     *  查询是否有符合佣金增加条件的配置
     * @param type 返佣类型
     * @param inviteType 邀请人类型
     * @param registerType 注册人类型
     * @param effectTime 配置有效日期
     * @return CommissionConfig
     */
    CommissionConfig selectByTypes(Integer type,Integer inviteType,Integer registerType,Date effectTime);

    /**
     *验证是否有符合条件的返佣规则
     * @param type 返佣类型(0:推广返佣,1:首单返佣,2:小票返佣)
     * @param effectStartTime 生效起始时间
     * @param effectEndTime 生效结束时间
     * @return boolean
     */
    boolean validateIsExist(byte type,byte inviteType,byte registerType, Date effectStartTime,Date effectEndTime);

}
