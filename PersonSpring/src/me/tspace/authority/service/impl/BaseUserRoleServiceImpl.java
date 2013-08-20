package me.tspace.authority.service.impl;

import me.tspace.authority.dao.BaseUserRoleMapper;
import me.tspace.authority.pojo.BaseUserRole;
import me.tspace.common.pojo.Criteria;
import me.tspace.authority.service.BaseUserRoleService;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class BaseUserRoleServiceImpl implements BaseUserRoleService {
	@Autowired
	private BaseUserRoleMapper baseUserRoleMapper;

	private static final Logger logger = LoggerFactory.getLogger(BaseUserRoleServiceImpl.class);

	public int countByExample(Criteria example) {
		int count = this.baseUserRoleMapper.countByExample(example);
		logger.debug("count: {}", count);
		return count;
	}

	public BaseUserRole selectByPrimaryKey(String userRoleId) {
		return this.baseUserRoleMapper.selectByPrimaryKey(userRoleId);
	}

	public List<BaseUserRole> selectByExample(Criteria example) {
		return this.baseUserRoleMapper.selectByExample(example);
	}
	
	public List<Map> selectMyRoleInfo(Criteria example){
		return this.baseUserRoleMapper.selectMyRoleInfo(example);
	}

}