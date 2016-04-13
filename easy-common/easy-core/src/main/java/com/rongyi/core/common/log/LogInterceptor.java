package com.rongyi.core.common.log;

import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.UUID;

/**
 * Created by yujisun on 2016/4/12
 */
public class LogInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        Map<String,String[]> pramMap = request.getParameterMap();
        String logid = null;
        if(pramMap.get("logid") != null){
            logid = pramMap.get("logid")[0];
        }

        if(StringUtils.isBlank(logid)){
            logid = UUID.randomUUID().toString().substring(1,16);
        }

        MDC.put("logid", logid);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        MDC.clear();
    }
}
