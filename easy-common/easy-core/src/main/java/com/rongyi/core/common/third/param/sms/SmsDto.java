package com.rongyi.core.common.third.param.sms;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/5/24    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SmsDto
    implements Serializable
    {

        private static final long serialVersionUID = 1L;

        private String channel;

        private String privateKey; //不可修改

        private String publicKey;//不可修改

        private String token; //token 不可修改

        private int ipLimit; // IP限制  ；0 不做限制 1 限制

        private String ipWhiteList; //ip白名单

        private int opType;//0 查询 1抛入 2修改，3修改ip限制

        private String sendChannel; //发送渠道

        private String sendType;//发送类型  RYNTCSMS 通知类型 RYMARKSMS 营销类型

        private int isDisabled;//0 正常 1禁用，停止

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public void setPrivateKey(String privateKey) {
            this.privateKey = privateKey;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public void setPublicKey(String publicKey) {
            this.publicKey = publicKey;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public int getIpLimit() {
            return ipLimit;
        }

        public void setIpLimit(int ipLimit) {
            this.ipLimit = ipLimit;
        }

        public String getIpWhiteList() {
            return ipWhiteList;
        }

        public void setIpWhiteList(String ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
        }

        public int getOpType() {
            return opType;
        }

        public void setOpType(int opType) {
            this.opType = opType;
        }

        public String getSendChannel() {
            return sendChannel;
        }

        public void setSendChannel(String sendChannel) {
            this.sendChannel = sendChannel;
        }

        public String getSendType() {
            return sendType;
        }

        public void setSendType(String sendType) {
            this.sendType = sendType;
        }

        public int getIsDisabled() {
            return isDisabled;
        }

        public void setIsDisabled(int isDisabled) {
            this.isDisabled = isDisabled;
        }
    }
