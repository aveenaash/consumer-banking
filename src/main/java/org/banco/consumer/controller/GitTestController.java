package org.banco.consumer.controller;

import org.banco.consumer.dtos.AccountDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GitTestController {
	
	@RequestMapping(value = "git-test", method = RequestMethod.POST)
	public ModelAndView saveAccount(AccountDto accountDto) {
		ModelAndView mv = new ModelAndView("account");
		return mv;
	}
	
}
