package com.cuoohe.entity;

import java.io.Serializable;
import java.util.Date;

import com.cuoohe.enums.NotifyStatusEnum;
import com.cuoohe.enums.NotifyType;


/**
 * 
 * @描述: 通知记录实体.
 * @版本: V1.0
 * 
 */
public class NotifyRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6104194914044220447L;

	/** 最后一次通知时间 **/
	private Date lastNotifyTime;

	/** 通知次数 **/
	private Integer notifyTimes = 0;

	/** 限制通知次数 **/
	private Integer limitNotifyTimes = 5;

	/** From **/
	private String sendFrom;

	/** To **/
	private String sendTo;

	/** 主题 **/
	private String subject;
	
	/** 内容 **/
	private String content;

	/** 通知状态(100:成功:101:未成功,默认101) **/
	private String status = NotifyStatusEnum.CREATED.getValue();

	/** 通知类型 NotifyTypeEnum **/
	private String notifyType = NotifyType.EMAIL.value();

	public Date getLastNotifyTime() {
		return lastNotifyTime;
	}

	public void setLastNotifyTime(Date lastNotifyTime) {
		this.lastNotifyTime = lastNotifyTime;
	}

	public Integer getNotifyTimes() {
		return notifyTimes;
	}

	public void setNotifyTimes(Integer notifyTimes) {
		this.notifyTimes = notifyTimes;
	}

	public Integer getLimitNotifyTimes() {
		return limitNotifyTimes;
	}

	public void setLimitNotifyTimes(Integer limitNotifyTimes) {
		this.limitNotifyTimes = limitNotifyTimes;
	}

	public String getSendFrom() {
		return sendFrom;
	}

	public void setSendFrom(String sendFrom) {
		this.sendFrom = sendFrom;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotifyType() {
		return notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
