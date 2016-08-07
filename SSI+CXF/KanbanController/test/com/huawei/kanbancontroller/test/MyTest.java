package com.huawei.kanbancontroller.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huawei.kanbancontroller.service.UserService;

public class MyTest {
	
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	BeanFactory factory = (BeanFactory)context;
	UserService service = (UserService)factory.getBean("userService");
	@Test
	public void test() {
		System.out.println("*************");
		service.getUserByName("kdjkf");
	}

}
