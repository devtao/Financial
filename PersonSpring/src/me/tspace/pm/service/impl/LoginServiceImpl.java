package me.tspace.pm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.pm.dao.LoginMapper;
import me.tspace.pm.dao.UserMapper;
import me.tspace.pm.model.Login;
import me.tspace.pm.model.LoginExample;
import me.tspace.pm.service.LoginService;
import me.tspace.pm.service.UserService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	@Autowired
	private UserService userService;
	
	@Override
	@Transactional(readOnly=true)
	public boolean checkLoginExists(Login login) {
		LoginExample example = new LoginExample();
		List<Login> logins  = new ArrayList<Login>();
		boolean flag = false;
		if(login.getLoginName()!=null){
			example.createCriteria().andLoginNameEqualTo(login.getLoginName());
			logins = loginMapper.selectByExample(example);
		}
		if(login.getLoginEmail()!=null){
			example.clear();
			example.createCriteria().andLoginEmailEqualTo(login.getLoginEmail());
			logins = loginMapper.selectByExample(example);
		}
		for(Login lo:logins){
			if(lo.getLoginPwd().equals(login.getLoginPwd())){
				flag = true;
			}
		}
		return flag;
	}

	@Override
	@Transactional(readOnly=false , rollbackFor=DataAccessException.class)
	public Login createLogin(Login login) {
		loginMapper.insert(login);
		userService.createCreate(login);
		return login;
	}

}
