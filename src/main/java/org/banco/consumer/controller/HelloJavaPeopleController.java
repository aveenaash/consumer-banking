package org.banco.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloJavaPeopleController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String showHelloPage() {
		return "hello";
	}
}
