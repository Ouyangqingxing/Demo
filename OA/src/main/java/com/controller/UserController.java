package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public ModelAndView  itemsList() {
		User user = userService.getById(1l);
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("user", user);
		return mav;
	}

}