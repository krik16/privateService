package com.rongyi.pay.core.webank.util;

import com.rongyi.pay.core.webank.model.Result;
import com.rongyi.pay.core.webank.model.WechatPunchCardResData;
import net.sf.json.JSONObject;

import java.math.BigDecimal;

/**
 * 基础工具类
 * Created by sujuan on 2017/2/22.
 */
public class Util {

    /**
     * 将json字符串转换成object
     * @param jsonStr
     * @return
     */
    public static Object getObjectFromString(String jsonStr,Class t) {
        JSONObject jsonobject = JSONObject.fromObject(jsonStr);
        return JSONObject.toBean(jsonobject,t);
    }

    public static void main(String args[]) {
        WechatPunchCardResData cardResData = new WechatPunchCardResData();
        cardResData.setSign("asdfafdsff");
        cardResData.setBank_type(new BigDecimal(999));
        cardResData.setFee_type("dfdfd");
        cardResData.setOpenid("dfdfdfdfdfdf");
        cardResData.setOrderid("335435454");
        Result result = new Result();
        result.setErrmsg("SUCCESS");
        result.setErrno(1);
        cardResData.setResult(result);
        JSONObject object = JSONObject.fromObject(cardResData);
        String str = object.toString();
        System.out.println(str);
        WechatPunchCardResData obj  =(WechatPunchCardResData) getObjectFromString(str,WechatPunchCardResData.class);
        System.out.println(obj);
    }
}
