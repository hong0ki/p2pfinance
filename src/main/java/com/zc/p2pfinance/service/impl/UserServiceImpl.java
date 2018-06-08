package com.zc.p2pfinance.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zc.p2pfinance.mapper.UserMapper;
import com.zc.p2pfinance.po.User;
import com.zc.p2pfinance.service.UserService;

/**
 ** @ClassName: UserServiceImpl.java
 * @Description: 该类的功能描述
 * @date 2018年6月7日
 * @version: v1.0.0
 * @author: Qiu
 */

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public List<User> find() {
		return userMapper.find();
	}

}
