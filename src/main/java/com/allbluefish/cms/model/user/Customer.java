package com.allbluefish.cms.model.user;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String realname;
	
	private String sex;
	
	private String addr;

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
