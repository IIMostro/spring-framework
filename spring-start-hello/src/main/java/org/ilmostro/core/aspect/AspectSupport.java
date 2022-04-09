package org.ilmostro.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author li.bowei
 */
@Aspect
@Component
public class AspectSupport {

	@Pointcut("execution(* org.ilmostro.core.service.aspect.SimpleAspectService.*(..))")
	public void pointcut(){

	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint joinPoint){
		System.out.println("process before...");
		Object proceed = null;
		try {
			proceed = joinPoint.proceed();
		} catch (Throwable throwable) {
			System.out.println("error!");
		}
		System.out.println("process after");
		return proceed;
	}
}
