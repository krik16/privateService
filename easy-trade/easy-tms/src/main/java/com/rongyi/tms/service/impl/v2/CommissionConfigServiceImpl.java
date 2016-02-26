package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.entity.v2.CommissionConfig;
import com.rongyi.tms.service.v2.CommissionConfigService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:54
 **/
public class CommissionConfigServiceImpl extends BaseServiceImpl implements CommissionConfigService{

    private static final Logger LOGGER = LoggerFactory.getLogger(CommissionConfigServiceImpl.class);

    private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.v2.CommissionConfigMapper";
    @Override
    public void insert(CommissionConfig commissionConfig) {

        this.getBaseDao().insertBySql(NAMESPACE+".insertSelective",commissionConfig);
    }

    @Override
    public void update(CommissionConfig commissionConfig) {
        this.getBaseDao().updateBySql(NAMESPACE+".updateByPrimaryKeySelective",commissionConfig);
    }

    @Override
    public CommissionConfig selectById(Integer id) {
        Map<String,Object> map = new HashMap<>();
        map.put("id",id);
        return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByPrimaryKey",map);
    }

    @Override
    public List<CommissionConfig> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        return this.getBaseDao().selectListBySql(NAMESPACE+".selectPageList",map);
    }
}
