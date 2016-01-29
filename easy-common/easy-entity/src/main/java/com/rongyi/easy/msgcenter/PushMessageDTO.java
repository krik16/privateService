package com.rongyi.easy.msgcenter;

import com.rongyi.core.constant.Constants;
import net.sf.json.JSONObject;

/**
 * Description:
 * Author: 袁波
 * Time: 16:40
 * Package:com.rongyi.easy.activity.entity.dto
 * Project:easy-market
 */
public class PushMessageDTO {


    /**
     * 消息标题
     */
    private String title;
    /**
     * 消息内容
     */
    private String message;

    /**
     * 消息类型，即落地页类型
     */
    private Integer type;
    /**
     * 对应的类型需要传递的参数，如不需要参数，可不传
     */
    private String typeValue;
    /**
     * 推送设备的唯一标识
     */
    private String channelId;
    /**
     * 设备类型 3:android 4:ios。 默认3
     */
    private Integer deviceType;

    /**
     * 百度消息类型 0：透传；1：通知。 默认 1
     */
    private Integer msgType;
    /**
     * 相对于当前时间的消息过期时间，单位为秒 默认 3600
     */
    private Integer msgExpires;

    /**
     * 需要推送的app 0:容易逛；1：摩店；默认 0
     */
    private Integer pushApp;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushMessageDTO{");
        sb.append("title='").append(title).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", type=").append(type);
        sb.append(", typeValue='").append(typeValue).append('\'');
        sb.append(", channelId='").append(channelId).append('\'');
        sb.append(", deviceType=").append(deviceType);
        sb.append(", msgType=").append(msgType);
        sb.append(", msgExpires=").append(msgExpires);
        sb.append(", pushApp=").append(pushApp);
        sb.append('}');
        return sb.toString();
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
        return deviceType==null?Constants.PUSH_DEVICE.ADDROID:deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getMsgType() {
        return msgType==null? Constants.BD_PUSH_MSG_TYPE.TZ_MSG:msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public Integer getMsgExpires() {
        return msgExpires==null?new Integer(3600):msgExpires;
    }

    public void setMsgExpires(Integer msgExpires) {
        this.msgExpires = msgExpires;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public void setTypeValue(String typeValue) {
        this.typeValue = typeValue;
    }

    public Integer getPushApp() {
        return pushApp==null?Constants.PUSH_APP.RYG:pushApp;
    }

    public void setPushApp(Integer pushApp) {
        this.pushApp = pushApp;
    }

    public String getAndroidPushMessage(){
        AndroidMsg androidMsg=null;
        if(this.getType()!=null){
            androidMsg=new AndroidMsg(this.getTitle(),this.getMessage(),this.getType(),this.getTypeValue());
        }else{
            androidMsg=new AndroidMsg(this.getTitle(),this.getMessage());
        }
        return JSONObject.fromObject(androidMsg).toString();
    }

    public String getIosPushMessage() {
        IosMsg iosMsg=null;
        if(this.getType()!=null) {
            iosMsg=new IosMsg(this.getMessage(), this.getType(), this.getTypeValue());
        }else{
            iosMsg=new IosMsg(this.getMessage());
        }
        return JSONObject.fromObject(iosMsg).toString();
    }

    public String getPushMessage() {
        if(this.getDeviceType()==Constants.PUSH_DEVICE.ADDROID) {
            return this.getAndroidPushMessage();
        }
        if(this.getDeviceType()==Constants.PUSH_DEVICE.IOS) {
            return this.getIosPushMessage();
        }
        return this.getAndroidPushMessage();
    }
}

