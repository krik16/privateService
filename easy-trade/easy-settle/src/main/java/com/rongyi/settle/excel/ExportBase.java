/**
 * @Copyright (C),上海容易网电子商务有限公司	
 * @Author: 柯军 
 * @datetime:2015年10月8日下午4:35:29
 * @Description: TODO
 *
 **/

package com.rongyi.settle.excel;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.rongyi.core.common.util.JsonUtil;

/**	
 * @Author:  柯军
 * @Description: 报表导出 
 * @datetime:2015年10月8日下午4:35:29
 *
 **/

public class ExportBase {
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getParamMap(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            String paramsJson = new String(request.getParameter("paramsJson").getBytes("iso8859-1"), "UTF-8");
            map = JsonUtil.getMapFromJson(paramsJson);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return map;
    }
}
