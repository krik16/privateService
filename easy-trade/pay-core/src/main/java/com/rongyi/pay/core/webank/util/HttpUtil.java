package com.rongyi.pay.core.webank.util;

import com.rongyi.pay.core.Exception.WebankException;
import com.rongyi.pay.core.constants.ConstantEnum;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import java.io.*;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 * http请求类
 * @author sujuan
 */
public class HttpUtil {
	private static Logger	logger = LoggerFactory.getLogger(HttpUtil.class);
	//HTTP请求器
	public static void main(String[] args) {
		
	}

	
	public static String httpGET(String url ,WebankConfigure configure) throws Exception{
		String result = "";
		URL u = null;
		logger.info("send_url:" + url);
		try {
			CloseableHttpClient httpClient = init(configure);
			HttpGet httpGet = new HttpGet(url);
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();

			result = EntityUtils.toString(httpEntity, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw e;
		}finally {
			//微众支付是个坑，需要加载javax.net.ssl.trustStore这个属性,是基于整个JVM的,微信这边是不需要这个的，所有要去除这个属性
//			if(StringUtils.isNotEmpty(System.getProperty("javax.net.ssl.trustStore"))) {
//				System.clearProperty("javax.net.ssl.trustStore");
//			}

		}
		return result;
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
		logger.info("send_url:" + url);
		logger.info("send_data:" + param);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();
			
			con.setRequestMethod("POST"); 
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setConnectTimeout(20000);
			con.setReadTimeout(30000);
			con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
			osw.write(param);
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw new WebankException(ConstantEnum.EXCEPTION_SYSTEM_ERROR);
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
			logger.info("http请求报错哦！！");
			throw new WebankException(ConstantEnum.EXCEPTION_SYSTEM_ERROR);
		}
		return buffer.toString();
	}
	
	/**
	 * post请求，传输json格式的参数
	 * @param url
	 * @param params
	 * @return
	 */
	public static String httpPOSTJson(String url, Map<String, String> params) {
        URL u = null;
        HttpURLConnection con = null;
        StringBuffer sb = new StringBuffer();
        String param = "";
        if (params != null) {
            for (Entry<String, String> e : params.entrySet()) {
                sb.append(e.getValue());
                sb.append("&");
            }
            param = sb.substring(0, sb.length() - 1);
        }
        logger.info("send_url:" + url);
        logger.info("send_data:" + param);
        try {
            u = new URL(url);
            con = (HttpURLConnection) u.openConnection();
            
            con.setRequestMethod("POST"); 
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
            osw.write(param);
            osw.flush();
            osw.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("http请求报错哦！");
			throw new WebankException(ConstantEnum.EXCEPTION_SYSTEM_ERROR);
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
            logger.info("http请求报错哦！");
			throw new WebankException(ConstantEnum.EXCEPTION_SYSTEM_ERROR);
		}
        return buffer.toString();
    }

	/**
	 * http以json方式请求
	 * @param url 请求链接
	 * @param obj 参数
	 * @return 返回结果
	 */
	public static String httpPOSTJson(String url,Object obj) throws Exception{
		logger.info("发送http请求 url:{} , obj:{}",url,obj);
		Map<String, String> params = objectToMap(obj);
		logger.info("http请求参数 param:{}",params);
		URL u = null;
		HttpURLConnection con = null;
		StringBuffer sb = new StringBuffer();
		String param = "";
		if (params != null) {
			for (Entry<String, String> e : params.entrySet()) {
				sb.append(e.getValue());
				sb.append("&");
			}
			param = sb.substring(0, sb.length() - 1);
		}
		logger.info("send_url:" + url);
		logger.info("send_data:" + param);
		try {
			u = new URL(url);
			con = (HttpURLConnection) u.openConnection();

			con.setRequestMethod("POST");
			con.setDoOutput(true);
			con.setDoInput(true);
			con.setUseCaches(false);
			con.setRequestProperty("Content-Type", "application/json");
			OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
			osw.write(param);
			osw.flush();
			osw.close();
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw e;
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
			logger.info("http请求报错哦！");
			throw e;
		}
		return buffer.toString();
	}



