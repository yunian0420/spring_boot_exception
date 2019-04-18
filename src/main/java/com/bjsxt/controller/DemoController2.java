package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Thymeleaf入门案例
 */
@Controller
public class DemoController2 {
	
	@RequestMapping("/defaultError1")
	public String testDefaultErrorPage(){
		
		int i = 10/0; // 除数为0
		
		return "testErrorPage";
	}
	
	@RequestMapping("/exceptionHandler1")
	public String testExceptionHandler(){
		
		String s = null;
		s.trim(); // 空指针异常
		
		return "exceptionHandler";
	}
	
}
