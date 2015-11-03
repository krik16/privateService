package com.rongyi.easy.activity.entity.dto;

/**
 * Description:
 * Author: 袁波
 * Time: 16:40
 * Package:com.rongyi.easy.activity.entity.dto
 * Project:easy-market
 */
public class PushMessageDTO {
    private String message;
    private String channelId;
    private Integer deviceType;
    private Integer msgType;
    private Integer msgExpires;

    @Override
    public String toString() {
        return "PushMessageDTO{" +
            "message='" + message + '\'' +
            ", channelId='" + channelId + '\'' +
            ", deviceType=" + deviceType +
            ", msgType=" + msgType +
            ", msgExpires=" + msgExpires +
            '}';
    }

    public PushMessageDTO() {
    }

    public PushMessageDTO(String message, String channelId, Integer deviceType, Integer msgType, Integer msgExpires) {

        this.message = message;
        this.channelId = channelId;
        this.deviceType = deviceType;
        this.msgType = msgType;
        this.msgExpires = msgExpires;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgExpires() {
        return msgExpires;
    }

    public void setMsgExpires(Integer msgExpires) {
        this.msgExpires = msgExpires;
    }
}

