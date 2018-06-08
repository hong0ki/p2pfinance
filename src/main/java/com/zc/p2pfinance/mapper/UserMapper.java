package com.zc.p2pfinance.mapper;

import java.util.List;

import com.zc.p2pfinance.po.User;

/**
 ** @ClassName: UserMapper.java
 * @Description: 该类的功能描述
 * @date 2018年6月7日
 * @version: v1.0.0
 * @author: Qiu
 */

public interface UserMapper {
	
	List<User> find();
}
