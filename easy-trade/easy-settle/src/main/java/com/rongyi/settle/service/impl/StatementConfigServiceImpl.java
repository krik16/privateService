/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:10:16
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.StatementConfigMapper;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.StatementConfigService;

/**
 * @Author: 柯军
 * @Description: 对账单配置实现
 * @datetime:2015年9月17日上午11:10:16
 * 
 **/
@Service
public class StatementConfigServiceImpl extends BaseServiceImpl implements StatementConfigService {

	private static final String NAMESPACE = "com.rongyi.settle.mapper.StatementConfigMapper";

	private Logger logger = LoggerFactory.getLogger(StatementConfigServiceImpl.class);

	@Autowired
	private OperationLogMapper operationLogMapper;

	@Autowired
	private StatementConfigMapper statementConfigMapper;

	@Autowired
	BussinessInfoService bussinessInfoService;
	
	@Override
	public List<StatementConfigVO> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
		map.put("currentPage", (currentPage-1) * pageSize);
		map.put("pageSize", pageSize);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
	}

	@Override
	public Integer selectPageListCount(Map<String, Object> map) {
		return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
	}

	@Override
	public int insert(StatementConfig statementConfig) {
		return this.getBaseDao().insertBySql(NAMESPACE + ".insert", statementConfig);
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
		bussinessInfo.setConfigId(statementConfig.getId());
		bussinessInfoService.insert(bussinessInfo);
	}

	@Override
	public List<StatementConfig> selectForSchedule() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("currentTime", new Date());
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForSchedule", map);
	}

	@Override
	public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId) {
		boolean result = false;
		try {
			if (CollectionUtils.isNotEmpty(ids) && status!=null){
				Map<String, Object> paramsMap = new HashMap<>();
				paramsMap.put("ids", ids);
				paramsMap.put("status", status);
				statementConfigMapper.updateStatusByIds(paramsMap);
				for (Integer id : ids){
					saveOperationLog(id, status, desc, userId);
				}
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(e.getMessage());
		}
		return result;
	}

	/**
	 * 插入日志记录
	 * @param id
	 * @param status
	 * @param desc
	 * @param userId
	 */
	private void saveOperationLog(Integer id,  Integer status, String desc, String userId) {
		OperationLog operatioLog = new OperationLog();
		operatioLog.setCreateUserId(userId);
		operatioLog.setDesc(desc);
		operatioLog.setOperationModel((byte) 0);
		operatioLog.setOperationType(Byte.valueOf(status.toString()));
		operatioLog.setCreadeAt(new Date());
		operatioLog.setOperationId(id);
		operatioLog.setIsDelete(Byte.valueOf((byte) 0));
		operationLogMapper.insertSelective(operatioLog);
	}

	@Override
	public StatementConfig selectByRuleCode(String ruleCode) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ruleCode", ruleCode);
		return this.getBaseDao().selectOneBySql(NAMESPACE+".selectByRuleCode");
	}
}
