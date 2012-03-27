package com.allbluefish.cms;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUnit {

	public static ClassPathXmlApplicationContext initContext(){
		return new ClassPathXmlApplicationContext("classpath*:**/*Context.xml");
	}
}
