/** 
* @Title: OSMMailSenderConfig.java 
* @Package com.rongyi.osm.listener 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月3日 下午6:10:22 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.listener;

/**
 * @author ZhengYl
 *
 */
public class OSMMailSenderConfig {
	/** 收件人 */
	private String mailTo;

	/** 发件人 */
	private String mailFrom;

	/** SMTP服务器 */
	private String mailHost;

	/** 发件人用户名 */
	private String mailUserName;

	/** 发件人密码 */
	private String mailPassword;

	public String getMailTo() {
		return mailTo;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public String getMailHost() {
		return mailHost;
	}

	public void setMailHost(String mailHost) {
		this.mailHost = mailHost;
	}

	public String getMailUserName() {
		return mailUserName;
	}

	public void setMailUserName(String mailUserName) {
		this.mailUserName = mailUserName;
	}

	public String getMailPassword() {
		return mailPassword;
	}

	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}

	/**
	 * @param mailTo
	 * @param mailFrom
	 * @param mailHost
	 * @param mailUserName
	 * @param mailPassword
	 */
	public OSMMailSenderConfig(String mailTo, String mailFrom, String mailHost, String mailUserName, String mailPassword) {
		super();
		this.mailTo = mailTo;
		this.mailFrom = mailFrom;
		this.mailHost = mailHost;
		this.mailUserName = mailUserName;
		this.mailPassword = mailPassword;
	}

	/**
	 * default constructor
	 */
	public OSMMailSenderConfig() {

	}
}
