package com.rongyi.easy.malllife.config;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  随机码生成工具类
 * time:  2015/12/28
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/12/28              1.0            创建文件
 *
 */

import java.util.Random;

public class RandomCodeUtil {


    /*去掉容易引起误解的 0，o 1 l,i,*/
    private static final char[] rongyi_char=new char[]{'v', 'y','r', 't', 'n', '6', 'b', 'g', 'h','q', 'w', 'e', '8', 'a', 's', '2', 'd', 'z', 'x', '9', 'c', '7', 'p', '5', 'k', '3', 'm', 'j', 'u', 'f', '4'};

    /*去掉容易引起误解的  0，1*/
    private static final char[] rongyi_num=new char[]{'2', '4', '7', '3', '5', '9', '6', '8'};

    /** 进制长度 */
    private static final int binLen=rongyi_char.length;

    /** 进制长度 */
    private static final int numLen=rongyi_num.length;


    /**
     * 随机码
     * @param randnum 摩店用户ID
     * @param random_size 生成码的长度
     * @return 随机码
     */
    public static String toRandomCode(String randnum,int random_size) {
         String str="";
        if(randnum.length() < random_size) {
            StringBuilder sb=new StringBuilder();
            Random rnd=new Random();
            sb.append(rongyi_num[rnd.nextInt(numLen)]);

            for(int i=1; i < random_size - randnum.length(); i++) {
                sb.append(rongyi_char[rnd.nextInt(binLen)]);
            }
            str+=sb.toString()+randnum;
        }
        return str.toUpperCase();
    }

    public static long codeToId(String code) {
        char chs[]=code.toCharArray();
        long res=0L;
        for(int i=0; i < chs.length; i++) {
            int ind=0;
            for(int j=0; j < binLen; j++) {
                if(chs[i] == rongyi_char[j]) {
                    ind=j;
                    break;
                }
            }
           /* if(chs[i] == rongyi) {
                break;
            }*/
            if(i > 0) {
                res=res * binLen + ind;
            } else {
                res=ind;
            }
        }
        return res;
    }

    public static void main(String args[]){


        System.out.println(RandomCodeUtil.toRandomCode("9415", 8));
        System.out.println(RandomCodeUtil.toRandomCode("9415", 8));
        System.out.println(RandomCodeUtil.toRandomCode("9415", 8));

    }



}
