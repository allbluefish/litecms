package com.allbluefish.cms.service.transaction.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allbluefish.cms.dao.user.UserDao;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.transaction.TransactionTestService;

@Service
public class TransactionTestServiceImpl implements TransactionTestService {

	@Autowired
	private UserDao userDao;

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
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
