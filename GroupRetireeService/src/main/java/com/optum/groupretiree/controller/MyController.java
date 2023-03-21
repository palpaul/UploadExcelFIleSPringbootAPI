package com.optum.groupretiree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/about")
	public String getMsg() {
		String msg = "Welcome to GroupRetiree Service";
		return msg;
	}

}
