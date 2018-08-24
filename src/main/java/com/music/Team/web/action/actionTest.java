package com.music.Team.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class actionTest {
	
	@RequestMapping("/test")
	public String Test() {
		
		System.out.println("success");
		
		return "index";
	}
}
