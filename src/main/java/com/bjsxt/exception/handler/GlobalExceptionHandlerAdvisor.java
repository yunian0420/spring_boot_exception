package com.bjsxt.exception.handler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// @ControllerAdvice
public class GlobalExceptionHandlerAdvisor {

	@ExceptionHandler(value={Exception.class})
	public String exceptionHandler(Exception e, Model model){
		
		model.addAttribute("message", "服务器正忙，请稍后重试。。。");
		
		return "error";
	}
	
	@ExceptionHandler(value={NullPointerException.class})
	public String nullPointerExceptionHandler(Exception e, Model model){
		
		model.addAttribute("myMessage", "服务器正忙，请稍后重试。。。");
		
		return "globalNullPointerExceptionHandler";
	}
	
	@ExceptionHandler(value={ArithmeticException.class})
	public String arithmeticExceptionHandler(Exception e, Model model){
		
		model.addAttribute("myMessage", "服务器正忙，请稍后重试。。。");
		
		return "globalArithmeticExceptionHandler";
	}
	
}
