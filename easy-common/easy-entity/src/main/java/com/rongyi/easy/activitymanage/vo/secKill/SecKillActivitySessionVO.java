package com.rongyi.easy.activitymanage.vo.secKill;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * @author chenjun
 * @date 2017/5/2 11:02
 */
public class SecKillActivitySessionVO implements Serializable{

    private static final long serialVersionUID = 2094008222784400378L;

    private long activitySessionStartAt;//场次开始时间
    private long activitySessionEndAt;//场次结束时间
    private String activitySessionId;//场次id
    private String activitySessionName;//场次名称
    private List<SecKillActivityGoodVO> commodityList;//场次商品列表

    public long getActivitySessionStartAt() {
        return activitySessionStartAt;
    }

    public void setActivitySessionStartAt(long activitySessionStartAt) {
        this.activitySessionStartAt = activitySessionStartAt;
    }

    public long getActivitySessionEndAt() {
        return activitySessionEndAt;
    }

    public void setActivitySessionEndAt(long activitySessionEndAt) {
        this.activitySessionEndAt = activitySessionEndAt;
    }

    public String getActivitySessionId() {
        return activitySessionId;
    }

    public void setActivitySessionId(String activitySessionId) {
        this.activitySessionId = activitySessionId;
    }

    public List<SecKillActivityGoodVO> getCommodityList() {
        return commodityList;
    }

    public void setCommodityList(List<SecKillActivityGoodVO> commodityList) {
        this.commodityList = commodityList;
    }

    public String getActivitySessionName() {
        return activitySessionName;
    }

    public void setActivitySessionName(String activitySessionName) {
        this.activitySessionName = activitySessionName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
