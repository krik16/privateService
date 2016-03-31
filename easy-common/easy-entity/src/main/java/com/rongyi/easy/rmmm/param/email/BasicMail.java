package com.rongyi.easy.rmmm.param.email;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.List;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  发送邮件基础类
 * time:  2015/5/26
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/26              1.0            创建文件
 *
 */
public class BasicMail implements Serializable {

    //邮件主题
    private String subject;

    //邮件内容
    private String content;

    //抄送
    private String cc;

    //发送人地址
   // private String fromAddress;

    //接受者地址
    private List<String> toAddress;

    //抄送人地址
    private List<String> ccAddress;

    //密送人地址
    private List<String> bccAddress;

    //是否需要身份认证
    private boolean validate = false;

    //附件
    private MultipartFile[] attachment = new MultipartFile[0];

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public List<String> getToAddress() {
        return toAddress;
    }

    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }

    public List<String> getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(List<String> ccAddress) {
        this.ccAddress = ccAddress;
    }

    public List<String> getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(List<String> bccAddress) {
        this.bccAddress = bccAddress;
    }

    public boolean isValidate() {
        return validate;
    }

    public void setValidate(boolean validate) {
        this.validate = validate;
    }

    public MultipartFile[] getAttachment() {
        return attachment;
    }

    public void setAttachment(MultipartFile[] attachment) {
        this.attachment = attachment;
    }
}

