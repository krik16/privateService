package com.rongyi.core.sms;

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

    public static final String SERVER_TELPHONE="400-040-8989";//客服电话;

    public static final String csUserName="xd000848";//"xd000848";
    public static final String csPassWord="RoNgyi0317aPP";
    public static final String csSendURL="http://114.113.154.5/sms.aspx?action=send";

    public static final String csURL="http://114.113.154.13/sms.aspx?action=overage";



    //短信内容

    public static final String MALLSHOP_RESTPWD="验证码：@，您正在找回密码，10分钟内有效，请勿泄露";
    public static final String MALLSHOP_REGISTER="验证码：@，您正在注册摩店，10分钟内有效，请勿泄露";
    public static final String MALLSHOP_CODE="验证码：@，请即时输入 。10分钟内有效，请勿泄露。";

    public static final String MALLLIFE_RESTPWD="验证码：@，您正在找回密码，10分钟有效，请勿泄露";
    public static final String MALLLIFE_REGISTER="验证码：@，您正在注册容易逛， 10分钟内有效，请勿泄露";
    public static final String MALLLIFE_LOGIN="验证码：@，您正在手机快捷登录容易逛，10分钟有效，请勿泄露";
    public static final String MALLLIFE_BINDING="验证码：@，您正在绑定手机号。10分钟有效，请勿泄露。";
    
    public static final String WEBCHAT_MALLLIFE_BINDING="谢谢您使用容易网客户端，您当前的验证码：@";

    public static final String COUPON_VALID = "您购买的@于@验证@份，剩@份未消费，如有任何疑问请您与商家咨询：400-040-8989";

    //返回异常
    public static final String LIMIT_EXCEPTION_MSG="亲你的手机,今天发送短信已达到上限,请明天再试!";
    public static final String LIMIT_MSG="Limit";


    /**
     * 签名类型
     */
    public abstract class SIGNATURE_TYPE {
        public static final String MALL_SHOP_SIGN="【上海摩购】";//摩店
        public static final  String MALL_LIFE_SIGN="【容易逛】";//容易逛
    }




    public abstract class SMSCHANNEL_TYPE {
        public static final String JIANZHOU="jianzhou";//建周
        public static final  String CHUANGSHI="chuangshi";//创世华信
        public static final  String WEILAI="weilai";//福建未来无线信息技术有限公司
    }







    //产品名称
    public abstract class PRODUCT_TYPE {
        public static final int MALL_SHOP=1;//摩店
        public static final  int MALL_LIFE=2;//容易逛(目前包括微商城)
        public static final  int TOB_NOTICE=3;//ToB_业务 通知类
        public static final  int TOB_MARKETING=4;//ToB_业务 营销
        public static final int ADVERT_EXPEPTION=5;//广告异常短信监控
 

    }



    /**
     * 发送通道
     * 1注册，2找回密码，3登录 4绑定手机 5交易
     */
    public abstract class SEND_MODULE{
        public static final int REGISTER=1;
        public static final int RESET_PWD=2;
        public static final  int LOGIN=3;
        public static final  int BINDING=4;
        public static final  int DEALMSM=5;
        public static final  int TONOTICE=6;//B端通知类短信
        public static final  int TOBMARKTING=7;//B端营销短信
    }

    /**
     * 发送渠道
     * 1创世华信,2建周 22.建周营销.3,未来无线,101云通讯
     */
    public abstract class SEND_CHANNEL{
        public static final  int CHANNEL_CHUANGSHI=1;
        public static final  int CHANNEL_JIANZHOU=2;
        public static final  int CHANNEL_JIANZHOU_MARKET=22;
        public static final  int CHANNEL_WEILAI=3;
        public static final  int CHANNEL_YUNTONGXUN=101;
    }



    //短信发送结果
    public abstract class SEND_REPORT {
        public static final String SUCCESS="Success";//成功
        public static final  String FAILD="Faild";//失败
        public static final  String LIMIT_MSG="Limit";//发送超出限制
    }








}
