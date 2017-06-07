package com.rongyi.core.aop;

import com.rongyi.core.util.Util;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.time.StopWatch;
import org.apache.log4j.Logger;

/**
 * 获取方法的执行时间
 *
 * @author wangjh7
 * @date 2016-08-31
 */
public class MethodTimeAdvice implements MethodInterceptor {

    private final static Logger logger = Logger.getLogger(MethodTimeAdvice.class);
    // 小于100毫秒不予显示
    private final static int DEFAULT_MIN_TIME = 100;

    /**
     * @see MethodInterceptor#invoke(MethodInvocation)
     */
    public Object invoke(MethodInvocation invocation) throws Throwable {
        StopWatch clock = new StopWatch();
        clock.start(); //计时开始
        Object result = null;
        //类名
        String className = invocation.getMethod().getDeclaringClass().getSimpleName();
        //方法名
        String methodName = invocation.getMethod().getName();
        methodName = className + "." + methodName;
        result = invocation.proceed();
        clock.stop(); //计时结束
        if (logger.isInfoEnabled()) {
            // 减少打印 仅仅方法的时间大于指定毫秒
            if (DEFAULT_MIN_TIME < clock.getTime()) {
                logger.info("<<<<<<< Method [ " + methodName + " ] consumed times = " + Util.getTimeString(clock.getTime()) + " >>>>>>>");
            } else {
                logger.debug("<<<<<<< Method [ " + methodName + " ] consumed times = " + Util.getTimeString(clock.getTime()) + " >>>>>>>");
            }
        }
        return result;
    }
}

