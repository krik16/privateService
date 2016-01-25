package com.rongyi.easy.huanxin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/4/23
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/4/23              1.0            创建文件
 *
 */
public class HuanXinConfig {



    /**
     * 环信IM相关常量
     * @author user
     *
     */

    public static abstract class HuanXinIM {

        /** 企业的唯一标识,开发者在环信开发者管理后台注册账号时填写的企业ID*/
        public static final String ORG_NAME = "rongyiwang-app";

        /** 同一”企业”下”app”唯一标识,开发者在环信开发者管理后台创建应用时填写的”应用名称” */
        public static final  String APP_NAME = "mallshop";

        /** app的client_id*/
        public static final  String CLIENT_ID = "YXA6pRWlIB40EeWKURM9hvIx6w";

        /** app的client_secret*/
        public static final  String CLIENT_SECRET = "YXA6vluMZMRELS8dbtQQaPu8utAWj5g";       

        /** 请求注册URL*/
        public static final String HUANXIN_REQUEST_URL = "https://a1.easemob.com/" + ORG_NAME + "/" + APP_NAME ;
        
        /**
         * 验码成功发送弹窗账号
         */
        /** 同一”企业”下”app”唯一标识,开发者在环信开发者管理后台创建应用时填写的”应用名称” */
        public static final  String APP_NAME1 = "evaluationmsg";

        /** app的client_id*/
        public static final  String CLIENT_ID1 = "YXA64_rY4EbpEeWRKEOxc0jZWQ";

        /** app的client_secret*/
        public static final  String CLIENT_SECRET1 = "YXA6I-nL_PCXOy8sF2yoCN2AvsuAdE0";
        
        /** 请求注册URL*/
        public static final String HUANXIN_REQUEST_URL1 = "https://a1.easemob.com/" + ORG_NAME+ "/" + APP_NAME1 ;
        
        

        /** 请求注册URL 后缀*/
        public static final String REGISTE_URL_SUFFIX = "/users";

        /**  请求修改密码URL 后缀*/
        public static final String RESETPW_URL_SUFFIX = "/password";

        /** 请求tokenURL 后缀*/
        public static final String TOKEN_URL_SUFFIX = "/token";

        /** 请求注册URL Request Headers key*/
        public static final String REQUEST_HEADERS_KEY = "Authorization";

        /** 请求注册URL Request Headers value*/
        public static final String REQUEST_HEADERS_VALUE = "Bearer ";

        /** 请求类型 1为注册 */
        public static final Integer REGISTE_TYPE = 1;

        /** 请求类型2为重置密码 */
        public static final  Integer RESETPWD_TYPE = 2;

        /** 请求类型3为重置昵称 */
        public static final   Integer RESETNICKNAME_TYPE = 3;

        public static final   String  SEND_MESSAGES = "/messages";

        /**
         * 查看用户在线状态
         */
        public static final   String ONLINE_STATUS_URL="status";


    }


    /**
     * 环信生成账号参数配置
     */
    public static abstract class HuanXinIdPamer {

        public static final String MALLLIFE_HUANXIN_USERID="mallife_huanxin_imID";
        public static final String MALLSHOP_HUANXIN_USERID="mallshop_huanxin_imID";

        public static final int INIT_HUANXIN_IM_NUM=500;//初始账号个数
        public static final int INIT_HUANXIN_IM_FAZHI=100;//初始账号阀值

        public static final int MALLSHOP_INIT_HUANXIN_IM_NUM=100;//摩店初始账号个数
        public static final int MALLSHOP_INIT_HUANXIN_IM_FAZHI=50;//摩店初始账号阀值



    }





    public static final String IM_MALLSHOP_USERCODE = "1001";//环信生成账号前缀
    public static final String IM_MALLLIFE_USERCODE = "1002";//环信生成账号前缀


    public  static final String IMCODE_FIRST="RONGYI";
    public  static final String IMCODE_SECOND="MAILLIFE";


    /**
     * 生成 摩生活 环信账号
     * @return
     */
    public static String generationMalllife(){
        return HuanXinConfig.IM_MALLLIFE_USERCODE+HuanXinConfig.getYearRandomStr()+HuanXinConfig.getRandomStr();
    }

    /**
     * 生成 摩店 环信账号
     * @return
     */
    public static String generationMallshop(){
        return HuanXinConfig.IM_MALLSHOP_USERCODE+HuanXinConfig.getYearRandomStr()+HuanXinConfig.getRandomStr();
    }




    /**
     * 根据年月日时分秒获取随机数
     * @return
     */
    public static String getYearRandomStr() {
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        Random random = new Random();
        int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        return rannum + str;// 当前时间+5位随机数
    }


    /**
     * 生成5位随机数
     * @return
     */
    public static String getRandomStr() {
        Random random = new Random();
        Integer rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        return rannum.toString() ;
    }




    public static void main(String args[]){

        String huanXinIMID= HuanXinConfig.IM_MALLSHOP_USERCODE+HuanXinConfig.getYearRandomStr()+HuanXinConfig.getRandomStr();
        System.out.println(huanXinIMID);


    }

}
