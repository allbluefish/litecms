package com.allbluefish.cms.web.action.user;


import com.allbluefish.cms.service.user.LoginService;

public class LoginController {

	private LoginService loginService;
	
	private String email;
	
	private String password;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String index() {
		this.loginService.doLogin();
		this.loginService.logout();
		
		return null;
	}



}
