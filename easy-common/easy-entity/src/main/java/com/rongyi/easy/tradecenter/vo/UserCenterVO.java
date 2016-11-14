package com.rongyi.easy.tradecenter.vo;

import java.io.Serializable;

/**
 * 统一用户（微信）
 *
 * @author wangjh7
 * @date 2016-11-14
 */
public class UserCenterVO implements Serializable {
    // 用户ID
    private String userId;
    // 用户名称
    private String userName;
    // 用户手机
    private String userPhone;
    // 微信Id
    private String openId;
    // 用户等级
    private int level;
    // 积分
    private int creditNumber;
}
