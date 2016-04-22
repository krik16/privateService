package com.rongyi.easy.mcmc.vo;

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

    @Override
    public String toString() {
        return "SearchParamsForWechat{" +
                "weAndTeStatus='" + weAndTeStatus + '\'' +
                ", terminal='" + terminal + '\'' +
                ", shopId='" + shopId + '\'' +
                ", registerAt='" + registerAt + '\'' +
                ", soldOutAt='" + soldOutAt + '\'' +
                ", id='" + id + '\'' +
                ", currpage='" + currpage + '\'' +
                ",name='"+ name +'\''+
                ", pageSize=" + pageSize +
                '}';
    }
}
