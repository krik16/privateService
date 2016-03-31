package com.rongyi.easy.roa.param;

import java.io.Serializable;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.domain.member.ChannelType;
import com.rongyi.easy.domain.member.SignInType;

/**
 * 会员信息参数对象
 * 
 * @author baodk
 */
public class MemberInfoParam extends BaseParam implements Serializable {

  private static final long serialVersionUID = 816191661074065275L;

  private String ownerId;

  private String conditions;

  private String type;

  private String mallId;

  private String openId;

  private String code;
  // 百联 {{{
  /** 会员编号 */
  private String memberNo;

  /** 身份证号 */
  private String identify;

  /**  */
  private String email;

  /** 手机号 */
  private String mobile;

  /** QQ号 */
  private String qq;

  /** 微信 */
  private String weixin;

  /** 需要详细信息 */
  private String needDetail;

  private SignInType signInType;
  /**
   * 类型:手机号,会员号,微信
   */
  private ChannelType channelType;


  public ChannelType getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelType channelType) {
    this.channelType = channelType;
  }

  public SignInType getSignInType() {
    return signInType;
  }

  public void setSignInType(SignInType signInType) {
    this.signInType = signInType;
  }

  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public String getConditions() {
    return conditions;
  }

  public void setConditions(String conditions) {
    this.conditions = conditions;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getMallId() {
    return mallId;
  }

  public String getOpenId() {
    return openId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMemberNo() {
    return memberNo;
  }

  public void setMemberNo(String memberNo) {
    this.memberNo = memberNo;
  }

  public String getIdentify() {
    return identify;
  }

  public void setIdentify(String identify) {
    this.identify = identify;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getQq() {
    return qq;
  }

  public void setQq(String qq) {
    this.qq = qq;
  }

  public String getWeixin() {
    return weixin;
  }

  public void setWeixin(String weixin) {
    this.weixin = weixin;
  }

  public String getNeedDetail() {
    return needDetail;
  }

  public void setNeedDetail(String needDetail) {
    this.needDetail = needDetail;
  }

}
