package com.allbluefish.cms.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "t_type")
	private int type;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	
}
