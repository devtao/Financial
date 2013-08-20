package me.tspace.authority.service;

import me.tspace.authority.pojo.BaseRoleModule;
import me.tspace.common.pojo.Criteria;
import java.util.List;

public interface BaseRoleModuleService {
	int countByExample(Criteria example);

	BaseRoleModule selectByPrimaryKey(String roleModuleId);

	List<BaseRoleModule> selectByExample(Criteria example);
}