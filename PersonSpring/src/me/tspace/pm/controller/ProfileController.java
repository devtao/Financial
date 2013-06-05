package me.tspace.pm.controller;

import me.tspace.pm.dao.UserDaoTest;
import me.tspace.pm.model.UserTest;
import me.tspace.pm.service.UserServiceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author dat mail:dev.tao@gmail.com
 *
 */

@Controller
public class ProfileController {
	@Autowired
	private UserDaoTest userDao;
	
	@RequestMapping(value="/profile.do",method=RequestMethod.GET)
	public String profile(@RequestParam("userID")int id ,ModelMap model){
		UserTest user = userDao.getUserByID(id);
		model.addAttribute("user", user);
		return "app/common/profile";
	}
}
