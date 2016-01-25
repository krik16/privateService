package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * ClassName: IntegralChangeAction <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 积分变化action<br/>
 * date: 2015年4月29日 下午8:05:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum IntegralChangeAction implements IEnum {
  /**
   * 签到加积分
   */
  SIGN_IN(0),
  /**
   * 礼品回退加积分
   */
  GIFT_ROLLBACK(1),
  /**
   * 礼品兑换:减积分
   */
  GIFT_EXCHANGE(2);

  @Override
  public int getValue() {
    return this.value;
  }

  public static IntegralChangeAction findByValue(int value) {
    switch (value) {
      case 0:
        return SIGN_IN;
      case 1:
        return GIFT_ROLLBACK;
      case 2:
        return GIFT_EXCHANGE;
      default:
        return null;

    }
  }

  private int value;

  private IntegralChangeAction(int value) {
    this.value = value;
  }
}
