package com.rongyi.rpb.common.util.orderSign.weixinSign.util;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.alibaba.dubbo.common.logger.Logger;
import com.alibaba.dubbo.common.logger.LoggerFactory;

public class Sha1Util {

	private Sha1Util() {

	}

	private static final Logger LOGGER = LoggerFactory.getLogger(Sha1Util.class);

	public static String getSha1(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}

		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
			mdTemp.update(str.getBytes());

			byte[] md = mdTemp.digest();
			int j = md.length;
			char[] buf = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
				buf[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(buf);
		} catch (Exception e) {
			LOGGER.error(e);
			return null;
		}
	}

	public static String createSHA1Sign(Map<String, String> map) {

		StringBuffer sb = new StringBuffer();
		for (String key : map.keySet()) {
			String value = map.get(key);
			sb.append(key + "=" + value + "&");
			}
		
//		Set es = map.keySet();
//		Iterator it = es.iterator();
//		for (String key : map.keySet()) {
//			String value = map.get(key);
//			sb.append(key + "=" + value + "&");
//			}
//		
//		while (it.hasNext()) {
//			Map.Entry entry = (Map.Entry) it.next();
//			String k = (String) entry.getKey();
//			String v = (String) entry.getValue();
//			sb.append(k + "=" + v + "&");
//		}
		String params = sb.substring(0, sb.lastIndexOf("&"));
		String appsign = Sha1Util.getSha1(params);
		return appsign;
	}

}
