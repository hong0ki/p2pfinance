package test;

import java.awt.List;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
}
