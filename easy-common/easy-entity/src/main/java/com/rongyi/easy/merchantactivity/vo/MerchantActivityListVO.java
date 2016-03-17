package com.rongyi.easy.merchantactivity.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * create by com.rongyi.easy.merchantactivity.vo ideaworkspace :author lijing
 * 商家活动模版列表
 * User:lijing
 * DATE : 2016/3/17
 * TIME : 13:48
 * ideaworkspace.
 */
public class MerchantActivityListVO implements Serializable {
    /**活动id*/
    private Integer id;
    /**活动名称*/
    private String name;
    /**活动开始时间*/
    private Date startAt;
    /**活动结束时间*/
    private Date endAt;
    /**活动类型 0.商品类活动，1卡券类活动，2.抽奖类活动 3.卡券及商品类活动，4.签到送积分，5，特卖'*/
    private Integer type;
    /**发布终端:[1,1,1,1]表示容易逛、终端屏、微信、微商端全部选中[1,0,0,0]表示第一个选中*/
    private String synTarget;
    private Date enrollStartAt;//报名开始时间
    private Date enrollEndAt;//报名结束时间
    /**活动状态  0.待审核
     1.不通过
     2.未开始
     3.进行中
     4.已结束
     5 强下线
     6 申请撤销中
     */
    private Integer status;
    /**创建人*/
    private String createUser;
    /**创建时间*/
    private Date createAt;
    /**修改人*/
    private String updateUser;
    /**修改时间*/
    private Date updateAt;
    /**待审核商品个数*/
    private Integer pendGoods;
    
    private Integer revokeGoods;
    /**模版类型*/
    private Integer activityType;
    /**报名商品总数*/
    private Integer goodsTotal;
    /**
     * 通过报名的商品
     */
    private Integer passGoods;
    /**
     * 是否自营
     */
    private Integer isAuto = 1;


}
