package com.rongyi.easy.util.new1;

import org.apache.commons.lang.StringUtils;

/**
 * Created by zhoukunkun on 2017/4/11.
 */
public class StringUtil {
    /**
     * 判断mongoId是否合规
     * @author zhoukunkun
     * @param mongoId
     * @return
     */
    public static boolean isMongoId(String mongoId) {
        return StringUtils.isNotBlank(mongoId) && mongoId.matches("[\\da-zA-Z]{24}");
    }

    /**
     * 判断两个字符串是否相等（str1=null||"",str2=null||""时，也返回false）
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equalStrValue(String str1, String str2) {
        return StringUtils.isNotBlank(str1) && StringUtils.isNotBlank(str2) && str1.equalsIgnoreCase(str2);
    }
}
