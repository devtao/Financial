package me.tspace.authority.service;

import me.tspace.authority.pojo.BaseFields;
import me.tspace.common.pojo.Criteria;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.MessageSource;

public interface BaseFieldsService {
	int countByExample(Criteria example);

	BaseFields selectByPrimaryKey(String fieldId);

	List<BaseFields> selectByExample(Criteria example);

	HashMap<String, String> selectAllByExample(Criteria example);

	/**
	 * 保存系统字段设置
	 * 
	 * @param example
	 * @return 00：失败，01：成功 ,其他情况
	 */
	String saveFields(Criteria example);

	/**
	 * 删除系统字段设置
	 * 
	 * @param example
	 * @return 00：失败，01：成功 ,其他情况
	 */
	String delete(Criteria example);

	Map<String, Map> refreshAllLocaleFields(List<Locale> locales,
			MessageSource messageSource);

	Map<String, String> getLocaleFields(Locale locale,
			MessageSource messageSource);

}