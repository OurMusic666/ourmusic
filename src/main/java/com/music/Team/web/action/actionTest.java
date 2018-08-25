package com.music.Team.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class actionTest {
	
	@RequestMapping("/test")
	public String Test(Model model) {
		String array= "[{title:'海阔天空',artist:'Beyond',mp3:'songs/Beyond.mp3',poster: 'images/m0.jpg' }]";
		System.out.println("success");
		System.out.println(array);
		model.addAttribute("arraySongs", array);
		return "index";
	}
}
