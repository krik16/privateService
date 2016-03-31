package com.rongyi.easy.rvc.param;

import java.util.Date;


public class MemberBaseInfo implements java.io.Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** 表ID */
    private Long id;
    
	/** 商场ID */
    private String mallId;
    
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
	
	/** 密码 */
    private String pwd;
    
    /** 渠道：1微信，2终端，3APP， */
    private Integer channel;
    
    /** （服务商+商场ID）*/
//    private String owner;
    
    /** 昵称 */
    private String nickName;
    
    /** 积分 */
    private Integer integral;

    /** 注册时间  */
    private Date registTime;
    
    /** 软件提供商ID */
    private String ownerId;
    
    /** 邮编 */
    private String postCode;
    
    /** 集团ID */
    private String groupId;
    /**生日*/
    private Date birthday;
    /** 性别: M=Male男性, F=Female女性 */
    private String gender;
    /** 会员等级 */
    private String memberLevel;
    
	public MemberBaseInfo() {
		super();
	}

	public MemberBaseInfo(String mallId, String memberNo, String identify, String email, String mobile, String qq, String weixin, String pwd, Integer channel, String nickName, Integer integral ) {
		super();
		this.mallId = mallId;
		this.memberNo = memberNo;
		this.identify = identify;
		this.email = email;
		this.mobile = mobile;
		this.qq = qq;
		this.weixin = weixin;
		this.setPwd(pwd);
		this.channel = channel;
//		this.owner = owner;
		this.nickName = nickName;
		this.integral = integral;
//		this.registTime = registTime;
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
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

//	public String getOwner() {
//		return owner;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}


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


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public Integer getIntegral() {
		return integral;
	}


	public void setIntegral(Integer integral) {
		this.integral = integral;
	}


//	public Date getRegistTime() {
//		return registTime;
//	}
//
//
//	public void setRegistTime(Date registTime) {
//		this.registTime = registTime;
//	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
}
