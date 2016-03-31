package com.rongyi.easy.redi.param;

import java.io.Serializable;

/**
 * 类BailianEnentActivityOptionParam.java的实现描述：用户行为事件活动查询
 * 
 * @author rongyi-13 2015年1月14日 下午5:42:38
 */
public class BailianEnentActivityOptionParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String optionType;// String 否 选项类型 1为优惠券
	private String optionId;// String 否 选项标识id（选项类型为1时为券模板id）
	private String optionName;// String 是 选项名称（选项类型为1时为券模板名称）
	private String optionPic;// String 是 选项图片（选项类型为1时为券模板列表图）

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getOptionId() {
		return optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionPic() {
		return optionPic;
	}

	public void setOptionPic(String optionPic) {
		this.optionPic = optionPic;
	}

}
