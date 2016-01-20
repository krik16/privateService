package com.rongyi.easy.malllife.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 投票数据 类AppVote.java的实现描述：TODO 类实现描述
 * 
 * @author rongyi11 2014年8月21日 下午8:09:36
 */
public class Vote implements Serializable{

    private String  name;        // 名称
    private Integer id;          // id
    private Integer content_id;  // 关联文章 活动id
    private Integer ballot;      // 投票数
    private Integer created_user; // 创建人
    private Integer updated_user; // 修改人
    private Date    created_date; // 创建时间
    private Date    updated_date; // 修改时间
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getContent_id() {
        return content_id;
    }
    
    public void setContent_id(Integer content_id) {
        this.content_id = content_id;
    }
    
    public Integer getBallot() {
        return ballot;
    }
    
    public void setBallot(Integer ballot) {
        this.ballot = ballot;
    }
    
    public Integer getCreated_user() {
        return created_user;
    }
    
    public void setCreated_user(Integer created_user) {
        this.created_user = created_user;
    }
    
    public Integer getUpdated_user() {
        return updated_user;
    }
    
    public void setUpdated_user(Integer updated_user) {
        this.updated_user = updated_user;
    }
    
    public Date getCreated_date() {
        return created_date;
    }
    
    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
    
    public Date getUpdated_date() {
        return updated_date;
    }
    
    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }
    

}
