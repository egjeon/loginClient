package com.project.jeg;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "index";
	}
	
	@RequestMapping(value = "/member/page")
	public String memberPage () {
		
		return "/login/memberPage";
	}
	
	@RequestMapping(value = "/admin/page")
	public String adminPage () {
		
		return "/login/adminPage";
	}
	
	@RequestMapping(value = "/guest/page")
	public String guestPage () {
		
		return "/login/guestPage";
	}
	
	@RequestMapping(value = "/user/page")
	public String userPage () {
		
		return "/login/userPage";
	}
	
}
