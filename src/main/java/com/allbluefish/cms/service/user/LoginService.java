package com.allbluefish.cms.service.user;

import com.allbluefish.cms.model.user.User;

public interface LoginService {

	User doLogin();
	
	boolean logout();
}
