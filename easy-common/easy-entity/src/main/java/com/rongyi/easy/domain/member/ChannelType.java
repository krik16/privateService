package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * ClassName: ChannelType <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:来源类型 <br/>
 * date: 2015年4月29日 下午8:05:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum ChannelType implements IEnum {
  /**
   * 手机
   */
  PHONE(0),
  /**
   * 会员号
   */
  MEMBER_NO(1),
  /**
   * 微信
   */
  WECHAT(2),
  /**
   * 身份证
   */
  IDENTIFY(3);

  @Override
  public int getValue() {
    return this.value;
  }

  public static ChannelType findByValue(int value) {
    switch (value) {
      case 0:
        return PHONE;
      case 1:
        return MEMBER_NO;
      case 2:
        return WECHAT;
      case 3:
        return IDENTIFY;
      default:
        return null;

    }
  }

  private int value;

  private ChannelType(int value) {
    this.value = value;
  }
}
