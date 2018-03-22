package com.ishoptest.core.logging;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring configuration class to enable Spring AOP for framework logging.
 * 
 * @author Jerry
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.ishoptest.*")
public class SpringAOPConfig {

}
