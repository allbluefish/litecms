package com.allbluefish.cms.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allbluefish.cms.TestUnit;
import com.allbluefish.cms.model.user.Admin;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.user.UserService;

public class UserServiceTest {

	private UserService userService; 
	
	@Before
	public void initApplicationContext(){
		ClassPathXmlApplicationContext context = TestUnit.initContext();
		this.userService = (UserService) context.getBean("userService");
	}
	
	@Test
	public void addUser(){
		User admin  = new Admin();
		admin.setUsername("admin");
		admin.setPassword("123456");
		
		this.userService.save(admin);
	}
}
