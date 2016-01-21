package com.rongyi.easy.domain.member;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import com.alibaba.fastjson.annotation.JSONField;
import com.rongyi.core.common.util.date.DateUtil;
import com.rongyi.core.common.util.date.SuperDate;
import com.rongyi.core.framework.exception.IllegalParamterException;
import com.rongyi.core.framework.exception.RYErrorCode;
import com.rongyi.core.framework.exception.RYServiceException;

/**
 * 
 * ClassName: SignInModel <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 签到规则. <br/>
 * date: 2015年4月30日 下午10:21:16 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class SignInModel implements Serializable {
  private static final long serialVersionUID = 6339713645981504106L;

  /**  */
  private Integer id;

  /** 商城id */
  private String mallId;

  /** 固定积分 */
  private Integer fixedIntegral;

  /** 集团id */
  private String groupId;

  /** 随机积分,例如:3~20 */
  private String randomIntegral;

  /** 最大签到次数 */
  private Integer maxSignIn;


  /** 生效日期 */
  @JSONField(format = SuperDate.patternDateMinutes)
  private Date activeAt;
  /**
   * 生效日期
   */
  private String activeAtStr;



  /** 创建用户id */
  private String createId;

  /** 创建用户名 */
  private String createName;

  /** 创建时间 */
  @JSONField(format = SuperDate.patternDateTime)
  private Date createAt;

  /** 更新用户id */
  private Integer updateId;

  /** 更新用户名 */
  private String updateName;

  /** 最后更新时间 */
  @JSONField(format = SuperDate.patternDateTime)
  private Date updateAt;

  /** version */
  private Long version;

  /** 审核状态(0:未审核,1审核通过) */
  private SignInStatus status;
  /**
   * 审核备注
   */
  private String memo;

  private List<SignInType> signInTypeList;

  public void initSignInType() {
    List<SignInType> list = new ArrayList<SignInType>();
    if (minRandomIntegral != 0 && maxRandomIntegral != 0 && minRandomIntegral <= maxRandomIntegral) {
      list.add(SignInType.RANDOM);
    }
    if (fixedIntegral != 0) {
      list.add(SignInType.FIXATION);
    }
    this.signInTypeList = list;
  }

  public void setSignInTypeList(List<SignInType> signInTypeList) {
    this.signInTypeList = signInTypeList;
  }

  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public String getActiveAtStr() {
    return activeAtStr;
  }

  public void setActiveAtStr(String activeAtStr) {
    this.activeAt = DateUtil.parseDate(activeAtStr, SuperDate.patternDateMinutes);
    this.activeAtStr = activeAtStr;
  }

  public SignInStatus getStatus() {
    return status;
  }

  public void setStatus(SignInStatus status) {
    this.status = status;
  }

  public Integer getMinRandomIntegral() {
    return minRandomIntegral;
  }

  public void setMinRandomIntegral(Integer minRandomIntegral) {
    this.minRandomIntegral = minRandomIntegral;
  }

  public Integer getMaxRandomIntegral() {
    return maxRandomIntegral;
  }

  public void setMaxRandomIntegral(Integer maxRandomIntegral) {
    this.maxRandomIntegral = maxRandomIntegral;
  }


  /** 最小的随机积分 */
  private Integer minRandomIntegral;
  /** 最大的随机积分 */
  private Integer maxRandomIntegral;

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
   * 固定积分
   * 
   * @return fixedIntegral
   */
  public Integer getFixedIntegral() {
    return fixedIntegral;
  }

  /**
   * 固定积分
   * 
   * @param fixedIntegral
   */
  public void setFixedIntegral(Integer fixedIntegral) {
    this.fixedIntegral = fixedIntegral;
  }

  /**
   * 集团id
   * 
   * @return groupId
   */
  public String getGroupId() {
    return groupId;
  }

  /**
   * 集团id
   * 
   * @param groupId
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  /**
   * 随机积分,例如:3~20
   * 
   * @return randomIntegral
   */
  public String getRandomIntegral() {
    return randomIntegral;
  }

  /**
   * 随机积分,例如:3~20
   * 
   * @param randomIntegral
   */
  public void setRandomIntegral(String randomIntegral) {
    this.randomIntegral = randomIntegral;
    String regEx = "^\\d+~\\d+$";// 验证数字区间
    Pattern p = Pattern.compile(regEx);
    if (p.matcher(randomIntegral).matches()) {
      String[] array = randomIntegral.split("~");
      this.minRandomIntegral = Integer.parseInt(array[0]);
      this.maxRandomIntegral = Integer.parseInt(array[1]);
    } else {

      throw new IllegalParamterException("randomIntegral type error");
    }
  }

  /**
   * 最大签到次数
   * 
   * @return maxSignIn
   */
  public Integer getMaxSignIn() {
    return maxSignIn;
  }

  /**
   * 最大签到次数
   * 
   * @param maxSignIn
   */
  public void setMaxSignIn(Integer maxSignIn) {
    this.maxSignIn = maxSignIn;
  }

  /**
   * 生效日期
   * 
   * @return activeAt
   */
  public Date getActiveAt() {
    return activeAt;
  }

  /**
   * 生效日期
   * 
   * @param activeAt
   */
  public void setActiveAt(Date activeAt) {
    this.activeAt = activeAt;
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
   * 更新用户id
   * 
   * @return updateId
   */
  public Integer getUpdateId() {
    return updateId;
  }

  /**
   * 更新用户id
   * 
   * @param updateId
   */
  public void setUpdateId(Integer updateId) {
    this.updateId = updateId;
  }

  /**
   * 更新用户名
   * 
   * @return updateName
   */
  public String getUpdateName() {
    return updateName;
  }

  /**
   * 更新用户名
   * 
   * @param updateName
   */
  public void setUpdateName(String updateName) {
    this.updateName = updateName;
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

  /**
   * version
   * 
   * @return version
   */
  public Long getVersion() {
    return version;
  }

  /**
   * version
   * 
   * @param version
   */
  public void setVersion(Long version) {
    this.version = version;
  }

  /**
   * 
   * getSendIntegral:得到送出的积分 <br/>
   * 
   * @author bin.zhang
   * @return
   * @since JDK 1.6
   */
  public int getSendIntegral(SignInType signInType) throws RYServiceException {
    int sendIntegral = 0;
    if (signInType.equals(SignInType.RANDOM)) {// 随机
      if (minRandomIntegral != 0 && maxRandomIntegral != 0
          && minRandomIntegral <= maxRandomIntegral) {
        int max = maxRandomIntegral - minRandomIntegral;
        Random r = new Random();
        int random = r.nextInt(max);
        sendIntegral += minRandomIntegral + random;
      } else {
        throw new RYServiceException(RYErrorCode.SIGN_IN_ERROR);
      }
    } else if ((signInType.equals(SignInType.FIXATION))) {// 固定
      sendIntegral = getFixedIntegral();
    }
    return sendIntegral;
  }

  /**
   * 
   * getSignInTypeList:得到签到类型. <br/>
   * 
   * @author bin.zhang
   * @return
   * @since JDK 1.6
   */
  public List<SignInType> getSignInTypeList() {

    return signInTypeList;
  }

  public static void main(String[] args) {
    SignInModel s = new SignInModel();
    s.setMaxRandomIntegral(12);
    s.setMinRandomIntegral(1);
    s.setFixedIntegral(100);
    System.err.println(s.getSendIntegral(SignInType.FIXATION));
  }

  @Override
  public String toString() {
    return "SignInModel [id=" + id + ", mallId=" + mallId + ", fixedIntegral=" + fixedIntegral
        + ", groupId=" + groupId + ", randomIntegral=" + randomIntegral + ", maxSignIn="
        + maxSignIn + ", activeAt=" + activeAt + ", activeAtStr=" + activeAtStr + ", createId="
        + createId + ", createName=" + createName + ", createAt=" + createAt + ", updateId="
        + updateId + ", updateName=" + updateName + ", updateAt=" + updateAt + ", version="
        + version + ", status=" + status + ", memo=" + memo + ", minRandomIntegral="
        + minRandomIntegral + ", maxRandomIntegral=" + maxRandomIntegral + "]";
  }



}
