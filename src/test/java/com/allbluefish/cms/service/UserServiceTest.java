package com.allbluefish.cms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.allbluefish.cms.model.user.Admin;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.user.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:**/*Context.xml"})
public class UserServiceTest {

	@Autowired
	private UserService userService; 
	
	/*@Before
	public void initApplicationContext(){
		ClassPathXmlApplicationContext context = TestUnit.initContext();
		this.userService = (UserService) context.getBean("userServiceImpl");
	}*/
	
	@Test
	public void addUser(){
		User admin  = new Admin();
		admin.setUsername("admin~廖子南");
		admin.setPassword("123456");
		
		this.userService.save(admin);
	}
	
	@Test
	public void testTransaction(){
		
	}
}
