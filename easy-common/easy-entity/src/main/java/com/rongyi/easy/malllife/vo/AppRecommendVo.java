package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

public class AppRecommendVo implements Serializable{

    private Integer id;
    
    private String name;
    
    private String description;
    
    private String logo;
    
    private String url;
    
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
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getLogo() {
        return logo;
    }
    
    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
