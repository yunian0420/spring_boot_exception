package com.bjsxt.exception.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

// @Configuration
public class GlobalExceptionConfiguration {

	@Bean
	public SimpleMappingExceptionResolver getHandlerExceptionResolver(){
		SimpleMappingExceptionResolver bean = 
				new SimpleMappingExceptionResolver();
		
		Properties mappings = new Properties();
		mappings.setProperty("java.lang.NullPointerException", "configNullPointerException");
		mappings.setProperty("java.lang.ArithmeticException", "configArithmeticException");
		
		bean.setExceptionMappings(mappings);
		
		return bean;
	}

}
