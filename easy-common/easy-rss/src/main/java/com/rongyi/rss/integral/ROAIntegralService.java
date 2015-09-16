package com.rongyi.rss.integral;
import net.sf.json.JSONObject;
import com.rongyi.easy.integral.vo.IntegralRecordVO;

public interface ROAIntegralService {

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
	 * 根据规则类型获取规则信息
	 * @param scoreRuleEnum
	 * @return
	 */
	public JSONObject  getRuleByType(int scoreRuleEnum);

	/**
	 * 根据规则类型获取规则比率
	 * @param scoreRuleEnum
	 * @return 
	 */
	public JSONObject  getRuleRateByType(int scoreRuleEnum);
	/**
	 * 根据用户ID获取积分记录
	 * @param userid
	 * @param scoreRuleEnum
	 * @param actionType
	 * @param row
	 * @param page
	 * @return
	 */
	public JSONObject  getScoreRecord(String userid,int actionType,int row,int page);
	/**
	 * 根据订单号获取积分记录
	 * @param orderSn
	 * @return
	 */
	public IntegralRecordVO getIntegralRecordByOrderSn(String orderSn);
	
	/**
	 * 根据条件查询用户积分信息
	 * @param userid
	 * @param source
	 * @param type
	 * @param action
	 * @param update_at
	 * @return
	 */
	public JSONObject getScoreRecordByConditioin(String userId, int source ,int type,int action ,String update_at,int page, int row);

}
