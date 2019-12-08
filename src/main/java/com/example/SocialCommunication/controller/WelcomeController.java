package com.example.SocialCommunication.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	/*
	 * @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET) public
	 * String hello(Model model, @RequestParam(value="name", required=false,
	 * defaultValue="World") String name) { model.addAttribute("name", name); return
	 * "welcome";
	 * 
	 * }
	 */
	 @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	 public String hello(ModelMap model) {
		 model.put("name", getLoggedinUserName());
		 return "welcome";
		
	}
	 
	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}

}
