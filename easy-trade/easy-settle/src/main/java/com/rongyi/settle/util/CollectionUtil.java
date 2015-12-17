package com.rongyi.settle.util;

import java.util.List;
import java.util.Map;

/**
 * Created by Ventures on 2015/12/17.
 */
public class CollectionUtil {

    private static final boolean SEP1 = false;

//    /**
//     * List转换String
//     *
//     * @param list
//     *            :需要转换的List
//     * @return String转换后的字符串
//     */
//    public static String ListToString(List<?> list) {
//        StringBuffer sb = new StringBuffer();
//        if (list != null && list.size() > 0) {
//            for (int i = 0; i < list.size(); i++) {
//                if (list.get(i) == null || list.get(i) == "") {
//                    continue;
//                }
//                // 如果值是list类型则调用自己
//                if (list.get(i) instanceof List) {
//                    sb.append(ListToString((List<?>) list.get(i)));
//                    sb.append(SEP1);
//                } else if (list.get(i) instanceof Map) {
//                    sb.append(MapToString((Map<?, ?>) list.get(i)));
//                    sb.append(SEP1);
//                } else {
//                    sb.append(list.get(i));
//                    sb.append(SEP1);
//                }
//            }
//        }
//        return "L" + EspUtils.EncodeBase64(sb.toString());
//    }

    /**
     * list转String
     * @param stringList
     * @param decollator :分隔符
     * @return
     */
    public static String listToString(List<String> stringList, String decollator ){
        if (stringList==null) {
            return null;
        }
        StringBuilder result=new StringBuilder();
        boolean flag=false;
        for (String string : stringList) {
            if (flag) {
                result.append(decollator);
            }else {
                flag=true;
            }
            result.append(string);
        }
        return result.toString();
    }

}
