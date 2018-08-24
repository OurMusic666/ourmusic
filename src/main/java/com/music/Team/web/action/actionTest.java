package com.music.Team.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class actionTest {
	
	@RequestMapping("/test")
	public String Test(Model model) {
		String array= "[\r\n" + 
				"  {\r\n" + 
				"      title:\"海阔天空\",\r\n" + 
				"      artist:\"Beyond\",\r\n" + 
				"      mp3:\"songs/Beyond.mp3\",\r\n" + 
				"      poster: \"images/m0.jpg\"\r\n" + 
				"    }\r\n" + 
				"  ]";
		System.out.println(array);
		model.addAttribute("arraySongs", array);
		return "index";
	}
}
