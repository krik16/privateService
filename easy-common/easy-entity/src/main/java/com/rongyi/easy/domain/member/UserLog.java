package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.Date;

public class UserLog implements Serializable {
  private static final long serialVersionUID = 5612708212271368615L;

  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 操作业务 */
  private UserLogOperateBiz operateBiz;

  public UserLogOperateBiz getOperateBiz() {
    return operateBiz;
  }

  public void setOperateBiz(UserLogOperateBiz operateBiz) {
    this.operateBiz = operateBiz;
  }

  /** 修改后的value */
  private String value;

  /** 用户id */
  private String memberId;

  /** 备注 */
  private String memo;

  /**  */
  private Date createAt;

  private ChannelType channel;

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  /**
   * 
   * @param id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 商城id
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商城id
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }


  /**
   * 修改后的value
   * 
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * 修改后的value
   * 
   * @param value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * 用户id
   * 
   * @return memberId
   */
  public String getMemberId() {
    return memberId;
  }

  /**
   * 用户id
   * 
   * @param memberId
   */
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * 备注
   * 
   * @return memo
   */
  public String getMemo() {
    return memo;
  }

  /**
   * 备注
   * 
   * @param memo
   */
  public void setMemo(String memo) {
    this.memo = memo;
  }

  /**
   * 
   * @return createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * 
   * @param createAt
   */
  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  /**
   * 渠道(0:手机1:微信)
   * 
   * @return channel
   */
  public ChannelType getChannel() {
    return channel;
  }

  /**
   * 渠道(0:手机1:微信)
   * 
   * @param channel
   */
  public void setChannel(ChannelType channel) {
    this.channel = channel;
  }
}
