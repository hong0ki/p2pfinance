package com.zc.p2pfinance.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.p2pfinance.po.User;
import com.zc.p2pfinance.service.UserService;

/**
 ** @ClassName: SplTest.java
 * @Description: 该类的功能描述
 * @date 2018年6月7日
 * @version: v1.0.0
 * @author: Qiu
 */
public class SplTest1 {
	
	@Test
	public void getSession() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		List<User> list = userService.find();
		System.out.print(list);
	}

}
