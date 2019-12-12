package com.project.jeg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login/loginPage")
	public String loginPage() throws Exception{
		return "/login/loginPage";
	}
	
}
