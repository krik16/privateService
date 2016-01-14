/** 
 * @Title: WithdrawApplyService.java 
 * @Package com.rongyi.rss.va 
 * @Description: 提现申请接口
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月20日 下午4:39:51 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.rss.va;

import java.math.BigDecimal;

import com.rongyi.core.bean.ResponseResult;

/**
 * @author ZhengYl
 * 
 */
public interface WithdrawApplyService {
	/**
	* 提现申请
	* @param userId 用户id
	* @param drawAmount 提现金额
	* @param accountNo 提现账号
	* @param accountName 提现账号户名
	* @param accountType 提现账号类型  (0：支付宝，1：银行卡)
	* @return 
	*/
	public ResponseResult withdrawApply(String userId, BigDecimal drawAmount, String accountNo, String accountName, String accountType,Integer guideType);

}
