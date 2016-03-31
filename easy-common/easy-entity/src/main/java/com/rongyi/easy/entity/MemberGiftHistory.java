package com.rongyi.easy.entity;

public class MemberGiftHistory {
    private Integer id;

    private String ownerId;

    private String memberNo;

    private String mallId;

    private String giftCode;

    private Integer redeemQty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    public Integer getRedeemQty() {
        return redeemQty;
    }

    public void setRedeemQty(Integer redeemQty) {
        this.redeemQty = redeemQty;
    }
}