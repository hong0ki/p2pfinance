package com.zc.p2pfinance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/user")
@Controller
public class P2PAction {

	@RequestMapping("/register")
	@ResponseBody
	public Object register(String string) {
		System.out.println(string);
		
		return null;
	}
}
