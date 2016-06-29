package com.rongyi.core.common.third.malllife;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  第三方对接参数
 * time:  2015/9/16
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/9/16              1.0            创建文件
 *
 */

import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.common.third.rsa.MalllifeRsaUtil;
import com.rongyi.core.common.third.sms.SmsEnum;

public class MallLifeThirdConfig {


    /**
     * 第三方公钥私钥 参数 (仅供全民财富使用)
     */
    public abstract class THIRD_RSACODER{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCEinizGfKxLiFNlnjOBiEffFmCuPD+FKQif0HRjTI0507s9f7/BnK1BZY12OJt6JhYBcDhN7Z4f08MZs9oicd3NBvM5UkgfO0tUJWPjGuhffSUfmsqHaI99mctCCf6Zs91AMCKOBf2DI2cE9bOuCmlMWrpAlPmWWzPLvB8r2RMJwIDAQAB";
        public static final String PRIVATE_KEY_STR = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAISKeLMZ8rEuIU2WeM4GIR98WYK48P4UpCJ/QdGNMjTnTuz1/v8GcrUFljXY4m3omFgFwOE3tnh/Twxmz2iJx3c0G8zlSSB87S1QlY+Ma6F99JR+ayodoj32Zy0IJ/pmz3UAwIo4F/YMjZwT1s64KaUxaukCU+ZZbM8u8HyvZEwnAgMBAAECgYBSMRCyeFfg+ita0wItOO3XeaSEhS2lUqWKYwIs8fN9jSeLmO09twDxMvq4f7vCzqeShlbbE1KLnN8nYKYkPLS9V8648PbqI6OTJjVxY4WYvQZSOvf+x6mpmXp6X2AJ1EDM7QhnGrHv1X5rA3uAz44RYoSzdMpY2y2VXtgnjQoKiQJBANJlftG4OPZTBvvk4t4JsdbZq/Th17JSgFnFmszMl1/hxTVf2/tD+HccEiTJMf5LgQxiaxy9uTLeogd59tSzcusCQQChROrPwfEg3I/hEtD+1ywtLiAK78CkanwdBJ5Yi1JFDVadCisifDQcq4srRnP7vnnosApjTfDllYlZy6IcUSS1AkA94sbLz0FKCx/5xdiJcRaTWNGApVF5zVSdk0c2SFOaS2Fjkr+1B8g02NfpZBjFcNYTm3tgJ9oqwVutkU1uQR5jAkEAlug0igDDsKp0AHtpEm8rKYP1/AXp0HDMfyLpQZXtgCxBFmaDgpuS8Bkd+3rL4ZCV50WEEvTGLS/G/T3uDm1n2QJAK2jWxskvXAEvt2EZ19UrJ0EMhDmy0WtuL5JTb37YXrLRPXLpq3fDF3YaYQmU8iXDW+saxCM1tY9HUDDb0uVEkg==";
    }

    /**
     * 全民财富对接参数
     *
     */
    public abstract class QMCAIFU_CHANNEL{
        public static final String CHANNEL="QMCAIFU";//全民财富www.qmcaifu.com
        public static final String TOKEN="631YU17EF8F7D21Z0HI0E36259JI9AN7F371F";
    }


