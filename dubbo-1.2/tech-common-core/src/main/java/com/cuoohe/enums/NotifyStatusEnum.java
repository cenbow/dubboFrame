package com.cuoohe.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @描述: 商户通知状态 .
 * 适用于通知记录表.
 * 
 * @作者: WuShuicheng .
 * @创建时间: 2013-9-12,上午10:34:40 .
 * @版本: 1.0 .
 */
public enum NotifyStatusEnum {
	
	SUCCESS("通知成功", "100"),
	FAILED("通知失败", "101"),
	CREATED("通知记录已创建", "102"),
	HTTP_REQUEST_SUCCESS("http请求响应成功", "200"), 
	HTTP_REQUEST_FALIED("http请求失败", "201");
	
	/** 描述 */
	private String desc;
	/** 枚举值 */
	private String value; 
	/** 构造函数 */
	private NotifyStatusEnum(String desc,String value) {
		this.desc = desc;
		this.value = value;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	//NotifyStatusEnum.CREATED.getValue()
}