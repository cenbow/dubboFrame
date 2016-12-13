package com.cuoohe.mq;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.service.MQProducerService;


/**
 * MQ消息生产者 .
* @Title: MQProducer.java 
* @Package com.cuoohe.mq 
* @Description: MQ消息生产者 
* @author telinx  
* @date 2016年12月13日 上午10:01:59 
* @version V1.0
 */
@Component
public class MQProducerServiceImpl implements MQProducerService{
	
	@Autowired
	private JmsTemplate activeMqJmsTemplate;
	
	/**
	 * 发送消息.
	 * @param mail 
	 */
	public void sendMessage(final NotifyRecord mail) {
		activeMqJmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(JSONObject.toJSONString(mail));
			}
		});
		
	}

}