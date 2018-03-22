package com.ishoptest.core.logging;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Manages Spring context initialization and wrapping-up works.
 * 
 * @author Jerry
 *
 */
public class LoggingContextHelper {
	public AnnotationConfigApplicationContext context;
	
	public void initializeAOPContext() {
		context = new AnnotationConfigApplicationContext(SpringAOPConfig.class);
	}
	
	public void finalizeAOPContext() {
		context.close();
	}
	
	public <T> T getLoggingDestinatinClass(Class<T> classType) {
		return context.getBean(classType);
	}
}
