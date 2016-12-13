package com.cuoohe.enums;

/**
 * 交易状态-用于TradeEntry.status
 * 
 * @author
 * 
 */
public enum TradeStatus {
	//TradeStatus.APPLY_SUCCESS.value();

	/**
	 * 待处理
	 */
	WAITING("1111"),
	/**
	 * 等待付款(系统不会异步通知)
	 */
	WAIT_PAY("WAIT_PAY"),
	/**
	 * 已付款(系统会异步通知)
	 */
	PAY_FINISHED("PAY_FINISHED"),
	/**
	 * 交易失败(系统会异步通知)
	 */
	TRADE_FAILED("TRADE_FAILED"),

	/**
	 * 交易结束(系统会异步通知)
	 */
	TRADE_FINISHED("TRADE_FINISHED"),

	/**
	 * 交易关闭（合作方通过调用交易取消接口来关闭）(系统会异步通知)
	 */
	TRADE_CLOSED("TRADE_CLOSED"),

	/**
	 * 处理中
	 */
	HANDING("MG00008F"),
	/**
	 * 成功(系统会异步通知)
	 */
	SUCCESS("SUCCESS"),

	/**
	 * 失败(系统会异步通知)
	 */
	FAILED("FAILED"),
	/**
	 * 退票(系统会异步通知)
	 */
	RETURNT_TICKET("RETURNT_TICKET"),
	/**
	 * 处理中(系统不会异步通知)
	 */
	PROCESSING("PROCESSING"),
	/**
	 * 提交成功，存在业务响应的以业务响应状态为准
	 */
	APPLY_SUCCESS("APPLY_SUCCESS"),

	/**
	 * 待处理(系统不会异步通知)
	 */
	WAIT_PROCESS("WAIT_PROCESS"),
	/**
	 * 等待退款（处理中）(系统不会异步通知)
	 */
	WAIT_REFUND("WAIT_REFUND"),
	/**
	 * 代收冻结成功（商户通知）
	 */
	PRE_AUTH_APPLY_SUCCESS("PRE_AUTH_APPLY_SUCCESS"),
	/**
	 * 代收撤销成功（商户通知）
	 */
	PRE_AUTH_CANCELED("PRE_AUTH_CANCELED"),
	/**
	 * 处理结束(系统会异步通知)
	 */
	FINISHED("FINISHED");

	private String tradeType;

	TradeStatus(String srce) {
		this.tradeType = srce;
	}

	public String value() {
		return tradeType;
	}

}
