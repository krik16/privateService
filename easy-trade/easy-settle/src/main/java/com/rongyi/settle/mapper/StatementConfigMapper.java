package com.rongyi.settle.mapper;


import com.rongyi.easy.settle.entity.StatementConfig;

import java.util.List;
import java.util.Map;

public interface StatementConfigMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(StatementConfig record);

	int insertSelective(StatementConfig record);

	StatementConfig selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(StatementConfig record);

	int updateByPrimaryKey(StatementConfig record);

	/**
	 * 根据id集合批量修改对账单配置状态
	 * @param paramsMap
	 */
	void updateStatusByIds(Map<String, Object> paramsMap);

}
