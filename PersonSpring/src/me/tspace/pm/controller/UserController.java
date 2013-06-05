package me.tspace.pm.controller;

import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.tspace.pm.dao.UserDaoTest;
import me.tspace.pm.model.UserTest;
import me.tspace.pm.service.UserServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	private UserServiceTest userService;
	@Autowired
	private UserDaoTest userDao;
	
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public String initLogin(ModelMap model){
		UserTest user = new UserTest();
		model.addAttribute("user",user);
		return "app/common/login";
	}
	
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public String login(@ModelAttribute("user") UserTest user){
		UserTest u = userService.read(user.getUserName(),user.getPassword());
		if(u!=null){
			return "redirect:profile.do?userID="+u.getUserID();
		}else{
			return "redirect:login.do";
		}
	}
	
	@RequestMapping(value="/logout.do",method=RequestMethod.GET)
	public void logout(){
		
	}
}
