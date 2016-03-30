/** 
 * @Title: VirtualAccountServiceImpl.java 
 * @Package com.rongyi.va.service.impl 
 * @Description: 虚拟账户综合访问接口实现
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月25日 下午4:48:43 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.service.impl;

import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.easy.va.vo.VirtualAccountVO;
import com.rongyi.rss.va.VirtualAccountGeneralService;
import com.rongyi.va.service.VirtualAccountDetailService;
import com.rongyi.va.service.VirtualAccountService;
import com.rongyi.va.vo.VirtualAccountQuerySumVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 * 
 */
@Service
public class VirtualAccountGeneralServiceImpl implements VirtualAccountGeneralService {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private VirtualAccountService virtualAccountService;

	@Autowired
	private VirtualAccountDetailService virtualAccountDetailService;

	/*
	 * (non-Javadoc)
	 * 
	 * @param userId
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.rss.va.VirtualAccountService#queryVirtualAccount(java.lang
	 * .String)
	 */
	@Override
	public VirtualAccountVO queryVirtualAccount(String userId) {
		VirtualAccountEntity virtualAccountEntity = virtualAccountService.selectByUserId(userId);
		if (virtualAccountEntity == null) {
			return null;
		}
		// 获取账号概述
		VirtualAccountVO vaVO = new VirtualAccountVO();
		vaVO.setBalance(virtualAccountEntity.getBalance());
		vaVO.setUserId(virtualAccountEntity.getUserId());
		vaVO.setUserName(virtualAccountEntity.getUserName());
		vaVO.setIsSuspended(virtualAccountEntity.getIsSuspended());
		vaVO.setStopAt(virtualAccountEntity.getStopAt());
		vaVO.setStopReason(virtualAccountEntity.getStopReason());

		// 获取账号明细合计
		VirtualAccountQuerySumVO sumVO = virtualAccountDetailService.selectAccountSumByUserId(userId);
		logger.info("sumVO={}",sumVO);
		if (sumVO != null) {
			vaVO.setIncomeTotal(sumVO.getIncomeSum());
			vaVO.setTradeTotal(sumVO.getTradeSum());
			vaVO.setDrawnTotal(sumVO.getDrawSum().abs());
			vaVO.setBonusTotal(sumVO.getBonusSum());
			vaVO.setCommissionTotal(sumVO.getCommissionSum());
			vaVO.setTradeDaily(sumVO.getTradeDaily());
			vaVO.setBonusDaily(sumVO.getBonusDaily());
			BigDecimal commissionIncome = sumVO.getCommissionSum().add(sumVO.getCouponCommissionSum()).add(sumVO.getBonusSum()).add(sumVO.getExpandCommissionTotal()).add(sumVO.getFirstCommissionTotal());
			vaVO.setCommissionIncome(commissionIncome);
		}

		return vaVO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @param userId
	 * 
	 * @param isSuspended
	 * 
	 * @return
	 * 
	 * @see
	 * com.rongyi.rss.va.VirtualAccountGeneralService#setAccountSuspend(java
	 * .lang.String, boolean)
	 */
	@Override
	public boolean setAccountSuspend(String userId, boolean isSuspended, String stopReason) {
		logger.info(">>>>>>账号变更，userId: " + userId + "动作: " + (isSuspended ? "冻结" : "解冻") + " ,冻结原因" + stopReason);

		boolean result = true;
		try {
			int rowCount = virtualAccountService.updateSuspended(userId, isSuspended, stopReason);
			if (rowCount != 1) {
				result = false;
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public VirtualAccountEntity selectByUserId(String userId) {
		return virtualAccountService.selectByUserId(userId);
	}
}
