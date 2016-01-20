package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * ClassName: SingInType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 签到类型 <br/>
 * date: 2015年4月29日 下午8:05:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum SignInType implements IEnum {
  /**
   * 固定签到
   */
  FIXATION(0),
  /**
   * 随机签到
   */
  RANDOM(1);

  @Override
  public int getValue() {
    return this.value;
  }

  public static SignInType findByValue(int value) {
    switch (value) {
      case 0:
        return FIXATION;
      case 1:
        return RANDOM;
      default:
        return null;

    }
  }

  private int value;

  private SignInType(int value) {
    this.value = value;
  }
}
