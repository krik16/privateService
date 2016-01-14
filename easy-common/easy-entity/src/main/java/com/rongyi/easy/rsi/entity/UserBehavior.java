package com.rongyi.easy.rsi.entity;

import java.util.Date;

public class UserBehavior implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  */
    private Long id;

    /** 类型，记录哪个行为：登录login */
    private String type;

    /** 会员编号 */
    private String memberNo;

    /** 手机号码 */
    private String mobile;

    /** 身份证号 */
    private String identify;

    /** 软件供应商ID */
    private String ownerId;

    /** 集团ID */
    private String groupId;

    /** 商场ID */
    private String mallId;

    /** 插入数据的时间 */
    private Date insDt;

    /** openId */
    private String openId;

    /** email */
    private String email;

    /** qq */
    private String qq;

    /** weixin */
    private String weixin;

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
     * 类型，记录哪个行为：登录login
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 类型，记录哪个行为：登录login
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 会员编号
     * @return memberNo
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * 会员编号
     * @param memberNo
     */
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    /**
     * 手机号码
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 手机号码
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 身份证号
     * @return identify
     */
    public String getIdentify() {
        return identify;
    }

    /**
     * 身份证号
     * @param identify
     */
    public void setIdentify(String identify) {
        this.identify = identify;
    }

    /**
     * 软件供应商ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 软件供应商ID
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 集团ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 集团ID
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
     * 插入数据的时间
     * @return insDt
     */
    public Date getInsDt() {
        return insDt;
    }

    /**
     * 插入数据的时间
     * @param insDt
     */
    public void setInsDt(Date insDt) {
        this.insDt = insDt;
    }

    /**
     * openId
     * @return openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * openId
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * qq
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * qq
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * weixin
     * @return weixin
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * weixin
     * @param weixin
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }
}