package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class ShopRmmmVO implements Serializable{
    private Integer id; 

    private String name;//店铺的名字

    private Integer mallId;//店铺对应的合作商场

    private Integer brandId;

    private String mongoId;//店铺的mongoId 是对应的mongo数据库中的id

    private Integer scoreTotalNumber;

    private Integer totalScore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMallId() {
        return mallId;
    }

    public void setMallId(Integer mallId) {
        this.mallId = mallId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }

    public Integer getScoreTotalNumber() {
        return scoreTotalNumber;
    }

    public void setScoreTotalNumber(Integer scoreTotalNumber) {
        this.scoreTotalNumber = scoreTotalNumber;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }
    
}
