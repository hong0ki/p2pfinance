/**
 * @Package: com.zc.p2pfinance.service.impl
 * @author: 李卓宏
 * @date: 2018年6月9日 上午10:48:50 
 */
package com.zc.p2pfinance.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zc.p2pfinance.mapper.VisitorMapper;
import com.zc.p2pfinance.po.News;
import com.zc.p2pfinance.service.VisitorService;

/**
 * @ClassName: VisitorServiceImpl
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月9日 上午10:48:50 
 */
@Service("visitorServiceImpl")
public class VisitorServiceImpl implements VisitorService{
	
	@Autowired
	private VisitorMapper visitorMapper;

	/* Title: getAllNews
	 * @Description: TODO
	 * @see com.zc.p2pfinance.service.VisitorService#getAllNews()
	 */
	@Override
	public List<News> getAllNews() {
		System.out.println("进入mapper……");
		return visitorMapper.getAllNews();
	}

	/* Title: getName
	 * @Description: TODO
	 * @see com.zc.p2pfinance.service.VisitorService#getName()
	 */
	@Override
	public List<String> getName() {
		
		return visitorMapper.getName();
	}

	/* Title: getNewsByName
	 * @Description: TODO
	 * @see com.zc.p2pfinance.service.VisitorService#getNewsByName()
	 */
	@Override
	public News getNewsByName(int id) {
		
		return visitorMapper.getNewsById(id);
	}

}
