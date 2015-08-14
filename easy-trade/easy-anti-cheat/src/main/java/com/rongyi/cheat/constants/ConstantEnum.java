/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年5月19日下午3:45:21
 * @Description: TODO
 *
 **/

package com.rongyi.cheat.constants;

/**
 * @Author: 柯军
 * @Description: 常量枚举
 * @datetime:2015年5月19日下午3:45:21
 * 
 **/

public enum ConstantEnum {

	BLACK_ROLL_STATUS_0(0, "正常"), 
	BLACK_ROLL_STATUS_1(1, "冻结"),

	EXCEL_LIMIT_COUNT(5000, "交易明细报表导出限制总数");
	private Object code;

	private Object value;

	private ConstantEnum(Object code, Object value) {
		this.code = code;
		this.value = value;
	}

	/**
	 * @Description: 获取code int类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Byte getCodeByte() {
		return Integer.valueOf(code.toString()).byteValue();
	}

	/**
	 * @Description: 获取code int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:51:11
	 **/
	public Integer getCodeInt() {
		return Integer.valueOf(code.toString());
	}

	/**
	 * @Description: 获取code String类型值
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:36
	 **/
	public String getCodeStr() {
		return code.toString();
	}


	/**
	 * @Description: 获取value int类型值,请确保该值可转换为byte值，否则会类型转换异常
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Byte getValueByte() {
		return Integer.valueOf(value.toString()).byteValue();
	}

	/**
	 * @Description: 获取value int类型值,请确保该值可转换为int值，否则会类型转换异常
	 * @return
	 * @Author: 柯军
	 * @datetime:2015年5月19日下午3:53:08
	 **/
	public Integer getValueInt() {
		return Integer.valueOf(value.toString());
	}

	/**
	 * @Description: 获取value String类型值
	 * @return
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
