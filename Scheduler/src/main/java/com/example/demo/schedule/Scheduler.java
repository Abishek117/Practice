package com.example.demo.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class Scheduler 
{
	@Autowired
	ThreadPoolTaskScheduler taskScheduler;

//	@Scheduled(fixedDelay = 5000)
	public void schedule()
	{		
		String cronExpression = "*/5 * * * * *";
		Runnable task = () -> {
	        System.out.println("Hello");
	    };
	    CronTrigger cronTrigger = new CronTrigger(cronExpression);
	    CronTask cronTask = new CronTask(task, cronTrigger);
	    taskScheduler.schedule(cronTask.getRunnable(), cronTask.getTrigger());
	}
}
