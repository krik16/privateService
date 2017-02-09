package com.rongyi.easy.baogang;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/1/16.
 */
public class ChannelListParam implements Serializable {
    private String source;
    private Long timeStamp;//时间戳
    private String sign;

    @Override
    public String toString() {
        return "ChannelListParam{" +
                "source='" + source + '\'' +
                ", timeStamp=" + timeStamp +
                ", sign='" + sign + '\'' +
                '}';
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
}
