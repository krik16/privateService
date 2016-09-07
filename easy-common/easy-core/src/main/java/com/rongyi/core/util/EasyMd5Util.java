package com.rongyi.core.util;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:   32位MD5加密算法
 * time:  2015/10/30
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/30              1.0            创建文件
 *
 */
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class EasyMd5Util {

    // 全局数组
    private final static String[] strDigits = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    public EasyMd5Util() {
    }

    // 返回形式为数字跟字符串
    private static String byteToArrayString(byte bByte) {
        int iRet = bByte;
        // System.out.println("iRet="+iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        int iD1 = iRet / 16;
        int iD2 = iRet % 16;
        return strDigits[iD1] + strDigits[iD2];
    }

    // 返回形式只为数字
    @SuppressWarnings("unused")
	private static String byteToNum(byte bByte) {
        int iRet = bByte;
        System.out.println("iRet1=" + iRet);
        if (iRet < 0) {
            iRet += 256;
        }
        return String.valueOf(iRet);
    }

    // 转换字节数组为16进制字串
    private static String byteToString(byte[] bByte) {
        StringBuffer sBuffer = new StringBuffer();
        for (int i = 0; i < bByte.length; i++) {
            sBuffer.append(byteToArrayString(bByte[i]));
        }
        return sBuffer.toString();
    }

    public static String GetMD5Code(String strObj) {
        String resultString = null;
        try {
            resultString = new String(strObj);
            MessageDigest md = MessageDigest.getInstance("MD5");
            // md.digest() 该函数返回值为存放哈希值结果的byte数组
            resultString = byteToString(md.digest(strObj.getBytes()));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return resultString;
    }

//    public static void main(String[] args) {
//        EasyMd5Util getMD5 = new EasyMd5Util();
//        System.out.println(getMD5.GetMD5Code("1111111"));


    //MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAKOO1N34y6XI7thXks8oIKi+C3UirdE1jpPCni+8I1h66XU6IYWn/om+es2T5jx7BaWM5QQ2V5mUYk0Lxs0yGmfKh7J8I49qx3NkCGVAWN5zxQbQj6xljwRPQbwC60cziNtbZOCTLzMl5AVwwiqxYqcV4IGAkwdVX/UrXII3Lf53AgMBAAECgYBL6bVfOWS8E+DXxP287LEL4PlMasYmPido6YGmQjpdjN7irBJ3CJwZrrEszaKlG6xpRFXfeKF8BOUDQZ4KC2E5XV1mV0DiuMfSSuaGnx/zrAYVy5M1EHNANfeZa4Fsj+Ni0GZmVL6Igv1G7XbWgUUYqIfxH10VFD2KvSaF4doHoQJBAPrfHhl7POwN6XbBbi9+yD3+TdRzEMYYJ+APbJcSiwS/bxJuk2OUwOkLbAHS4QxyNeseTjei41KTWqRXCPhkyA8CQQCm5sbgVTBC4cZ/6XMjclOlx4PmK8j9CBD9qlQbr1PUTDPqfWx77gYpm9YF1jmRletfGfucK9ctjDIUA3qOFTsZAkEAlHKKYRGnjxb8WyVCiiA/ZU+hxmEAP/fzQIZf/1UdpgWROBruZDKVpFD57GpYeQDsHuCj8BAW67n+HNjTmggoyQJAXfecjP0peN5oxeeH3bMmiTW1e0e3l06NUmQtipDB38svh5wqEfRHH/IPI6YjL2Z66EZWtOyx74D5SO9Udt5ZMQJBAMGso5TGEJw4vzocK/AiqywrqWl9PBn37gJlXQVE0c9Qz/MK8qLVexHO6xmldTxn2PDLLDCVtKQtYj4FpKDEjY0=
//    }
}
