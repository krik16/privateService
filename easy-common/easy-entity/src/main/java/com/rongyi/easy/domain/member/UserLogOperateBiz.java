package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

public enum UserLogOperateBiz implements IEnum {

  /**
   * 注册
   */
  REGISTER(0),
  /**
   * 登陆
   */
  LOGIN(1),
  /**
   * 签到
   */
  SIGN_IN(2),
  /**
   * 绑定会员卡
   */
  BIND_VIP_CODE(3), ;



  @Override
  public int getValue() {
    return this.value;
  }

  public static UserLogOperateBiz findByValue(int value) {
    switch (value) {
      case 0:
        return REGISTER;
      case 1:
        return LOGIN;
      case 2:
        return SIGN_IN;
	  case 3:
        return BIND_VIP_CODE;
      default:
        return null;

    }
  }

  private int value;

  private UserLogOperateBiz(int value) {
    this.value = value;
  }


}
