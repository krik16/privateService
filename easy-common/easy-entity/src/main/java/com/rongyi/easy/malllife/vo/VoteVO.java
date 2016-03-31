package com.rongyi.easy.malllife.vo;

import java.io.Serializable;

/**
 * 展示投票选项list对象
 * 类AppVoteVO.java的实现描述：TODO 类实现描述 
 * @author rongyi11 2014年8月21日 下午8:27:38
 */
public class VoteVO implements Serializable{

    private Integer id;
    private Integer number;
    private String  name;
    private Integer percent;//百分比
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getNumber() {
        return number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

}
