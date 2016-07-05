package com.rongyi.easy.malllife.config;

import com.rongyi.easy.integral.constant.SourceType;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  maillLife 系统配置
 * time:  2015/6/2
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/2              1.0            创建文件
 *
 */
public class SystemConfig implements Serializable{


    //

    public static final  String  USER_DISABLED_MSG="抱歉，卖家休息中，请您换个卖家看看吧~";

    public static final  String  SMS_KEY="SMSKEY";

    public static final String TOUCH_KEY="touchConfig";
    /**
     *
     */
    public abstract class RSACODER_KEY{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDYOECUiOrN7TaaBP/q0nu4EwisCvF1T+3ZcfYq91DgrKVfeQjLiJBOsgmNS5JIy8lv83ryFixpYZ19xE+RuvHlw4c2ztLKP3ZAb0HfkLqyJ+kAVD1CJjb+s+RoOJFruEoTdO7VXZsoLC0vQqbhTe8Peskz/RqLPyWlDoD+gxP0UQIDAQAB";
        public static final String PRIVATE_KEY_STR = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBANg4QJSI6s3tNpoE/+rSe7gTCKwK8XVP7dlx9ir3UOCspV95CMuIkE6yCY1LkkjLyW/zevIWLGlhnX3ET5G68eXDhzbO0so/dkBvQd+QurIn6QBUPUImNv6z5Gg4kWu4ShN07tVdmygsLS9CpuFN7w96yTP9Gos/JaUOgP6DE/RRAgMBAAECgYA76QJD5dghrPu3G3GJsD6ll2iMuw+CcN43pPMPnq1jQ5Mi7Bd6xeEuXPh2lRz4XLb49R742xn9LRYFVhKyD3mcrI4+H786YAR3AHeEclSk7ze/O7CHyGP5ok507mRyxGDP5Lo+qHbgrEcuY+uLwQlbI5QC7MNhSA3UjzrLvrCeAQJBAP8DgNuiRR4+voNibtCpNqIbJj0ujSxGUhZgLKyil33erJZox1csT+u7LAoR0VUcSt/7rs8cVT5TXjP7FVwDUOECQQDZDlZ+n/XoZ8cZhyXWV2Oko+eo9TKS47ChEWAXB43a3w4zhEXl/JS8VoM9oVFghj5Eymlh1wwDoBD1EGSK+GFxAkAsAEK/ouQiL9lXeih8wHW4ys5ySBH7zbZkPfv3XaaeBUnqOfILTI4NsqIKqsBf2x3gP+ENw2nB80iR14T792aBAkEAv4poh5tPHMSfrQZXPHunob1GDBI8i+VDlA9KNWhkJRYbaRi7ugWXl0/cxsEZl80/G+Nm9YEYyAYzkJ7jqsMe8QJAVSbvDllgxsD9sG9SzfHBEG98IZiDGaQjBwS8upKz12m+L/zBpOJ7LeVButBeE4fsBnapziB1q+6gPHCghP7qGw==";
    }


    /**  配置网盘路径  **/
    private static final  String UPAIYUN_ADDRESS="http://rongyi.b0.upaiyun.com/";  //整路径

    public static final String THUMBNAIL_PATH = UPAIYUN_ADDRESS+"system/favour/img/";
    public static final String THUMBNAIL_ICONURL = UPAIYUN_ADDRESS+"system/brand/icon/";
    public static final String CA_PATH_PREFIX = UPAIYUN_ADDRESS+"system/app_category/";
    public static final String iconUrl = UPAIYUN_ADDRESS+"system/mall/icon/";
    public static final String UPAIYUN_URL_MALL_APPEARANCE_PIC = UPAIYUN_ADDRESS+"system/mall/appearance_pic/"; // 云盘路径-商场app外景图
    public static final String PicUrl = UPAIYUN_ADDRESS+"system/mall/appearance_pic/";
    public static final String productionIconUrl = UPAIYUN_ADDRESS+"system/production/icon/";
    public static final String shopPicUrl = UPAIYUN_ADDRESS+"system/photo/file/";

