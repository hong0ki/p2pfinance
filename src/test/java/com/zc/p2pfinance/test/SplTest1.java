package com.zc.p2pfinance.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.p2pfinance.po.News;
import com.zc.p2pfinance.po.User;
import com.zc.p2pfinance.service.UserService;
import com.zc.p2pfinance.service.VisitorService;

/**
 ** @ClassName: SplTest.java
 * @Description: 该类的功能描述
 * @date 2018年6月7日
 * @version: v1.0.0
 * @author: Qiu
 */
public class SplTest1 {
	@Resource
	VisitorService visitorService;
	
	@Test
	public void getSession() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		List<User> list = userService.find();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}
	@Test
	public void gett() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		VisitorService visitorService = (VisitorService) ac.getBean("visitorServiceImpl");
		List<News> list=visitorService.getAllNews();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}
