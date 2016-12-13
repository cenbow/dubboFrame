
package com.cuoohe.notify.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.enums.NotifyStatusEnum;

/**
 * 邮件发送业务逻辑类 
* @Title: MailBiz.java 
* @Package com.cuoohe.notify.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author telinx  
* @date 2016年12月12日 下午4:19:06 
* @version V1.0
 */
@Component
public class HttpMailSender {

	@Autowired
	private JavaMailSender mailSender;// spring配置中定义
	@Autowired
	private SimpleMailMessage simpleMailMessage;// spring配置中定义

	/**
	 * 发送模板邮件
	 * @param notifyRecord
	 * @return
	 */
	public String mailSend(NotifyRecord notifyRecord) {
			String responseResult = NotifyStatusEnum.FAILED.getValue();
			
			simpleMailMessage.setFrom(simpleMailMessage.getFrom()); // 发送人,从配置文件中取得
			simpleMailMessage.setTo(notifyRecord.getSendTo()); // 接收人
			simpleMailMessage.setSubject(notifyRecord.getSubject());
			simpleMailMessage.setText(notifyRecord.getContent());
			try {
				mailSender.send(simpleMailMessage);
				responseResult = NotifyStatusEnum.SUCCESS.getValue();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return responseResult;	
	}
}
