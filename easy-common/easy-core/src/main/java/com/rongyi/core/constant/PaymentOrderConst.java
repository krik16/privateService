package com.rongyi.core.constant;

public class PaymentOrderConst {

	/**
	 * 对账：0-未对账，1-已对账，2-对账不一致
	 */
	public final static Integer PAYER_RECON_FLAG_TODO = 0;
	public final static Integer PAYER_RECON_FLAG_DONE = 1;
	public final static Integer PAYER_RECON_FLAG_ERROR = 2;

	/**
	 * 支付类型：1-付款，2-退款
	 */
	public final static Integer TRADE_TYPE_PAY = 0;
	public final static Integer TRADE_TYPE_REFUND = 1;

}
