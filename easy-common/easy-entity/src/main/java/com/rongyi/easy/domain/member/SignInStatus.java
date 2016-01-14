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
public enum SignInStatus implements IEnum {
  /**
   * 未审核
   */
  NOT_CHECK(0),
  /**
   * 审核未通过
   */
  CHECK_REFUSE(1),
  /**
   * 审核通过
   */
  CHECK_PASS(2),
  /**
   * 已经同步
   */
  HAS_SYNC(3);

  @Override
  public int getValue() {
    return this.value;
  }

  public static SignInStatus findByValue(int value) {
    switch (value) {
      case 0:
        return NOT_CHECK;
      case 1:
        return CHECK_REFUSE;
      case 2:
        return CHECK_PASS;
      case 3:
        return HAS_SYNC;
      default:
        return null;

    }
  }

  private int value;

  private SignInStatus(int value) {
    this.value = value;
  }
}
