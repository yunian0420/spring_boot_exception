package com.bjsxt.controller;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String getError() {
		int i = 10/0; // 除数为0
		return "testErrorPage";
	}
	
}
