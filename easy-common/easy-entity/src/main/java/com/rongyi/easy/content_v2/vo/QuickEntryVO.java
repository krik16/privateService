package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 容易逛首页-快捷入口VO
 * Created by Breggor on 2015/9/10.
 */
public class QuickEntryVO implements Serializable {


    private String quickPics; // 快捷入口图标，多个衣逗号分隔。例如："快捷入口图标1,快捷入口图标2"
    private String publishBeginAt;  //发布开始时间
    private String publishEndAt;  //发布结束时间

    public String getQuickPics() {
        return quickPics;
    }

    public void setQuickPics(String quickPics) {
        this.quickPics = quickPics;
    }

    public String getPublishBeginAt() {
        return publishBeginAt;
    }

    public void setPublishBeginAt(String publishBeginAt) {
        this.publishBeginAt = publishBeginAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("quickPics", quickPics)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }
}
