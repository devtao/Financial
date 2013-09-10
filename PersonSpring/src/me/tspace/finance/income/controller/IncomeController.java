package me.tspace.finance.income.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/finance/income")
@Scope("prototype")
public class IncomeController {
	@RequestMapping(method = RequestMethod.GET)
	public String init(HttpSession session) {
		
		
		return "finance/income";
	}
	
	
	
	
}
