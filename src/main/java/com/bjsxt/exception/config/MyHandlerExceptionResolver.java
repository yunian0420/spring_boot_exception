package com.bjsxt.exception.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, 
			Object handler,
			Exception ex) {
		
		// 异常信息收集
		// String message = ex.getMessage();
		// request.setAttribute("message", message);
		
		ModelAndView mv = new ModelAndView();
		// 异常信息收集
		mv.addObject("message", "出错了，请联系管理员， 错误内容是： " + ex.getMessage());
		mv.setViewName("error");
		
		return mv;
	}

}
