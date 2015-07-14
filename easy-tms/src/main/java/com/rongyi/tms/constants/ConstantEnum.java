/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午3:45:21
 * @Description: TODO
 *
 **/

package com.rongyi.tms.constants;

/**
 * @Author: 柯军
 * @Description: 常量枚举
 * @datetime:2015年5月19日下午3:45:21
 * 
 **/

public enum ConstantEnum {


    
    DRAWAPPLY_STATUS_0(0, "未审核"),
    DRAWAPPLY_STATUS_1(1, "一级审核"),
    DRAWAPPLY_STATUS_2(2, "二级审核"),
    DRAWAPPLY_STATUS_3(3, "审核通过"),
    DRAWAPPLY_STATUS_4(-1, "一级审核不通过"),
    DRAWAPPLY_STATUS_5(-2, "二级审核不通过"),

    DRAWAPPLY_SUCCESS(0,"提现成功！"),
    DRAWAPPLY_FAULT(1,"提现失败！"),
    
    MESSAGE_EVENT_RPB("rpb","rpb消息队列"),
    MESSAGE_EVENT_TMS("tms","tms消息队列"),
    
    TRADE_STATUS_PAY_NO(0,"待打款"),
    TRADE_STATUS_PAYING(1,"款已打"),
    TRADE_STATUS_PAY_YES(2,"款已到"),
    
    TRADE_TYPE_PAY(0,"购买"),
    TRADE_TYPE_REFUND(1,"买家退款"),
    TRADE_TYPE_TO_SELLER(2,"打款给卖家"),
    TRADE_TYPE_TO_DRAW_APPLY(3,"提现"),
    TRADE_TYPE_EXCE_PAY(4,"异常交易"),
    
    PAY_CHANNEL_ZHIFUBAO(0,"支付宝"),
    PAY_CHANNEL_WEIXIN(1,"微信"),
    PAY_CHANNEL_YINLIAN(2,"银行卡"),
    
    USER_ACCOUNT_TYPE_ZHIFUBAO(1,"支付宝"),
    USER_ACCOUNT_TYPE_YINLIAN(2,"银行卡"),
    
    TRADE_TYPE_INCOME(0,"收入"),
    TRADE_TYPE_EXPENSE(1,"支出"),
   
    RONGYI_ZHIFUBAO_ACCOUNT("hr@rongyi.com","容易网支付宝账号"),
    RONGYI_ZHIFUBAO_NAME("上海容易网电子商务有限公司","容易网支付宝账号姓名"),
    RONGYI_WEIXIN_ACCOUNT("1220588601","容易网微信支付账号"),
    RONGYI_WEIXIN_NAME("上海容易网电子商务有限公司","容易网微信支付姓名"),
    
    USER_ACCOUNT_STATUS0(0,"商家账号正常"),
    USER_ACCOUNT_STATUS1(1,"商家账号被停用，无法进行提现"),
    USER_ACCOUNT_STATUS2(2,"商家资金账号被冻结，无法进行提现"),
    USER_ACCOUNT_STATUS3(3,"商家账号不存在,无法进行提现"),
    
    PAYMENT_ORDER_TYPE0(0,"商品订单"),
    PAYMENT_ORDER_TYPE1(1,"优惠券订单"),
    
    EXCEL_LIMIT_COUNT(5000,"交易明细报表导出限制总数");
    interface ACCOUNT_STATUS{
        int ACCOUNT_STATUS0 = 0;//登陆账号和支付账号正常
        int ACCOUNT_STATUS1 = 1;//登陆账号被禁用
        int ACCOUNT_STATUS2 = 2;//支付账号被禁用
        int ACCOUNT_STATUS3 = 3;//账户不存在
        
    }
    private Object code;

    private Object value;

    private ConstantEnum(Object code, Object value) {
        this.code = code;
        this.value = value;
    }


    /**	
     * @Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:51:11
     **/
    public Integer getCodeInt() {
        return Integer.valueOf(code.toString());
    }
    
    /**	
     * @Description: 获取code String类型值
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:36
     **/
    public String getCodeStr() {
        return code.toString();
    }


    /**	
     * @Description:  获取value int类型值,请确保该值可转换为int值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:08
     **/
    public Integer getValueInt() {
        return Integer.valueOf(value.toString());
    }
    
    /**	
     * @Description: 获取value String类型值 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:21
     **/
    public String getValueStr() {
        return value.toString();
    }
    
    public Object getCode() {
        return code;
    }

    
    public Object getValue() {
        return value;
    }
}
