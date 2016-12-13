package com.cuoohe.notify.listener;

import java.util.Date;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.enums.NotifyStatusEnum;
import com.cuoohe.notify.entity.NotifyQueue;

/**
 * @描述: 队列监听器 .实现监听后将消息对象放入序列处理
 * @版本号: V1.0 .
 */
@Component
public class ConsumerSessionAwareMessageListener implements SessionAwareMessageListener<Message> {

	private static final Log log = LogFactory.getLog(ConsumerSessionAwareMessageListener.class);

	@Autowired
	private JmsTemplate activeMqJmsTemplate;
	@Autowired
	private Destination sessionAwareQueue;
	@Autowired
	private NotifyQueue notifyQueue;
	
	@Override
	public synchronized void onMessage(Message message, Session session) throws JMSException {
		ActiveMQTextMessage msg = (ActiveMQTextMessage) message;
		final String ms = msg.getText();
		log.info("== receive message:" + ms);
		NotifyRecord notifyRecord = JSONObject.parseObject(ms, NotifyRecord.class);// 这里转换成相应的对象还有问题
		if(null != notifyRecord){
			notifyRecord.setStatus(NotifyStatusEnum.CREATED.getValue());
			notifyQueue.addElement(notifyRecord);
		}
	}


}