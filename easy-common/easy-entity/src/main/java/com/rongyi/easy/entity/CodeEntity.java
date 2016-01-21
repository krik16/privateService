package com.rongyi.easy.entity;

import java.util.Date;

public class CodeEntity  implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  */
    private Long id;

    /** 兑奖码 */
    private String code;

    /** 与类型相关id */
    private Long referenceId;

    /** 码所属的商场id */
    private String mallId;

    /** 1:未被使用，2:被使用 */
    private Integer status;

    /** 来源, 0000（终端机），0001（app），0002（微信），0003-9999（其他，包括发码，活动等） */
    private String source;

    /** 发码类型 */
    private Long type;

    /** 绑定用户id */
    private String userId;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /** 用户手机号 */
    private String phone;
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
     * 兑奖码
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * 兑奖码
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 与类型相关id
     * @return referenceId
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * 与类型相关id
     * @param referenceId
     */
    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * 码所属的商场id
     * @return mallId
     */
    public String getMallId() {
        return mallId;
    }

    /**
     * 码所属的商场id
     * @param mallId
     */
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    /**
     * 1:未被使用，2:被使用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 1:未被使用，2:被使用
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 来源, 0000（终端机），0001（app），0002（微信），0003-9999（其他，包括发码，活动等）
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * 来源, 0000（终端机），0001（app），0002（微信），0003-9999（其他，包括发码，活动等）
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 发码类型
     * @return type
     */
    public Long getType() {
        return type;
    }

    /**
     * 发码类型
     * @param type 0:积分商品
     */
    public void setType(Long type) {
        this.type = type;
    }

    /**
     * 绑定用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 绑定用户id
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 创建时间
     * @return createAt
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 创建时间
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 更新时间
     * @return updateAt
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 更新时间
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
}