package com.rongyi.settle.constants;

/**
 * @Author: 柯军
 * @Description: 错误码常量
 * @datetime:2015年9月22日下午6:47:25
 **/
public enum CodeEnum {
	FIAL_USER_PARAMS_PAYMENT(1018401, "没有登录或登录信息错误"),//前台约定，没有登录统一后三位为401
	FIAL_NO_AUTHORITY_PAYMENT(1018403, "没有访问该资源的权限"),//前台约定，没有权限统一后三位为403
	FIAL_USER_IDENTITY(1018404, "没有获取登录用户身份信息"),

	ERROR_SYSTEM(1018004, "系统故障"),
	NO_PARAM(1018105, "参数异常"),
	
	FIAL_CONFIG_LIST(1018001, "加载配置列表失败"),
	FIAL_STATEMENT_LIST(1018002, "加载对账单列表失败"),
	FIAL_PARAMS_ERROR(1018003, "参数传递错误"),
	FIAL_UPDATE_PAYMENT(1018005, "修改状态失败"),
	FIAL_CONFIG_EXIST(1018006,"该规则编号的配置记录已存在，请不要提交重复配置记录"),
	FIAL_CONFIG_BIZ_EXIST(1018007,"该商家生效时间内配置已存在，请修改后重新提交"),
	FIAL_CONFIG_BIZ_NOACCOUNT(1018012,"没有此商家财务联系人ID"),
	FIAL_CONFIG_NO_ACCOUNT(1018009,"未查到自身账号"),
	FIAL_CONFIG_EFFECT_START(1018010,"账号生效时间大于此刻审核时间"),
	FIAL_SAVE_CONFIG(1018008,"保存对账单配置失败"),
	FIAL_CONFIG_NOT_FOUND(1018011, "对账单配置没有找到"),
	FIAL_STATEMENT_INVALID(1018013, "作废对账单不能重新生成"),
	FAIL_CHANGE_DATE(1018100, "日期转换异常"),
	
	NOT_EXIST_DIVIDE_ACCOUNT(1018101, "分账不存在"),
	FAIL_GENERATE_XML(1018102,"生成xlsx异常"),
	MALL_NOT_EXIST(1018103,"商场信息错误"),
	SHOP_NOT_EXIST(1018104,"店铺信息错误"),
	SUCCESS("0", "正常"),;

	private Object code;

	private Object value;

	private CodeEnum(Object code, Object value) {
		this.code = code;
		this.value = value;
	}

	/**
	 * @return
	 * @Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Byte getCodeByte() {
		return Integer.valueOf(code.toString()).byteValue();
	}

	/**
	 * @return
	 * @Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Integer getCodeInt() {
		return Integer.valueOf(code.toString());
	}

	/**
	 * @return
	 * @Description: 获取code String类型值
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:36
	 **/
	public String getCodeStr() {
		return code.toString();
	}

	/**
	 * @return
	 * @Description: 获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Byte getValueByte() {
		return Integer.valueOf(value.toString()).byteValue();
	}

	/**
	 * @return
	 * @Description: 获取value int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Integer getValueInt() {
		return Integer.valueOf(value.toString());
	}

	/**
	 * @return
	 * @Description: 获取value String类型值
	 * @Author: 柯军
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
