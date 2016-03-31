package com.rongyi.easy.malllife.vo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class CommodityCommentVO implements Serializable {
    private ObjectId id;
    private ObjectId commodityId;//商品编号
    private ObjectId specId;//规格编号，可能为空
    private int commentLevel;//好评1  中评2 差评3
    private String commentContent;//评价内容
    private Date createAt;//数据创建日期
    private String username;//评价人用户名
    private String userlogo;//评价人头像url地址
    private String userid;//评价人用户id（预留，暂未使用）
    private List<String> picList;
    private Date tranDate;//用户购买时间
    
    private String createAtString;//得到的是字符串类型的日期
    private String tranDateString;//得到用户购买的字符串类型的日期
    private List<String> columnId;//用户买的尺码和颜色的名字
    private List<String> columnValues;//用户买的尺码和颜色的value
    
    
    public List<String> getColumnId() {
		return columnId;
	}


	public void setColumnId(List<String> columnId) {
		this.columnId = columnId;
	}


	public List<String> getColumnValues() {
		return columnValues;
	}


	public void setColumnValues(List<String> columnValues) {
		this.columnValues = columnValues;
	}


	public String getCreateAtString() {
		return createAtString;
	}


	public void setCreateAtString(String createAtString) {
		this.createAtString = createAtString;
	}


	public String getTranDateString() {
		return tranDateString;
	}


	public void setTranDateString(String tranDateString) {
		this.tranDateString = tranDateString;
	}


	public List<String> getPicList() {
        return picList;
    }

    
    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    
    public Date getTranDate() {
        return tranDate;
    }

    
    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public ObjectId getId() {
        return id;
    }
    
    public void setId(ObjectId id) {
        this.id = id;
    }
    
    public ObjectId getCommodityId() {
        return commodityId;
    }
    
    public void setCommodityId(ObjectId commodityId) {
        this.commodityId = commodityId;
    }
    
    public ObjectId getSpecId() {
        return specId;
    }
    
    public void setSpecId(ObjectId specId) {
        this.specId = specId;
    }
    
    public int getCommentLevel() {
        return commentLevel;
    }
    
    public void setCommentLevel(int commentLevel) {
        this.commentLevel = commentLevel;
    }
    
    public String getCommentContent() {
        return commentContent;
    }
    
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
    
    public Date getCreateAt() {
        return createAt;
    }
    
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUserlogo() {
        return userlogo;
    }
    
    public void setUserlogo(String userlogo) {
        this.userlogo = userlogo;
    }
    
    public String getUserid() {
        return userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
}
