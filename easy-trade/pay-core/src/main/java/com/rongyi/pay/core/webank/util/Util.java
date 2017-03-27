package com.rongyi.pay.core.webank.util;

import com.google.gson.Gson;
import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.model.Result;
import com.rongyi.pay.core.webank.model.WwPunchCardResData;
import net.sf.json.JSONObject;

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
        Object obj = null;
        try {
            Gson gson = new Gson();
            obj = gson.fromJson(jsonStr, t);
//            JSONObject jsonObject = JSONObject.fromObject(jsonStr);
//            obj = jsonObject.toBean(jsonObject, t);
        } catch (Exception e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_RES_FAIL);
        }
        return obj;
    }

    public static void main(String args[]) {
        WwPunchCardResData cardResData = new WwPunchCardResData();
        cardResData.setSign("asdfafdsff");
        cardResData.setBank_type("999");
        cardResData.setFee_type("dfdfd");
        cardResData.setOpenid("dfdfdfdfdfdf");
        cardResData.setOrderid("335435454");
        Result result = new Result();
        result.setErrmsg("SUCCESS");
        result.setErrno("1");
        cardResData.setResult(result);
        JSONObject object = JSONObject.fromObject(cardResData);
        String str = object.toString();
        System.out.println(str);
        WwPunchCardResData obj  =(WwPunchCardResData) getObjectFromString("",WwPunchCardResData.class);
        System.out.println(obj);
    }
}
