package org.banco.consumer.controller;

import org.banco.consumer.dtos.AccountDto;
import org.banco.consumer.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	//TODO my testing git check
	//this is second git testing
	
	@RequestMapping(value = "account", method = RequestMethod.GET)
	public ModelAndView showAccount(@RequestParam(value = "customerid") long customerId) {
		System.out.println("customerId : " + customerId);
		ModelAndView mv = new ModelAndView("account");
		AccountDto account = new AccountDto();
		account.setCustomerId(customerId);
		mv.addObject("accountDto",account);
		return mv;
	}
	
	@RequestMapping(value = "save-account", method = RequestMethod.POST)
	public ModelAndView saveAccount(AccountDto accountDto) {
		System.out.println("customerId : " + accountDto.getCustomerId());
		accountService.saveAccount(accountDto);
		ModelAndView mv = new ModelAndView("account");
		mv.addObject("accountDto",new AccountDto());
		return mv;
	}
	
}
