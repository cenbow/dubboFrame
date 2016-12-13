package com.cuoohe.notify.entity;
import java.util.Map;

/**
 * 通知参数,可以由配置notify.xml来修改参数
 * 
 * 
 */
public class NotifyParam {
	private Map<Integer, Integer> notifyParams;
	
	private String successValue;

	public Map<Integer, Integer> getNotifyParams() {
		return notifyParams;
	}

	public void setNotifyParams(Map<Integer, Integer> notifyParams) {
		this.notifyParams = notifyParams;
	}

	public String getSuccessValue() {
		return successValue;
	}

	public void setSuccessValue(String successValue) {
		this.successValue = successValue;
	}

	public Integer getMaxNotifyTime() {
	return notifyParams == null ? 0 : notifyParams.size();
}

}