package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * ClassName: SingInType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 签到审核类型 <br/>
 * date: 2015年4月29日 下午8:05:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum MMSLogOperateBiz implements IEnum {
  /**
   * 审核未通过
   */
  CHECK_REFUSE(0),
  /**
   * 审核通过
   */
  CHECK_PASSS(1), ;

  @Override
  public int getValue() {
    return this.value;
  }

  public static MMSLogOperateBiz findByValue(int value) {
    switch (value) {
      case 0:
        return CHECK_REFUSE;
      case 1:
        return CHECK_PASSS;
      default:
        return null;

    }
  }

  private int value;

  private MMSLogOperateBiz(int value) {
    this.value = value;
  }
}
