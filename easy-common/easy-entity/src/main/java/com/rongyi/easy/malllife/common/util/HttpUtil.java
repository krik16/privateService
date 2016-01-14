package com.rongyi.easy.malllife.common.util;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author yoUng
 * @description ����http����
 * @filename HttpUtil.java
 * @time 2011-6-15 ����05:26:36
 * @version 1.0
 */
public class HttpUtil {
    private static final Log LOG=LogFactory.getLog(HttpUtil.class);
	static class MyThread extends Thread {
		public int x = 0;

		public void run() {
			regist();
		}
	}

	public static void main(String[] args) {
//		getUrl6();
//		doLogin();
//		regist();
		for (int i = 0; i < 3; i++) {
			Thread t = new HttpUtil.MyThread();
			t.start();
		}
	}
	
	public static String getUrl6() {
		String url1 = "http://192.168.1.128:8081/app/j_spring_security_check?openId=12";
		String result = httpGET(url1);
		try {
			Map<String, Object> map = JsonUtil.getMapFromJson(result);
			Map<String, Object> meta = (Map<String, Object>) map.get("meta");
			String uid = (String) meta.get("uid");
			String jsessionid_ = (String) meta.get("jsessionid");
			System.out.println(uid+";"+jsessionid_);
			url1 = "http://192.168.1.128:8081/app/v5/user/mine.htm;jsessionid="+jsessionid_;
			result = httpGET(url1);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * @return
	 */
	public static String regist() {
		String url1 = "http://192.168.1.128:8081/app/v5/user/getVerifyCodeWhenRegist.htm?phone=13757123280";
		String result = httpGET(url1);
		System.out.println(">>>" + result);
		Map<String, Object> map = JsonUtil.getMapFromJson(result);
		Map<String, Object> meta = (Map<String, Object>) map.get("meta");
		String verifyCode = (String) meta.get("verifyCode");
		String jsessionid = (String) meta.get("jsessionid");
//public void regist(@RequestParam String phone, @RequestParam String verifyCode, @RequestParam String nickName, @RequestParam String pwd) {
		url1 = "http://192.168.1.128:8081/app/v5/user/regist.htm";
		url1 += ";jsessionid=" + jsessionid;
		//j_username=1&j_password=2
		String j_password = "12345678";
		byte[] data = j_password.getBytes();
		// String publicKey_ = "";
		 byte[] encodedData = null;
		result = "";
		try {
			Map<String, String> params = new HashMap<String, String>();
			params.put("phone", "18362620342");
			params.put("verifyCode", verifyCode);
			params.put("pwd", CodeUtil.bornCode());
			String nickName = "小鱼儿";
			nickName = URLEncoder.encode(nickName, "utf-8");

			params.put("nickName", nickName);
			
			String url2 = "http://192.168.1.128:8081/app/v5/user/requestPublicKey.htm";
			url2 += ";jsessionid=" + jsessionid;
			result = httpGET(url2);
			System.out.println(">>>" + result);
			map = JsonUtil.getMapFromJson(result);
			meta = (Map<String, Object>) map.get("meta");
			String publicKey = (String) meta.get("publicKey");
			jsessionid = (String) meta.get("jsessionid");
			
			encodedData = RSACoder.encryptByPublicKey(data, publicKey);
			http(url1, encodedData, params);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	/**
	 * 18616020582 yhw07255 4.5,4.6版本的登录
	 * 一般测试的几个帐号18801627445，12345678；18693406502，123456789
	 * 
	 * @param publicKey
	 * @param jsessionid
	 * @return
	 */
	public static String login(String publicKey, String jsessionid) {
		String url1 = "http://192.168.1.128:8081/app/j_spring_security_check";
		url1 += ";jsessionid=" + jsessionid;
		//j_username=1&j_password=2
		String j_password = "12345678";
		byte[] data = j_password.getBytes();
		// String publicKey_ = "";
		 byte[] encodedData = null;
		String result = "";
		try {
			Map<String, String> params = new HashMap<String, String>();
			params.put("jusername", "13757123287");
			params.put("jpassword", CodeUtil.bornCode());
			encodedData = RSACoder.encryptByPublicKey(data, publicKey);
			result = http(url1, encodedData, params);
			
			Map<String, Object> map = JsonUtil.getMapFromJson(result);
			Map<String, Object> meta = (Map<String, Object>) map.get("meta");
			String uid = (String) meta.get("uid");
			String jsessionid_ = (String) meta.get("jsessionid");
			System.out.println(uid+";"+jsessionid_);
			
			url1 = "http://192.168.1.128:8081/app/v5/user/mine.htm;jsessionid="+jsessionid_;
			result = httpGET(url1);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public static String getUrl4(String publicKey, String jsessionid) {
		String url1 = "http://192.168.1.128:8081/user/decodedData.htm";
		url1 += ";jsessionid=" + jsessionid;
		System.out.println(System.getProperty("file.encoding"));
		String inputStr = "19860227";
		byte[] data = inputStr.getBytes();
		// String publicKey_ = "";
		 byte[] encodedData = null;
		String result = "";
		try {
			encodedData = RSACoder.encryptByPublicKey(data, publicKey);
			http(url1, encodedData, null);
//			// String outputStr = new String(encodedData,"ISO-8859-1");
//			System.out.println("outputStr:" + outputStr);
//			// url1 += "?encodedData="+outputStr;
//			Map<String, String> params = new HashMap<String, String>();
//			params.put("encodedData", outputStr);
//			result = httpPOST(url1, params);
//			// result = httpGET(url1);
//			System.out.println(">>>" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * @return
	 */
	public static String doLogin() {
		String url1 = "http://192.168.1.128:8081/app/v5/user/requestPublicKey.htm";
		String result = httpGET(url1);
		System.out.println(">>>" + result);
		Map<String, Object> map = JsonUtil.getMapFromJson(result);
		Map<String, Object> meta = (Map<String, Object>) map.get("meta");
		String publicKey = (String) meta.get("publicKey");
		String jsessionid = (String) meta.get("jsessionid");
		login(publicKey, jsessionid);
		return result;
	}

	/**
	 * http://192.168.1.128:8081/market/code/offer.action?key=iamrongyiboy&type=
	 * k99&channel=1
	 * 
	 * @param s
	 * @return
	 */
	public static String getUrl2(String key, String type, String channel) {
		String url1 = "http://192.168.1.128:8081/market/code/offer.action?key=" + key + "&type=" + type + "&channel=" + channel + "";
		String result = httpGET(url1);
		System.out.println(">>>" + result);
		return result;
	}

	public static String getUrl3(String key, String type, String code) {
		String url1 = "http://192.168.1.128:8081/market/code/check.action?key=" + key + "&type=" + type + "&code=" + code + "";
		String result = httpGET(url1);
		System.out.println(">>>" + result);
		return result;
	}

	public static String httpGET(String url) {
		URL u = null;
		HttpURLConnection con = null;
		System.out.println("send_url:" + url);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();
			con.setRequestMethod("GET");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("http请求报错哦！");
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}
		StringBuffer buffer = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String temp;
			while ((temp = br.readLine()) != null) {
				buffer.append(temp);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("http请求报错哦！");
		}
		return buffer.toString();
	}

	public static String httpPOST(String url, Map<String, String> params) {
		URL u = null;
		HttpURLConnection con = null;
		StringBuffer sb = new StringBuffer();
		String param = "";
		if (params != null) {
			for (Entry<String, String> e : params.entrySet()) {
				sb.append(e.getKey());
				sb.append("=");
				sb.append(e.getValue());
				sb.append("&");
			}
			param = sb.substring(0, sb.length() - 1);
		}
		System.out.println("send_url:" + url);
		System.out.println("send_data:" + param);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();

			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
			osw.write(param);
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("http请求报错哦！");
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}

		StringBuffer buffer = new StringBuffer();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			String temp;
			while ((temp = br.readLine()) != null) {
				buffer.append(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("http请求报错哦！");
		}
		return buffer.toString();
	}

	
	
	public static String jsonPOST(String url, Map<String, String> params) {
		String resultStr = "";
		HttpPost postRequest = new HttpPost(url);
		JSONObject json = JSONObject.fromObject(params);
		StringEntity input = null;
		HttpClient httpClient = new DefaultHttpClient();
		try {
			input = new StringEntity(json.toString());
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		input.setContentType("application/json;charset=UTF-8;encoding=UTF-8");
		postRequest.setEntity(input);
		input.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
				"application/json;charset=UTF-8;encoding=UTF-8"));
		postRequest.setHeader("Accept", "application/json");
		postRequest.setEntity(input);

		HttpResponse response;

		try {
			response = httpClient.execute(postRequest);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(response.getEntity().getContent()), "UTF-8"));

			String output;

			while ((output = br.readLine()) != null) {
				LOG.info("output:"+output);
				JSONObject result = JSONObject.fromObject(output);

				String str="";
					if(null!=result&&result.get("success")!=null) {
						str = result.get("success").toString();
					}
				if (str.equals("true")){
					JSONObject info = result.getJSONObject("info");
					resultStr = info.toString();
					
//					return;
				}else{
					
			
				}
			}

			httpClient.getConnectionManager().shutdown();
			return resultStr;
		}catch(Exception e){
			e.printStackTrace();
			return resultStr;
		}
	}
	/**
	 * Java处理HTTP的POST请求(发送接收二进制流数据)
	 * @param url
	 * @param PostData
	 * @return
	 */
	public static String http(String url, byte[] PostData, Map<String, String> params) {
		URL u = null;
		HttpURLConnection con = null;
		InputStream inputStream = null;
		System.out.println("send_url:" + url);
		// 尝试发送请求
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();
			
			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setRequestProperty("Content-Type", "binary/octet-stream");
			if (params != null) {
				for (Entry<String, String> e : params.entrySet()) {
					con.setRequestProperty(e.getKey(), e.getValue());
				}
			}
			OutputStream outStream = con.getOutputStream();
			outStream.write(PostData);
			outStream.flush();
			outStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				con.disconnect();
			}
		}
		// 读取返回内容
		String str = null;
		try {
			// 读取返回内容
			inputStream = con.getInputStream();
			
			int len = con.getContentLength();
			byte buffer[] = new byte[len];
			// 2
			int total = 0;
			int once = 0;
			while ((total < len) && (once >= 0)) {
				once = inputStream.read(buffer, total, len);
				total += once;
			}
			str = new String(buffer);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	// function end

}