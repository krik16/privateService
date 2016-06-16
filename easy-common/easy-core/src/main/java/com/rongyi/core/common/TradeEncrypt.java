package com.rongyi.core.common;

import com.rongyi.core.Exception.TradeException;
import com.rongyi.core.common.third.exception.ThirdException;
import com.rongyi.core.common.third.rsa.MalllifeRsaUtil;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 交易数据加密公共类
 * kejun
 * 2016/6/16 10:03
 **/
public class TradeEncrypt {


    /**
     * 对需要加密的数据先进行des对称加密后再使用rsa非对称加密(rsa加密算法存在加密数据不能超过加密公钥长度的限制,故先des加密再rsa)
     * @param data 需加密的字符串
     * @param desKey des加密key
     * @param rsaKey rsa 加密key
     * @return 加密过后数据
     * @throws ThirdException
     * @throws UnsupportedEncodingException
     */
    public static String encrypt(String data,String desKey,String rsaKey) throws ThirdException, UnsupportedEncodingException {
        byte[] bytes = DESEncrypt.encrypt(data.getBytes(), desKey);
        if(bytes == null)
            throw new TradeException("des加密失败");
        String desStr = new String(bytes);
        String dataEncrypt = MalllifeRsaUtil.encryptionStr(desStr,rsaKey);
        return  URLEncoder.encode(dataEncrypt, "utf-8");
    }
}
