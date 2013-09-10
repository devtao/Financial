package me.tspace.finance.debt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/finance/debt")
@Scope("prototype")
public class debtController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String init(HttpSession session) {
		
		
		return "finance/debt";
	}

}
