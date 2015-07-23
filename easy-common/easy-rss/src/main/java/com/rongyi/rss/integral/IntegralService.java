package com.rongyi.rss.integral;

 import net.sf.json.JSONObject;

import com.rongyi.easy.integral.constant.ActionType;
import com.rongyi.easy.integral.constant.ScoreRuleEnum;
import com.rongyi.easy.integral.vo.IntegralRecordVO;

/**
 * 积分
* @Title: IntegralService.java 
* @Package com.rongyi.integral.service 
* @Description: 
* @author zzq 
* @date 2015-7-17 下午5:13:51
 */
public interface IntegralService {  
	
	/**
	 * 修改积分
	 * @param integral
	 */
	public JSONObject addOrSubScore(IntegralRecordVO integral);
	
	/**
	 * 根据用户id查询用户积分
	 * @param userId
	 */
	public JSONObject getScoreByUserId(String userId);
	
	/**
	 * 根据规则类型获取规则
	 * @param scoreRuleEnum
	 * @return
	 */
	public JSONObject  getRuleByType(ScoreRuleEnum scoreRuleEnum);
	/**
	 * 获取积分记录
	 * @param userid
	 * @param scoreRuleEnum
	 * @param actionType
	 * @param row
	 * @param page
	 * @return
	 */
	public JSONObject  getScoreRecord(String userid,ScoreRuleEnum scoreRuleEnum,ActionType actionType,int row,int page);
	/**
	 * 根据订单号获取积分记录
	 * @param orderSn
	 * @return
	 */
	public IntegralRecordVO getIntegralRecordByOrderSn(String orderSn);
	
}
