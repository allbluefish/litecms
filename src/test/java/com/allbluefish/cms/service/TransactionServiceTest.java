package com.allbluefish.cms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.allbluefish.cms.model.user.Admin;
import com.allbluefish.cms.model.user.User;
import com.allbluefish.cms.service.transaction.TransactionTestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/*Context.xml" })
public class TransactionServiceTest {

	@Autowired
	private TransactionTestService transactionTestService;

	
	private User initAdmin() {
		User admin  = new Admin();
		admin.setUsername("admin_liaozinan");
		admin.setPassword("123456");
		return admin;
	}
	
	/**
	 * 如果存在一个事务，则支持当前事务。如果没有事务则开启一个新的事务
	 */
	@Test
	public void testTXRequired() {

		User admin = initAdmin();
		
		this.transactionTestService.save(admin);
	}

	/**
	 * 如果存在一个事务，支持当前事务。如果没有事务，则非事务的执行。但是对于事务同步的事务管理器，
	 * PROPAGATION_SUPPORTS与不使用事务有少许不同
	 */
	@Test
	public void testTXSupports() {
	}

	/**
	 * 如果已经存在一个事务，支持当前事务。如果没有一个活动的事务，则抛出异常
	 */
	@Test
	public void testTXMandatory() {
		this.transactionTestService.save(initAdmin());
	}

	/**
	 * 总是开启一个新的事务。如果一个事务已经存在，则将这个存在的事务挂起
	 */
	@Test
	public void testTXRequiresNew() {
		this.transactionTestService.add(initAdmin(),initAdmin());
	}

	/**
	 * 总是非事务地执行，并挂起任何存在的事务
	 */
	@Test
	public void testTXNotSupported() {

	}

	/**
	 * 总是非事务地执行，如果存在一个活动事务，则抛出异常
	 */
	@Test
	public void testTXNever() {

	}

	/**
	 * 如果一个活动的事务存在，则运行在一个嵌套的事务中. 如果没有活动事务,
	 * 则按TransactionDefinition.PROPAGATION_REQUIRED 属性执行
	 */
	@Test
	public void testTXNested() {

	}
}