    /**
     * TO_B业务
     * 哈根达斯—老虎机活动
     */
    public abstract class TOB_RSACODER{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOIfpdq2D+IlGxjSWJNIdis8E1xRNxA343wvZOWFMHotO55d973OD8TJBY8YMdI1SLj7B6RanAAxECA54vqTe/h9S95C1HVU1UlZKqTKWltatAK17zEiwZAC99BGRYY+Bz5mWfETa27RlOMHNkblyVF3KxJbJ2XS7BgYMgqFxSxwIDAQAB";                         
        public static final String PRIVATE_KEY_STR = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI4h+l2rYP4iUbGNJYk0h2KzwTXFE3EDfjfC9k5YUwei07nl33vc4PxMkFjxgx0jVIuPsHpFqcADEQIDni+pN7+H1L3kLUdVTVSVkqpMpaW1q0ArXvMSLBkAL30EZFhj4HPmZZ8RNrbtGU4wc2RuXJUXcrElsnZdLsGBgyCoXFLHAgMBAAECgYBnmuUBupctKJ8cKaMe7Kdzj0xbgZi2XLF4vCkG2uNLQanMbIAHre5iev0NmJ7WcpaCVO9zcaxXRuTy7ug0HcmAO8HikL2HzV1l2nYwoQagoEvr/rBG7Mc2Ov4Wk4tAScmARo7U99pPZfZDUUTjzQHRJJ/D057vZvQOdWt5fiNhQQJBAOrqFaSKbMjO/TrDeqnSQzmDDSULGXfnn+XQFvGc6s7nMPJIJWYmvCfFnzJyzkyBC7d3GFAbZ56eXwKrZUIqCm8CQQCa4++BomwOeEd+U770pc4CbIL2viNl7s1U0xjl58vIqml446VRNcuRs7/ByjMicvblPYH3YOVtwaKZoFP3SUkpAkA91d5akIFwHmQz6q7IMuu1INT98j0C/fpuAOd5NAfu7JZKwEjv6bRPd8qe+e9p3fIamgPRWlVdQGzcBAfEcdKLAkBrOaofSwqVBc0wddc20+WGpgoPuFcXBLcepriQx+O6OcakSquySZRwfEgeZtT5Xy7uSaNEVs7dKXRf967I/PHpAkBsv8SUC63K/gwiRfeJLtwZofXPa3kGzv/zfGdkZsBC4SN9M5VKi9UvJac1638VWoPsYfO9Nik5mhu0mYHhOej6";
    }

    /**
     * TO_B业务
     * 哈根达斯—老虎机活动
     */
    public abstract class TOB_CHANNEL{
        public static final String CHANNEL="HGDSLHJ";//哈根达斯—老虎机活动
        public static final String TOKEN="ec037d3911591c55b84b8e0918890989";
    }
    /**
     * TO_B业务
     * 微信-翻盘购
     */
    public abstract class TOB_WECHAT_CHANNEL{
        public static final String CHANNEL="WECHATFPG";//微信-翻盘购
        public static final String TOKEN="we037d3911591c55b84b8e09188909yu";
    }


    /**
     * 短信接口公钥
     */
    public abstract class TOB_SMS_RSACODER{
        public static final String PUBLIC_KEY_STR = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOIfpdq2D+IlGxjSWJNIdis8E1xRNxA343wvZOWFMHotO55d973OD8TJBY8YMdI1SLj7B6RanAAxECA54vqTe/h9S95C1HVU1UlZKqTKWltatAK17zEiwZAC99BGRYY+Bz5mWfETa27RlOMHNkblyVF3KxJbJ2XS7BgYMgqFxSxwIDAQAB";
        public static final String PRIVATE_KEY_STR = "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAI4h+l2rYP4iUbGNJYk0h2KzwTXFE3EDfjfC9k5YUwei07nl33vc4PxMkFjxgx0jVIuPsHpFqcADEQIDni+pN7+H1L3kLUdVTVSVkqpMpaW1q0ArXvMSLBkAL30EZFhj4HPmZZ8RNrbtGU4wc2RuXJUXcrElsnZdLsGBgyCoXFLHAgMBAAECgYBnmuUBupctKJ8cKaMe7Kdzj0xbgZi2XLF4vCkG2uNLQanMbIAHre5iev0NmJ7WcpaCVO9zcaxXRuTy7ug0HcmAO8HikL2HzV1l2nYwoQagoEvr/rBG7Mc2Ov4Wk4tAScmARo7U99pPZfZDUUTjzQHRJJ/D057vZvQOdWt5fiNhQQJBAOrqFaSKbMjO/TrDeqnSQzmDDSULGXfnn+XQFvGc6s7nMPJIJWYmvCfFnzJyzkyBC7d3GFAbZ56eXwKrZUIqCm8CQQCa4++BomwOeEd+U770pc4CbIL2viNl7s1U0xjl58vIqml446VRNcuRs7/ByjMicvblPYH3YOVtwaKZoFP3SUkpAkA91d5akIFwHmQz6q7IMuu1INT98j0C/fpuAOd5NAfu7JZKwEjv6bRPd8qe+e9p3fIamgPRWlVdQGzcBAfEcdKLAkBrOaofSwqVBc0wddc20+WGpgoPuFcXBLcepriQx+O6OcakSquySZRwfEgeZtT5Xy7uSaNEVs7dKXRf967I/PHpAkBsv8SUC63K/gwiRfeJLtwZofXPa3kGzv/zfGdkZsBC4SN9M5VKi9UvJac1638VWoPsYfO9Nik5mhu0mYHhOej6";
    }


