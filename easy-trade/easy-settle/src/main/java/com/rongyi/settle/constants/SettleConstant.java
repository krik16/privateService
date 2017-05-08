package com.rongyi.settle.constants;

/**
 * Description:
 *
 * @author xgq
 * @version 2015/9/25
 */
public interface SettleConstant {
	// 对账配置 - 计算周期
	interface CountCycleType {
		Byte DAY = 0;// 日
		Byte WEEK = 1;// 周
		Byte MONTH = 2;// 月
		Byte OTHER = 3;// 自定义
	}

	// 对账单- 类型
	interface PaymentStatementType {
		Byte SHOP = 0;// 商家对账单
		Byte PERSON = 1;// 个人对账单
	}

	// 对账单- 状态
	interface PaymentStatementStatus {
		Byte INIT = 0;// 初始状态
		Byte MANUAL_PASS = 1;// 人工审核通过
		Byte MANUAL_UN_PASS = 2;// 人工审核不通过
		Byte SYSTEM_PASS = 3;// 系统审核通过
		Byte SHOP_PASS = 4;// 商家确认通过
		Byte SHOP_UN_PASS = 5;// 确认异常
		Byte PAY_PASS = 6;// 付款审核通过
		Byte PAY_UN_PASS = 7;// 付款审核不通过
		Byte CANCEL = 8;// 作废
		Byte PAY_FROZEN = 9;// 付款冻结
		Byte PAY_UN_FROZEN = 10;// 付款解冻
		Byte PAYED = 11;// 已付款
	}

	interface BussinessType {
		Byte SHOP = 0;// 店铺
		Byte MALL = 1;// 商场
		Byte BRAND = 2; // 品牌
		Byte BRANCH = 3; // 分公司
		Byte GROUP = 4; // 集团公司
	}

	interface PayChannel {
		Byte ZHIFUBAO = 0;// 支付宝
		Byte WECHAT = 1;// 微信
		Byte POSBANK = 2;// POS银行卡
		Byte CASH = 3;// 现金
		Byte TIANYI = 6; //翼支付
	}

	interface LinkType {
		Byte ALL = 0;// 全部
		Byte SELF = 1;// 自身
		Byte PART = 2;// 部分
	}
}