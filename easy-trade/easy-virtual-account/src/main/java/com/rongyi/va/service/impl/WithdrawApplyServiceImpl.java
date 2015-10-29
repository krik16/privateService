/** 
 * @Title: WithDrawApplyServiceImpl.java 
 * @Package com.rongyi.va.service 
 * @Description: 提现申请dubbo接口实现
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月20日 上午11:45:14 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.enumerate.CodeEnum;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.rss.rpb.OrderNoGenService;
import com.rongyi.rss.va.WithdrawApplyService;
import com.rongyi.va.account.BaseEvent;
import com.rongyi.va.account.ResponseEvent;
import com.rongyi.va.constants.DrawApplyRules;
import com.rongyi.va.constants.VirtualAccountDetailTypes;
import com.rongyi.va.mq.SpringAmqpSender;
import com.rongyi.va.service.VirtualAccountDetailService;
import com.rongyi.va.service.VirtualAccountService;

/**
 * @author ZhengYl
 * 
 */
@Service
public class WithdrawApplyServiceImpl implements WithdrawApplyService {
	private Logger logger = Logger.getLogger(getClass());

	@Autowired
	private SpringAmqpSender messageSender;

	@Autowired
	private VirtualAccountDetailService virtualAccountDetailService;

	@Autowired
	private VirtualAccountService virtualAccountService;

	@Autowired
	private DrawApplyRules drawApplyRules;
	
    @Autowired
    private OrderNoGenService orderNoGenService;
	
	/*
	 * (non-Javadoc)
	 * @param userId
	 * @param drawAmount
	 * @param accountNo
	 * @param accountName
	 * @param accountType
	 * @return
	 * @see com.rongyi.rss.va.WithdrawApplyService#withdrawApply(java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String)
	 */
	public ResponseResult withdrawApply(String userId, BigDecimal drawAmount, String accountNo, String accountName,
			String accountType, Integer guideType) {
		logger.info(">>>>>>>>>提现申请开始");

		ResponseResult result = new ResponseResult();
		try {
			int permission = virtualAccountService.checkWithdrawPermission(userId, drawAmount, drawApplyRules.getDrawApplyTimesLimit());
			if (permission == 0) {
				// 首先，向tms发送提现请求mq事件
				Map<String, Object> body = new HashMap<String, Object>();
				String applicationNo = orderNoGenService.getOrderNo();
				body.put("userId", userId);
				body.put("drawAmount", drawAmount);
				body.put("payType", accountType);
				body.put("payAccount", accountNo);
				body.put("payName", accountName);
				body.put("applicationNo", applicationNo);
				body.put("guideType", guideType);
				BaseEvent event = new BaseEvent();
				event.setBody(JSONObject.fromObject(body));
				event.setSource(Constants.MQRequestParam.REQUEST_QUEUENAME_VA);
				event.setTimestamp((new Date()).getTime());
				event.setType(VirtualAccountEventTypeEnum.DRAWAPPLY.getCode());
				event.setTarget(Constants.MQRequestParam.REQUEST_QUEUENAME_TMS);

				// 发送事件，检查返回结果
				ResponseEvent response = messageSender.sendRPCEvent(event);
				if (response != null && response.getCode() != 0) {
					// tms mq提现请求失败
					logger.error(">>>>>>>>>提现申请tms返回失败结果：");
					logger.error(response.getMessage());
					
					result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
					result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
					result.setSuccess(false);
				} else if(response != null && response.getCode() == 0){
					// 生成金额明细
					VirtualAccountDetailEntity virtualAccountDetailEntity = new VirtualAccountDetailEntity();
					virtualAccountDetailEntity.setUserId(userId);
					virtualAccountDetailEntity.setAmount(drawAmount);
					virtualAccountDetailEntity.setSign(-1);
					virtualAccountDetailEntity.setCreateAt(new Date());
					virtualAccountDetailEntity.setItemType(VirtualAccountDetailTypes.WITHDRAW);
					virtualAccountDetailEntity.setSettlementAccountNo(accountNo);
					virtualAccountDetailEntity.setSettlementAccountName(accountName);
					virtualAccountDetailEntity.setApplicationNo(applicationNo);
					
					// 根据提现金额取负数，加入账户余额
					virtualAccountService.updateBalance(userId, drawAmount.negate(), virtualAccountDetailEntity);

					result.setCode(CodeEnum.SUCCESS.getActionCode());
					result.setMessage("提现申请成功");
					result.setSuccess(true);
				}else{
					logger.info("MQ消息未正确处理，删除错误提现申请，提现单号："+applicationNo);
					virtualAccountService.deleteByDrawNo(applicationNo);
					result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
					result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
					result.setSuccess(false);
				}

			} else if (permission == 1) {
				result.setCode(CodeEnum.ERROR_ACCOUNT_NO_PERMISSION.getActionCode());
				result.setMessage(CodeEnum.ERROR_ACCOUNT_NO_PERMISSION.getMessage());
				result.setSuccess(false);
			} else if (permission == 2) {
				result.setCode(CodeEnum.ERROR_ACCOUNT_INSUFFICIENT_BALANCE.getActionCode());
				result.setMessage(CodeEnum.ERROR_ACCOUNT_INSUFFICIENT_BALANCE.getMessage());
				result.setSuccess(false);
			}  else if (permission == 3) {
				result.setCode(CodeEnum.ERROR_ACCOUNT_DRAW_TIMES.getActionCode());
				result.setMessage(CodeEnum.ERROR_ACCOUNT_DRAW_TIMES.getMessage());
				result.setSuccess(false);
			}
		} catch (Exception e) {
			result.setCode(CodeEnum.ERROR_SYSTEM.getActionCode());
			result.setMessage(CodeEnum.ERROR_SYSTEM.getMessage());
			result.setSuccess(false);
			result.setInfo(null);
			e.printStackTrace();
			logger.error(e, e);
		}
		logger.debug(">>>>>>>>>提现申请结束");
		return result;

	}
}
