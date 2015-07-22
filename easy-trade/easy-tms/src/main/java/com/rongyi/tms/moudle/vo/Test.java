
/**   
 * @Title: Test.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月26日 下午1:33:30 
 */


package com.rongyi.tms.moudle.vo;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.math.NumberUtils;

/** 
 * @Description 
 * @author user
 * @date 2015年5月26日 下午1:33:30 
 */

public class Test {

    /** 
     * @Description 
     * @author user
     * @param args  
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print(NumberUtils.isNumber("12.s"));
        System.out.println("sdfsdf:"+"ssdfsdf");
        JSONArray array=JSONArray.fromObject("[{\"amount\":\"\",\"marks\":\"\",\"type\":\"\",\"sellerAccount\":\"13764627554\"}]");
        System.out.println(array.size());
    }

}
