package com.zckj.p2p.conterller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hehe")
@Controller
public class P2PAction {

	@RequestMapping("/register")
	public String register() {
		
		return "register";
	}
}
