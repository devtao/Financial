package me.tspace.finance.category.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/finance/category")
@Scope("prototype")
public class CategoryController {
	@RequestMapping(method = RequestMethod.GET)
	public String init(HttpSession session) {
		
		
		return "finance/category";
	}
	
	
}
