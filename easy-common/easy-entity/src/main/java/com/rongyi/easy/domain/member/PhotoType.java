package com.rongyi.easy.domain.member;

import com.rongyi.core.framework.ienum.IEnum;

/**
 * 
 * ClassName: Operate <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 图片类型 <br/>
 * date: 2015年5月29日 上午11:15:27 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public enum PhotoType implements IEnum {
  /**
   * 积分规则
   */
  INTEGRAL_RULES(1),
  /**
   * 会员权益
   */
  BENEFITS(2), ;


  @Override
  public int getValue() {
    return this.value;
  }

  public static PhotoType findByValue(int value) {
    switch (value) {
      case 1:
        return INTEGRAL_RULES;
      case 2:
        return BENEFITS;
      default:
        return null;

    }
  }

  private int value;

  private PhotoType(int value) {
    this.value = value;
  }

  /**
   * 
   * getUpaiyunUrl:得到云盘路径. <br/>
   * 
   * @author bin.zhang
   * @return
   * @since JDK 1.6
   */
  public String getUpaiyunUrl() {
    switch (this.value) {
      case 1:
        return "system/integralRules/";
      case 2:
        return "system/benefits/";
      default:
        return null;

    }
  }

  public String getRealPath() {
    switch (this.value) {
      case 1:
        return "/integralRules/original/";
      case 2:
        return "/benefits/original/";
      default:
        return null;

    }
  }

  public String getUpaiyunUrlFullPath() {
    String UPAIYUN_Url = "http://rongyi.b0.upaiyun.com/";
    switch (this.value) {
      case 1:
        return UPAIYUN_Url + "system/integralRules/";
      case 2:
        return UPAIYUN_Url + "system/benefits/";
      default:
        return null;

    }
  }

  public static void main(String[] args) {
    System.err.println(PhotoType.INTEGRAL_RULES.getUpaiyunUrl());
  }
}
