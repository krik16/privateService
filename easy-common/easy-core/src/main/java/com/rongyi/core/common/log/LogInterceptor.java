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

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        try
        {

            String logid = UUID.randomUUID().toString().substring(1,16);

            org.slf4j.MDC.put("logid", logid);
            org.apache.log4j.MDC.put("logid", logid);
            org.slf4j.MDC.put("logidFromController", logid);
            org.apache.log4j.MDC.put("logidFromController", logid);
            RpcContext.getContext().setAttachment("logid", logid);

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
        org.slf4j.MDC.clear();
        org.apache.log4j.MDC.remove("logid");
        org.apache.log4j.MDC.remove("logidFromController");
    }
}
