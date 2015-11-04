package com.rongyi.easy.malllife.config;

import com.rongyi.easy.integral.constant.SourceType;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
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

}
