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

import org.apache.commons.lang.StringUtils;

import java.util.Random;
import java.util.UUID;

public class RandomCodeUtil {


    /*去掉容易引起误解的 0，o 1 l,i,*/
    private static final char[] rongyi_char=new char[]{'v', 'y','r', 't', 'n', '6', 'b', 'g', 'h','q', 'w', 'e', '8', 'a', 's', '2', 'd', 'z', 'x', '9', 'c', '7', 'p', '5', 'k', '3', 'm', 'j', 'u', 'f', '4'};

    /*去掉容易引起误解的  0，1*/
    private static final char[] rongyi_num=new char[]{'2', '4', '7', '3', '5', '9', '6', '8'};

    public static final char[] rongyi_char_num = new char[]   { 'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
            't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z' };

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

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
            sb.append(rongyi_char_num[rnd.nextInt(random_size)]);

             for(int i=1; i < random_size - randnum.length(); i++) {
                sb.append(rongyi_char_num[rnd.nextInt(binLen)]);
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




    public static String toRandomBiGCode(String randnum,int random_size) {
        String str="";
        if(randnum.length() > random_size) {
            StringBuilder sb=new StringBuilder();
            Random rnd=new Random();
            sb.append(rongyi_num[rnd.nextInt(random_size)]);

            for(int i=1; i < random_size-sb.toString().length(); i++) {
                sb.append(rongyi_char[rnd.nextInt(binLen)]);
            }
            str+=sb.toString()+randnum;
        }
        return str.toUpperCase();
    }
    public static void main(String args[]){


       // System.out.println(RandomCodeUtil.generateShortUuid());
       //  System.out.println(RandomCodeUtil.generateShortUuid());
       // System.out.println(RandomCodeUtil.generateShortUuid("6887817c44ae552e351a862289fca380", 8));
       //  System.out.println(RandomCodeUtil.generate24ShortUuid("51f9eb5b31d65584ab00f4c8"));
        //System.out.println(RandomCodeUtil.generate24ShortUuid("51f9eb5b31d65584ab00f4c8"));

        System.out.println(RandomCodeUtil.toSerialCode(1, 8));
        System.out.println(RandomCodeUtil.toSerialCode(1L, 8));

    }





    public static String generateShortUuid(String code,int numLen) {
        StringBuffer shortBuffer = new StringBuffer();
        // UUID.randomUUID().toString().replace("-", "");
        if(StringUtils.isNotBlank(code)){
            System.out.println("1================"+code.length());
            if(code.length()!=24&&code.length()!=32){
                String temp="Y";
                for(int i=1; i < 32-code.length(); i++) {
                    temp+="Y";
                }
                code=code+temp;

            }

        }
        System.out.println("================"+code);
        System.out.println("2================"+code.length());
        String uuid =code;
        for (int i = 0; i < numLen; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();

    }


    /**
     * 32位
     * 生成8位码
     * @return
     */
    public static String generateShortUuid(String code) {
        StringBuffer shortBuffer = new StringBuffer();
      // String uuid= UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = code.substring(i * 4, i * 4 + 4);
           // System.out.println("========"+str);
            int x = Integer.parseInt(str, 16);
           // System.out.println("========"+x);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();

    }


    /**
     *
     * @return
     */
    public static String generate24ShortUuid(String code) {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid=code;// UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 3, i * 3 + 3);
            System.out.println("========"+str);
            int x = Integer.parseInt(str, 16);
            System.out.println("========"+x);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();

    }


    public static String generate10ShortUuid(String code) {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid=code;// UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 3, i * 3 + 3);
            System.out.println("========"+str);
            int x = Integer.parseInt(str, 16);
            System.out.println("========"+x);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();

    }


    /**
     * 根据ID生成六位随机码
     * @param id
     * @param share_size 生成码的长度
     * @return 随机码
     */
    public static String toSerialCode(long id,int share_size) {
        char[] buf=new char[32];
        int charPos=32;
        while((id / binLen) > 0) {
            int ind=(int)(id % binLen);
            buf[--charPos]=rongyi_char[ind];
            id/= binLen;
        }
        buf[--charPos]=rongyi_char[(int)(id % binLen)];
        String str=new String(buf, charPos, (32 - charPos));
        // 不够长度的自动随机补全
        if(str.length() < share_size) {
            StringBuilder sb=new StringBuilder();
            Random rnd=new Random();
            sb.append(rongyi_num[rnd.nextInt(numLen)]);

            for(int i=1; i < share_size - str.length(); i++) {
                sb.append(rongyi_char[rnd.nextInt(binLen)]);
            }
            str+=sb.toString();
        }
        return str;
    }



}
