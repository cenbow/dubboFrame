package com.cuoohe.batch;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author administrator
 * <a>定时类<a>
 */
@Component
public class BatchQuartzService {

	private static final Log log = LogFactory.getLog(BatchQuartzService.class);
	/**
	 * 定时设置说明
	 * 每隔10秒 0/10 * * * * ?  秒
	 * 每天凌晨 0 0 0 * * ?  
	 * 凌晨1点  0 0  01 * * ？  时
	 * 凌晨10分 0 10 0 * *  ？  分
 	 */
	@Scheduled(cron ="1/2 * * * * ?")
	public void batchQuartz(){
		log.info("定时任务开始......");
		long begin = System.currentTimeMillis();
		log.info("------------------------------------->>>>>" + new Date());
		long end = System.currentTimeMillis();
		log.info("定时任务结束，共耗时：[" + (end - begin) / 1000 + "]秒");
	}
	
//	@PostConstruct
//	public void doWhat() throws Exception {
//		// TODO Auto-generated method stub
//		log.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$>>>>>" + new Date());
//	}

}
