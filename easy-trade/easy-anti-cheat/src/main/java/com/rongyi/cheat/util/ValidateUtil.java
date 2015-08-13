
/**   
 * @Title: ValidateUtil.java 
 * @Package: com.rongyi.tms.util 
 * @Description: TODO
 * @author user  
 * @date 2015年5月19日 下午4:40:52 
 */


package com.rongyi.cheat.util;

import java.util.ArrayList;
import java.util.List;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年5月19日 下午4:40:52 
 */

public class ValidateUtil {

    public static List<Integer> StringToIntList(String str){
        String []idsArray=str.split(",");
        List<Integer> intList=new ArrayList<Integer>();
        for(int i=0;i<idsArray.length;i++){
            intList.add(Integer.parseInt(idsArray[i]));
        }
        return intList;
    }
}
