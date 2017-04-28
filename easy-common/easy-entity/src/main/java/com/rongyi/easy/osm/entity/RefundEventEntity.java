package com.rongyi.easy.osm.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * d退款事件实体
 *
 * @author wangjh7
 * @date 2017-04-17
 **/
public class RefundEventEntity implements Serializable {
    // 标题=detail
    private String title;
    // 原因
    private String remark;
    // 创建时间
    private Date createDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "RefundEventEntity{" +
                "createDate=" + createDate +
                ", title='" + title + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