    public abstract class TOB_SMS_CHANNEL{
        public static final String NC_CHANNEL="RYNTCSMS";//通知
        public static final String MARK_CHANNEL="RYMARKSMS";//营销
    }





    public  static void main(String args[]){

        try {

            long times=System.currentTimeMillis();

            String publicKey="";
            String tokenStr="";
            String channelStr="";
            String sendType="";


            // String jsonStr="{'phone':'15821659415','passWd':'111111','uuid':'testId','regiTime':'"+times+"','couponId':'111'}";
            String jsonStr="";
            //jsonStr="{'openId':'15821659415'}";
            //jsonStr="{'phone':'15821659415','msgStr':'你的验证码为778899【容易网】','sendType':2}";
            jsonStr="{'phone':'15821659415','msgStr':'【梅溪新天地】您在测试商场兑换的“测试礼品”一份，兑换码：12345678，已核销成功','sendType':1}";
            //jsonStr="{'phone':'15821659415','passWd':'111111','sendType':1,'msgStr':'【容易网】尊敬的顾客，恭喜您获得XXX一份，请于活动截止日前至工作人员处领取，南国西汇城市广场感谢您的积极参与！'}";


          /*  System.out.println("PUBLICKEY===="+SmsEnum.getName(MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL + "_PUBLICKEY"));
            String  data=  MalllifeRsaUtil.encryptionStr(jsonStr, SmsEnum.getName(MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL + "_PUBLICKEY"));
            String str="data="+data+"&timeStamp="+times+"&channel="+MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL+"&token="+SmsEnum.getName(MallLifeThirdConfig.TOB_SMS_CHANNEL.NC_CHANNEL + "_TOKEN");
            String md5Sign= Md5Util.GetMD5Code(str);
            System.out.println("data=" + data);
            System.out.println("md5Sign="+md5Sign);
            System.out.println("times=" + times);*/


            //步步高
               publicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDqjVndmCKne9qd6SxHG6muvWVi5HO/wiRmwTirQocA9qxbJuANRAP9rIN112g+20+lMti00+gMPjGqmp/iz49I8fLVV7MOxW7rG3OdlvBZGVK8PDz08dOg/qWLy2tcgT8mbzq3If0pjqLU192WZrezyaDbfzWtCuG11qfA+LjH+QIDAQAB";
              tokenStr="E7723AE90732C4ACC914F24A82293638";
              channelStr="BUBUGAONTC";
              sendType="1";
            //PHP平台
           /* publicKey="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDqjVndmCKne9qd6SxHG6muvWVi5HO/wiRmwTirQocA9qxbJuANRAP9rIN112g+20+lMti00+gMPjGqmp/iz49I8fLVV7MOxW7rG3OdlvBZGVK8PDz08dOg/qWLy2tcgT8mbzq3If0pjqLU192WZrezyaDbfzWtCuG11qfA+LjH+QIDAQAB";
            tokenStr="E7723AE90732C4ACC914F24A82293638";
            channelStr="PHPPLATNTC";
            sendType="1";*/





            String  data=  MalllifeRsaUtil.encryptionStr(jsonStr,publicKey);
            String str="data="+data+"&timeStamp="+times+"&channel="+channelStr+"&token="+tokenStr;

            String md5Sign= Md5Util.GetMD5Code(str);
           /* System.out.println("data=" + data);
            System.out.println("md5Sign="+md5Sign);
            System.out.println("times=" + times);*/


            System.out.println("{\n" +
                    "\"data\":\""+data+"\",\n" +
                    "\"timeStamp\":\""+times+"\",\n" +
                    "\"sign\":\""+md5Sign+"\",\n" +
                    "\"channel\":\""+channelStr+"\",\n" +
                    "\"sendType\":"+sendType+"\n" +
                    "}");


        }catch (Exception e){
            e.printStackTrace();

        }



    }
}
