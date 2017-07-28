package com.rongyi.rpb.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*@Component
@Aspect*/
public class LogAspect {

	private static final Logger log = LoggerFactory.getLogger(LogAspect.class);
/*
	@Pointcut("")
	public void aspect() {

	}


	//声明环绕通知
	@Around("aspect()")
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		long begin = System.nanoTime();
		Object o = pjp.proceed();
		long end = System.nanoTime();
		log.info("{}:{}ms", pjp.getTarget().getClass() + "." + pjp.getSignature().getName(), (end - begin) / 1000000);
		return o;
	}*/
}
