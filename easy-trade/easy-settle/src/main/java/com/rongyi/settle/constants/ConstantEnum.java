/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午3:45:21
 * @Description: TODO
 *
 **/

package com.rongyi.settle.constants;

/**
 * @Author: 柯军
 * @Description: 常量枚举
 * @datetime:2015年5月19日下午3:45:21
 * 
 **/

public enum ConstantEnum {


    PAY_CHANNEL_ZHIFUBAO(0,"支付宝"),
    PAY_CHANNEL_WEIXIN(1,"微信"),
    PAY_CHANNEL_YINLIAN(2,"银行卡"),
    PAY_CHANNEL_CASH(3,"现金"),
    PAY_CHANNEL_TRANSFER(4,"银行转账"),
//    :店铺，1:商场，2:品牌，3:分公司，4:集团公司
    BIZ_TYPE0(0,"店铺"),
    BIZ_TYPE1(1,"商场"),
    BIZ_TYPE2(2,"品牌"),
    BIZ_TYPE3(3,"分公司"),
    BIZ_TYPE4(4,"集团公司"),

    STATUS_0(0,"初始状态"),
    STATUS_1(1,"人工审核通过"),
    STATUS_2(2,"人工审核不通过"),
    STATUS_3(3,"系统审核通过"),
    STATUS_4(4,"商家确认通过"),
    STATUS_5(5,"确认异常"),
    STATUS_6(6,"付款审核通过"),
    STATUS_7(7,"付款审核不通过"),
    STATUS_8(8,"作废"),
    STATUS_9(9,"付款冻结"),
    STATUS_10(10,"付款解冻"),
    STATUS_11(11,"已下载"),
    STATUS_12(12,"已付款"),

    CONFIG_STATUS_0(0, "待审核"),
    CONFIG_STATUS_1(1, "已通过"),
    CONFIG_STATUS_2(2, "未通过"),
    CONFIG_STATUS_3(3, "变更待审核中"),
    CONFIG_STATUS_4(4, "停用"),

    PAY_MODE_0(0,"固定日期"),
    PAY_MODE_1(1,"滚动日期"),

    ROLL_TYPE_0(0,"天"),
    ROLL_TYPE_1(1,"时"),

    OP_DESC_0(0,"新增"),
    OP_DESC_1(1,"修改生效"),
    OP_DESC_2(2,"修改待审核"),
    OP_MODEL_0(0,"对账单配置"),
    OP_MODEL_1(1,"对账单"),

    IS_ONESELF(1,"关联自身"),
    NOT_ONESELF(0,"非关联自身"),

	PAGE_SIZE(10,"分页条数");
    
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
