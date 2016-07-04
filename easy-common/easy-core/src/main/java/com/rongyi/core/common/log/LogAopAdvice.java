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
    Logger logger = LoggerFactory.getLogger(LogAopAdvice.class);

    public void logIdInit() {


        String logId = RpcContext.getContext().getAttachment("logid");

        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        org.slf4j.MDC.put("logid", logId);
        org.apache.log4j.MDC.put("logid", logId);

        //aop多次切入，计数，只有最后一次会清楚mdc的logid
        if(RpcContext.getContext().getAttachment("logidCount") != null){

            Integer logIdCount = Integer.parseInt(RpcContext.getContext().getAttachment("logidCount")) + 1;
            logger.info("日志id计数器不为空={}",logIdCount);
            RpcContext.getContext().setAttachment("logidCount", String.valueOf(logIdCount));
        }
        else{
            logger.info("日志id计数器为空");
            RpcContext.getContext().setAttachment("logidCount", "1");
        }

        RpcContext.getContext().setAttachment("logid", logId);
        logger.info("日志id={}",logId);
    }

    public void clear()
    {
        if(RpcContext.getContext().getAttachment("logidCount") == null){
            logger.info("日志id计数器为空 清空logid");
            RpcContext.removeContext();
        }
        else{
            Integer logIdCount = Integer.parseInt(RpcContext.getContext().getAttachment("logidCount")) - 1;
            if(logIdCount == 0){
                logger.info("日志id计数器为1 清空logid");
                RpcContext.removeContext();
            }
            else{
                logger.info("日志id计数器不为空");
                RpcContext.getContext().setAttachment("logidCount", String.valueOf(logIdCount));
            }
        }
    }

    public void exceptionProcess()
    {
        if(RpcContext.getContext().getAttachment("logidCount") == null){
            logger.info("日志id计数器为空 清空logid");
            RpcContext.removeContext();
        }
        else
        {
            Integer logIdCount = Integer.parseInt(RpcContext.getContext().getAttachment("logidCount")) - 1;
            if (logIdCount == 0)
            {
                logger.info("日志id计数器为1 清空logid");
                RpcContext.removeContext();
            } else
            {
                logger.info("日志id计数器不为空");
                RpcContext.getContext().setAttachment("logidCount", String.valueOf(logIdCount));
            }
        }
    }

}
