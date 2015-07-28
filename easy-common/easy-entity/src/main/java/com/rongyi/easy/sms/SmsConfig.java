package com.rongyi.easy.sms;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/7/23
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/7/23              1.0            创建文件
 *
 */
public class SmsConfig implements Serializable{

    private static final long serialVersionUID = 1L;

    public static final String csUserName="xd000848";
    public static final String csPassWord="rongYI@8888";
    public static final String csSendURL="http://114.113.154.5/sms.aspx?action=send";
    public static final String csURL="http://114.113.154.5/sms.aspx?action=overage";



    //短信内容

    public static final String MALLSHOP_RESTPWD="【摩店】验证码：@，您正在找回密码，10分钟内有效，请勿泄露";
    public static final String MALLSHOP_REGISTER="【摩店】验证码：@，您正在注册摩店，10分钟内有效，请勿泄露";
    public static final String MALLSHOP_CODE="【摩店】验证码：@，请即时输入 。10分钟内有效，请勿泄露。";

    public static final String MALLLIFE_RESTPWD="【容易逛】验证码：@，您正在找回密码，10分钟有效，请勿泄露";
    public static final String MALLLIFE_REGISTER="【容易逛】验证码：@，您正在注册容易逛， 10分钟内有效，请勿泄露";
    public static final String MALLLIFE_LOGIN="【容易逛】验证码：@，您正在手机快捷登录容易逛，10分钟有效，请勿泄露";
    public static final String MALLLIFE_BINDING="【容易逛】验证码：@，您正在绑定手机号。10分钟有效，请勿泄露。";






}
