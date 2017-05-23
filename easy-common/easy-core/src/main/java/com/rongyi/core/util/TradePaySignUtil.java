package com.rongyi.core.util;

import com.rongyi.core.Exception.ParamNullException;
import com.rongyi.core.common.third.md5.Md5Util;
import org.apache.commons.lang.StringUtils;

import java.util.*;

/**
 * conan
 * 2017/2/9 11:41
 **/
public class TradePaySignUtil {


    /**
     * 获取加密签名
     * @param params 业务数据
     * @param token 加密token
     * @return 验证结果
     */
    public static String getSignWithToken(Map<String, Object> params, String token) {
        if (params.size() > 0) {
            Collection<String> keyset = params.keySet();
            List<String> list = new ArrayList<>(keyset);
            //对key键值按字典升序排序
            Collections.sort(list);
            String sb = "";
            for (String aList : list) {
                if(StringUtils.isNotEmpty(String.valueOf(params.get(aList))) && !"null".equals(String.valueOf(params.get(aList)))) {
                    sb = sb.concat(aList).concat("=").concat(String.valueOf(params.get(aList))).concat("&");
                }
            }
            sb = sb.concat("token=").concat(token);
            return Md5Util.GetMD5Code(sb);
        }
        throw new ParamNullException("-1","签名业务数据不能为空");
    }


    /**
     * 验证签名
     * @param params 业务数据
     * @param sign 签名结果
     * @param token 加密token
     * @return 验证结果
     */
    public static Boolean signValidateWithToken(Map<String, Object> params, String token,String sign) {
        if (params.size() > 0) {
            Collection<String> keyset = params.keySet();
            List<String> list = new ArrayList<>(keyset);
            //对key键值按字典升序排序
            Collections.sort(list);
            String sb = "";
            for (String aList : list) {
                if(StringUtils.isNotEmpty(String.valueOf(params.get(aList)))) {
                    sb = sb.concat(aList).concat("=").concat(String.valueOf(params.get(aList))).concat("&");
                }
            }
            sb = sb.concat("token=").concat(token);
            String md5Sign = Md5Util.GetMD5Code(sb);
            if (md5Sign.equals(sign)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] s){
        Map<String,Object> map = new HashMap<>();
        map.put("b",1);
        map.put("d","aaaa");
        map.put("c", "");
        String token = "abc123";
       String sign = getSignWithToken(map,token);
        System.err.println("sign=" + sign);
        Boolean res = signValidateWithToken(map,token,sign);
        System.err.println("res="+res);


    }
}
