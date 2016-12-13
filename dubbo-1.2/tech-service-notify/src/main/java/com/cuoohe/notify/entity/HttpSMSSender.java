package com.cuoohe.notify.entity;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.enums.NotifyStatusEnum;

/**
 * 接口类型：互亿无线触发短信接口，支持发送验证码短信、订单通知短信等。
 * 账户注册：请通过该地址开通账户http://sms.ihuyi.com/register.html
 * 注意事项：
 *（1）调试期间，请用默认的模板进行测试，默认模板详见接口文档；
 *（2）请使用 用户名(例如：cf_demo123)及 APIkey来调用接口，APIkey在会员中心可以获取；
 *（3）该代码仅供接入互亿无线短信接口参考使用，客户可根据实际需要自行编写；
* @Title: HttpSMSSender.java 
* @Package com.cuoohe.notify.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author telinx  
* @date 2016年12月12日 下午4:05:32 
* @version V1.0
 */
@Component
public class HttpSMSSender {
	
	private static final Log log = LogFactory.getLog(HttpSMSSender.class);
	@Value("${SMSSender.url}")
	private String Url;
	@Value("${SMSSender.account}")
	private String account;
	@Value("${SMSSender.password}")
	private String password;
	
	public String SMSSend(NotifyRecord notifyRecord){
		String responseResult = NotifyStatusEnum.FAILED.getValue();
		
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(Url);

		client.getParams().setContentCharset("GBK");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=GBK");

		NameValuePair[] data = {//提交短信
	            new NameValuePair("account", account), 
			    new NameValuePair("password", password), //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
			    new NameValuePair("mobile", notifyRecord.getSendTo()), 
			    new NameValuePair("content", notifyRecord.getContent()),
		};
		method.setRequestBody(data);

		try {
			client.executeMethod(method);
			
			String SubmitResult =method.getResponseBodyAsString();

			log.info(SubmitResult);

			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();

			String code = root.elementText("code");
			String msg = root.elementText("msg");
			String smsid = root.elementText("smsid");

			log.info(code);
			log.info(msg);
			log.info(smsid);

			 if("2".equals(code)){
				 log.info("短信提交成功");
				 responseResult = NotifyStatusEnum.SUCCESS.getValue();;
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}	
		return responseResult;
	}
	
}