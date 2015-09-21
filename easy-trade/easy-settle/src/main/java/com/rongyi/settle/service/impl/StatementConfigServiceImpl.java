/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:10:16
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.settle.service.StatementConfigService;

/**
 * @Author: 柯军
 * @Description: 对账单配置实现
 * @datetime:2015年9月17日上午11:10:16
 * 
 **/
@Service
public class StatementConfigServiceImpl extends BaseServiceImpl implements StatementConfigService {

	private static final String NAMESPACE = "com.rongyi.settle.mapper.xml.StatementConfigMapper";
	

	@Override
	public List<StatementConfig> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		map.put("currentPage", currentPage * pageSize);
		map.put("pageSize", pageSize);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public void insert(StatementConfig statementConfig) {
		this.getBaseDao().insertBySql(NAMESPACE + ".insert", statementConfig);
	}

	@Override
	public void update(StatementConfig statementConfig) {
		this.getBaseDao().updateBySql(NAMESPACE + ".update", statementConfig);
	}

	@Override
	public StatementConfig selectById(Integer id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectById", map);
	}

	@Override
	public void saveStatementConfigAndInfo(StatementConfig statementConfig, BussinessInfo bussinessInfo) {
		insert(statementConfig);
		//TODO insert bussiness info
	}

}
