package com.rongyi.easy.rvc.entity;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.domain.member.IntegralChangeAction;
import com.rongyi.easy.domain.member.MemberType;

/**
 * 
 * ClassName: IntegralHistoryAdd <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 积分增加变动表. <br/>
 * date: 2015年8月23日 下午10:12:29 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class IntegralLog implements Serializable {
  private static final long serialVersionUID = 4045378800971384690L;

  /**  */
  private Integer id;

  /** 商场id */
  private String mallId;

  /** 会员号 */
  private String memberId;

  /** 积分变动 */
  private Integer integralNum;

  /** 总积分 */
  private Integer integral;

  /** 备注 */
  private String memo;

  /** 0,签到,1礼品回退 */
  private IntegralChangeAction action;

  /** 创建时间 */
  private Date createAt;
  /**
   * 会员类型：0，电子会员,1商场会员
   */
  private MemberType type;

  /** 最后更新时间 */
  private Date updateAt;


  public MemberType getType() {
    return type;
  }

  public void setType(MemberType type) {
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
   * 商场id
   * 
   * @return mallId
   */
  public String getMallId() {
    return mallId;
  }

  /**
   * 商场id
   * 
   * @param mallId
   */
  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  /**
   * 会员号
   * 
   * @return memberId
   */
  public String getMemberId() {
    return memberId;
  }

  /**
   * 会员号
   * 
   * @param memberId
   */
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * 积分变动
   * 
   * @return integralNum
   */
  public Integer getIntegralNum() {
    return integralNum;
  }

  /**
   * 积分变动
   * 
   * @param integralNum
   */
  public void setIntegralNum(Integer integralNum) {
    this.integralNum = integralNum;
  }

  /**
   * 总积分
   * 
   * @return integral
   */
  public Integer getIntegral() {
    return integral;
  }

  /**
   * 总积分
   * 
   * @param integral
   */
  public void setIntegral(Integer integral) {
    this.integral = integral;
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


  public IntegralChangeAction getAction() {
    return action;
  }

  public void setAction(IntegralChangeAction action) {
    this.action = action;
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
   * 最后更新时间
   * 
   * @return updateAt
   */
  public Date getUpdateAt() {
    return updateAt;
  }

  /**
   * 最后更新时间
   * 
   * @param updateAt
   */
  public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
  }
}
