package com.cuoohe.service;

import com.cuoohe.entity.NotifyRecord;

/**   
 * @Title: MQ消息生产者 
 * @Package com.cuoohe.service 
 * @Description: MQ消息生产者 
 * @author telinx  
 * @date 2016年12月13日 上午10:05:38 
 * @version V1.0   
 */
public interface MQProducerService {

	public void sendMessage(final NotifyRecord mail);
	
}