    /*URL过滤地址**/
    public static final List<String> urlList = Arrays.asList(new String[]{"1", "/flashsale/saleDetail.htm",
            "/flashsale/saleFlashDetail.htm",
            "/flashsale/flashDetail.htm",
            "/live/liveSearch.htm",
            "/live/liveDetail.htm",
            "/bull/getBullDetail.htm",
            "/sys/msg/getbuyMsgCount.htm",
            "/commodity/getCommodityDetail.htm",
            "/commodity/searchCommodity.htm",
            "/commodity/searchCommodityForMallLife.htm",
            "/shopCart/addShopCart.htm",
            "/cartOrder/getMyOrderDetailForCart.htm",
            "/v5/mall/getMall.htm",
            "/v5/recommend/activity.htm",
            "/v5/home/getArticleInfo.htm",
            "/v5/activity/myCouponDetail.htm",
            "/v5/shop/getShop.htm"
    });

    public static final List<String> uaList = Arrays.asList("Android", "IOS", "H5");


    public static final List<String> mdUaList = Arrays.asList("Android", "IOS");


    public static String buildPictureUrl(String userId, String headImg) {
        String UPAIYUN_Content = "system/user/avatar/";
        StringBuffer pictureUrl = new StringBuffer();
        if (StringUtils.isNotBlank(headImg)) {
            if(headImg.indexOf("/") == -1) {
                pictureUrl.append(UPAIYUN_ADDRESS).append(UPAIYUN_Content).append(userId + "/").append(headImg);
            }else {
                pictureUrl.append(headImg);
            }
        }
        return pictureUrl.toString();
    }



    /**
     * 测试手机号
     * 不做验证了
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(String mobiles){
       // Pattern p = Pattern.compile("^((13[0-9])|(17[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
        Pattern p = Pattern.compile("^1[23456789]\\d{9}$");//只验证11位以1开头的手机号
        Matcher m = p.matcher(mobiles);
//		System.out.println(m.matches()+"---");
        return m.matches();
//		return true;
    }




    public static void main(String args[]){

        SystemConfig systemConfig = new SystemConfig();
        System.out.println("test=="+systemConfig.isMobileNO("19712165941"));

    }


    /**
     * 返回具体日期
     * @param ms
     * @return
     */
    public static  String formatTime(Long ms) {
        Integer ss = 1000;
        Integer mi = ss * 60;
        Integer hh = mi * 60;
        Integer dd = hh * 24;

        Long day = ms / dd;
        Long hour = (ms - day * dd) / hh;
        Long minute = (ms - day * dd - hour * hh) / mi;
        Long second = (ms - day * dd - hour * hh - minute * mi) / ss;
        Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;

        StringBuffer sb = new StringBuffer();
        if(day >= 0) {
            sb.append(day+"天");
        }
        if(hour >= 0) {
            sb.append(hour+"时");
        }
        if(minute >= 0) {
            sb.append(minute+"分");
        }
        /* if(second > 0) {
            sb.append(second+"秒");
        }*/
       /* if(milliSecond > 0) {
            sb.append(milliSecond+"毫秒");
        }*/
        return sb.toString();
    }



    public static String convert(long mill){
        Date date=new Date(mill);
        String strs="";
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            strs=sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strs;
    }


    /**
     * Str 转 Int
     * @param str
     * @return
     */
    public static int stringToInt(String str){
        int temp=0;
        try {
            if(StringUtils.isNotBlank(str)){
                temp=Integer.parseInt(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return temp;
        }

    }

    public static String listToString(List<String> stringList){
        if (stringList==null||stringList.size()<1) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : stringList) {
            if (flag) {
                result.append(",");
            }else {
                flag=true;
            }
            result.append(string);
        }
        return result.toString();
    }

}
