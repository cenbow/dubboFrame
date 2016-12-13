package com.cuoohe.notify.entity;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;
import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.enums.NotifyStatusEnum;
import com.cuoohe.enums.NotifyType;

/**   
 * @Title: NotifyTask.java 
 * @Package com.cuoohe.notify.entity 
 * @Description: 多线程策略执行
 * @author telinx  
 * @date 2016年12月12日 下午2:47:21 
 * @version V1.0   
 */
public class NotifyTask implements Delayed, Runnable{
	
	private static final Log log = LogFactory.getLog(NotifyTask.class);

	private long executeTime;				//延迟执行时间
	
	private NotifyRecord notifyRecord;		//通知信息对象
	
	private NotifyParam notifyParam;		//信息通知配置
	
	private NotifyQueue notifyQueue; 		//线程队列
	
    private HttpMailSender httpMailSender;	//邮箱发送
    
    private HttpSMSSender httpSMSSender;	//短信发送
    
    

	/**
	 * 
	 * @param executeTime
	 * @param notifyRecord
	 * @param notifyParam
	 * @param notifyQueue
	 * @param httpMailSender
	 * @param httpSMSSender
	 */
	public NotifyTask(NotifyRecord notifyRecord,
			NotifyParam notifyParam, NotifyQueue notifyQueue, 
			HttpMailSender httpMailSender, HttpSMSSender httpSMSSender) {
		super();
		this.notifyRecord = notifyRecord;
		this.notifyParam = notifyParam;
		this.notifyQueue = notifyQueue;
		this.executeTime = getExecuteTime(notifyRecord);
		this.httpSMSSender = httpSMSSender;
		this.httpMailSender = httpMailSender;
		
	}

	public long getExecuteTime(NotifyRecord notifyRecord){
		long lastTime = notifyRecord.getLastNotifyTime().getTime();
		Integer nextNotifyTime = notifyParam.getNotifyParams().get(notifyRecord.getNotifyTimes());
		return (nextNotifyTime == null ? 0 : nextNotifyTime * 1000) + lastTime;
	}
	
	/* 
	 * 
	 */
	@Override
	public int compareTo(Delayed delayed) {
		NotifyTask task = (NotifyTask) delayed;
		return executeTime > task.executeTime ? 1 : (executeTime < task.executeTime ? -1 : 0);
	}

	/*
	 * 
	 */
	@Override
	public long getDelay(TimeUnit timeunit) {
		return timeunit.convert(executeTime - System.currentTimeMillis(), timeunit.SECONDS);
	}
	
	/* 
	 *
	 */
	@Override
	public void run() {
		//notifyQueue.remove(this);
		/*
		 * 小于发送次数，可再次发送
		 */
		if(this.notifyRecord.getNotifyTimes() <= this.notifyRecord.getLimitNotifyTimes()){
			log.info("信息推送------》" + JSON.toJSONString(this.notifyRecord) + ",第" + this.notifyRecord.getNotifyTimes() + "次推送");
			String result = null;
			if(notifyRecord.getNotifyType().equals(NotifyType.EMAIL.value())){
				result = httpMailSender.mailSend(notifyRecord);
			}
			if(notifyRecord.getNotifyType().equals(NotifyType.MOBILE.value())){
				result = httpSMSSender.SMSSend(notifyRecord);	
			}
			log.info("--->信息发送平台结果" + result);
			/*
			 * 信息发送失败再次发送
			 */
			if(!result.equals(NotifyStatusEnum.SUCCESS.getValue())){
				this.notifyQueue.addElement(notifyRecord);
			}
		}else{
			/*
			 * 大于发送次数不能再次发送
			 * 数据库保存信息数据save
			 * 队列移除信息remove
			 */
			log.info("--->信息发送平台:"+JSON.toJSONString(notifyRecord) + "发送次数超限不再发送数据");
			this.notifyQueue.remove(this);
		}
		
	}

}
