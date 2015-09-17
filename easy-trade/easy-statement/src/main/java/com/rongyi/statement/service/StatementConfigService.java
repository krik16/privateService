/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:09:52
 * @Description: TODO
 *
 **/

package com.rongyi.statement.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.statement.entity.StatementConfig;

/**	
 * @Author:  柯军
 * @Description: 对账单配置接口 
 * @datetime:2015年9月17日上午11:09:52
 *
 **/

public interface StatementConfigService {
	
	/**	
	 * @Description: 分页查询
	 * @param map
	 * @param currentPage
	 * @param pageSize
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:23:43
	 **/
	public abstract List<StatementConfig> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize); 
	
	/**	
	 * @Description: 分页总数 
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:23:51
	 **/
	public abstract Integer selectPageListCount(Map<String,Object> map);
	
	/**	
	 * @Description: 插入 
	 * @param statementConfig	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:02
	 **/
	public abstract void insert(StatementConfig statementConfig);
	
	/**	
	 * @Description: 更新
	 * @param statementConfig	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:08
	 **/
	public abstract void update(StatementConfig statementConfig);
	
	/**	
	 * @Description: 根据id查询 
	 * @param id	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:15
	 **/
	public abstract StatementConfig selectById(Integer id);

}
