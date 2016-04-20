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

    //private Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        try
        {
            //logger.info("日志拦截器开始");

            String logid = UUID.randomUUID().toString().substring(1,16);

            org.slf4j.MDC.put("logid", logid);
            org.apache.log4j.MDC.put("logid", logid);
            org.slf4j.MDC.put("logidFromController", logid);
            org.apache.log4j.MDC.put("logidFromController", logid);
            RpcContext.getContext().setAttachment("logid", logid);

            //logger.info("日志拦截器结束 logid={}",logid);

            return true;
        }
        catch (Exception e)
        {
            //logger.error("拦截出错",e.getMessage(),e);
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        //logger.info("日志拦截器销毁");
        org.slf4j.MDC.clear();
        org.apache.log4j.MDC.remove("logid");
        org.apache.log4j.MDC.remove("logidFromController");
    }
}
