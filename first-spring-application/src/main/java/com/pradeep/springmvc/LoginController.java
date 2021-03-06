package com.pradeep.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes; 

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String LoadLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String  HandleLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model) {
		if (loginService.isVaidUser(name, password)) {
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		}else {
			model.put("error", "Inavlid Credentials");
			return "login";
		}
		
	}

}
