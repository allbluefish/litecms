package com.allbluefish.cms.service.user.impl;

import org.springframework.stereotype.Service;

import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.user.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	public User doLogin() {
		System.out.println("do login~");
		return null;
	}

	public boolean logout() {
		System.out.println("do logout~");
		return false;
	}
	
}
