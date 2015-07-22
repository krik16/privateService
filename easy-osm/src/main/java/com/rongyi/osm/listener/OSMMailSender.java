/** 
* @Title: OSMMailSender.java 
* @Package com.rongyi.osm.listener 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年7月3日 下午6:01:17 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.osm.listener;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Component;

/**
 * @author ZhengYl
 *
 */
@Component
public class OSMMailSender {
	public void sendWarningMail(String mailContent) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("zhengyiliang@rongyi.com");
		mailMessage.setTo("zhuze@rongyi.com");
		mailMessage.setText(mailContent);
		mailMessage.setSubject("OSM Error Report");
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.rongyi.com");
		mailSender.setUsername("zhengyiliang@rongyi.com");
		mailSender.setPassword("samsung28");
		mailSender.send(mailMessage);
	}
}
