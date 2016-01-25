package com.rongyi.easy.usercenter.entity;

import java.io.Serializable;
import java.util.Date;

public class MalllifeUserAddressEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /** id(uuid生成) */
    private String id;

    /** 用户ID */
    private String userId;

    /** 默认地址标识 1为默认，2为非默认 */
    private Integer status;

    /** 收货人电话 */
    private String phone;

    /** 收货人姓名 */
    private String consignee;

    /** 详细地址 */
    private String detailAddress;

    /** 省ID */
    private String provinceId;

    /** 市ID */
    private String cityId;

    /** 区ID */
    private String districtId;

    /** 省名称 */
    private String provinceName;

    /** 市名称 */
    private String cityName;

    /** 区名称 */
    private String districtName;

    /** 判断是否删除 0是 1否 */
    private Integer isDelete;

    /** 创建时间 */
    private Date createAt;

    /** 更新时间 */
    private Date updateAt;

    /**
     * id(uuid生成)
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * id(uuid生成)
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 默认地址标识 1为默认，2为非默认
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 默认地址标识 1为默认，2为非默认
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 收货人电话
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 收货人电话
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 收货人姓名
     * @return consignee
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 收货人姓名
     * @param consignee
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    /**
     * 详细地址
     * @return detailAddress
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * 详细地址
     * @param detailAddress
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * 省ID
     * @return provinceId
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省ID
     * @param provinceId
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 市ID
     * @return cityId
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市ID
     * @param cityId
     */
    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    /**
     * 区ID
     * @return districtId
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * 区ID
     * @param districtId
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    /**
     * 省名称
     * @return provinceName
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省名称
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    /**
     * 市名称
     * @return cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 市名称
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 区名称
     * @return districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 区名称
     * @param districtName
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    /**
     * 判断是否删除 0是 1否
     * @return isDelete
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 判断是否删除 0是 1否
     * @param isDelete
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
}