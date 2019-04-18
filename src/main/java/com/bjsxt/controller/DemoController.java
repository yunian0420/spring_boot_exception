package com.bjsxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Thymeleaf入门案例
 */
@Controller
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value={"/", "/index", "/default"})
	public String showIndex(){
		return "index";
	}
	
	@RequestMapping("/defaultError")
	public String testDefaultErrorPage(){
		
		
		//int i = 10/0; // 除数为0
		
		//return "testErrorPage";
		return demoService.getError();
	}
	
	@RequestMapping("/exceptionHandler")
	public String testExceptionHandler(){
		
		String s = null;
		s.trim(); // 空指针异常
		
		return "exceptionHandler";
	}
	
	/**
	 * 如果在一个方法中需要处理多种异常，可以在@ExceptionHandler注解的value属性中定义。并可以
	 * 根据代码逻辑，实现不同异常的多样化处理。
	 * @ExceptionHandler - 定义异常处理方法。
	 *  属性 value - 当前方法可处理的异常类型数组
	 * @param e - 服务方法发生的具体异常对象
	 * @param model - 数据模型对象
	 * @return - 视图名称
	 */
	@ExceptionHandler(value={NullPointerException.class})
	public String myHandler(Exception e, Model model){
		
		model.addAttribute("myMessage", "服务器正忙，请稍后重试。。。");
		
		return "myExceptionHandler";
	}
	
}
