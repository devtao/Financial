package me.tspace.account.controller;

import me.tspace.account.dao.UserDaoTest;
import me.tspace.account.model.UserTest;
import me.tspace.account.service.IUserServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */

@Controller
@SessionAttributes("userName")
public class UserController {
	
	@Autowired
	private IUserServiceTest userService;
	@Autowired
	private UserDaoTest userDao;
	
	@RequestMapping(value="login1.do",method=RequestMethod.GET)
	public String initLogin(ModelMap model){
		UserTest user = new UserTest();
		model.addAttribute("user",user);
		return "app/common/login";
	}
	
	@RequestMapping(value="login1.do",method=RequestMethod.POST)
	public String login(@ModelAttribute("user") UserTest user){
		UserTest u = userService.read(user.getUserName(),user.getPassword());
		if(u!=null){
			return "redirect:profile.do?userID="+u.getUserID();
		}else{
			return "redirect:login1.do";
		}
	}
	
	@RequestMapping(value="/logout.do",method=RequestMethod.GET)
	public void logout(){
		
	}
}
