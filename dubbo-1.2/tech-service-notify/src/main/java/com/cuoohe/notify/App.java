package com.cuoohe.notify;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.cuoohe.notify.entity.HttpSMSSender;
import com.cuoohe.notify.entity.NotifyQueue;
import com.cuoohe.notify.entity.NotifyTask;

/**
 * Hello world!
 *
 */
public class App {

	private static final Log log = LogFactory.getLog(HttpSMSSender.class);
	
	private static ThreadPoolTaskExecutor threadPool;
	
	private static NotifyQueue notifyQueue;
	
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
			context.start();
			threadPool = (ThreadPoolTaskExecutor) context.getBean("threadPool");
			notifyQueue = (NotifyQueue) context.getBean("notifyQueue");
			startSendInfo();
		} catch (Exception e) {
			log.error("== application start error:", e);
			return;
		}
		synchronized (App.class) {
			while (true) {
				try {
					App.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:", e);
				}
			}
		}
	}
	
	public static void startSendInfo(){
		
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				while(true){
					if(threadPool.getActiveCount() < threadPool.getMaxPoolSize()){
						final NotifyTask task = (NotifyTask) notifyQueue.poll();
						if(null != task){
							threadPool.execute(task);
						}
					}	
				}
				
			}
		});
		
	}
}
