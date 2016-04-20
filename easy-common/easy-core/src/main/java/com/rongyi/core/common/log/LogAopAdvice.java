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
    private Logger logger = LoggerFactory.getLogger(LogAopAdvice.class);

    public void logIdInit() {
        logger.info("日志aop开始");

        String logId = RpcContext.getContext().getAttachment("logid");
        logger.info("RpcContext={}",logId);
        if(StringUtils.isBlank(logId)){
            logId = org.slf4j.MDC.get("logidFromController");
        }
        if(StringUtils.isBlank(logId)){
            logId =  org.apache.log4j.MDC.get("logidFromController") == null?null:org.apache.log4j.MDC.get("logidFromController").toString();
        }
        if(StringUtils.isBlank(logId)){
            //logger.info("RpcContext logid null");
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        org.slf4j.MDC.put("logid", logId);
        org.apache.log4j.MDC.put("logid", logId);
        RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {
        logger.info("日志aop结束");
        if(org.slf4j.MDC.get("logidFromController") == null){
            org.slf4j.MDC.remove("logid");
        }

        if(org.apache.log4j.MDC.get("logidFromController") == null){
            org.apache.log4j.MDC.remove("logid");
        }
    }

}
