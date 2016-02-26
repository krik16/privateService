package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.entity.v2.SalesCommission;
import com.rongyi.tms.service.v2.SalesCommissionService;
import org.springframework.stereotype.Repository;

/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * kejun
 * 2016/2/25 17:53
 **/
@Repository
public class SalesCommissionServiceImpl extends BaseServiceImpl implements SalesCommissionService{

    private  static final String NAMESPACE ="com.rongyi.tms.mapper.xml.v2.SalesCommissionMapper";
    @Override
    public void insert(SalesCommission salesCommission) {

        this.getBaseDao().insertBySql(NAMESPACE+".insertSelective",salesCommission);
    }
}
