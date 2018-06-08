package test;


import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.p2pfinance.po.User;
import com.zc.p2pfinance.service.UserService;


public class TestCase {
	
	
	@SuppressWarnings("resource")
	@Test
	public void testDataSource( ) throws SQLException {
		ApplicationContext aContext=null;
		{
			aContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		}
		DataSource dataSource=aContext.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	@Test
	public void getSession() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ac.getBean("userServiceImpl");
		List<User> list = userService.find();
		System.out.print(list);
	}
}
