package com.cuoohe.notify.entity;

import java.util.Date;
import java.util.concurrent.DelayQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cuoohe.entity.NotifyRecord;

/**   
 * @Title: NotifyQueue.java 
 * @Package com.cuoohe.notify.entity 
 * @Description: 线程队列操作
 * @author telinx  
 * @date 2016年12月12日 下午2:49:32 
 * @version V1.0   
 */
@Component
public class NotifyQueue extends DelayQueue{
	@Autowired
	private NotifyParam notifyParam;
	@Autowired
	private HttpMailSender httpMailSender;	//邮箱发送
	@Autowired
    private HttpSMSSender httpSMSSender;	//短信发送 
	
	public void addElement(NotifyRecord notifyRecord){
		notifyRecord.setLastNotifyTime(new Date());
		notifyRecord.setNotifyTimes(notifyRecord.getNotifyTimes() + 1);
		this.add(new NotifyTask(notifyRecord, notifyParam, this, httpMailSender, httpSMSSender));
	}

}
