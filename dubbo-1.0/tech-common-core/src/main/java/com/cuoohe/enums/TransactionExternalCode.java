package com.cuoohe.enums;

/**
 * 外部业务码
 * 
 * @author liuwenjie
 *
 */
public enum TransactionExternalCode {
	/**
	 * 代收投标1001
	 */
	DSTB("1001"),
	/**
	 * 代收提现手续费1001
	 */
	DSTXF("1001"),
	/**
	 * 代收还款 1002
	 */
	DSHK("1002"),
	/**
	 * 代收债权转让(1002)
	 */
	DSZQZR("1002"),
	/**
	 * 代付（本金/收益）
	 */
	DFZQZR("2002"),
	/**
	 * 代付放款(代付借款金 2001)
	 */
	DFFK("2001"),
	/**
	 * 代收平台转账 1001
	 */
	DSZZ("1001"),
	/**
	 * 代付平台转账到用户 2001
	 */
	DFZZ("2001"),
	/**
	 * 代收提现手续费(代收提现手续费 2001)
	 */
	DFTXF("2001"),
	/**
	 * 代付（本金/收益2002）
	 */
	DFHK("2002");

	private String transactionCode;

	TransactionExternalCode(String srce) {
		this.transactionCode = srce;
	}

	public String value() {
		return transactionCode;
	}

	//TransactionExternalCode.DFFK.value();
}
