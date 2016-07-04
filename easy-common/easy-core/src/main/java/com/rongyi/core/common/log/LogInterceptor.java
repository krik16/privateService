package com.rongyi.core.common.log;

import com.alibaba.dubbo.rpc.RpcContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * Created by yujisun on 2016/4/12
 */
public class LogInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        try
        {

            String logid = UUID.randomUUID().toString().substring(1,16);

            org.slf4j.MDC.put("logid", logid);
            org.apache.log4j.MDC.put("logid", logid);

            RpcContext.getContext().setAttachment("logid", logid);
            RpcContext.getContext().setAttachment("logidCount","1");

            logger.info("aop日志id={}",logid);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

        logger.info("拦截器销毁日志id={}",org.slf4j.MDC.get("logid"));
        org.slf4j.MDC.clear();
        org.apache.log4j.MDC.remove("logid");
        org.apache.log4j.MDC.remove("logidFromController");
        RpcContext.removeContext();
    }
}
