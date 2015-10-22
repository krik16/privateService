/** 
 * @Title: WithdrawRequestEvent.java 
 * @Package com.rongyi.va.account 
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月14日 下午1:53:52 
 * @version V1.0   
 * Copyright (C),上海容易网电子商务有限公司
 */
package com.rongyi.va.account;

import java.math.BigDecimal;

import net.sf.json.JSONObject;

import org.springframework.context.ApplicationContext;

import com.rongyi.core.constant.TmsEventTypeEnum;
import com.rongyi.va.service.impl.WithdrawApplyServiceImpl;

/**
 * @author ZhengYl
 * 
 */
public class WithdrawRequestEvent extends AccountEvent implements Cloneable {

	/** 提现申请金额 */
	private BigDecimal drawAmount;

	/** 支付方式 */
	private String payType;

	/** 打款账号 */
	private String outAccount;

	/** 打款账号姓名 */
	private String outName;

	/** 提现单号 */
	private String orderNo;

	@SuppressWarnings("unchecked")
	public void load(JSONObject json) throws Exception {
		// 调用父类分析函数
		super.load(json);

		JSONObject param = (JSONObject) getBody();

		setDrawAmount(new BigDecimal(param.get("drawAmount").toString()));
		setPayType(param.get("payType").toString());
		setOutAccount(param.get("outAccount").toString());
		setOutName(param.get("outName").toString());
		setOrderNo(param.get("orderNo").toString());
	}

	public BigDecimal getDrawAmount() {
		return drawAmount;
	}

	public void setDrawAmount(BigDecimal drawAmount) {
		this.drawAmount = drawAmount;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getOutAccount() {
		return outAccount;
	}

	public void setOutAccount(String outAccount) {
		this.outAccount = outAccount;
	}

	public String getOutName() {
		return outName;
	}

	public void setOutName(String outName) {
		this.outName = outName;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @throws Exception
	 * 
	 * @see com.rongyi.va.account.BaseEvent#process()
	 */
	@Override
	public void process(ApplicationContext ctx) throws Exception {

		WithdrawApplyServiceImpl virtualAccountService = (WithdrawApplyServiceImpl) ctx
				.getBean("vaWithdrawApplyService");
//		virtualAccountService.withdrawApply(userId, drawAmount, outAccount, outName,
//				TmsEventTypeEnum.DRAWAPPLY.getCode());

		// VirtualAccountGeneralService virtualAccountGeneralService =
		// (VirtualAccountGeneralService) ctx
		// .getBean("vaVirtualAccountGeneralService");
		// VirtualAccountVO vo =
		// virtualAccountGeneralService.queryVirtualAccount(userId);
		// boolean a = virtualAccountGeneralService.setAccountSuspend(userId,
		// false);
		//
		// a = virtualAccountGeneralService.setAccountSuspend(userId, true);
		

	}

}
