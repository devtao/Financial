package me.tspace.common.pojo;

import org.apache.commons.lang3.StringUtils;


/**
 * Ext的分页请求对象
 * 
 * @author selleck
 * @date 2011-3-17 上午10:37:27
 */
public class ExtPager {

	private Integer limit;
	private Integer start;
	/**
	 * 大写的ASC or DESC
	 */
	private String dir;
	/**
	 * 排序的字段
	 */
	protected String sort;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getSort() {
		// TODO:先转化
		return Table.toClumn(sort);
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	
	/**
	 * 设置分页信息
	 * @param criteria
	 */
	public void setPagingAndSortInfo(Criteria criteria){
    	if (this.limit != null && this.start != null) {
    		criteria.setOracleEnd(this.limit);
    		if (this.start == 0)
    			criteria.setOracleStart(0);
    		else
    			criteria.setOracleStart(((this.limit + this.start) / this.limit - 1)
    					* this.limit);
    	}
    	// 排序信息
    	if (StringUtils.isNotBlank(this.dir)
    			&& StringUtils.isNotBlank(this.sort)) {
    		criteria.setOrderByClause(this.sort + " "
    				+ this.dir);
    	}
	}

}
