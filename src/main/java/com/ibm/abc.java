package com.ibm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

   @Controller
    public class abc {
	@GetMapping("/welcome")
	public String getWelcome(Model model) {
	model.addAttribute("msg", "welcome to kirru");
	System.out.println("hello ");
	
    return "index";

	}
}
