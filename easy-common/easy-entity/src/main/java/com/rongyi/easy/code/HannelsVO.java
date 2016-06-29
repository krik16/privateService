package com.rongyi.easy.code;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaozhou on 2016/6/29.
 * 促销推广码返回vo
 */
public class HannelsVO implements Serializable {
    private int id;//推广码id
    private String name;//推广码名称
    private int type;//推广码类型(0:渠道邀请码；1:渠道推广码)
    private String channerId;//关联渠道id
    private String channerName;//关联渠道名称
    private int status;//1 待审核 2 未开始 3 进行中 4 已结束 5未通过 6 已作废
    private Long validStartAt;//有效开始时间
    private Long validEndAt;//有效结束时间
    private List<HannelsCheckLog> hannelCheckLogs;//审核，作废日志列表

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getChannerId() {
        return channerId;
    }

    public void setChannerId(String channerId) {
        this.channerId = channerId;
    }

    public String getChannerName() {
        return channerName;
    }

    public void setChannerName(String channerName) {
        this.channerName = channerName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getValidStartAt() {
        return validStartAt;
    }

    public void setValidStartAt(Long validStartAt) {
        this.validStartAt = validStartAt;
    }

    public Long getValidEndAt() {
        return validEndAt;
    }

    public void setValidEndAt(Long validEndAt) {
        this.validEndAt = validEndAt;
    }

    public List<HannelsCheckLog> getHannelCheckLogs() {
        return hannelCheckLogs;
    }

    public void setHannelCheckLogs(List<HannelsCheckLog> hannelCheckLogs) {
        this.hannelCheckLogs = hannelCheckLogs;
    }

    @Override
    public String toString() {
        return "HannelsVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", channerId='" + channerId + '\'' +
                ", channerName='" + channerName + '\'' +
                ", status=" + status +
                ", validStartAt=" + validStartAt +
                ", validEndAt=" + validEndAt +
                ", hannelCheckLogs=" + hannelCheckLogs +
                '}';
    }
}
