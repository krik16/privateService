package com.rongyi.easy.mms.vo;

import java.util.List;

import com.rongyi.easy.entity.IntegralCommodity;
import com.rongyi.easy.mms.ExchangeIntegralType;
import com.rongyi.easy.mms.vo.UserGradeGiftVO;

public class IntegralCommodityVO extends IntegralCommodity {

  private static final long serialVersionUID = 8458807907920553329L;
  /**
   * 发布状态根据发布时间判断 >发布开始时间 未发布 1 2 发布中 小于发布时间的 已过期 3
   */
  private Integer validStatus;

 

/**
   * 审核未通过理由
   */
  private String memo;
  /**
   * 沈阳大悦城ID
   */
  private String joyCode;
  /**
   * 返回的礼品编码
   */
  private String otherGiftCode;
  
  /**
 * @return the otherGiftCode
 */
public String getOtherGiftCode() {
	return otherGiftCode;
}

/**
 * @param otherGiftCode the otherGiftCode to set
 */
public void setOtherGiftCode(String otherGiftCode) {
	this.otherGiftCode = otherGiftCode;
}

public String getJoyCode() {
	return joyCode;
  }
	
  public void setJoyCode(String joyCode) {
	this.joyCode = joyCode;
  }

/**
   * 用户等级积分列表
   */
  private List<UserGradeGiftVO> userGradeGiftVOList;


  public List<UserGradeGiftVO> getUserGradeGiftVOList() {
    return userGradeGiftVOList;
  }

  public void setUserGradeGiftVOList(List<UserGradeGiftVO> userGradeGiftVOList) {
    this.userGradeGiftVOList = userGradeGiftVOList;
  }

  public Long getIntegral(Integer gradeId) {
    Long integralReturn = null;
    if (getExchangeIntegralType() == ExchangeIntegralType.MEMBER_LEVEL) {
      for (UserGradeGiftVO userGradeGift : userGradeGiftVOList) {
        if (userGradeGift.getId() == gradeId) {
          integralReturn = userGradeGift.getIntegral();
        }
      }
    } else if (getExchangeIntegralType() == ExchangeIntegralType.UNIFY_SET) {
      integralReturn = getIntegral();
    }
    return integralReturn;
  }


  public Integer getValidStatus() {
    return validStatus;
  }

  public void setValidStatus(Integer validStatus) {
    this.validStatus = validStatus;
  }


  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  @Override
  public String toString() {
    return "IntegralCommodityVO [validStatus=" + validStatus + ", getId()=" + getId()
        + ", getTitle()=" + getTitle() + ", getIntegral()=" + getIntegral() + ", getUserLimit()="
        + getUserLimit() + ", getTotalNumer()=" + getTotalNumer() + ", getType()=" + getType()
        + ", getUseMode()=" + getUseMode() + ", getPublicStart()=" + getPublicStart()
        + ", getPublicEnd()=" + getPublicEnd() + ", getStartTime()=" + getStartTime()
        + ", getEndTime()=" + getEndTime() + ", getDescription()=" + getDescription()
        + ", getCreatedTime()=" + getCreatedTime() + ", getUpdatedTime()=" + getUpdatedTime()
        + ", getOperateUser()=" + getOperateUser() + ", getIcon()=" + getIcon() + ", getMallId()="
        + getMallId() + ", getRelationShopIds()=" + getRelationShopIds() + ", getPublicStatus()="
        + getPublicStatus() + ", getBuyedNumber()=" + getBuyedNumber() + ", getMallName()="
        + getMallName() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
        + ", hashCode()=" + hashCode() + "]";
  }


}
