package com.rongyi.easy.mms.vo;

import java.io.Serializable;

import com.rongyi.easy.mms.UserGrade;

/**
 * 用户等级积分
 * 
 * @author bin.zhang
 *
 */
public class UserGradeGiftVO extends UserGrade implements Serializable {

  /**
	 * 
	 */
  private static final long serialVersionUID = 7092453039459537317L;
  /**
   * 用户积分
   */
  private Long integral;

  public Long getIntegral() {
    return integral;
  }

  public void setIntegral(Long integral) {
    this.integral = integral;
  }

  @Override
  public String toString() {
    return "UserGradeGiftVO [integral=" + integral + ", getIntegral()=" + getIntegral()
        + ", getId()=" + getId() + ", getMallId()=" + getMallId() + ", getGrade()=" + getGrade()
        + ", getGradeDesc()=" + getGradeDesc() + ", getCreateId()=" + getCreateId()
        + ", getCreateName()=" + getCreateName() + ", getCreateAt()=" + getCreateAt()
        + ", getUpdateId()=" + getUpdateId() + ", getUpdateName()=" + getUpdateName()
        + ", getUpdateAt()=" + getUpdateAt() + ", getVersion()=" + getVersion() + "]";
  }



}
