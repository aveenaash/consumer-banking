package org.banco.consumer.controller;

import org.banco.consumer.dtos.CustomerDto;
import org.banco.consumer.dtos.LoginDto;
import org.banco.consumer.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "signin", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		LoginDto loginDto = new LoginDto();
		mv.addObject("loginObject", loginDto);
		return mv;
	}
	
	@RequestMapping(value = "login-process", method = RequestMethod.POST)
	public ModelAndView submitLogin(LoginDto loginDto) {
		CustomerDto customerDto = loginService.login(loginDto.getUsername(), loginDto.getPassword());
		if(customerDto != null) {
			ModelAndView mv = new ModelAndView("home");
			mv.addObject("customer", customerDto);
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("login");
			mv.addObject("loginObject", loginDto);
			return mv;
		}
	}

}
