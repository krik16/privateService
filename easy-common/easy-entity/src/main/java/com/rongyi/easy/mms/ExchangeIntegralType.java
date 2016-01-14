package com.rongyi.easy.mms;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: LogOperateBiz <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 礼品兑换类型 <br/>
 * date: 2015年6月1日 下午7:34:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum ExchangeIntegralType implements IEnum {

  /**
   * 统一设置
   */
  UNIFY_SET(0),
  /**
   * 会员等级
   */
  MEMBER_LEVEL(1), ;



  @Override
  public int getValue() {
    return this.value;
  }

  public static ExchangeIntegralType findByValue(int value) {
    switch (value) {
      case 0:
        return UNIFY_SET;
      case 1:
        return MEMBER_LEVEL;
      default:
        return null;

    }
  }

  private int value;

  private ExchangeIntegralType(int value) {
    this.value = value;
  }


}
