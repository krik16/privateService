package com.rongyi.easy.malllife.common.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

public class StringUtil {

	/**
	 * java中判断字段真实长度（中文2个字符，英文1个字符）的方法 1、判断字符串是否为连续的中文字符(不包含英文及其他任何符号和数字)：
	 * Regex.IsMatch("中文","^[/u4e00-/u9fa5]")；
	 * 2、判断字符串是否为中文字符串(仅不包含英文但可以包含其他符号及数字)： ！Regex.IsMatch("中文",@"[a-zA-Z]")；
	 *
	 * @param value
	 * @return
	 */
	public static int stringLength(String value) {
		int valueLength = 0;
		String chinese = "[\u4e00-\u9fa5]";
		for (int i = 0; i < value.length(); i++) {
			String temp = value.substring(i, i + 1);
			if (temp.matches(chinese)) {
				valueLength += 2;
			} else {
				valueLength += 1;
			}
		}
		return valueLength;
	}

	/**
	 * 字符转成集合
	 * @param s
	 * @return
	 */
	public static List<String> string2List(String s, String ge) {
		List<String> list = new ArrayList<String>();
		if(StringUtils.isNotBlank(s)) {
			String[] arr = s.split(ge);
			if(arr!=null && arr.length>0) {
				for(String str : arr) {
					if(str!=null && StringUtils.isNotBlank(str.trim())) {
						list.add(str.trim());
					}
				}
			}
		}
		return list;
	}

    /**
     * 将数字转化为汉字
     * @param num
     * @return
     */
	public static String numToChinese(int num) {
		// String u[] = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
		String u[] = { "〇", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
		char[] str = String.valueOf(num).toCharArray();
		String rstr = "";
		for (int i = 0; i < str.length; i++) {
			rstr = rstr + u[Integer.parseInt(str[i] + "")];
		}
		return rstr;
	}

	/**
     * 把str中包含oldseparate的字符全部换成newseparate
     * @param num
     * @return
     */
	public static String replaceSeparate(String str,String oldseparate,String newseparate){
		str=str.replaceAll(oldseparate, newseparate);
    	if(str.indexOf(oldseparate)!=-1){
    		str = replaceSeparate(str,oldseparate,newseparate);
    	}
		return str;
    }

	/**
     * list去重
     * @return
     */
	public static void removeDuplicate(List list) {
	      HashSet h = new HashSet(list);
	      list.clear();
	      list.addAll(h);
	}

	/**
     * string去重
     * @return
     */
	public static String removeDuplicateStr(String string,String separate) {
		 List<String> strlist = string2List(string, separate);
		 removeDuplicate(strlist);
		  StringBuffer strbuff = new StringBuffer();
	      for(String str :strlist){
          	strbuff.append(str);
          	strbuff.append(separate);
          }

	      return strbuff.toString();
	}


	/**
     * 汉语转换成拼音
     * @return
     */
	public static String cnToSpell(String name) {
        String pinyinName = "";
        char[] nameChar = name.toCharArray();
        HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        for (int i = 0; i < nameChar.length; i++) {
            if ((nameChar[i] >= 0x4e00) && (nameChar[i] <= 0x9fbb)) {
                try {
                    pinyinName += PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat)[0];
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                pinyinName += nameChar[i];
            }
        }
        return pinyinName;
    }

	 /**
     * 对象返回对应的string
     *
     */
    public static String convert2String(Object obj){
        if(obj == null){
            return "";
        }
        return obj.toString();
    }
    
    
    /**
     * 生成19位以下的随机数
     * @param num:位数<19
     */
    public static String getRandomNum(int num){
    	if(num>=19){
    		return null;
    	}
    	StringBuffer moStr = new StringBuffer();
    	moStr.append("1");
    	for(int i=0;i<num;i++){
    		moStr.append("0");
    	}
    	String limitStr = moStr.toString();
    	limitStr = limitStr.substring(0,limitStr.length()-1);
    	Long mo = Long.valueOf(moStr.toString());
    	Long limit = Long.valueOf(limitStr);
    	Long result = Math.abs(new Random().nextLong())%mo;
    	if(result<limit){
    		 return getRandomNum(num);
    	}else{
    		return String.valueOf(result);
    	}

    }

}
