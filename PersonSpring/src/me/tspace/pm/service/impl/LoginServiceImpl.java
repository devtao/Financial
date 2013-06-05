package me.tspace.pm.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.tspace.pm.dao.LoginMapper;
import me.tspace.pm.model.Login;
import me.tspace.pm.model.LoginExample;
import me.tspace.pm.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public boolean checkLoginExists(Login login) {
		LoginExample example = new LoginExample();
		List<Login> logins  = new ArrayList<Login>();
		boolean flag = false;
		if(login.getLoginName()!=null){
			example.createCriteria().andLoginNameEqualTo(login.getLoginName());
			logins = loginMapper.selectByExample(example);
		}else if(login.getLoginEmail()!=null){
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
	public Login createLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkExistWithName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkExistWithEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
