package com.rongyi.pay.core.tianyi.util;

import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yangyang on 2017/4/5.
 */
public class CommonUtil {

    /**
     * 将bean将成map
     * @param obj bean对象
     * @return 转换的map值
     * @throws Exception
     */
    public static Map<String, Object> objectToMapRemoveSign(Object obj) {
        if(obj == null){
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if("mac".equals(field.getName()))
                    continue;
                if (value!=null&&value!="") {
                    map.put(field.getName(), field.get(obj) + "");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new WebankException(ConstantEnum.EXCEPTION_WEBANK_SIGN_FAIL);
        }
        return map;
    }
}
