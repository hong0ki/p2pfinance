package com.zc.p2pfinance.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zc.p2pfinance.po.ResultMessage;
import com.zc.p2pfinance.service.UserService;

@RequestMapping("/user")
@Controller
public class P2PAction {
	@Resource
	private UserService userService;

	@RequestMapping("/register")
	@ResponseBody
	public ResultMessage register(String verifyStr,String verifyVal) {
		
		System.out.println(userService.find());
		//登录标志，操作结果，反馈信息，结果集
		return new ResultMessage(true,1,"返回提示信息",null);
	}
}
