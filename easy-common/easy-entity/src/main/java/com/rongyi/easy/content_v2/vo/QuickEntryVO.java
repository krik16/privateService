package com.rongyi.easy.content_v2.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 容易逛首页-快捷入口VO
 * Created by Breggor on 2015/9/10.
 */
public class QuickEntryVO implements Serializable {

    private List<String> quickPics; //["快捷入口图标1","快捷入口图标2"]
    private String publishBeginAt;  //发布开始时间
    private String publishEndAt;  //发布结束时间

    public List<String> getQuickPics() {
        return quickPics;
    }

    public void setQuickPics(List<String> quickPics) {
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
        return new ToStringBuilder(this, ToStringStyle.SIMPLE_STYLE)
                .append("quickPics", quickPics)
                .append("publishBeginAt", publishBeginAt)
                .append("publishEndAt", publishEndAt)
                .toString();
    }
}
