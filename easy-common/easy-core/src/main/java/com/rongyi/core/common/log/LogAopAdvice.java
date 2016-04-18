package com.rongyi.core.common.log;

//import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
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
        logger.info("日志aop RpcContext logid={}",logId);
        if(StringUtils.isBlank(logId)){
            logId = MDC.get("logid");
            logger.info("日志aop MDC logid={}",logId);
        }
        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
            logger.info("日志aop 生成logid={}",logId);
        }
        MDC.put("logid",logId);
        RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {
        MDC.clear();
    }

}
