package com.example.pullpush;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class testController {
	
	@GetMapping("/test")
	public String test () {
		
		
		return "jsptest222";
	}
	
	@PostMapping("/test277777")
	public String test2() {
		return "redirect:/pull77.html";
	}
	
	//asdfijpsadjfpasj

}
