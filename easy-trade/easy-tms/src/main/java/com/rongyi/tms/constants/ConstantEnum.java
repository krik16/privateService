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
    OP_MODEL_0(0, "对账单配置"),
    OP_MODEL_1(1, "对账单"),
    OP_MODEL_2(2, "佣金配置"),

    COMMISSION_VERIFY_0(0, "佣金一级审核"),
    COMMISSION_VERIFY_1(0, "佣金二级审核"),
    COMMISSION_TYPE_0(0, "推广返佣"),
    COMMISSION_TYPE_1(1, "首单返佣"),
    COMMISSION_TYPE_2(2, "小票返佣"),

    COMMISSION_REGISTER_RONGYI(1, "容易逛"),
    COMMISSION_REGISTER_MALLSHOP(2, "摩店"),

    ORDER_STATUS_1("1","未付款"),
    ORDER_STATUS_2("2","待发货"),
    ORDER_STATUS_3("4","已发货"),
    ORDER_STATUS_4("4","已完成"),
    ORDER_STATUS_5("5","已关闭"),
    ORDER_STATUS_8("8","已退款"),

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
    MESSAGE_EVENT_VA("va","va消息队列"),
    
    TRADE_STATUS_PAY_NO(0,"待打款"),
    TRADE_STATUS_PAYING(1,"款已打"),
    TRADE_STATUS_PAY_YES(2,"款已到"),
    
    TRADE_TYPE_PAY(0,"购买"),
    TRADE_TYPE_REFUND(1,"买家退款"),
    TRADE_TYPE_TO_SELLER(2,"打款给卖家"),
    TRADE_TYPE_TO_DRAW_APPLY(3,"提现"),
    TRADE_TYPE_EXCE_PAY(4,"异常交易"),
    TRADE_TYPE_REPAY(5,"重复支付"),
    TRADE_TYPE_REPAY_REFUND(6,"重复支付退款"),
    TRADE_TYPE_STATEMENT(7,"商家对账"),
    
    PAY_CHANNEL_ZHIFUBAO(0,"支付宝"),
    PAY_CHANNEL_WEIXIN(1,"微信"),
    PAY_CHANNEL_YINLIAN(2,"银行卡"),
    PAY_CHANNEL_CASH(3,"现金"),
    PAY_CHANNEL_TRANSFER(4,"银行转账"),
    
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
    
    COUPON_COMMISSION_STATUS0(0,"待审核"),
    COUPON_COMMISSION_STATUS1(1,"审核通过"),
    
    BONUS_STYLE1(1,"奖励"),
    BONUS_STYLE2(2,"惩罚"),
    
    BONUS_OPERATE1(1,"交易佣金"),
    BONUS_OPERATE2(2,"验码佣金"),

    BONUS_TYPE1(1,"交易佣金奖励"),
    BONUS_TYPE2(2,"交易佣金惩罚"),
    BONUS_TYPE3(3,"验码佣金奖励"),
    BONUS_TYPE4(4,"验码佣金惩罚"),
    
    INVITE_COMMISSION_STATUS0(0,"待审核"),
    INVITE_COMMISSION_STATUS1(1,"一级审核通过"),
    INVITE_COMMISSION_STATUS2(2,"一级审核未通过"),
    INVITE_COMMISSION_STATUS3(3,"二级审核通过"),
    INVITE_COMMISSION_STATUS4(4,"二级审核未通过"),
    
    IS_DELETE_0(0,"正常"),
    IS_DELETE_1(1,"标记删除"),
    
    STATEMENT_STATUE_6(6,"付款审核通过"),
    STATEMENT_STATUE_9(9,"付款冻结"),
    STATEMENT_STATUE_10(10,"付款解冻"),
    STATEMENT_STATUE_11(11,"未下载"),
    STATEMENT_STATUE_12(12,"已付款"),

    USER_TYPE_2(2,"卖家账号买手类型"),

    COMMISSION_STATUS_2_UNCHECK(-2,"二审不通过"),
    COMMISSION_STATUS_1_UNCHECK(-1,"一审不通过"),
    COMMISSION_STATUS_0(0,"小票未上传"),
    COMMISSION_STATUS_1(1,"待审核"),
    COMMISSION_STATUS_2(2,"一级审核通过"),
    COMMISSION_STATUS_3(3,"二级审核通过"),
    COMMISSION_STATUS_4(4,"此状态未使用"),
    COMMISSION_STATUS_5(5,"当日返佣超出限制"),
    COMMISSION_STATUS_6(6,"佣金已到账"),

    COMMISSION_CONFIG_STATUS_0(0,"待审核"),
//    COMMISSION_CONFIG_STATUS_1(3,"审核通过"),//审核通过和启用逻辑上一致，故值定义为相同
    COMMISSION_CONFIG_STATUS_2(2,"审核不通过"),
    COMMISSION_CONFIG_STATUS_3(3,"启用"),
    COMMISSION_CONFIG_STATUS_4(4,"停用"),

    COMMISSION_CONFIG_TYPE_0(0,"推广返佣"),
    COMMISSION_CONFIG_TYPE_1(1,"首单返佣"),
    COMMISSION_CONFIG_TYPE_2(2,"小票返佣"),

    COMMISSION_CONFIG_CUST_VERIFY_0(0,"系统审核"),
    COMMISSION_CONFIG_CUST_VERIFY_1(1,"人工审核"),

    SERCHER_TYPE_0(0,"客服请求"),
    SERCHER_TYPE_1(1,"财务请求"),

    REGISTER_TYPE_1(1,"容易逛"),
    REGISTER_TYPE_2(2,"摩店买手"),
    REGISTER_TYPE_3(3,"摩店导购"),
    REGISTER_TYPE_4(4,"摩店全部"),

    FIAL_USER_PARAMS_PAYMENT("1019401", "没有登录或登录信息错误"),//前台约定，没有登录统一后三位为401
    FIAL_NO_AUTHORITY_PAYMENT("1019403", "没有访问该资源的权限"),//前台约定，没有权限统一后三位为403

    COMMISSION_ADD_FAIL("1019201","未查找到符合的佣金规则配置，不增加佣金"),
    COMMISSION_CONFIG_LIST_FAIL("1019202","查询佣金规则列表失败"),
    COMMISSION_CONFIG_EXIST("1019203","此佣金规则配置已存在"),
    COMMISSION_CONFIG_SAVE_FAIL("1019204","保存佣金规则配置失败"),
    COMMISSION_CONFIG_VERIFY_FAIL("1019205","审核佣金规则配置失败"),
    COMMISSION_CONFIG_FREEZE_FAIL("1019206","审核佣金规则启用/停用失败"),
    COMMISSION_CONFIG_DETAIL_FAIL("1019207","返佣规则详情"),
    COMMISSION_ADD_INVITE_NOT_FOUND("1019208","未找到对应的邀请人信息，不增加佣金"),
    COMMISSION_ADD_NOT_FIRST("1019209","此笔返佣不是首笔返佣,不增加佣金"),

    LIST_QUERY_EXCEPTION("1019210","列表查询失败"),
    DETAIL_QUERY_EXCEPTION("1019211","详情查询失败"),
    EXCEPTION_LIMIT_COUNT("1019212","报表导出数据超出上限,请重新过滤后再选择导出"),

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
     * @Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:51:11
     **/
    public Byte getCodeByte() {
        return Integer.valueOf(code.toString()).byteValue();
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
     * @Description:  获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常 
     * @return	
     * @Author:  柯军
     * @datetime:2015年5月19日下午3:53:08
     **/
    public Byte getValueByte() {
        return Integer.valueOf(value.toString()).byteValue();
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
