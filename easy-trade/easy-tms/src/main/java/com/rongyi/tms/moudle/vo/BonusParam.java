/**   
 * @Title: BonusParam.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月18日 上午11:30:04 
 */

package com.rongyi.tms.moudle.vo;

import org.apache.commons.lang.StringUtils;

import com.rongyi.tms.constants.ConstantEnum;

import java.math.BigDecimal;

/**
 * 
 * @Description
 * @author 袁波
 * @date 2015年6月18日 上午11:30:04
 */

public class BonusParam {
	private Integer id;
	private String sellerAccount;
	private Integer type;
	private Integer operateType;
	private BigDecimal amount;
	private String marks;
	private String guideType;

	public String getGuideType() {
		return guideType;
	}

	public void setGuideType(String guideType) {
		this.guideType = guideType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSellerAccount() {
		return sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Integer getOperateType() {
		return operateType;
	}

	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}

	@Override
	public String toString() {
		return "BonusParam [id=" + id + ", sellerAccount=" + sellerAccount + ", type=" + type + ", amount=" + amount + ", marks=" + marks + "]";
	}

	public BonusVO paramsToVO() {
		BonusVO vo = new BonusVO();
		if (id != null) {
			vo.setId(id);
		}
		if (StringUtils.isNotBlank(sellerAccount)) {
			vo.setSellerAccount(sellerAccount);
		}
		if (type != null && operateType != null) {
			vo.setBonusType(converterType(type, operateType));
		}
		if (amount != null) {
			vo.setAmount(amount);
		}
		if (StringUtils.isNotBlank(marks)) {
			vo.setMarks(marks);
		}
		if(StringUtils.isNotBlank(this.getGuideType())){
			vo.setGuideType(Integer.valueOf(this.getGuideType()));
		}
		return vo;
	}

	/**	
	 * @Description: 根据考核方式和操作类型转换成数据库对应类型（由于数据库表结构之前设计耦合较严重，改动影响业务较大，暂无法增加新类型来区分，只能在原有字段基础上定义类型） 
	 * @param bonusStyle 奖励/惩罚
	 * @param operateType 交易奖金/券码奖金
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年7月21日下午4:58:03
	 **/
	public static int converterType(int bonusStyle,int operateType){
		Integer tmpType = 0;
		if (ConstantEnum.BONUS_STYLE1.getCodeInt().equals(bonusStyle) && ConstantEnum.BONUS_OPERATE1.getCodeInt().equals(operateType))// 奖励，交易奖金
			tmpType = ConstantEnum.BONUS_TYPE1.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE2.getCodeInt().equals(bonusStyle) && ConstantEnum.BONUS_OPERATE1.getCodeInt().equals(operateType))// 惩罚，交易奖金
			tmpType = ConstantEnum.BONUS_TYPE2.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE1.getCodeInt().equals(bonusStyle) && ConstantEnum.BONUS_OPERATE2.getCodeInt().equals(operateType))// 奖励，验码奖金
			tmpType = ConstantEnum.BONUS_TYPE3.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE2.getCodeInt().equals(bonusStyle) && ConstantEnum.BONUS_OPERATE2.getCodeInt().equals(operateType))// 惩罚，验码奖金
			tmpType = ConstantEnum.BONUS_TYPE4.getCodeInt();
		return tmpType;
	}
	
	/**	
	 * @Description: 根据考核方式和操作类型转换成数据库对应类型（由于数据库表结构之前设计耦合较严重，改动影响业务较大，暂无法增加新类型来区分，只能在原有字段基础上定义类型） 
	 * @param bonusStyle 奖励/惩罚
	 * @param operateType 交易奖金/券码奖金
	 * @return	
	 * @Author:  柯军
	 * @datetime:2015年7月21日下午4:58:03
	 **/
	public static int converterType(String bonusStyleString,String operateTypeString){
		Integer tmpType = 0;
		if (ConstantEnum.BONUS_STYLE1.getValueStr().equals(bonusStyleString) && ConstantEnum.BONUS_OPERATE1.getValueStr().equals(operateTypeString))// 奖励，交易奖金
			tmpType = ConstantEnum.BONUS_TYPE1.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE2.getValueStr().equals(bonusStyleString) && ConstantEnum.BONUS_OPERATE1.getValueStr().equals(operateTypeString))// 惩罚，交易奖金
			tmpType = ConstantEnum.BONUS_TYPE2.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE1.getValueStr().equals(bonusStyleString) && ConstantEnum.BONUS_OPERATE2.getValueStr().equals(operateTypeString))// 奖励，验码奖金
			tmpType = ConstantEnum.BONUS_TYPE3.getCodeInt();
		else if (ConstantEnum.BONUS_STYLE2.getValueStr().equals(bonusStyleString) && ConstantEnum.BONUS_OPERATE2.getValueStr().equals(operateTypeString))// 惩罚，验码奖金
			tmpType = ConstantEnum.BONUS_TYPE4.getCodeInt();
		return tmpType;
	}
}
