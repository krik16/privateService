/** 
 * @Title: AccountInfoServiceImpl.java 
 * @Package com.rongyi.tms.service.impl 
 * @Description: 收入管理-账号信息接口 实现
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月26日 下午2:50:10 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.tms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.easy.va.vo.VirtualAccountVO;
import com.rongyi.rss.tms.AccountInfoService;
import com.rongyi.tms.moudle.vo.CommissionInfoVO;
import com.rongyi.tms.moudle.vo.DrawApplyInfoVO;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.SalesCommissionService;

import java.math.BigDecimal;

/**
 * @author ZhengYl
 * 
 */
@Service
public class AccountInfoServiceImpl implements AccountInfoService {

	@Autowired
	private DrawApplyService drawApplyService;

	@Autowired
	private SalesCommissionService salesCommissionService;

	public VirtualAccountVO queryAccountInfo(String userId) {
		VirtualAccountVO result = new VirtualAccountVO();
		result.setUserId(userId);

		// 查询提现金额（在审）合计
		DrawApplyInfoVO drawApplyVo = drawApplyService.selectDrawApplyInfo(userId);
		if (drawApplyVo != null) {
			result.setDrawForAuditTotal(drawApplyVo.getDrawForAuditTotal().compareTo(BigDecimal.ZERO) == 1 ?drawApplyVo.getDrawForAuditTotal():BigDecimal.ZERO);
		}

		// 查询审核中佣金金额（包含交易佣金和验码佣金）合计
		CommissionInfoVO commissionVo = salesCommissionService.selectCommissionInfo(userId);
		if (commissionVo != null) {
			result.setCommissionForAuditTotal(commissionVo.getCommissionForAuditTotal().compareTo(BigDecimal.ZERO) == 1 ?commissionVo.getCommissionForAuditTotal():BigDecimal.ZERO);
		}
		// 审核失败佣金（本月,包含交易佣金和验码佣金）合计
		commissionVo = salesCommissionService.selectFaleCommission(userId);
		if (commissionVo != null && commissionVo.getFaleCommissionMonth() != null)
			result.setFaleCommissionMonth(commissionVo.getFaleCommissionMonth().compareTo(BigDecimal.ZERO) == 1 ?commissionVo.getFaleCommissionMonth():BigDecimal.ZERO);
		return result;
	}
}