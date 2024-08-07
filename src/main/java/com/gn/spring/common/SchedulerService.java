package com.gn.spring.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerService {
	
	// 매개변수 x return은 void 정해진것임
//	@Scheduled(cron = "0/1 * * * * ?")
//	public void checkTime() {
//		System.out.println("1초마다 실행");
//	}
}
