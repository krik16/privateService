package com.rongyi.easy.redi.param;

import java.io.Serializable;
import java.util.List;

/**
 * 类BailianEnentActivity.java的实现描述：用户行为事件活动查询
 * 
 * @author rongyi-13 2015年1月14日 下午5:41:38
 */
public class BailianEnentActivityParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private String resCode;// String 是 操作结果编码
	private Integer activityFlag;// Long 是 是否有活动,1为有，0为没有
	private String optionNum;// String 是 活动选项数
	private String multiSelectFlag;// String 是 活动是否可多选 1为是0为否
	private String maxSelect;// String 是 活动最大可选取的选项数
	private String activityMsg;// String 是 活动提示文字
	private List<BailianEnentActivityOptionParam> optionList;

//	public String getResCode() {
//		return resCode;
//	}

//	public void setResCode(String resCode) {
//		this.resCode = resCode;
//	}

	public Integer getActivityFlag() {
		return activityFlag;
	}

	public void setActivityFlag(Integer activityFlag) {
		this.activityFlag = activityFlag;
	}

	public String getOptionNum() {
		return optionNum;
	}

	public void setOptionNum(String optionNum) {
		this.optionNum = optionNum;
	}

	public String getMultiSelectFlag() {
		return multiSelectFlag;
	}

	public void setMultiSelectFlag(String multiSelectFlag) {
		this.multiSelectFlag = multiSelectFlag;
	}

	public String getMaxSelect() {
		return maxSelect;
	}

	public void setMaxSelect(String maxSelect) {
		this.maxSelect = maxSelect;
	}

	public String getActivityMsg() {
		return activityMsg;
	}

	public void setActivityMsg(String activityMsg) {
		this.activityMsg = activityMsg;
	}

	public List<BailianEnentActivityOptionParam> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<BailianEnentActivityOptionParam> optionList) {
		this.optionList = optionList;
	}
}
