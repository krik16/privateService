package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: LogOperateBiz <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 日志操作类型 <br/>
 * date: 2015年6月1日 下午7:34:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum LogType implements IEnum {

  /**
   * 签到
   */
  SIGN_IN(0),
  /**
   * 会员权益
   */
  BENEFITS(1),
  /**
   * 积分规则
   */
  INTEGRAL_RULES(2), ;



  @Override
  public int getValue() {
    return this.value;
  }

  public static LogType findByValue(int value) {
    switch (value) {
      case 0:
        return SIGN_IN;
      case 1:
        return BENEFITS;
      case 2:
        return INTEGRAL_RULES;
      default:
        return null;

    }
  }

  private int value;

  private LogType(int value) {
    this.value = value;
  }


}
