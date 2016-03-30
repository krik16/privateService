/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月11日下午3:28:58
 * @Description: TODO
 *
 **/

package com.rongyi.tms.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.tms.entity.DrawVerifyLog;
import com.rongyi.tms.service.DrawVerifyLogService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**	
 * @Author:  柯军
 * @Description: 提现申请审核日志service实现
 * @datetime:2015年5月11日下午3:28:58
 *
 **/

@Service
public class DrawVerifyLogServiceImpl extends BaseServiceImpl implements DrawVerifyLogService{
    private static final String INTEGRAL_COMM_NAMESPACE_DRAWVERIFYLOG = "com.rongyi.easy.tms.entity.xml.DrawVerifyLogMapper";
    /**
     * Description 
     * @param verifyLog
     * @return 
     * @see com.rongyi.tms.service.DrawVerifyLogService#createDrawVerifyLog(com.rongyi.easy.tms.entity.DrawVerifyLog) 
     */ 
    	
    @Override
    public int createDrawVerifyLog(DrawVerifyLog verifyLog) {
        return this.getBaseDao().insertBySql(INTEGRAL_COMM_NAMESPACE_DRAWVERIFYLOG + ".insert", verifyLog);
    }
    /**
     * Description 
     * @param applyId
     * @return 
     * @see com.rongyi.tms.service.DrawVerifyLogService#getLogByApplyId(java.lang.Integer) 
     */ 
    	
    @Override
    public DrawVerifyLog getLogByApplyId(Integer applyId) {
        Map<String, Object> parameterMap=new HashMap<String, Object>();
        parameterMap.put("applyId", applyId);
        return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWVERIFYLOG + ".selectByApplyId", parameterMap);
    }

    @Override
    public DrawVerifyLog getLatestLogByApplyId(Integer applyId) {
        Map<String, Object> parameterMap=new HashMap<String, Object>();
        parameterMap.put("applyId", applyId);
        return this.getBaseDao().selectOneBySql(INTEGRAL_COMM_NAMESPACE_DRAWVERIFYLOG + ".selectLatestByApplyId", parameterMap);
    }

}
