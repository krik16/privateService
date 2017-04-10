package com.rongyi.core.util;

import com.rongyi.core.common.third.md5.Md5Util;
import com.rongyi.core.constant.Const;
import org.apache.commons.lang.StringUtils;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 签名公共方法
 * 
 * @author xiaobo
 *
 */
public class Util {
	
	/*public static void main(String[] args) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("channel", "013");
		params.put("st", "bhn5S4+n5v5D6034WwIsjNkRqjyO32jelaPaL5iBPI0M/RWTrRSHT9a/5JJAHxZeaP9wJnnmztbpxqanVeShTnJL1AgDgNV1fVjidXXsya0jHunoq2KjwTANC57JJP4gQS79Jl2ElJM2LNsJnVqG8FS6bVNKayUOFu0QNSvMweA");
		
		Collection<String> keyset = params.keySet();
		List<String> list = new ArrayList<>(keyset);
		//对key键值按字典升序排序
		Collections.sort(list);
		String sb = new String();
		for (int i = 0; i < list.size(); i++) {
			sb = sb.concat(list.get(i)).concat("=").concat(String.valueOf(params.get(list.get(i)))).concat("&");
		}
		sb = sb.concat("token=").concat(Const.CHANNEL_TOKEN.get(params.get("channel")));
		System.out.println(sb);
		String md5Sign = Md5Util.GetMD5Code(sb.toString());
		System.out.println(md5Sign);
	}*/
	/**
	 * 签名判断
	 * @param params
	 * @return
	 */
	public static Boolean signValidate(HashMap<String, Object> params, String sign) {
		if (params.size() > 0) {
			Collection<String> keyset = params.keySet();
			List<String> list = new ArrayList<>(keyset);
			//对key键值按字典升序排序
			Collections.sort(list);
			String sb = new String();
			for (int i = 0; i < list.size(); i++) {
				sb = sb.concat(list.get(i)).concat("=").concat(String.valueOf(params.get(list.get(i)))).concat("&");
			}
			sb = sb.concat("token=").concat(Const.CHANNEL_TOKEN.get(params.get("channel")));
			String md5Sign = Md5Util.GetMD5Code(sb.toString());
			if (md5Sign.equals(sign)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 签名判断
	 * @param params
	 * @return
	 */
	public static Boolean signValidateWithoutChannel(HashMap<String, Object> params, String sign) {
		if (params.size() > 0) {
			Collection<String> keyset = params.keySet();
			List<String> list = new ArrayList<>(keyset);
			//对key键值按字典升序排序
			Collections.sort(list);
			String sb = new String();
			for (int i = 0; i < list.size(); i++) {
				sb = sb.concat(list.get(i)).concat("=").concat(String.valueOf(params.get(list.get(i)))).concat("&");
			}
			sb = sb.concat("token=").concat(Const.CHANNEL_TOKEN.get("pos"));
			String md5Sign = Md5Util.GetMD5Code(sb.toString());
			if (md5Sign.equals(sign)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断时间是否超过2秒
	 * @param time 请求时间
	 * @return
	 */
	public static boolean timeValidate(long time) {
		try {			
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date(time));
			calendar.add(Calendar.SECOND, Const.REQUEST_TIME_OUT);

			if (System.currentTimeMillis() <= calendar.getTimeInMillis()) {
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * 判断字符串是否为空
	 * 
	 * @author wangjianhua
	 * @param str
	 * @return true：空 false：非空
	 */
	public static boolean isEmpty(String str) {
		if (null == str || "".equals(str) || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean IntegerIsEmpty(Integer intger) {
		if (null == intger || intger == 0) {
			return true;
		}
		return false;
	}

	/**
	 * 判断字符串是否不为空
	 * 
	 * @author wangjianhua
	 * @param str
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断Object对象是否为空
	 * 
	 * @author wangjianhua
	 * @param obj
	 * @return true：空 false：非空
	 */
	public static boolean isEmpty(Object obj) {
		if (null == obj) {
			return true;
		}
		return false;
	}

	/**
	 * 判断Object对象是否不为空
	 * 
	 * @author wangjianhua
	 * @param obj
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}

	/**
	 * 判断List对象是否为空
	 * 
	 * @author wangjianhua
	 * @param str
	 * @return true：空 false：非空
	 */
	public static boolean isEmpty(List<?> list) {
		if (null == list || 0 == list.size()) {
			return true;
		}
		return false;
	}

	/**
	 * 判断List对象是否不为空
	 * 
	 * @author wangjianhua
	 * @param str
	 * @return true：非空 false：空
	 */
	public static boolean isNotEmpty(List<?> list) {
		return !isEmpty(list);
	}

	/**
	 * 判断是否是（纯）数字字符串
	 * 
	 * @author wangjianhua
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String input) {
		return isMatcher("^[\\d]+$", input);
	}

	/**
	 * 是否有合适的匹配
	 *
	 * @param regex
	 * @param input
	 * @return
	 * @author wangjh7
	 */
	private static boolean isMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();
	}

	/**
	 * 隐藏部分字符串
	 *
	 * @param code
	 * @return
	 * @author wangjh7
	 */
	public static String hideString(String code) {
		if (StringUtils.isNotBlank(code)) {
			if (8 < code.length()) {
				code = code.substring(0, code.length() - 4) + "****";
			} else if (4 < code.length()) {
				code = code.substring(0, code.length() - 2) + "**";
			} else {
				code = code.substring(0, code.length() - 1) + "*";
			}
		}
		return code;
	}

	/**
	 * 获取友好的时间差
	 *
	 * @param ts 毫秒
	 * @return
	 * @author wangjh7
	 */
	public static String getTimeString(long ts) {
		// 1秒
		if (1000 < ts) {
			// 10秒
			if (10000 < ts) {
				// 3分钟
				if (180000 < ts) {
					return new DecimalFormat("##0.00").format(ts / 60000f) + "（分）";
				} else {
					return ts + "（秒）";
				}
			} else {
				return new DecimalFormat("##0.00").format(ts / 1000f) + "（秒）";
			}

		} else {
			return ts + "（毫秒）";
		}
	}

	public static void main(String[] args) {
		HashMap<String,Object> params = new HashMap<>();
		//会员查询接口
		/*params.put("verificationCode","294376");
		params.put("timeStamp",1515567178131l);*/

		//积分消费获取验证码接口
		/*params.put("cardNumber","15000388436");
		params.put("orderNumber","401201607250945111");
		params.put("serialNumber","201701110945111");
		params.put("timeStamp",1515567178131l);*/

		//积分消费并同步订单接口
		params.put("cardNumber","15000388436");
		params.put("orderNumber","401201607250945111");
		params.put("serialNumber","201701110945111");
		params.put("timeStamp",1515567178131l);
		params.put("verificationCode","850163");

		//订单冲正接口
		/*params.put("cardNumber","15000388436");
		params.put("orderNumber","401201607250945004");
		params.put("serialNumber","201701110945004");
		params.put("timeStamp",1515567178131l);*/

		//退换货接口参数
		/*params.put("cardNumber","15000388436");
		params.put("orderNumber","401201607250945005");
		params.put("serialNumber","201701120945003");
		params.put("timeStamp", 1515567178131l);*/

		//渠道列表参数
		/*params.put("source",1);
		params.put("timeStamp",1515567178131l);*/
		signValidateWithoutChannel(params,"dddd");
	}

	/**
	 * 天转秒
	 *
	 * @param day
	 * @return
	 */
	public static int toChgSecond(int day) {
		return day * 24 * 3600;
	}

	/**
	 * 秒转天
	 *
	 * @param second
	 * @return
	 */
	public static int toChgDay(int second) {
		return second / 24 / 3600;
	}
}
