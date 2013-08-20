package me.tspace.authority.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import me.tspace.common.jackjson.JackJson;
import me.tspace.authority.dao.BaseFieldsMapper;
import me.tspace.authority.pojo.BaseFields;
import me.tspace.common.pojo.Criteria;
import me.tspace.authority.service.BaseFieldsService;

@Service
public class BaseFieldsServiceImpl implements BaseFieldsService {
	@Autowired
	private BaseFieldsMapper baseFieldsMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(BaseFieldsServiceImpl.class);

	public int countByExample(Criteria example) {
		int count = this.baseFieldsMapper.countByExample(example);
		logger.debug("count: {}", count);
		return count;
	}

	public BaseFields selectByPrimaryKey(String fieldId) {
		return this.baseFieldsMapper.selectByPrimaryKey(fieldId);
	}

	public List<BaseFields> selectByExample(Criteria example) {
		return this.baseFieldsMapper.selectByExample(example);
	}

	@Override
	@Deprecated
	public HashMap<String, String> selectAllByExample(Criteria example) {
//		selectAllByExample1(example);
		List<BaseFields> list = this.baseFieldsMapper.selectByExample(example);
		HashMap<String, LinkedHashMap<String, String>> all = new HashMap<String, LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> part = null;
		for (int i = 0; i < list.size(); i++) {
			BaseFields baseFields = list.get(i);
			String key = baseFields.getField();
			if (all.containsKey(key)) {
				// 如果包含这个field，就加入它的值
				part = all.get(key);
				part.put(baseFields.getValueField(), baseFields.getDisplayField());
			} else {
				part = new LinkedHashMap<String, String>();
				part.put(baseFields.getValueField(), baseFields.getDisplayField());
				// 没有这个fiel，则新加入这个filed
				all.put(key, part);
			}
		}
		part = new LinkedHashMap<String, String>();
		logger.info("开始读取系统默认配置");
		for (Entry<String, LinkedHashMap<String, String>> entry : all.entrySet()) {
			String key = entry.getKey();
			HashMap<String, String> value = entry.getValue();
			// 为了eval('(${applicationScope.fields.sex})')这个单引号使用,替换所有的'，为\'
			String val = JackJson.fromObjectToJson(value).replaceAll("\\'", "\\\\'");
			logger.info(val);
			part.put(key, val);
		}
		logger.info("结束读取系统默认配置");
		return part;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public String saveFields(Criteria example) {
		BaseFields fields = (BaseFields) example.get("fields");

		int result = 0;
		if (fields.getFieldId() == null) {
			result = this.baseFieldsMapper.insertSelective(fields);
		} else {
			result = this.baseFieldsMapper.updateByPrimaryKeySelective(fields);
		}
		return result > 0 ? "01" : "00";
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = { Exception.class })
	public String delete(Criteria example) {
		String fieldId = example.getAsString("fieldId");
		int result = 0;
		// 删除自己
		result = this.baseFieldsMapper.deleteByPrimaryKey(fieldId);
		return result > 0 ? "01" : "00";
	}
	@Override
	public Map<String,String> getLocaleFields(Locale locale , MessageSource messageSource){
		Criteria criteria = new Criteria();
		criteria.setOrderByClause(" field desc ,sort asc ");
		criteria.put("enabled", "1");
		List<BaseFields> list = this.baseFieldsMapper.selectByExample(criteria);
		return packLocaleFields(list, locale, messageSource);
	}
	
	@Override
	public Map<String,Map> refreshAllLocaleFields(List<Locale> locales , MessageSource messageSource){
		Criteria criteria = new Criteria();
		criteria.setOrderByClause(" field desc ,sort asc ");
		criteria.put("enabled", "1");
		List<BaseFields> list = this.baseFieldsMapper.selectByExample(criteria);
		Map<String,Map> resultMap = new HashMap<String,Map>();
		for(Locale locale:locales){
			Map map = packLocaleFields(list, locale, messageSource);
			if("zh".equals(locale.getLanguage()))
				resultMap.put("zh_fields", map);
			else
				resultMap.put("en_fields", map);
		}
		return resultMap;
	}
	
	public Map<String,String> packLocaleFields(List<BaseFields> list, Locale locale , MessageSource messageSource){
		HashMap<String, LinkedHashMap<String, String>> all = new HashMap<String, LinkedHashMap<String, String>>();
		LinkedHashMap<String, String> part = null;
		for (int i = 0; i < list.size(); i++) {
			BaseFields baseFields = list.get(i);
			String key = baseFields.getField();
			if (all.containsKey(key)) {
				// 如果包含这个field，就加入它的值
				part = all.get(key);
				if(baseFields.getNeedLocale()==0)
				   part.put(baseFields.getValueField(), baseFields.getDisplayField());
				else
				   part.put(baseFields.getValueField(), returnMsg(baseFields.getDisplayField(), locale,messageSource));
			} else {
				part = new LinkedHashMap<String, String>();
				if(baseFields.getNeedLocale()==0)
				   part.put(baseFields.getValueField(), baseFields.getDisplayField());
				else
				   part.put(baseFields.getValueField(), returnMsg(baseFields.getDisplayField(), locale,messageSource));
				// 没有这个field，则新加入这个field
				all.put(key, part);
			}
		}
		part = new LinkedHashMap<String, String>();
		logger.info("开始读取系统默认配置");
		for (Entry<String, LinkedHashMap<String, String>> entry : all.entrySet()) {
			String key = entry.getKey();
			HashMap<String, String> value = entry.getValue();
			// 为了eval('(${applicationScope.fields.sex})')这个单引号使用,替换所有的'，为\'
			String val = JackJson.fromObjectToJson(value).replaceAll("\\'", "\\\\'");
			logger.info(val);
			part.put(key, val);
		}
		logger.info("结束读取系统默认配置");
		return part;
	}
	
	private String returnMsg(String str,Locale locale , MessageSource messageSource){
		return messageSource.getMessage(str, null, "Default", locale);
	}
}