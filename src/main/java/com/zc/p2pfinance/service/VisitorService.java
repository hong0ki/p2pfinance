/**
 * @Package: com.zc.p2pfinance.service
 * @author: 李卓宏
 * @date: 2018年6月9日 上午10:25:16 
 */
package com.zc.p2pfinance.service;

import java.util.List;

import com.zc.p2pfinance.po.News;

/**
 * @ClassName: VisitorService
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月9日 上午10:25:16 
 */
public interface VisitorService {
	
	List<News> getAllNews();

}
