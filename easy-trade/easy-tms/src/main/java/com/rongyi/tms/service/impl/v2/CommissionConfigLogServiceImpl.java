package com.rongyi.tms.service.impl.v2;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.tms.service.v2.CommissionConfigLogService;
import org.springframework.stereotype.Service;

/**
 * 对账单配置日志操作
 * Created by hebo on 2016/3/21.
 */
@Service("commissionConfigLogService")
public class CommissionConfigLogServiceImpl extends BaseServiceImpl implements CommissionConfigLogService{

    private static final String NAMESPACE = "com.rongyi.tms.mapper.xml.v2.OperationLogMapper";

    @Override
    public void insert(OperationLog log) {
        this.getBaseDao().insertBySql(NAMESPACE+".insert", log);
    }
}
