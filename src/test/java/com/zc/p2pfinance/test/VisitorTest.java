/**
 * @Package: com.zc.p2pfinance.test
 * @author: 李卓宏
 * @date: 2018年6月9日 下午4:28:06 
 */
package com.zc.p2pfinance.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zc.p2pfinance.po.News;
import com.zc.p2pfinance.service.VisitorService;

/**
 * @ClassName: VisitorTest
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月9日 下午4:28:06 
 */
public class VisitorTest {
	@Test
	public void gettnew() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		VisitorService visitorService = (VisitorService) ac.getBean("visitorServiceImpl");
		News list=visitorService.getNewsByName(2);
		
		System.out.println(list);
	}
}
