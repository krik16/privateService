package com.rongyi.core.common.third.md5;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    // 获得MD5摘要算法的 MessageDigest 对象
    private static MessageDigest _mdInst = null;
    private static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static MessageDigest getMdInst() {
        if (_mdInst == null) {
            try {
                _mdInst = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return _mdInst;
    }

    public static String encode(String s) {
        try {
            byte[] btInput = s.getBytes();
            // 使用指定的字节更新摘要
            getMdInst().update(btInput);
            // 获得密文
            byte[] md = getMdInst().digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 重载默认编码
     *
     * @param s
     * @param charset
     * @return
     */
    public static String encode(String s, Charset charset) {
        try {
            byte[] btInput = s.getBytes(charset);
            // 使用指定的字节更新摘要
            getMdInst().update(btInput);
            // 获得密文
            byte[] md = getMdInst().digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] arg) {
//        String s = "channeld=21,appKey=0000000100000153a76b48910000000d,orderId=080943506176163559,count=1,couponType=6004,timeStamp=1470731769977";
//        System.out.println("默认："+encode(s).toUpperCase());
//
//        System.out.println("UTF-8："+encode(s,Charset.forName("UTF-8")).toUpperCase());
//
//        System.out.println("GBK："+encode(s,Charset.forName("gb2312")).toUpperCase());
    }
}
