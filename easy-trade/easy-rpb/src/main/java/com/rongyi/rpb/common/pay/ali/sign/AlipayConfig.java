
package com.rongyi.rpb.common.pay.ali.sign;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
	
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class AlipayConfig {
	
	private AlipayConfig(){
		
	}
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static final String partner = "2088701977493485";
	
	// 交易安全检验码，由数字和字母组成的32位字符串
	// 如果签名方式设置为“MD5”时，请设置该参数
	public static final String key = "1htrinnzcp1371s5hbbt9gr5p1wlgz2f";
	
    // 商户的私钥
    // 如果签名方式设置为“0001”时，请设置该参数
	public static final String private_key = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKzzEv3f+2RSlEaXSlVEp2/ZRVa6EZavxfeqB6s71slX8wuSFrkdx2j2BWpMMhGYM0fld1ZD5MF4bFMAozH62TUHfRxswc/AFMf4tTV3jzchNeRCxDmnI+Fu6f0mTvw5lXcFoIyAb0pBXWDioB8/S5bchMLr3EUF9B890zTd4gBLAgMBAAECgYBCLgmYaDsUWp0unfntwwWnQSbNVwof9Ub1zHR+y7kW9rakONTFJWYG/g14bYvDO9BztJUDx5sjhWc+I8JO/8RZaxVClKUY9pGtC9Waa1Sy/77i+uyghf2Gvc7UvWzRLpdaEln8iPteTapKbM5XpSHemjjIAiWbSiiC6aGD/Kta0QJBAOBDKnmwcGa0CzRP0W+Ur9YAapTJvHeXk1tZnaG1Mqk4Tv5KVFQNXJlt6uOQCjB91z2ycAQPKkct3U9fgvL9hcUCQQDFbOMg0va9Sep2vwlAMZZ/1+Er+LKwyGH3/GPiawxaB9mshkU1odF4kEJAD3xO9OjhfLIObslzLMb7qCs1et7PAkBbtRu5h51vYlDyo3FR38vIB4OONLENdr6brJn5ds+ww4YKFvtFI/GqDHjxdgW0rsFGSaHlBw6S7P6DZtt14pbBAkAT18TgWLPaBKLfOoY4gINq6AzGuaFkKU/HeAOmDzJXnjBfqcMtB82g+4bdH3FUEkOR3lGbJ8FxpQ9+3cEyB957AkEAqaEy5vffZVfxS6oAFC4cL8M3n6bKkQbq2Q14irks38zPRhKLNayBr1QUlGgVQ1h5fS8/EOzo1fhaKtEhYpgzHA==";

    // 支付宝的公钥
    // 如果签名方式设置为“0001”时，请设置该参数
	public static final String ali_public_key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";

	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	

	// 调试用，创建TXT日志文件夹路径
	public static final String log_path = "D:\\";

	// 字符编码格式 目前支持  utf-8
	public static final String input_charset = "utf-8";
	
	// 签名方式，选择项：0001(RSA)、MD5
	public static final String sign_type = "MD5";
	
	// 无线的产品中，签名方式为rsa时，sign_type需赋值为0001而不是RSA
	public static final String sign_type_rsa = "0001";

}
