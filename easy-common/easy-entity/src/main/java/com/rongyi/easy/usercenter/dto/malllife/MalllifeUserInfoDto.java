package com.rongyi.easy.usercenter.dto.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/11/19
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/11/19              1.0            创建文件
 *
 */

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class MalllifeUserInfoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 用户uuid */
    private String id;

    /** 用户名称 */
    private String userName;
    /** 收藏的商品编号 **/
    private Set<String> collectCommoditys;

    /** 手机号 */
    private String phone;

    /** 头像地址 */
    private String headImg;

    /** 微信openid */
    private String openId;

    /** 环信号 */
    private String imId;

    /** 用户呢称 */
    private String nickName;
    /** 用户性别，U未知,M男，F女,默认U */
    private String gender;
    /** 是否领取红包 默认值0 未领取，1已领取 */
    private Integer loginRed;
    /** 百度推送Id */
    private String pushId;
    /** 摩店邀请注册码 */
    private String shareCode;




}
