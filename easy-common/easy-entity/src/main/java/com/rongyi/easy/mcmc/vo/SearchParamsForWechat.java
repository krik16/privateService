package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.mvc.DateJson.DateJsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xuying on 2016/3/17.
 */
public class SearchParamsForWechat implements Serializable{

    private String weAndTeStatus ;
    private String terminal;
    private String shopId;
    private Date registerAt;
    private Date soldOutAt;
    private String id;
    private Integer currpage;
    private Integer pageSize;
    private String name;
    private String keyword;
    private String displayStatus;
    private String category;
    private String type;
    @JsonDeserialize(using=DateJsonDeserializer.class)
    private Date startTime;
    @JsonDeserialize(using=DateJsonDeserializer.class)
    private Date endTime;

    private String brandId;
    private Integer status;
    private String dateType;

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDisplayStatus() {
        return displayStatus;
    }

    public void setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
    }

    public String getWeAndTeStatus() {
        return weAndTeStatus;
    }

    public void setWeAndTeStatus(String weAndTeStatus) {
        this.weAndTeStatus = weAndTeStatus;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Date getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(Date registerAt) {
        this.registerAt = registerAt;
    }

    public Date getSoldOutAt() {
        return soldOutAt;
    }

    public void setSoldOutAt(Date soldOutAt) {
        this.soldOutAt = soldOutAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCurrpage() {
        return currpage;
    }

    public void setCurrpage(Integer currpage) {
        this.currpage = currpage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchParamsForWechat{" +
                "weAndTeStatus='" + weAndTeStatus + '\'' +
                ", terminal='" + terminal + '\'' +
                ", shopId='" + shopId + '\'' +
                ", registerAt=" + registerAt +
                ", soldOutAt=" + soldOutAt +
                ", id='" + id + '\'' +
                ", currpage=" + currpage +
                ", pageSize=" + pageSize +
                ", name='" + name + '\'' +
                ", keyword='" + keyword + '\'' +
                ", displayStatus='" + displayStatus + '\'' +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", brandId='" + brandId + '\'' +
                ", status=" + status +
                ", dateType=" + dateType +
                '}';
    }
}
