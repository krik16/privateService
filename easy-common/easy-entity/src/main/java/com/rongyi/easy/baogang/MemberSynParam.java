package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/1/16.
 */
public class MemberSynParam implements Serializable {
    private Integer channel;
    private Integer source;
    private String modifyDateTime;
    private Integer isAll;//0 增量同步 1 全量同步
    private Integer page;
    private Long timeStamp;//时间戳
    private String sign;//签名

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(String modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getIsAll() {
        return isAll;
    }

    public void setIsAll(Integer isAll) {
        this.isAll = isAll;
    }

    @Override
    public String toString() {
        return "MemberSynParam{" +
                "channel=" + channel +
                ", source=" + source +
                ", modifyDateTime='" + modifyDateTime + '\'' +
                ", isAll=" + isAll +
                ", page=" + page +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                '}';
    }
}
