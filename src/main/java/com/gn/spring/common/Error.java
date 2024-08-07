package com.gn.spring.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Error {
	
	@GetMapping("/error")
	public String errorPage() {
		return "error/404";
	}
}
