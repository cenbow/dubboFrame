package com.cuoohe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuoohe.entity.User;
import com.cuoohe.service.UserService;
import com.cuoohe.service.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}


}
