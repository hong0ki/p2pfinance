package com.zc.p2pfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zc.p2pfinance.po.ResultMessage;

@RequestMapping("/user")
@Controller
public class P2PAction {

	@RequestMapping("/register")
	@ResponseBody
	public ResultMessage register(String string) {
		System.out.println(string);
		String str=string+"结果集";
		//登录标志，操作结果，反馈信息，结果集
		return new ResultMessage(true,1,"返回提示信息",str);
	}
}
