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


        String logId = RpcContext.getContext().getAttachment("logid");
        logger.info("aop 开始 RpcContext={}",logId);

        if(StringUtils.isBlank(logId)){
            logId = org.slf4j.MDC.get("logidFromController");
        }
        if(StringUtils.isBlank(logId)){
            logId =  org.apache.log4j.MDC.get("logidFromController") == null?null:org.apache.log4j.MDC.get("logidFromController").toString();
        }
        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        org.slf4j.MDC.put("logid", logId);
        org.apache.log4j.MDC.put("logid", logId);

        //aop多次切入，计数，只有最后一次会清楚mdc的logid
        if(org.slf4j.MDC.get("aopCount") != null){
            org.slf4j.MDC.put("aopCount",String.valueOf(Integer.parseInt(org.slf4j.MDC.get("aopCount")) + 1));
        }
        else{
            org.slf4j.MDC.put("aopCount","1");
        }

        if(org.apache.log4j.MDC.get("aopCount") != null){
            org.apache.log4j.MDC.put("aopCount",String.valueOf(Integer.parseInt(org.apache.log4j.MDC.get("aopCount").toString()) + 1));
        }
        else{
            org.apache.log4j.MDC.put("aopCount","1");
        }

        RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {
        logger.info("aop 结束");
        org.slf4j.MDC.put("aopCount",String.valueOf(Integer.parseInt(org.slf4j.MDC.get("aopCount")) - 1));
        org.apache.log4j.MDC.put("aopCount",String.valueOf(Integer.parseInt(org.apache.log4j.MDC.get("aopCount").toString()) - 1));

        if(org.slf4j.MDC.get("logidFromController") == null){
            if(Integer.parseInt(org.slf4j.MDC.get("aopCount")) == 0)
            {
                logger.info("aop 清楚logid");
                org.slf4j.MDC.remove("logid");
            }
        }

        if(org.apache.log4j.MDC.get("logidFromController") == null){
            if(Integer.parseInt(org.apache.log4j.MDC.get("aopCount").toString()) == 0)
            {
                logger.info("aop 清楚logid");
                org.apache.log4j.MDC.remove("logid");
            }
        }
    }

    public void exceptionProcess()
    {
        logger.info("aop 出错");
        org.slf4j.MDC.remove("logid");
        org.apache.log4j.MDC.remove("logid");
    }

}
