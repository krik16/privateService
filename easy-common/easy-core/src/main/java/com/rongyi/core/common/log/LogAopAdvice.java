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
    public void logIdInit() {


        String logId = RpcContext.getContext().getAttachment("logid");

        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        org.slf4j.MDC.put("logid", logId);
        org.apache.log4j.MDC.put("logid", logId);

        //aop多次切入，计数，只有最后一次会清楚mdc的logid
        if(org.slf4j.MDC.get("logCount") != null){
            org.slf4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.slf4j.MDC.get("logCount")) + 1));
        }
        else{
            org.slf4j.MDC.put("logCount","1");
        }

        if(org.apache.log4j.MDC.get("logCount") != null){
            org.apache.log4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.apache.log4j.MDC.get("logCount").toString()) + 1));
        }
        else{
            org.apache.log4j.MDC.put("logCount","1");
        }

        RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {

        org.slf4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.slf4j.MDC.get("logCount")) - 1));
        org.apache.log4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.apache.log4j.MDC.get("logCount").toString()) - 1));

        if(Integer.parseInt(org.slf4j.MDC.get("logCount")) == 0)
        {
            org.slf4j.MDC.remove("logid");
        }

        if(Integer.parseInt(org.apache.log4j.MDC.get("logCount").toString()) == 0)
        {
            org.apache.log4j.MDC.remove("logid");
        }
    }

    public void exceptionProcess()
    {
        org.slf4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.slf4j.MDC.get("logCount")) - 1));
        org.apache.log4j.MDC.put("logCount",String.valueOf(Integer.parseInt(org.apache.log4j.MDC.get("logCount").toString()) - 1));

        if(Integer.parseInt(org.slf4j.MDC.get("logCount")) == 0)
        {
            org.slf4j.MDC.remove("logid");
        }

        if(Integer.parseInt(org.apache.log4j.MDC.get("logCount").toString()) == 0)
        {
            org.apache.log4j.MDC.remove("logid");
        }
    }

}
