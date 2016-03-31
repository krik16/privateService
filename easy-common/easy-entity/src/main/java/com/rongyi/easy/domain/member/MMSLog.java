package com.rongyi.easy.domain.member;

import java.util.Date;

public class MMSLog {
  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 操作业务 */
  private MMSLogOperateBiz operateBiz;
  /**
   * 日志类型
   */
  private LogType type;

  /** 备注 */
  private String memo;

  /** 创建用户id */
  private String createId;

  /** 创建用户名 */
  private String createName;

  /** 创建时间 */
  private Date createAt;

  /** 会员id */
  private Integer memberId;

  /** 会员名 */
  private String memberName;



  public LogType getType() {
    return type;
  }

  public void setType(LogType type) {
    this.type = type;
  }

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


  public MMSLogOperateBiz getOperateBiz() {
    return operateBiz;
  }

  public void setOperateBiz(MMSLogOperateBiz operateBiz) {
    this.operateBiz = operateBiz;
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
   * 创建用户id
   * 
   * @return createId
   */
  public String getCreateId() {
    return createId;
  }

  /**
   * 创建用户id
   * 
   * @param createId
   */
  public void setCreateId(String createId) {
    this.createId = createId;
  }

  /**
   * 创建用户名
   * 
   * @return createName
   */
  public String getCreateName() {
    return createName;
  }

  /**
   * 创建用户名
   * 
   * @param createName
   */
  public void setCreateName(String createName) {
    this.createName = createName;
  }

  /**
   * 创建时间
   * 
   * @return createAt
   */
  public Date getCreateAt() {
    return createAt;
  }

  /**
   * 创建时间
   * 
   * @param createAt
   */
  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }

  /**
   * 会员id
   * 
   * @return memberId
   */
  public Integer getMemberId() {
    return memberId;
  }

  /**
   * 会员id
   * 
   * @param memberId
   */
  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  /**
   * 会员名
   * 
   * @return memberName
   */
  public String getMemberName() {
    return memberName;
  }

  /**
   * 会员名
   * 
   * @param memberName
   */
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public String toString() {
    return "SignInLog [id=" + id + ", mallId=" + mallId + ", SignInLogOperateBiz=" + operateBiz
        + ", memo=" + memo + ", createId=" + createId + ", createName=" + createName
        + ", createAt=" + createAt + ", memberId=" + memberId + ", memberName=" + memberName + "]";
  }

}
