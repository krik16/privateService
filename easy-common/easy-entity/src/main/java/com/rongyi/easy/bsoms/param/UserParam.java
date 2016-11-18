package com.rongyi.easy.bsoms.param;

import com.rongyi.core.constant.Identity;

import java.util.Date;

/**
 * 用户参数
 * Created by sujuan on 2016/11/2.
 */
public class UserParam extends BaseParam {
    private static final long serialVersionUID = 3376988164223508963L;
    private Integer userId;
    private String term ;//查询条件  （账号、手机号、姓名等）
    private Integer roleId;
    private Integer shopId;
    private Date startTime;
    private Date endTime;
    private Integer userIdentity; //用户类型  0集团 1商场 2品牌（暂时去掉了） 3分公司 4店长 5导购
    private Integer bindingId;  //用户绑定的ID  （集团ID or商场ID or分公司id or店铺ID）
    private Integer onlyShop; //给推送增加的参数  不查询导购数据
    private Integer identity ; //查询用户类型
    private Integer isChief;  //是否是主账号  1是 0否
    private String orderVar = "desc";   //order by顺序
    private Integer isDisabled ; //0正常 1禁用
    private Integer status;  //状态
    private Integer industryId;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(Integer userIdentity) {
        this.userIdentity = userIdentity;
    }

    public Integer getBindingId() {
        return bindingId;
    }

    public void setBindingId(Integer bindingId) {
        this.bindingId = bindingId;
    }

    public Integer getOnlyShop() {
        return onlyShop;
    }

    public void setOnlyShop(Integer onlyShop) {
        this.onlyShop = onlyShop;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public Integer getIsChief() {
        return isChief;
    }

    public void setIsChief(Integer isChief) {
        this.isChief = isChief;
    }

    public String getOrderVar() {
        return orderVar;
    }

    public void setOrderVar(String orderVar) {
        this.orderVar = orderVar;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public Integer getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    @Override
    public String toString() {
        return "UserParam{" +
                "userId=" + userId +
                ", term='" + term + '\'' +
                ", roleId=" + roleId +
                ", shopId=" + shopId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", userIdentity=" + userIdentity +
                ", bindingId=" + bindingId +
                ", onlyShop=" + onlyShop +
                ", identity=" + identity +
                ", isChief=" + isChief +
                '}';
    }
}
