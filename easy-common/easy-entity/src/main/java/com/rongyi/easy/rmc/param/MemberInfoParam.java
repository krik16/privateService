package com.rongyi.easy.rmc.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.domain.member.ChannelType;
import com.rongyi.easy.domain.member.SignInType;

/**
 * 
 * ClassName: MemberInfoParam <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:会员信息. <br/>
 * date: 2015年7月19日 下午7:57:37 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class MemberInfoParam extends BaseParam implements Serializable {
  private static final long serialVersionUID = -4630417774498735207L;
  /** 会员编号 */
  private String memberNo;
  /** 手机号 */
  private String phone;
  private String mallId;
  /**
   * 模块id 0000（终端机），0001（app），0002（微信），0003-9999（其他，包括发码，活动等）
   */
  private String moduleId;

  private SignInType signInType;
  /**
   * 类型:手机号,会员号,微信
   */
  private ChannelType channelType;



  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public SignInType getSignInType() {
    return signInType;
  }

  public void setSignInType(SignInType signInType) {
    this.signInType = signInType;
  }

  public ChannelType getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelType channelType) {
    this.channelType = channelType;
  }

  public String getModuleId() {
    return moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }


  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }


}
