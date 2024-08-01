package com.gn.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);
	
	// 클라이언트가 요청한 서비스 주소와 메소드를 연결(요청 메소드)
	// http://localhost:8090
	// http://localhost:8090/ (두개를 다르게 인식, 그래서 value를 두개 설정)
	// 복수개로 설정할 때는 중괄호 묶기
	@RequestMapping(value= {"","/"},method=RequestMethod.GET)
	public String home() {
		// /WEB-INF/views/home.jsp
		LOGGER.info("게시판 프로그램 시작");
		return "home";
	}
}
