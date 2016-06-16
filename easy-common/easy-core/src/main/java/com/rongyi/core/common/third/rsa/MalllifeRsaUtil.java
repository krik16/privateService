package com.rongyi.core.common.third.rsa;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/9/17
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/17              1.0            创建文件
 *
 */


import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.util.Base64Helper;
import com.rongyi.core.util.EasyMd5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  对第三方提供加密解决公具类
 * time:  2015/9/17
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/17              1.0            创建文件
 *
 */
public class MalllifeRsaUtil {

    protected static  Logger logger = LoggerFactory.getLogger(MalllifeRsaUtil.class);


    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;

    /**
     * 解密
     * @param str 加密串
     * @param privateKey 解密 私钥匙
     * @return
     */
    public static String decryptStr(String str, String privateKey)throws ThirdException {
        logger.info("====解密===");
        try {
            byte[] decodedData = decryptByPrivateKey(new BASE64Decoder().decodeBuffer(str.trim()), privateKey);
            str = new String(decodedData,"utf-8");
        }catch (Exception e){
            logger.info("====解密失败===");
            throw new ThirdException("解码失败");
        }
        return str;
    }

    /**
     * 分组加密
     * @param encryptedData
     * @param privateKey
     * @return
     * @autor yuzhijian
     * @throws Exception
     */
    public static byte[] decryptByPrivateKey(byte[] encryptedData, String privateKey)
            throws Exception {
        byte[] keyBytes = Base64Helper.decode(privateKey);
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key privateK = keyFactory.generatePrivate(pkcs8KeySpec);
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, privateK);
        int inputLen = encryptedData.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(encryptedData, offSet, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(encryptedData, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        return decryptedData;
    }

    /**
     * 加密
     * @param str 加密前数据
     * @param publicKey 加密公钥
     * @return
     * @throws ThirdException
     */
    public static String encryptionStr(String str, String publicKey)throws ThirdException{
        logger.info("====加密===");
        try {
            //byte[] encodeUserName = RsaHelper.encryptByPublicKey(str.getBytes(), publicKey);
            byte[] encodeUserName =  encryptByPublicKey(str.getBytes("utf-8"), publicKey);
            str= Base64Helper.encode(encodeUserName);

        }catch (Exception e){
            e.printStackTrace();
            logger.info("====加密失败===");
            throw new ThirdException("加密失败");
        }
        return str;
    }


    public static byte[] encryptByPublicKey(byte[] data, String publicKey)
            throws Exception {
        byte[] keyBytes = Base64Helper.decode(publicKey);
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(KEY_ALGORITHM);
        Key publicK = keyFactory.generatePublic(x509KeySpec);
        // 对数据加密
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, publicK);
        int inputLen = data.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offSet = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offSet > 0) {
            if (inputLen - offSet > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data, offSet, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data, offSet, inputLen - offSet);
            }
            out.write(cache, 0, cache.length);
            i++;
            offSet = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        return encryptedData;
    }



    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";
    private static final String PUBLIC_KEY = "RSAPublicKey";
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    public static String getPublicKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY);
        byte[] publicKey = key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }
    public static String getPrivateKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        byte[] privateKey =key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }

    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }
    /**
     * 生成 公私钥匙
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static Map<String, Object> initKey() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        Map<String, Object> keyMap = new HashMap<String, Object>(2);
        keyMap.put(PUBLIC_KEY, publicKey);
        keyMap.put(PRIVATE_KEY, privateKey);
        return keyMap;
    }


    public static Map<String, String> getString(){

        Map<String, String> returnMap = new HashMap<String, String>();

        try {
            Map<String, Object> keyMap;
            keyMap = initKey();
            String publicKey = getPublicKey(keyMap);
            String privateKey = getPrivateKey(keyMap);
            //System.out.println("publicKey=" + publicKey);
           // System.out.println("privateKey=" + privateKey);
            returnMap.put("publicKey",publicKey);
            returnMap.put("privateKey",privateKey);
             String uuid= UUID.randomUUID().toString();
            uuid="RONGYISMS"+uuid+System.currentTimeMillis();
            returnMap.put("rongyitoken",EasyMd5Util.GetMD5Code(uuid).toUpperCase());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnMap;

    }

    public static void main(String  ...args) {

        try {
            Map<String, Object> keyMap;
            try {

                //生成 公钥 私钥
                 keyMap = initKey();
                String publicKey =  getPublicKey(keyMap);
                String privateKey =  getPrivateKey(keyMap);
                System.out.println("publicKey="+publicKey);
                System.out.println("privateKey="+privateKey);


                String jsonStr="{'phone':'15821659415','passWd':'111111','uuid':'尊敬的顾客，恭喜您获得XX一份，请于活动截止日前至工作人员处领取，南国西汇城市广场感谢您的积极参与！【容易网】','regiTime':'1442838385146','couponId',:'couponId'}";
                //jsonStr="{'phone':'15821659415',";
                System.out.println("加密前="+jsonStr);
                String encryStr=  MalllifeRsaUtil.encryptionStr(jsonStr,publicKey);
                System.out.println("加密后="+encryStr);
                String decryStr=MalllifeRsaUtil.decryptStr(encryStr,privateKey);
                System.out.println("解密后="+decryStr);


                //全民财富
                /*
                String jsonStr="{'phone':'15821659415','passWd':'111111','uuid':'1111','regiTime':'1442838385146'}";
                System.out.println("加密前="+jsonStr);
                String encryStr=  MalllifeRsaUtil.encryptionStr(jsonStr,MallLifeThirdConfig.THIRD_RSACODER.PUBLIC_KEY_STR);
                System.out.println("加密后="+encryStr);
                String decryStr=MalllifeRsaUtil.decryptStr(encryStr, MallLifeThirdConfig.THIRD_RSACODER.PRIVATE_KEY_STR);
                System.out.println("解密后="+decryStr);
                */

                //ToB 业务
                /*String jsonStr="{'phone':'15821659415','passWd':'111111','uuid':'尊敬的顾客，恭喜您获得XX一份，请于活动截止日前至工作人员处领取，南国西汇城市广场感谢您的积极参与！【容易网】','regiTime':'1442838385146','couponId',:'couponId'}";
                  jsonStr="{'phone':'15821659415',";
                System.out.println("加密前="+jsonStr);
                String encryStr=  MalllifeRsaUtil.encryptionStr(jsonStr,SmsEnum.getName(MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL + "_PUBLICKEY"));
                System.out.println("加密后="+encryStr);
                String decryStr=MalllifeRsaUtil.decryptStr(encryStr,SmsEnum.getName(MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL + "_PRIVATEKEY"));
                System.out.println("解密后="+decryStr);
                 */




            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {

        }
    }



}