	/**
	 * 将bean将成map
	 * @param obj bean对象
	 * @return 转换的map值
	 * @throws Exception
	 */
	public static Map<String, String> objectToMap(Object obj) {
		if(obj == null){
			return null;
		}

		Map<String, String> map = new HashMap<>();

		try {
			Field[] declaredFields = obj.getClass().getDeclaredFields();
			for (Field field : declaredFields) {
				field.setAccessible(true);
				Object value = field.get(obj);
				if (value!=null &&value!="") {
					map.put(field.getName(), field.get(obj).toString());
				}
			}
		} catch (IllegalAccessException e) {
			logger.info("bean转map报错");
			e.printStackTrace();
			throw new WebankException(ConstantEnum.EXCEPTION_SYSTEM_ERROR);
		}
		return map;
	}

	public static String httpPostWithJSON(String url, JSONObject jsonObject) {
		 
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        String respContent = null;
        
//        json方式
        StringEntity entity = new StringEntity(jsonObject.toString(),"utf-8");//解决中文乱码问题    
        entity.setContentEncoding("UTF-8");    
        entity.setContentType("application/json");    
        httpPost.setEntity(entity);
        System.out.println();
        
        HttpResponse resp;
		try {
			resp = client.execute(httpPost);
			 if(resp.getStatusLine().getStatusCode() == 200) {
	            HttpEntity he = resp.getEntity();
	            respContent = EntityUtils.toString(he,"UTF-8");
	        }
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return respContent;
    }


	public static String sendPostClient(String url, Object object ,WebankConfigure configure) throws IOException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException {
		logger.info("http请求 url:{},object:{}",url,object);
		long start = System.nanoTime();
		//请求器的配置
	//	RequestConfig requestConfig;
		CloseableHttpClient httpClient = init(configure);
		Map<String,Object> map = Signature.objectToMap(object);
		JSONObject jsonObject = JSONObject.fromObject(map);
		String result = null;

		HttpPost httpPost = new HttpPost(url);

		StringEntity entity = new StringEntity(jsonObject.toString(),"utf-8");//解决中文乱码问题
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		logger.info("reqEntity:{}", jsonObject);

		try {
			HttpResponse response = httpClient.execute(httpPost);

			HttpEntity httpEntity = response.getEntity();

			result = EntityUtils.toString(httpEntity, "UTF-8");

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw e;
		}
		finally {
			httpPost.abort();
			//微众支付是个坑，需要加载javax.net.ssl.trustStore这个属性,是基于整个JVM的,微信这边是不需要这个的，所有要去除这个属性
//			if(StringUtils.isNotEmpty(System.getProperty("javax.net.ssl.trustStore"))) {
//				System.clearProperty("javax.net.ssl.trustStore");
//			}
		}
		datePrint(url,start);
		return result;
	}

	public static String sendPostClientXml(String url,Object object ,WebankConfigure configure)throws Exception {
		logger.info("以xml方式http请求url:{},object:{}",url,object);
		long start = System.nanoTime();
		CloseableHttpClient httpClient = init(configure);
		String result = null;

		HttpPost httpPost = new HttpPost(url);

		//解决XStream对出现双下划线的bug
		XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));

		//将要提交给API的数据对象转换成XML格式数据Post给API
		String postDataXML = xStreamForRequestPostData.toXML(object);

