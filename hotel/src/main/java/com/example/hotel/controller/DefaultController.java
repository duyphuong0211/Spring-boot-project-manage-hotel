package com.example.hotel.controller;


import com.example.hotel.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultController {
	
	
	@RequestMapping("/")
	public String redirectHome() {
		return "home-page";
	}
	
	@GetMapping("/about")
	public String redirectAboutPage() {
		return "about-page";
	}

	@GetMapping("/login")
	public String redirectloginPage() {
		return "login-page";

	}
	
	@GetMapping("/register")
	public String redirectRegisterPage(Model theModel) {
		
		Users theUser=new Users();
		//UserProfile theUserProfile=new UserProfile();
		
		theModel.addAttribute("user", theUser);
		
		//theModel.addAttribute("userprofile", theUserProfile);
		
		return "register-page";
	}

	
	

}
