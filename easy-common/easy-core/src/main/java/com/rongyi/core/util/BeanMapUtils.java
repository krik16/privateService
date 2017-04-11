package com.rongyi.core.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * conan
 * 2017/2/15 11:52
 **/
public class BeanMapUtils {

    /**
     * Converts a map to a JavaBean.
     *
     * @param type type to convert
     * @param map map to convert
     * @return JavaBean converted
     */
    public static  Object toBean(Class<?> type, Map<String, Object> map){
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(type);
            Object obj = type.newInstance();
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor : propertyDescriptors) {
                String propertyName = descriptor.getName();
                if (map.containsKey(propertyName)) {
                    Object value = map.get(propertyName);
                    Object[] args = new Object[1];
                    args[0] = value;
                    descriptor.getWriteMethod().invoke(obj, args);
                }
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("转换异常");
        }

    }

    /**
     * Converts a JavaBean to a map
     *
     * @param bean JavaBean to convert
     * @return map converted
     * @throws IntrospectionException failed to get class fields
     * @throws IllegalAccessException failed to instant JavaBean
     * @throws InvocationTargetException failed to call setters
     */
    public static Map<String, Object> toMap(Object bean)
            throws IntrospectionException, IllegalAccessException, InvocationTargetException {
        Map<String, Object> returnMap = new HashMap<String, Object>();
        BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for (PropertyDescriptor descriptor : propertyDescriptors) {
            String propertyName = descriptor.getName();
            if (!propertyName.equals("class")) {
                Method readMethod = descriptor.getReadMethod();
                Object result = readMethod.invoke(bean, new Object[0]);
                if (result != null) {
                    returnMap.put(propertyName, result);
                } else {
                    returnMap.put(propertyName, "");
                }
            }
        }
        return returnMap;
    }

    public static Map<String, Object> objectToMapRemoveSign(Object obj) throws IllegalAccessException{
        if(obj == null){
            return null;
        }

        Map<String, Object> map = new HashMap<>();
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            for (Field field : declaredFields) {
                field.setAccessible(true);
                Object value = field.get(obj);
                if("sign".equals(field.getName()))
                    continue;
                if("serialVersionUID".equals(field.getName()))
                    continue;
                if (value!=null&&value!="") {
                    map.put(field.getName(), field.get(obj) + "");
                }
            }
        return map;
    }

}
