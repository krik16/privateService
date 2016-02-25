package com.rongyi.settle.mapper;

import com.rongyi.easy.settle.entity.OperationLog;

import java.util.Map;


public interface OperationLogMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(OperationLog record);

	int insertSelective(OperationLog record);

	OperationLog selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(OperationLog record);

	int updateByPrimaryKey(OperationLog record);

	/**
	 * map条件查询日志记录(多个取最后一个)
	 * @param paramsMap
	 */
	OperationLog getOpByMap(Map<String, Object> paramsMap);
}
