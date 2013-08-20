package me.tspace.authority.service;

import me.tspace.authority.pojo.BaseUserRole;
import me.tspace.common.pojo.Criteria;

import java.util.List;
import java.util.Map;

public interface BaseUserRoleService {
	int countByExample(Criteria example);

	BaseUserRole selectByPrimaryKey(String userRoleId);

	List<BaseUserRole> selectByExample(Criteria example);
	
	public List<Map> selectMyRoleInfo(Criteria example);

}