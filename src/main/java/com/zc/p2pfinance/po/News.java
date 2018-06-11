/**
 * @Package: com.zc.p2pfinance.po
 * @author: 李卓宏
 * @date: 2018年6月9日 上午10:26:57 
 */
package com.zc.p2pfinance.po;

import java.io.Serializable;

/**
 * @ClassName: News
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年6月9日 上午10:26:57 
 */
public class News implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int news_id;
	private String news_title;
	private String news_context;
	private String news_pic;
	private int news_type;
	private String news_time;
	public News() {
		
	}
	public News(int news_id, String news_title, String news_context, String news_pic, int news_type, String news_time) {
		super();
		this.news_id = news_id;
		this.news_title = news_title;
		this.news_context = news_context;
		this.news_pic = news_pic;
		this.news_type = news_type;
		this.news_time = news_time;
	}
	public int getNews_id() {
		return news_id;
	}
	public void setNews_id(int news_id) {
		this.news_id = news_id;
	}
	public String getNews_title() {
		return news_title;
	}
	public void setNews_title(String news_title) {
		this.news_title = news_title;
	}
	public String getNews_context() {
		return news_context;
	}
	public void setNews_context(String news_context) {
		this.news_context = news_context;
	}
	public String getNews_pic() {
		return news_pic;
	}
	public void setNews_pic(String news_pic) {
		this.news_pic = news_pic;
	}
	public int getNews_type() {
		return news_type;
	}
	public void setNews_type(int news_type) {
		this.news_type = news_type;
	}
	public String getNews_time() {
		return news_time;
	}
	public void setNews_time(String news_time) {
		this.news_time = news_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "News [news_id=" + news_id + ", news_title=" + news_title + ", news_context=" + news_context
				+ ", news_pic=" + news_pic + ", news_type=" + news_type + ", news_time=" + news_time + "]";
	}
	
	
	
	
	

}
