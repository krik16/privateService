package com.rongyi.core.constant;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/7/11 11:20
 * Package:com.rongyi.core.constant
 * Project:easy-market
 */
public interface MsgCenterConstants {
    //1:注册，2交易，3邀请，4激活
    interface TRIGGER_TYPE{
        byte REGISTE=1;
        byte TRADE=2;
        byte INVITE=3;
        byte ACTIVATE=4;
        byte OLDPUSHNEW=6;
    }
    interface REFUND_MSG_TYPE{
        int REFUND_APPLY=1;// 退款申请
        int EXPIRE_REMIND=2;//到期提醒
        int REFUND_DELIVERY=3;//退款收货
        int DELIVERY_EXPIRE=4;//确认收货到期提醒
        int APPEAL_APPLY=5;//申诉申请
        int DELIVERY_REMIND=6;//收货提醒
    }
    //状态代码 0未推送 1已推送
    interface MSG_STATUS{
        int PUSHED=1;
        int UNPUSHED=0;
    }
    /** 推送对象 0 全部 1卖家 2买家 3指定单用户 4指定商场 5指定店铺 6指定部分用户*/
    interface MSG_TYPE{
        int ALL=0;
        int SALLER=1;
        int BUYER=2;
        int SPECIFIED=3;
        int MALL=4;
        int SHOP=5;
        int PARTUSES=6;
    }
   // 1:系统推送；0：人工推送
    interface PUSH_TYPE{
        int SYSTEM=1;
        int ARTIFICIAL=0;
    }
    /**
     * 关联的类型。0：默认；1：商品类 2 卡券类 3活动类 4退款/维权类
     */
    interface PUSH_RELATED_TYPE{
        int DEFAULT = 0;
        int COMMODITY = 1;
        int COUPON = 2;
        int ACTIVITY = 3;
        int REFUND = 4;
    }
    interface READ_PLATFORM{
        String MER = "1";
        String APP = "2";
        String OPE = "3";
        String MER_APP = "1,2";
        String MER_APP_OPE = "1,2,3";
        String APP_OPE = "2,3";
        String MER_OPE = "1,3";
    }
}
