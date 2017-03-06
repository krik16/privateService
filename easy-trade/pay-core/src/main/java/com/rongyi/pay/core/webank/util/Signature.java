package com.rongyi.pay.core.webank.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.*;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;

import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.AlipayCommonReqData;
import com.rongyi.pay.core.wechat.util.MD5;
import com.rongyi.pay.core.wechat.util.Util;
import com.rongyi.pay.core.wechat.util.XMLParser;
import net.sf.json.JSONObject;
import org.xml.sax.SAXException;

/**
 * 签名算法
 */
public class Signature {

    public static String getWechatSign(Map<String,Object> map,String key){
        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
            if(entry.getValue()!=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        result = MD5.MD5Encode(result).toUpperCase();
        return result;
    }

    /**
     * 生成签名
     * @param obj 参数bean
     * @param key 密钥
     * @return 签名
     */
    public static String getWechatSign(Object obj,String key) {
        Map<String,Object> map = objectToMap(obj);
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != "") {
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String[] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        result = MD5.MD5Encode(result).toUpperCase();
        return result;
    }

    public static String getAlipaySign(Object obj, AlipayCommonReqData reqData, String signTicket) {
        List<String> values = new ArrayList<>();
        Map<String,Object> map = objectToMap(obj);
        JSONObject json = JSONObject.fromObject(map);
        values.add(signTicket);
        values.add(reqData.getAppId());
        values.add(reqData.getNonce());
        values.add(reqData.getVersion());
        values.add(json.toString());
        values.removeAll(Collections.singleton(null));// remove null
        java.util.Collections.sort(values);
        StringBuilder sb = new StringBuilder();
        for (String s : values) {
            sb.append(s);
        }
        try {
            MessageDigest md = MessageDigest.getInstance("sha1");
            md.update(sb.toString().getBytes("UTF-8"));
            String sign = bytesTohex(md.digest());
            return sign;
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_SIGN_FAIL);
        }
    }

    public static String getAlipaySign(List<String> values, String signTicket) {
        if (values == null) {
            throw new NullPointerException("values is null");
        }
        values.removeAll(Collections.singleton(null));// remove null
         values.add(signTicket);
         java.util.Collections.sort(values);
         StringBuilder sb = new StringBuilder();
        for (String s : values) {
            sb.append(s);
        }
        try {
            MessageDigest md = MessageDigest.getInstance("sha1");
            md.update(sb.toString().getBytes("UTF-8"));
            String sign = bytesTohex(md.digest());
            return sign;
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_SIGN_FAIL);
        }
    }

    public static String bytesTohex(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString().toUpperCase();
    }

    public static List<String> objectToList(Object obj) {
        List<String> list = new ArrayList<>();
        if (obj == null) {
            return null;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value != null && value != "") {
                    list.add(field.get(obj).toString());
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_SIGN_FAIL);
        }
        return list;
    }

    /**
     * 将bean将成map
     * @param obj bean对象
     * @return 转换的map值
     * @throws Exception
     */
    public static Map<String, Object> objectToMap(Object obj) {
        if(obj == null){
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if (value!=null&&value!="") {
                    map.put(field.getName(), field.get(obj)+"");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_SIGN_FAIL);
        }
        return map;
    }

    /**
     * 从API返回的XML数据里面重新计算一次签名
     * @param responseString API返回的XML数据
     * @return 新鲜出炉的签名
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static String getSignFromResponseString(String responseString,String key) throws IOException, SAXException, ParserConfigurationException {
        Map<String,Object> map = XMLParser.getMapFromXML(responseString);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign","");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        return Signature.getWechatSign(map, key);
    }

    /**
     * 检验API返回的数据里面的签名是否合法，避免数据在传输的过程中被第三方篡改
     * @param responseString API返回的XML数据字符串
     * @return API签名是否合法
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static boolean checkIsSignValidFromResponseString(String responseString,String key) throws ParserConfigurationException, IOException, SAXException {

        Map<String,Object> map = XMLParser.getMapFromXML(responseString);
        Util.log(map.toString());

        String signFromAPIResponse = map.get("sign").toString();
        if(signFromAPIResponse=="" || signFromAPIResponse == null){
            Util.log("API返回的数据签名数据不存在，有可能被第三方篡改!!!");
            return false;
        }
        Util.log("服务器回包里面的签名是:" + signFromAPIResponse);
        //清掉返回数据对象里面的Sign数据（不能把这个数据也加进去进行签名），然后用签名算法进行签名
        map.put("sign","");
        //将API返回的数据根据用签名算法进行计算新的签名，用来跟API返回的签名进行比较
        String signForAPIResponse = com.rongyi.pay.core.wechat.util.Signature.getSign(map, key);

        if(!signForAPIResponse.equals(signFromAPIResponse)){
            //签名验不过，表示这个API返回的数据有可能已经被篡改了
            Util.log("API返回的数据签名验证不通过，有可能被第三方篡改!!!");
            return false;
        }
        Util.log("恭喜，API返回的数据签名验证通过!!!");
        return true;
    }

}
