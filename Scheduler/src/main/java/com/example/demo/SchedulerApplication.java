package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.support.CronTrigger;

import com.example.demo.schedule.Scheduler;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example.schedule")
public class SchedulerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SchedulerApplication.class, args);
		Scheduler sc = ctx.getBean(Scheduler.class);
		sc.schedule();
		
	}

}
