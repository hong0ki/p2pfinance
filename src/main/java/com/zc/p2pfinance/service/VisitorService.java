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

	/**@Title: getName 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return List<String>
	 */
	List<String> getName();

	/**@Title: getNewsByName 
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @return
	 * @return News
	 */
	News getNewsByName(int id);

}
