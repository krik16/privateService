package com.rongyi.core.aop;

import com.rongyi.core.util.Util;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.time.StopWatch;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 获取方法的执行时间
 *
 * @author wangjh7
 * @date 2016-08-31
 */
public class MethodTimeAdvice implements MethodInterceptor {

    private final static Logger logger = Logger.getLogger(MethodTimeAdvice.class);
    private final static int DEFAULT_MIN_TIME = 10;

    /**
     * @see MethodInterceptor#invoke(MethodInvocation)
     */
    public Object invoke(MethodInvocation invocation) {
        StopWatch clock = new StopWatch();
        clock.start(); //计时开始
        Object result = null;
        //类名
        String className = invocation.getMethod().getDeclaringClass().getSimpleName();
        //方法名
        String methodName = invocation.getMethod().getName();
        methodName = className + "." + methodName;
        try {
            //返回结果
            result = invocation.proceed();
        } catch (Throwable e) {
            //监控的参数
//            Object[] objs = invocation.getArguments();
           // logger.error("MethodTimeAdvice | invoke | 异常 | 方法名：" + methodName, e);
        }
        clock.stop(); //计时结束
        if (logger.isInfoEnabled()) {
            // 减少打印 仅仅方法的时间大于10毫秒
            if (DEFAULT_MIN_TIME < clock.getTime()) {
                logger.info("******* 统计 | " + methodName + " | 执行时间：" + Util.getTimeString(clock.getTime()) + " *******");
            }
        }
        return result;
    }
}

