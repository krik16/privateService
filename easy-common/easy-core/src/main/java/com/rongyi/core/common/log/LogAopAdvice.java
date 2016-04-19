package com.rongyi.core.common.log;

//import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.commons.lang.StringUtils;
//import org.apache.log4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Description: 日志切面，注入唯一logid
 *
 * @author yujisun
 * @date 2015/7/30
 */
public class LogAopAdvice
{
    //private Logger logger = LoggerFactory.getLogger(LogAopAdvice.class);

    public void logIdInit() {
        String logId = RpcContext.getContext().getAttachment("logid");
        if(StringUtils.isBlank(logId)){
            logId = org.slf4j.MDC.get("logidFromController");
        }
        if(StringUtils.isBlank(logId)){
            org.apache.log4j.MDC.get("logidFromController");
        }
        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        org.slf4j.MDC.put("logid", logId);
        org.apache.log4j.MDC.put("logid", logId);
        RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {
        org.slf4j.MDC.remove("logid");
        org.apache.log4j.MDC.remove("logid");
    }

}
