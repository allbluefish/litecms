package com.allbluefish.cms.service.user.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allbluefish.cms.dao.user.UserDao;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.user.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(User t) {
		this.userDao.save(t);
	}

	public void delete(User t) {
		// TODO Auto-generated method stub

	}

	public void update(User t) {
		// TODO Auto-generated method stub

	}

	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
