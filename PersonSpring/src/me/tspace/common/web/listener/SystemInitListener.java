package me.tspace.common.web.listener;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import me.tspace.authority.service.BaseFieldsService;
import me.tspace.common.pojo.Criteria;
import me.tspace.common.springmvc.SpringContextHolder;

/**
 * 系统初始化监听器
 * 
 * @author selleck
 * @date 2011-12-16 下午11:26:14
 */
public class SystemInitListener implements ServletContextListener {

	/**
	 * 由于国际化引入的关系,此代码已废弃
	 * 具体见HomeController,initLocaleCollections
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
//		ServletContext servletContext = sce.getServletContext();
//		BaseFieldsService baseFieldsService = SpringContextHolder.getBean("baseFieldsServiceImpl");
//		Criteria criteria = new Criteria();
//		criteria.setOrderByClause(" field desc ,sort asc ");
//		criteria.put("enabled", "1");
//		Map resultMap = baseFieldsService.selectAllByExample(criteria);
//		servletContext.setAttribute("fields",resultMap );
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
