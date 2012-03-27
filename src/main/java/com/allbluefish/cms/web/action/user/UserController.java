package com.allbluefish.cms.web.action.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.allbluefish.cms.model.user.Admin;
import com.allbluefish.cms.service.user.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addUser(Admin admin){
		this.userService.save(admin);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String toAddUser(){
		return "/user/add";
	}
}
