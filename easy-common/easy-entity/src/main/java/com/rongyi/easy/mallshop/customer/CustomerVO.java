package com.rongyi.easy.mallshop.customer;

import com.rongyi.easy.malllife.common.util.DateUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by xgq on 2015/7/16.
 */
public class CustomerVO implements Serializable {
    /**
     * 表ID
     */
    private Integer id;

    /**
     * 关联的摩生活用户id(mongodb.users  MallLifeUserEntity)
     */
    private String userId;

    /**
     * 关联的摩生活用户的IMID
     */
    private String userIMId;

    /**
     * 顾客组
     */
    private CustomerGroupVO customerGroupVO;

    /**
     * 标签列表
     */
    private List<CustomerTagVO> customerTagVOList;

    /**
     * 关联的摩生活用户昵称(mongodb.user)
     */
    private String nickname;

    /**
     * 关联的摩生活用户电话(mongodb.user)
     */
    private String phone;

    /**
     * 关联的摩生活用户头像(mongodb.user)
     */
    private String headImg;

    /**
     * 是否为专属导购
     */
    private boolean belong;

    /**
     * 用户来源
     */
    private String userSource = "容易逛";

    /**
     * 备注名
     */
    private String memoName;

    /**
     * 性别 M为男性  F为女性
     */
    private String gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 家庭情况  1为学生  2为未婚  3为已婚  4为有子
     */
    private Integer familyType;

    /**
     * 备注
     */
    private String memo;

    /**
     * 购买列表 该顾客最新4张在该店铺购买商品的id 缩略图
     */
    private List<CustomerOrderCommodityVO> commodityVOs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemoName() {
        return memoName;
    }

    public void setMemoName(String memoName) {
        this.memoName = memoName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return DateUtil.dateToYMD(this.birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getFamilyType() {
        return familyType;
    }

    public void setFamilyType(Integer familyType) {
        this.familyType = familyType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CustomerGroupVO getCustomerGroupVO() {
        return customerGroupVO;
    }

    public void setCustomerGroupVO(CustomerGroupVO customerGroupVO) {
        this.customerGroupVO = customerGroupVO;
    }

    public List<CustomerTagVO> getCustomerTagVOList() {
        return customerTagVOList;
    }

    public void setCustomerTagVOList(List<CustomerTagVO> customerTagVOList) {
        this.customerTagVOList = customerTagVOList;
    }

    public List<CustomerOrderCommodityVO> getCommodityVOs() {
        return commodityVOs;
    }

    public void setCommodityVOs(List<CustomerOrderCommodityVO> commodityVOs) {
        this.commodityVOs = commodityVOs;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public boolean isBelong() {
        return belong;
    }

    public void setBelong(boolean belong) {
        this.belong = belong;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public String getUserIMId() {
        return userIMId;
    }

    public void setUserIMId(String userIMId) {
        this.userIMId = userIMId;
    }
}
