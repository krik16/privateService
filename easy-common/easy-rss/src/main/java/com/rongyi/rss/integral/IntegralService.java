package com.rongyi.rss.integral;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.integral.constant.ActionType;
import com.rongyi.easy.integral.constant.ScoreRuleEnum;
import com.rongyi.easy.integral.vo.IntegralRecord;

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
	public ResponseResult addOrSubScore(IntegralRecord integral);
	
	/**
	 * 根据用户id查询用户积分
	 * @param userId
	 */
	public ResponseResult getScoreByUserId(String userId);
	
	/**
	 * 根据规则类型获取规则
	 * @param scoreRuleEnum
	 * @return
	 */
	public ResponseResult  getRuleByType(ScoreRuleEnum scoreRuleEnum);
	/**
	 * 获取积分记录
	 * @param userid
	 * @param scoreRuleEnum
	 * @param actionType
	 * @param row
	 * @param page
	 * @return
	 */
	public ResponseResult  getScoreRecord(String userid,ScoreRuleEnum scoreRuleEnum,ActionType actionType,int row,int page);
	
	
	
}