		postDataXML = postDataXML.replace("com.rongyi.pay.core.webank.model.req.WwScanPayReqData", "xml");
		logger.info("postDataXML=" + postDataXML);
//        System.err.println("post data:"+postDataXML);
		//得指明使用UTF-8编码，否则到API服务器XML的中文不能被成功识别
		StringEntity postEntity = new StringEntity(postDataXML, "UTF-8");
		httpPost.addHeader("Content-Type", "text/xml");
		httpPost.setEntity(postEntity);
		logger.info("888888"+postEntity.toString());
		try {
			HttpResponse response = httpClient.execute(httpPost);

			HttpEntity httpEntity = response.getEntity();

			result = EntityUtils.toString(httpEntity, "UTF-8");

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw e;
		}
		finally {
			httpPost.abort();
			//微众支付是个坑，需要加载javax.net.ssl.trustStore这个属性,是基于整个JVM的,微信这边是不需要这个的，所有要去除这个属性
//			if(StringUtils.isNotEmpty(System.getProperty("javax.net.ssl.trustStore"))) {
//				System.clearProperty("javax.net.ssl.trustStore");
//			}
		}
		datePrint(url,start);
		return result ;
	}

	private static CloseableHttpClient init(WebankConfigure webankConfigure) throws IOException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException {
		logger.info("webankConfigure=" + webankConfigure.toString());
		String KEY_STORE_PASSWORD = webankConfigure.getWechatKeyStorePwd();
		String KEY_STORE_TRUST_PASSWORD = "123456";
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		KeyStore trustStore = KeyStore.getInstance("JKS");
		InputStream ksIn = new FileInputStream(webankConfigure.getWechatKeyStorePath());
		InputStream tsIn = new FileInputStream(webankConfigure.getWechatTrustStorePath());
		try {
			keyStore.load(ksIn, KEY_STORE_PASSWORD.toCharArray());
			trustStore.load(tsIn, KEY_STORE_TRUST_PASSWORD.toCharArray());
			//将证书写入系统 ，会影响其它支付宝与微信的证书  去掉换一种方式
//			System.setProperty("javax.net.ssl.trustStore", webankConfigure.getWechatTrustStorePath());
		} catch (Exception e) {
			System.out.println("got a exception" + e.getMessage());
		} finally {
			ksIn.close();
			tsIn.close();
		}
//		SSLContext sslcontext = null;
//		sslcontext = SSLContexts.custom()
//				.loadKeyMaterial(keyStore, KEY_STORE_PASSWORD.toCharArray())
//				.loadTrustMaterial(trustStore, new TrustSelfSignedStrategy())
//				.build();
//		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" },
//				null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
//		return HttpClients.custom().setSSLSocketFactory(sslsf).build();

		SSLContext sslcontext = SSLContext.getInstance("TLS");
		TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustManagerFactory.init(trustStore);
		KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance("SunX509");
		keyManagerFactory.init(keyStore, KEY_STORE_PASSWORD.toCharArray());
		sslcontext.init(keyManagerFactory.getKeyManagers(), trustManagerFactory.getTrustManagers(), null);
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[]{"TLSv1"},
				null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
		return HttpClients.custom().setSSLSocketFactory(sslsf).build();

	}


	/**
	 * 方法耗时
	 */
	private static void datePrint(String sendUrl,long begin){
		long end = System.nanoTime();
		logger.info("接口耗时:{}:{}ms",sendUrl, (end - begin) / 1000000);
	}
	public static InputStream httpGet(String url ,WebankConfigure configure) throws Exception{
		InputStream is = null;
		logger.info("send_url:" + url);
		try {
			CloseableHttpClient httpClient = init(configure);
			HttpGet httpGet = new HttpGet(url);
			HttpResponse httpResponse = httpClient.execute(httpGet);
			HttpEntity httpEntity = httpResponse.getEntity();

			is = httpEntity.getContent();
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("http请求报错哦！");
			throw e;
		}
//		finally {
//			//微众支付是个坑，需要加载javax.net.ssl.trustStore这个属性,是基于整个JVM的,微信这边是不需要这个的，所有要去除这个属性
//			if(StringUtils.isNotEmpty(System.getProperty("javax.net.ssl.trustStore"))) {
//				System.clearProperty("javax.net.ssl.trustStore");
//			}
//
//		}
		return is;
	}
}