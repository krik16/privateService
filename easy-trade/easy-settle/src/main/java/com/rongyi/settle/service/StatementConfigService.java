/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:09:52
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.StatementConfigVO;

/**	
 * @Author:  柯军
 * @Description: 对账单配置接口 
 * @datetime:2015年9月17日上午11:09:52
 *
 **/

public interface StatementConfigService {

	/**
	 * 判断账号打款配置
	 * @param id : 关联id
	 * @param userAccount ： 账号
	 * @return
	 */
	boolean checkUserAccountConfig(String id, String userAccount) throws Exception;
	
	/**	
	 * @Description: 分页查询
	 * @param map
	 * @param currentPage
	 * @param pageSize
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:23:43
	 **/
	List<StatementConfigVO> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize);
	
	/**	
	 * @Description: 分页总数 
	 * @param map
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:23:51
	 **/
	Integer selectPageListCount(Map<String,Object> map);
	
	/**	
	 * @Description: 插入 
	 * @param statementConfig	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:02
	 **/
	int insert(StatementConfig statementConfig);
	
	/**	
	 * @Description: 更新
	 * @param statementConfig	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:08
	 **/
	void update(StatementConfig statementConfig);
	
	/**	
	 * @Description: 根据id查询 
	 * @param id	
	 * @Author:  柯军
	 * @datetime:2015年9月17日上午11:24:15
	 **/
	StatementConfig selectById(Integer id);
	
	
	/**	
	 * @Description: 保存配置和商家信息 
	 * @param statementConfig
	 * @param bussinessInfo	
	 * @Author:  柯军
	 * @datetime:2015年9月21日下午4:26:16
	 **/
	void saveStatementConfigAndInfo(StatementConfig statementConfig,BussinessInfo bussinessInfo);

	/**
	 * @Description: 定时任务查询符合条件的对账配置
	 * @Author:  xgq
	 **/
	List<StatementConfig> selectForSchedule();

	/**
	 * 批量对账单配置审核
	 * @param ids
	 * @param status
	 * @param desc
	 * @param userId
	 * @return
	 */
	boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId);

	/**	
	 * @Description: 根据规则编号查询记录 
	 * @param ruleCode
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年10月15日上午10:52:29
	 **/
	StatementConfig selectByRuleCode(String ruleCode);
	
	/**	
	 * @Description: 查询对账单配置相关信息 
	 * @param id
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年10月16日下午7:12:25
	 **/
	StatementConfigVO selectConfigInfoById(	Integer id);
	
	
	/**	
	 * @Description: 验证对账单配置是否已存在 
	 * @param cooperateType
	 * @param bussinessType
	 * @param bussinessId
	 * @param status
	 * @param effectStartTime
	 * @param effectEndTime
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年10月21日下午2:38:48
	 **/
	boolean validateIsExist(byte cooperateType,byte bussinessType,String bussinessId,byte status,Date effectStartTime,Date  effectEndTime, Byte lintType) throws Exception;
}
