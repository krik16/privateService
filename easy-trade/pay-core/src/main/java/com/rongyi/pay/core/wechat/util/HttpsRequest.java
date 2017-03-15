package com.rongyi.pay.core.wechat.util;

import com.rongyi.pay.core.Exception.WeChatException;
import com.rongyi.pay.core.wechat.service.IServiceRequest;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;

/**
 * kejun
 * Date: 2015/10/29
 */
public class HttpsRequest implements IServiceRequest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpsRequest.class);

    public interface ResultListener {


        public void onConnectionPoolTimeoutError();

    }

    //表示请求器是否已经做了初始化工作
    private boolean hasInit = false;

    //连接超时时间，默认10秒
    private int socketTimeout = 10000;

    //传输超时时间，默认30秒
    private int connectTimeout = 30000;

    //请求器的配置
    private RequestConfig requestConfig;

    /**
     * 通过Https往API post xml数据
     *
     * @param url    API地址
     * @param xmlObj 要提交的XML数据对象
     * @return API回包的实际数据
     * @throws IOException
     * @throws KeyStoreException
     * @throws UnrecoverableKeyException
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */

    public String sendPost(String url, Object xmlObj, WechatConfigure wechatConfigure) throws IOException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException {

//        if (!hasInit) {
        HttpClient httpClient = init(wechatConfigure);
//        }

        String result = null;

        HttpPost httpPost = new HttpPost(url);

        //解决XStream对出现双下划线的bug
        XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));

        //将要提交给API的数据对象转换成XML格式数据Post给API
        String postDataXML = xStreamForRequestPostData.toXML(xmlObj);

        LOGGER.debug("postDataXML=" + postDataXML);
//        System.err.println("post data:"+postDataXML);
        //得指明使用UTF-8编码，否则到API服务器XML的中文不能被成功识别
        StringEntity postEntity = new StringEntity(postDataXML, "UTF-8");
        httpPost.addHeader("Content-Type", "text/xml");
        httpPost.setEntity(postEntity);

        //设置请求器的配置
        httpPost.setConfig(requestConfig);

        try {
            HttpResponse response = httpClient.execute(httpPost);

            HttpEntity entity = response.getEntity();

            result = EntityUtils.toString(entity, "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpPost.abort();
        }

        return result;
    }

    private HttpClient init(WechatConfigure wechatConfigure) throws IOException, KeyStoreException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyManagementException {
        LOGGER.info("wechatConfigure=" + wechatConfigure.toString());
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        String cretFilePath = wechatConfigure.getCertLocalPath();
        FileInputStream instream = null;
        try {
            instream = new FileInputStream(new File(cretFilePath));//加载本地的证书进行https加密传输
            keyStore.load(instream, wechatConfigure.getCertPassword().toCharArray());//设置证书密码
           String path = System.getProperty("javax.net.ssl.trustStore");
            LOGGER.info("path={}",path);
            System.clearProperty("javax.net.ssl.trustStore");
        } catch (IOException e) {
            LOGGER.error("证书文件获取失败,cretFilePath={}", cretFilePath);
            throw new WeChatException("-1", "证书文件获取失败");
        } catch (CertificateException e) {
            e.printStackTrace();
            throw new WeChatException("-1", "加载证书密码出错");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } finally {
            if (instream != null) {
                instream.close();
            }
        }

        // Trust own CA and all self-signed certs
        SSLContext sslcontext = SSLContexts.custom()
                .loadKeyMaterial(keyStore, wechatConfigure.getCertPassword().toCharArray())
                .build();
        // Allow TLSv1 protocol only
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" },
                null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
//        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
//                sslcontext,
//                new String[]{"TLSv1"},
//                null,
//                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        HttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(sslsf)
                .build();
        //根据默认超时限制初始化requestConfig
//        requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();
        hasInit = true;
        return httpClient;
    }


    /**
     * 设置连接超时时间
     *
     * @param socketTimeout 连接时长，默认10秒
     */
    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
        resetRequestConfig();
    }

    /**
     * 设置传输超时时间
     *
     * @param connectTimeout 传输时长，默认30秒
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
        resetRequestConfig();
    }

    private void resetRequestConfig() {
        requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout).setConnectTimeout(connectTimeout).build();
    }

    /**
     * 允许商户自己做更高级更复杂的请求器配置
     *
     * @param requestConfig 设置HttpsRequest的请求器配置
     */
    public void setRequestConfig(RequestConfig requestConfig) {
        this.requestConfig = requestConfig;
    }
}
