package com.cuoohe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuoohe.entity.NotifyRecord;
import com.cuoohe.entity.User;
import com.cuoohe.service.MQProducerService;
import com.cuoohe.service.UserService;
import com.cuoohe.service.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private MQProducerService mqProducerService;

	@Override
	public User getUserById(String id) {
		NotifyRecord record = new NotifyRecord();
		
		record.setSendTo("liuyucang236@163.com");
		record.setSubject("我的消息队列德莫");
		record.setContent("通过我的消息队列demo-发送信息！");
		record.setNotifyType("1");
		
//		record.setSendTo("18519213936");
//		record.setSubject("我的消息队列德莫");
//		record.setContent("尊敬的风控：市场部合伙人申请了银行贷-15101号借款订单，请审核。");
//		record.setNotifyType("2");

		mqProducerService.sendMessage(record);
		return userMapper.selectByPrimaryKey(id);
	}


}
