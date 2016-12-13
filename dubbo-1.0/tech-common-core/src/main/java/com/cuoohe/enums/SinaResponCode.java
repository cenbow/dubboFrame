package com.cuoohe.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 存放Sian 返回的状态吗
 * 
 * @author liuwenjie
 *
 */
public class SinaResponCode {

	@SuppressWarnings("serial")
	public static final Map<String, String> map = new HashMap<String, String>() {

		{
			put("APPLY_SUCCESS", "提交成功，存在业务响应的以业务响应状态为准");
			put("AUTHORIZE_FAIL", "授权失败");
			put("AUTH_INVALID_DATE", "商户该接口授权已过期");
			put("ADD_VERIFY_FAIL", "添加认证信息失败");
			put("ADVANCE_FAILED", "支付或绑卡推进失败");
			put("BANK_ACCOUNT_NOT_EXISTS", "银行卡信息不存在");
			put("BANK_ACCOUNT_TOO_MANY", "绑定银行卡数量超限");
			put("BANK_CARD_NOT_VERIFIED", "银行卡未认证");
			put("BANK_CODE_NOT_SUPPORT", "a");
			put("BANK_CARD_NOT_EFFECT", "a");
			put("BANK_CARD_NOT_SIGN", "a");
			put("BANK_INFO_VERIFY_FAILED", "a");
			put("BIND_CARD_FAILED", "a");
			put("BIZ_PENDING", "a");
			put("BLANCE_NOT_ENOUGH", "a");
			put("CARD_TYPE_NOT_SUPPORT", "a");
			put("CERT_NOT_EXIST", "a");
			put("CERTNO_NOT_MATCHING", "a");
			put("DUPLICATE_IDENTITY_ID", "a");
			put("DUPLICATE_OUT_FREEZE_NO", "a");
			put("DUPLICATE_OUT_UNFREEZE_NO", "a");
			put("DUPLICATE_REQUEST_NO", "a");
			put("DUPLICATE_VERIFY", "a");
			put("FREEZE_FUND_FAIL", "a");
			put("FREEZE_FUND_PROCESSING", "a");
			put("GET_VERIFY_FAIL", "a");
			put("HOST_PAY_NOT_SUPPORT_REFUND", "a");
			put("ILLEGAL_ACCESS_SWITCH_SYSTEM", "a");
			put("ILLEGAL_ARGUMENT", "a");
			put("ILLEGAL_DECRYPT", "a");
			put("ILLEGAL_INDETITY_PALTFORMTYPE", "a");
			put("ILLEGAL_IP_OR_DOMAIN", "a");
			put("ILLEGAL_OUTER_TRADE_NO", "a");
			put("ILLEGAL_SERVICE", "a");
			put("ILLEGAL_SIGN", "a");
			put("ILLEGAL_SIGN_TYPE", "a");
			put("INCORRECT_CARD_INFORMATION", "a");
			put("INSUFFICIENT_FREEZE_BALANCE", "a");
			put("INSUFFICIENT_UNFREEZE_BALANCE", "a");
			put("MEMBER_ID_NOT_EXIST", "a");
			put("MEMBER_NOT_EXIST", "a");
			put("NO_BANK_CARD_INFO", "a");
			put("NO_BASIC_ACCOUNT", "a");
			put("NO_FUND_ORIG_FREEEZE_TRADE", "a");
			put("NO_SUCH_MERCHANT", "a");
			put("ORDER_NOT_EXIST", "a");
			put("OTHER_ERROR", "a");
			put("PARAMETER_INVALID", "a");
			put("PARTNER_ID_NOT_EXIST", "a");
			put("PAY_METHOD_NOT_SUPPORT", "a");
			put("PAYER_INCONSISTENT", "a");
			put("PAYMENT_DUPLIDATE", "a");
			put("PAY_FAILED", "a");
			put("REALNAME_CONFIRM_FAILED", "a");
			put("REALNAME_NOT_MATCHING", "a");
			put("REQUEST_METHOD_NOT_VALIDATE", "a");
			put("REQUEST_EXPIRED", "a");
			put("SAVING_POT_ACCOUNT_OPEN_FAILED", "a");
			put("SYSTEM_ERROR", "a");
			put("TRADE_AMOUNT_MODIFIED", "a");
			put("TRADE_CLOSED", "a");
			put("TRADE_FAILED", "a");
			put("TRADE_NO_MATCH_ERROR", "a");
			put("USER_BANK_ACCOUNT_NOT_MATCH", "a");
			put("VERIFY_NOT_EXIST", "a");
			put("VERIFY_BINDED_OVERRUN", "a");
			put("UNBINDING_SECURITY_CARD_FORBIDDING", "a");
			put("BIZ_CHECK_EXCEPTION", "a");
			put("UPLOAD_FILE_FAIL", "a");
			put("CHECK_FILE_DIGEST_FAIL", "a");
			put("ACCOUNT_NOT_EXIST", "a");
			put("AUTHORIZE_FAIL", "a");
			put("MERCHANT_BUILD_FAIL", "a");
			put("MERCHANT_SUBMIT_AUDIT_SUCCESS", "a");
			put("MERCHANT_SUBMIT_AUDIT_FAIL", "a");
			put("MERCHANT_AUDIT_REQ_IS_EMPTY", "a");
			put("FORBIDDEN_REPEAT_REQUEST", "a");
			put("AUDIT_PROCESSING", "a");
			put("AUDIT_SUCCESS", "a");
			put("AUDIT_REFUSED", "a");
			put("AUDIT_NOTHING", "a");
			put("BINDING_BANK_CARD_FAILD", "a");
			put("FILE_NOT_FOUND", "a");
			put("MERCHANT_OPEN_ACCOUNT_FAIL", "a");
			put("MERCHANT_OPEN_REQ_ERROR", "a");
			put("ILLEGAL_PARTY_INFO", "a");

		}

	};

}
