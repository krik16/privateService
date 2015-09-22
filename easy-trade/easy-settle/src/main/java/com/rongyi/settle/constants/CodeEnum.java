package com.rongyi.settle.constants;

/**
 * 错误码常量
 * 
 * @author baodk
 */
public enum CodeEnum {

	FIAL_CONFIG_LIST(1018001, "加载配置列表失败"),
	FIAL_STATEMENT_LIST(1018002, "加载对账单列表失败"),
	SUCCESS("0", "正常");

	private Object code;

	private Object value;

	private CodeEnum(Object code, Object value) {
		this.code = code;
		this.value = value;
	}

	/**
	 * @Description: 获取code byte类型值,请确保该值可转换为byte值，否则会类型转换异常
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
	 * @Description: 获取value byte类型值,请确保该值可转换为byte值，否则会类型转换异常
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
