package com.rongyi.easy.gcc;


import java.io.Serializable;
import java.math.BigDecimal;

public class BuyerTransConfigurations  implements Serializable {

   private static final long serialVersionUID = 1L;

    /**
     * 以下是买手相关的配置
     */
    private int MaiShouCommissionCountMax  = 0;//这个是同一卖家在同一天与同一买家交易量中，最多能获取的返佣单数-买手
    private int MaiShouCashCouponUseMax = 0;//这个是同一个买家同一天允许使用的现金卷的次数-买手
    private BigDecimal MaiShouCommissionPrice = new BigDecimal(0);//返佣金额-买手
    private int MaiShouSettleDateEarly = 0;//范围1-28   这个是月初结算日-买手
    private int MaiShouSettleDateLate = 0;//范围1-28    这个是月末结算日-买手
    private int MaiShouDrawCountMax = 0;//这个是同一天同一个卖家允许提现的次数-买手


    /*俞志坚 新加字段 有时间你们记得重构吧*/
    //验码返佣金
    private BigDecimal  buyerCheckCodePrice = new BigDecimal(0); //这个是每单返回佣金的金额
    private int buyerCheckCodeDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
    private int buyerCheckCodeDateLate = 0;//范围1-28    这个是月末结算日 结束日期
    private int buyerCheckCodeMax = 0;//同一导购最多能获取反单数
    //首单返佣金
    private BigDecimal  buyerFirstPrice = new BigDecimal(0); //这个是每单返回佣金的金额
    private int buyerFirstDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
    private int buyerFirstDateLate = 0;//范围1-28    这个是月末结算日 结束日期
    private int buyerFirstMax = 0;//同一导购最多能获取反单数
    //注册返佣
    private BigDecimal  buyerRegistPrice = new BigDecimal(0); //这个是每单返回佣金的金额
    private int  buyerRegistType= 0;// 0表示系统 1表示手动
    private int buyerRegistMax = 0;//同一导购最多能获取反单数

}
