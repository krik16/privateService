/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年9月17日上午11:09:52
 * @Description: TODO
 *
 **/

package com.rongyi.settle.service;

import java.util.List;
import java.util.Map;

import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.ConfigShopVO;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.settle.web.controller.vo.UserInfoVo;

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
	void saveStatementConfigAndInfo(StatementConfig statementConfig,BussinessInfo bussinessInfo, List<ConfigShop> shopConfigs);


	/**
	 * 获取对账单配置（旧）
	 * 
	 * @return
	* @author erliang
	* @date 2016年1月15日
	 */
	List<StatementConfig> selectForScheduleDaily();

	/**
	 * 获取对账单配置（多日间隔为一个结算周期）
	 * 
	 * @return
	 * @author erliang
	 * @date 2016年1月15日
	 */
	List<StatementConfig> selectForScheduleSpacing();

	/**
	 * 获取对账单配置（指定日期）
	 *
	 * @return
	 * @author erliang
	 * @date 2016年1月15日
	 */
	List<StatementConfig> selectForScheduleJumping();
	
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
	 * @param statementConfig
	 * @param linkShopIds
	 * @param statuses
	 * @return
	 * @Author:  柯军
	 * @datetime:2015年10月21日下午2:38:48
	 **/
	Map<String, Object> validateIsExist(StatementConfig statementConfig, List<Byte> statuses, String[] linkShopIds) throws Exception;

	/**
	 * 获取账户信息
	 * @param isOneself
	 * @param type
	 * @param guideType
	 * @param id
	 * @param userAccount
	 * @return
	 */
	List<UserInfoVo> getAccountInfoByParam(Integer isOneself, Integer type, Integer guideType, String id, String userAccount);

	/**
	 * @Description:验证是否需要打款到买家虚拟账号
	 * @param:shopId 店铺ID
	 * @param:userId 用户ID
	 * @param:gradeType 用户角色(1:导购,2:买手)
	 * @return true	打款，false 不打款
	 * @Author:  柯军
	 **/

	boolean validateNeedPay(String shopId,String userId,Integer gradeType);

	List<StatementConfig> checkeffectStart(Map<String, Object> paramsMap);

	List<ConfigShopVO> selectConfigShopsPage(Map<String, Object> paramsMap, int currPage, int pageSize) throws Exception;

	int selectConfigShopsPageCount(Map<String, Object> paramsMap);

	/**
	 * 根据配置id查询该配置下配置的所有账号id
	 * @param configId
	 * @return
	 */
	List<Integer> getUserIdByConfigId(Integer configId);
}
