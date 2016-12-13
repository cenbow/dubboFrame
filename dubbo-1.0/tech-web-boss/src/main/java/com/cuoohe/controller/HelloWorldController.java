package com.cuoohe.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cuoohe.entity.User;
import com.cuoohe.service.UserService;

@Controller
@RequestMapping(value="/")
public class HelloWorldController{
	
	private static Logger logger = Logger.getLogger(HelloWorldController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "index", method={RequestMethod.GET, RequestMethod.POST})
	public String index(){
		User user = userService.getUserById("1");
		logger.info("------>" + user.getName());
		return "index";
	}
	
}