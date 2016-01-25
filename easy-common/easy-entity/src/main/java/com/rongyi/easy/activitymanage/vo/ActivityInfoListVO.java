package com.rongyi.easy.activitymanage.vo;

import com.rongyi.easy.activitymanage.entity.ActivityGoodsRule;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.activitymanage.vo easy-api :author lijing
 * User:lijing
 * DATE : 2016/1/25
 * TIME : 16:41
 * easy-api.
 */
public class ActivityInfoListVO implements Serializable {
    /**活动id*/
    private Integer id;

    private String name;

    private Date startAt;

    private Date endAt;

    private Integer type;

    private String synTarget;

    private Integer status;

    private Integer publishChannel;

    private String createUser;

    private Date createAt;

    private String updateUser;

    private Date updateAt;

    private ActivityGoodsRule activityGoodsRule;
}
