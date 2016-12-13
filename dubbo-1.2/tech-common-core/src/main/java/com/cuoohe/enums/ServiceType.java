package com.cuoohe.enums;

/**
 * Sina 交易类型
 * 
 * @author liuwenjie
 *
 */
public enum ServiceType {
	/**
	 * 创建激活会员
	 */
	CREATE_ACTIVATE_MEMBER("create_activate_member"),

	/**
	 * 2.2 设置实名信息
	 */
	SET_REAL_NAME("set_real_name"),

	/**
	 * 2.3 绑定认证信息
	 */
	BINDING_VERIFY("binding_verify"),

	/**
	 * 2.4 解绑认证信息
	 */
	UNBINDING_VERIFY("unbinding_verify"),

	/**
	 * 2.5 查询认证信息
	 */
	QUERY_VERIFY("query_verify"),

	/**
	 * 2.6 绑定银行卡
	 */
	BINDING_BANK_CARD("binding_bank_card"),

	/**
	 * 2.7 绑定银行卡推进
	 */
	BINDING_BANK_CARD_ADVANCE("binding_bank_card_advance"),
	/**
	 * 2.8 解绑银行卡
	 */
	UNBINDING_BANK_CARD("unbinding_bank_card"),
	/**
	 * 2.9 查询银行卡
	 */
	QUERY_BANK_CARD("query_bank_card"),
	/**
	 * 2.10 查询余额/基金份额
	 */
	QUERY_BALANCE("query_balance"),
	/**
	 * 2.11 查询收支明细
	 */
	QUERY_ACCOUNT_DETAILS("query_account_details"),
	/**
	 * 2.12 冻结余额
	 */
	BALANCE_FREEZE("balance_freeze"),
	/**
	 * 2.13 解冻余额
	 */
	BALANCE_UNFREEZE("balance_unfreeze"),
	/**
	 * 2.14 请求审核企业会员资质
	 */
	AUDIT_MEMBER_INFOS("audit_member_infos"),

	/**
	 * 2.15 查询企业会员信息
	 */
	QUERY_MEMBER_INFOS("audit_member_infos"),
	/**
	 * 2.16 查询企业会员审核结果
	 */
	QUERY_AUDIT_RESULT("query_audit_result"),
	/**
	 * 2.17 sina页面展示用户信息
	 */
	SHOW_MEMBER_INFOS_SINA("show_member_infos_sina"),

	/**
	 * 3.1 创建托管代收交易
	 */
	CREATE_HOSTING_COLLECT_TRADE("create_hosting_collect_trade"),

	/**
	 * 3.2 创建托管代付交易
	 */
	CREATE_SINGLE_HOSTING_PAY_TRADE("create_single_hosting_pay_trade"),

	/**
	 * 3.3 创建批量托管代付交易
	 */
	CREATE_BATCH_HOSTING_PAY_TRADE("create_batch_hosting_pay_trade"),
	/**
	 * 3.4 托管交易支付
	 */
	PAY_HOSTING_TRADE("pay_hosting_trade"),
	/**
	 * 3.5 支付结果查询
	 */
	QUERY_PAY_RESULT("query_pay_result"),
	/**
	 * 3.6 托管交易查询
	 */
	QUERY_HOSTING_TRADE("query_hosting_trade"),

	/**
	 * 3.7 托管交易批次查询
	 */
	QUERY_HOSTING_BATCH_TRADE("query_hosting_batch_trade"),
	/**
	 * 3.8 托管退款
	 */
	CREATE_HOSTING_REFUND("create_hosting_refund"),

	/**
	 * 3.9 托管退款查询
	 */
	QUERY_HOSTING_REFUND("query_hosting_refund"),

	/**
	 * 3.10 托管充值
	 */
	CREATE_HOSTING_DEPOSIT("create_hosting_deposit"),
	/**
	 * 3.11 托管充值查询
	 */
	QUERY_HOSTING_DEPOSIT("query_hosting_deposit"),
	/**
	 * 3.12 托管提现
	 */
	CREATE_HOSTING_WITHDRAW("create_hosting_withdraw"),
	/**
	 * 3.13 托管提现查询
	 */
	QUERY_HOSTING_WITHDRAW("query_hosting_withdraw"),
	/**
	 * 3.14 转账接口
	 */
	CREATE_HOSTING_TRANSFER("create_hosting_transfer"),

	/**
	 * 3.15 支付推进
	 */
	ADVANCE_HOSTING_PAY("advance_hosting_pay"),

	/**
	 * 3.16 标的录入
	 */
	CREATE_P2P_HOSTING_BORROWING_TARGER("create_p2p_hosting_borrowing_target"),
	/**
	 * 3.17 创建单笔代付到提现卡交易
	 */
	CREATE_SINGLE_HOSTING_PAY_TO_CARD_TRADE(
			"create_single_hosting_pay_to_card_trade"),
	/**
	 * 3.18 创建批量代付到提现卡交易
	 */
	CREATE_BATCH_HOSTING_PAY_TO_CARD_TRADE(
			"create_batch_hosting_pay_to_card_trade"),

	/**
	 * 5.1 存钱罐基金收益率查询
	 */
	QUERY_FUND_YIELD("query_fund_yield"),
	/**
	 * 2.1 设置支付密码重定向
	 */

	SET_PAY_PASSWORD("set_pay_password"),
	/**
	 * 2.2 修改支付密码重定向
	 */

	MODIFY_PAY_PASSWORD("modify_pay_password"),
	/**
	 * 2.3 找回支付密码重定向
	 */

	FIND_PAY_PASSWORD("find_pay_password"),
	/**
	 * 2.4 查询是否设置支付密码
	 */

	QUERY_IS_SET_PASSWORD("query_is_set_pay_password"),
	/**
	 * 2.5 修改认证手机
	 */

	MODIFY_VERIFY_MOBILE("modify_verify_mobile"),

	/**
	 * 2.6 找回认证手机
	 */

	FIND_VERIFY_MOBILE("find_verify_mobile"),
	/**
	 * 代收完成
	 */
	FINISH_PRE_AUTH_TRADE("finish_pre_auth_trade"),
	/**
	 * 代收撤销
	 */
	CANCEL_PRE_AUTH_TRADE("cancel_pre_auth_trade"),

	/**
	 * 2.7 我的银行卡
	 */

	WEB_BINDING_BANK_CARD("web_binding_bank_card");

	private String service;

	ServiceType(String srce) {
		this.service = srce;
	}

	public String value() {
		return service;
	}
}
