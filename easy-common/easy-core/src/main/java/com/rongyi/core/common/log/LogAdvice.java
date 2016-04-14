package com.rongyi.core.common.log;

//import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Description: 日志切面，注入唯一logid
 *
 * @author yujisun
 * @date 2015/7/30
 */
@Component
//@Aspect
public class LogAdvice
{
    public void logIdInit() {
        String logId = null;//RpcContext.getContext().getAttachment("logid");
        if(StringUtils.isBlank(logId)){
            logId = MDC.get("logid");
        }
        if(StringUtils.isBlank(logId)){
            logId = UUID.randomUUID().toString().substring(1,16);
        }
        MDC.put("logid",logId);
        //RpcContext.getContext().setAttachment("logid", logId);
    }

    public void clear()
    {
        MDC.clear();
    }

}
