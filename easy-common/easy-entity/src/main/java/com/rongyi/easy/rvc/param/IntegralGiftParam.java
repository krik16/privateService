package com.rongyi.easy.rvc.param;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.rongyi.easy.domain.member.MemberType;
import com.rongyi.easy.mvc.DateJson.DateJsonDeserializer;
import com.rongyi.easy.mvc.DateJson.DateJsonSerializer;

public class IntegralGiftParam implements java.io.Serializable {
  /**
	 * 
	 */
  private static final long serialVersionUID = 1L;

  private Integer id;

  /** 奖品已被领取数 */
  private String mallId;

  /** 奖品编码 */
  private String code;

  /** 奖品名称 */
  private String title;

  private String description;

  /** 奖品总数 */
  private Integer totalNum;

  /** 每人兑换限制次数 */
  private Integer personalTimes;

  /** 奖品图片编号 */
  private String thumbnail;

  /** 上架时间 */
  private Date shelvesDate;

  /** 下架时间 */
  private Date offShelvesDate;

  /** 最晚领取时间（实际意义？） */
  private Date deadline;

  /** 兑换积分 */
  private Integer exchangeIntegral;

  /** 优惠起始时间 */
  private Date favourableStartTime;

  /** 优惠结束时间 */
  private Date favourableEndTime;

  /** 优惠期间兑换积分 */
  private Integer favourableIntegral;

  /** 奖品已被领取数 */
  private Integer receiveTimes;

  /** 状态：默认0，若退还的时候，则把当初兑换的状态改成1,礼品领取了之后状态变成2 */
  private Byte status;

  /** 验证方式 */
  private Long useMode;
  /** 兑换时间 */
  private Date exchangeDate;

  /**
   * 会员类型：0，电子会员,1商场会员
   */
  private MemberType type;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getMallId() {
    return mallId;
  }

  public void setMallId(String mallId) {
    this.mallId = mallId;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }

  public Integer getPersonalTimes() {
    return personalTimes;
  }

  public void setPersonalTimes(Integer personalTimes) {
    this.personalTimes = personalTimes;
  }

  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  @JsonSerialize(using = DateJsonSerializer.class)
  public Date getShelvesDate() {
    return shelvesDate;
  }

  @JsonDeserialize(using = DateJsonDeserializer.class)
  public void setShelvesDate(Date shelvesDate) {
    this.shelvesDate = shelvesDate;
  }

  @JsonSerialize(using = DateJsonSerializer.class)
  public Date getOffShelvesDate() {
    return offShelvesDate;
  }

  @JsonDeserialize(using = DateJsonDeserializer.class)
  public void setOffShelvesDate(Date offShelvesDate) {
    this.offShelvesDate = offShelvesDate;
  }

  @JsonSerialize(using = DateJsonSerializer.class)
  public Date getDeadline() {
    return deadline;
  }

  @JsonDeserialize(using = DateJsonDeserializer.class)
  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }

  public Integer getExchangeIntegral() {
    return exchangeIntegral;
  }

  public void setExchangeIntegral(Integer exchangeIntegral) {
    this.exchangeIntegral = exchangeIntegral;
  }

  @JsonSerialize(using = DateJsonSerializer.class)
  public Date getFavourableStartTime() {
    return favourableStartTime;
  }

  @JsonDeserialize(using = DateJsonDeserializer.class)
  public void setFavourableStartTime(Date favourableStartTime) {
    this.favourableStartTime = favourableStartTime;
  }

  @JsonSerialize(using = DateJsonSerializer.class)
  public Date getFavourableEndTime() {
    return favourableEndTime;
  }

  @JsonDeserialize(using = DateJsonDeserializer.class)
  public void setFavourableEndTime(Date favourableEndTime) {
    this.favourableEndTime = favourableEndTime;
  }

  public Integer getFavourableIntegral() {
    return favourableIntegral;
  }

  public void setFavourableIntegral(Integer favourableIntegral) {
    this.favourableIntegral = favourableIntegral;
  }

  public Integer getReceiveTimes() {
    return receiveTimes;
  }

  public void setReceiveTimes(Integer receiveTimes) {
    this.receiveTimes = receiveTimes;
  }

  public Byte getStatus() {
    return status;
  }

  public void setStatus(Byte status) {
    this.status = status;
  }

  public Long getUseMode() {
    return useMode;
  }

  public void setUseMode(Long useMode) {
    this.useMode = useMode;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getExchangeDate() {
    return exchangeDate;
  }

  public void setExchangeDate(Date exchangeDate) {
    this.exchangeDate = exchangeDate;
  }

  public MemberType getType() {
    return type;
  }

  public void setType(MemberType type) {
    this.type = type;
  }


}
