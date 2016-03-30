package com.rongyi.tms.service.v2;

import com.rongyi.easy.settle.entity.OperationLog;

import java.util.Map;

/**
 * 对账单配置日志操作
 * Created by hebo on 2016/3/21.
 */
public interface CommissionConfigLogService {

    void insert(OperationLog log);

    OperationLog getLogByMap(Map<String, Object> searchMap);
}
