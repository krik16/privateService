package com.rongyi.easy.msgcenter;

import com.rongyi.core.constant.Constants;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Description:
 * Author: 袁波
 * DATE: 2015/12/24 14:32
 * Package:com.rongyi.message.entity
 * Project:message-center
 */
public class UsersParamDto implements Serializable{
    private final static Long UID=1L;
    private String nickName;
    private String id;
    private String phone;
    private Integer currentPage;
    private Integer conditionType;
    private Date startTime;
    private Date endTime;
    private Integer pageSize;
    private Integer start;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickName() {
        if(nickName!=null)
            return "%"+nickName+"%";
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCurrentPage() {
        return currentPage==null? Constants.CouponPage.CURRENT_PAGE:currentPage;
    }

    public Integer getStart() {
        return (this.getCurrentPage()-1) * this.getPageSize();
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize==null? Constants.CouponPage.PAGE_SIZE:pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Map<String,Object> convertToMap(){
        return null;
    }

    public Integer getConditionType() {
        return conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UsersParamDto{");
        sb.append("nickName='").append(nickName).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", currentPage=").append(currentPage);
        sb.append(", conditionType=").append(conditionType);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", start=").append(start);
        sb.append('}');
        return sb.toString();
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
}
