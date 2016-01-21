package com.rongyi.easy.malllife.vo;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/1/20
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/1/20              1.0            创建文件
 *
 */

import java.io.Serializable;

public class EasyOrderVo implements Serializable {


    static final long serialVersionUID = 1L;

    private String typeCode;//详情类型
    private String typeid;//详情ID
    private Boolean istrue=false;//false 不跳

    private String picUrl; //图片地址
    private String subjectStr; // 令主题

    private  String firstParam;//第一个参数

    private String secondParam;//第二个参数

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public Boolean getIstrue() {
        return istrue;
    }

    public void setIstrue(Boolean istrue) {
        this.istrue = istrue;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getSubjectStr() {
        return subjectStr;
    }

    public void setSubjectStr(String subjectStr) {
        this.subjectStr = subjectStr;
    }

    public String getFirstParam() {
        return firstParam;
    }

    public void setFirstParam(String firstParam) {
        this.firstParam = firstParam;
    }

    public String getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(String secondParam) {
        this.secondParam = secondParam;
    }
}
