/**
 * @Package: com.zc.p2pfinance.mapper
 * @author: 李卓宏
 * @date: 2018年6月9日 上午10:50:45 
 */
package com.zc.p2pfinance.mapper;

import java.util.List;

import com.zc.p2pfinance.po.News;

/**
 * @ClassName: VisitorMapper
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月9日 上午10:50:45 
 */
public interface VisitorMapper {
	
	List<News> getAllNews();

}
