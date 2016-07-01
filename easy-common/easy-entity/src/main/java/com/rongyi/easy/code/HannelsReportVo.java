package com.rongyi.easy.code;

/**
 * Created by shaozhou on 2016/7/1.
 */
public class HannelsReportVo {
    private String channelCode; // 渠道邀请码
    private String code;//红包密码
    private String createAt;//创建时间
    public String getChannelCode() {
        return channelCode;
    }
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCreateAt() {
        return createAt;
    }
    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }
    @Override
    public String toString() {
        return "HannelsReportVo{" +
                "channelCode='" + channelCode + '\'' +
                ", code='" + code + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }
}
