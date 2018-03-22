package com.ishoptest.core.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Logging Aspect for the page object operations.
 * 
 * @author Jerry
 *
 */
@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(public * com.ishoptest.pageobjects.*.*(..))")
	private void forPageObjectOperations() {}

	@Before("forPageObjectOperations()")
	public void pageObjectOperationsBeforeAdvice(JoinPoint joinPoint) {
		
		StringBuilder builder = new StringBuilder();
		
		// Append method signature.
		builder.append("[");
		builder.append(joinPoint.getSignature());
		builder.append("] [");
		
		// Append method parameters.
		Object[] args = joinPoint.getArgs();
		for (Object arg : args) {
			String patterned = "{" + arg.toString() + "} ";
			builder.append(patterned);
		}
		builder.append("] ");
		
		Log.info(builder.toString());
	}
}
