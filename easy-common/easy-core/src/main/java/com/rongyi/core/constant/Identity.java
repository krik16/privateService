package com.rongyi.core.constant;

/**
 * 身份类型
 * Created by liulei on 2016/2/29.
 */
public interface Identity {
    //-2运营、-1定时任务、0集团管理员、1商场管理员、2品牌管理员、3分公司、4店长、5导购、6买手
    /** 身份类型：运营 **/
    int OPERATOR = -2;
    /** 身份类型：定时任务 **/
    int TIMED_TASK = -1;
    /** 身份类型：集团管理员 **/
    int GROUP = 0;
    /** 身份类型：商场管理员 **/
    int MALL = 1;
    /** 身份类型：品牌管理员 **/
    int BRAND = 2;
    /** 身份类型：分公司 **/
    int FILIALE = 3;
    /** 身份类型：店长 **/
    int SHOP = 4;
    /** 身份类型：导购 **/
    int SHOPPERS = 5;
    /** 身份类型：买手 **/
    int BUYER = 6;
}
