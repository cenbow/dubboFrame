package com.cuoohe.enums;

/**
 * 
* @Title: TransferType.java 
* @Package com.cuoohe.enums 
* @Description: 
* @author telinx  
* @date 2016年12月12日 下午3:16:41 
* @version V1.0
 */
public enum NotifyType {
	//TradeStatus.APPLY_SUCCESS.value();

	/**
	 * 邮件通知
	 */
	EMAIL("1"),
	/**
	 * 短信通知
	 */
	MOBILE("2");

	private String notifyType;

	NotifyType(String srce) {
		this.notifyType = srce;
	}
	public String value() {
		return notifyType;
	}

}
