package com.cybage.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.User;
import com.cybage.service.UserService;

@Controller
@RequestMapping("/book/management")
public class LoginController {
	
	@GetMapping("/login")
	public ModelAndView showLoginPage() {
		User user = new User();
		return new ModelAndView("login","user",user);
	}
	
	@Autowired
	UserService userService;
	
	@PostMapping("/bookAppOptions")
	public ModelAndView bookAppOptions(@Valid @ModelAttribute User user , BindingResult result) {
		if(result.hasErrors())
			return new ModelAndView("login","user",user);
		userService.addUserAndLogin(user);
		return new ModelAndView("bookappoptions","user",user);
	}
}
