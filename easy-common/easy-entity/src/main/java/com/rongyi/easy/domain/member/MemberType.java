package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * ClassName: MemberType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:会员类型 <br/>
 * date: 2015年4月29日 下午8:05:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum MemberType implements IEnum {
  /**
   * 电子会员
   */
  E_MEMBER(0),
  /**
   * 商场会员
   */
  MALL_MEMBER(1);

  @Override
  public int getValue() {
    return this.value;
  }

  public static MemberType findByValue(int value) {
    switch (value) {
      case 0:
        return E_MEMBER;
      case 1:
        return MALL_MEMBER;
      default:
        return null;

    }
  }

  private int value;

  private MemberType(int value) {
    this.value = value;
  }
}
