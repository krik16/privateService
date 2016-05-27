package com.rongyi.rss.sms;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  短信发送
 * time:  2016/4/5
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/4/5              1.0            创建文件
 *
 */

import com.rongyi.core.sms.param.SmsParam;
import com.rongyi.easy.mallshop.MallShopException;

public interface ISmsSendService {

    /**
     * 发送短消息
     * @param smsParam 短信发送参数
     *                 必填参数 phone msgStr productType sendModule
     *                 其中msgStr 发送消息 签名不需要带入 【容易逛】 【上海摩购】
     *                 发送功能会根据productType做签名匹配 ，
     * @return
     * 【1】 Faild  表示 失败
     * 【2】 Success  表示成功
     * 【3】 Limit 表示当前手机号，当天发送超量
     * @throws com.rongyi.easy.mallshop.MallShopException
     */
    public  String sendSmsMessage(SmsParam smsParam) throws MallShopException;


    /**
     * 发送语音
     * 【1】 Faild  表示 失败
     * 【2】 Success  表示成功
     * 【3】 Limit 表示当前手机号，当天发送超量
     * @param smsParam
     * @return
     * @throws MallShopException
     */
    public  String sendYuYINSmsMessage(SmsParam smsParam) throws MallShopException;


    /**
     * 发送B端短信
     * @param smsParam
     * @return
     * @throws MallShopException
     */
    public String sendToBSms(SmsParam smsParam)throws MallShopException;


}
