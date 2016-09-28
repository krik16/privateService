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
}
