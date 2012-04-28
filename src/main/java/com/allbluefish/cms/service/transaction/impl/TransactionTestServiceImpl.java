package com.allbluefish.cms.service.transaction.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allbluefish.cms.dao.user.UserDao;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.transaction.TransactionTestService;
import com.allbluefish.cms.service.user.UserService;

@Service
public class TransactionTestServiceImpl implements TransactionTestService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserService userService;
	
	
//	@Transactional(readOnly = false, propagation = Propagation.MANDATORY)
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void save(User t) {
		this.userDao.save(t);
		//throwException();
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void add(User t,User t2){
		this.userDao.save(t);
		this.userService.save(t2);
		//throwException();
	}
	
	private void throwException() {
		throw new RuntimeException("i am wrong");
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
