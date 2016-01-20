package com.rongyi.easy.mms.vo;

import java.io.Serializable;
import java.util.Date;

public class IntegralHistoryVO implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 4479575617161199381L;

    /**  */
    private Long id;

    /** 会员表member:ID */
    private Long memberId;
    
    private String memberName;

    /** 积分数量：>0加，<0减 */
    private Integer integralNum;

    /** 对应礼品的ID */
    private String giftNo;
    
    /**对应礼品名称   */
    private String giftName;
    
    /**兑换积分  */
    private Integer integral;

    /** 礼品兑换后生成的码 */
    private String giftCode;

    /** 兑换礼品的数量，一般都是1 */
    private Integer giftNum;

    /** 调整原因 */
    private String memo;

    /** 状态：默认0，若退还的时候，则把当初兑换的状态改成1,礼品领取了之后状态变成2 */
    private Byte status;

    /** 生成时间 */
    private Date insDt;

    /** 更新时间 */
    private Date updDt;

    /** 来源：1容易 */
    private Byte channel;

    /** 商场ID */
    private String mallId;

    /** 服务商+商场ID */
    private String owner;
    
    /** 增减积分接口和返回积分记录加上type:-1减积分，1加积分 */
    private Integer type;

    /**
     * 
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 会员表member:ID
     * @return memberId
     */
    public Long getMemberId() {
        return memberId;
    }

    /**
     * 会员表member:ID
     * @param memberId
     */
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    /**
     * 积分数量：>0加，<0减
     * @return integralNum
     */
    public Integer getIntegralNum() {
        return integralNum;
    }

    /**
     * 积分数量：>0加，<0减
     * @param integralNum
     */
    public void setIntegralNum(Integer integralNum) {
        this.integralNum = integralNum;
    }

    /**
     * 对应礼品的ID
     * @return giftNo
     */
    public String getGiftNo() {
        return giftNo;
    }

    /**
     * 对应礼品的ID
     * @param giftNo
     */
    public void setGiftNo(String giftNo) {
        this.giftNo = giftNo;
    }

    /**
     * 礼品兑换后生成的码
     * @return giftCode
     */
    public String getGiftCode() {
        return giftCode;
    }

    /**
     * 礼品兑换后生成的码
     * @param giftCode
     */
    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    /**
     * 兑换礼品的数量，一般都是1
     * @return giftNum
     */
    public Integer getGiftNum() {
        return giftNum;
    }

    /**
     * 兑换礼品的数量，一般都是1
     * @param giftNum
     */
    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }

    /**
     * 调整原因
     * @return memo
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 调整原因
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * 状态：默认0，若退还的时候，则把当初兑换的状态改成1,礼品领取了之后状态变成2
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态：默认0，若退还的时候，则把当初兑换的状态改成1,礼品领取了之后状态变成2
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 生成时间
     * @return insDt
     */
    public Date getInsDt() {
        return insDt;
    }

    /**
     * 生成时间
     * @param insDt
     */
    public void setInsDt(Date insDt) {
        this.insDt = insDt;
    }

    /**
     * 更新时间
     * @return updDt
     */
    public Date getUpdDt() {
        return updDt;
    }

    /**
     * 更新时间
     * @param updDt
     */
    public void setUpdDt(Date updDt) {
        this.updDt = updDt;
    }

    /**
     * 来源：1容易
     * @return channel
     */
    public Byte getChannel() {
        return channel;
    }

    /**
     * 来源：1容易
     * @param channel
     */
    public void setChannel(Byte channel) {
        this.channel = channel;
    }

    /**
     * 商场ID
     * @return mallId
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 商场ID
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    /**
     * 服务商+商场ID
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 服务商+商场ID
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

	public Integer getType() {
		return type;
	}

    public void setType(Integer type) {
        this.type = type;
    }
    

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    @Override
    public String toString() {
        return "IntegralHistory [id=" + id + ", memberId=" + memberId + ", integralNum=" + integralNum + ", giftNo="
                + giftNo + ", giftCode=" + giftCode + ", giftNum=" + giftNum + ", memo=" + memo + ", status=" + status
                + ", insDt=" + insDt + ", updDt=" + updDt + ", channel=" + channel + ", mallId=" + mallId + ", owner="
                + owner + ", type=" + type + "]";
    }
    
}