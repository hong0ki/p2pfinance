/**
 * @Package: com.zc.p2pfinance.controller
 * @author: 李卓宏
 * @date: 2018年6月8日 下午4:41:30 
 */
package com.zc.p2pfinance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zc.p2pfinance.po.News;
import com.zc.p2pfinance.service.VisitorService;

/**
 * @ClassName: TestAction
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月8日 下午4:41:30 
 */
@RequestMapping("/visitor")
@Controller
public class VisitorAction {
	
	@Autowired
	VisitorService visitorService;
	
	@RequestMapping("/newsList")
	@ResponseBody
	public List<News> getAllNews(){
		System.out.println("开始获取新闻……");
		return visitorService.getAllNews();
		
	}
	
	@RequestMapping("/news")
	@ResponseBody
	public News getNewsById(String newsId){
		System.out.println("新闻id"+newsId);
		int nId=Integer.parseInt(newsId);
		return visitorService.getNewsByName(nId);
		
	}

}
