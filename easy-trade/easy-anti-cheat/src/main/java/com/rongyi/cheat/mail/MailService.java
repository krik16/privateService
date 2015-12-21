package com.rongyi.cheat.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * @Author: 柯军
 * @Description: TODO
 * @datetime:2015年8月13日下午1:41:59
 * 
 **/
@Service("mailService")
public class MailService {

	@Autowired
	private JavaMailSenderImpl sender;

	protected Logger logger = LoggerFactory.getLogger(MailService.class);

	private int retryTimes = 5;

	private long retryInterval = 60_000;

	public void sendAttachmentEmail() throws  MessagingException, UnsupportedEncodingException {
		Set<String> toAdrs = new HashSet<String>();
		toAdrs.add("kejun@rongyi.com");
		List<String> filenames = new ArrayList<String>();
		// filenames.add("d://my.log");
		this.sendAttachmentEmail("测试邮件", "cwjs@rongyi.com", toAdrs, "发送于： " + new Date(), filenames);
	}

	// 发送带附件的邮件
	public void sendAttachmentEmail(String subject, String fromAdrs, Set<String> toAdrs, String content, List<String> filenames) throws AddressException, MessagingException,
			UnsupportedEncodingException {

		System.setProperty("file.encoding", "UTF-8");

		MimeMessage message = this.sender.createMimeMessage();

		// 第二个参数设置为TRUE，即 multipart=true 时才能发送附件
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		// 设置主题
		// helper.setSubject(subject);
		// helper.setSubject(MimeUtility.encodeText(subject));
		helper.setSubject(MimeUtility.encodeText(subject, "UTF-8", "B")); // B为base64方式
		// 设置发送方邮箱地址
		helper.setFrom(new InternetAddress(fromAdrs));

		// 设置接收方邮箱地址
		InternetAddress[] internetAddress = new InternetAddress[toAdrs.size()];

		Iterator<String> iter = toAdrs.iterator();
		int xx = 0;
		while (iter.hasNext()) {
			internetAddress[xx] = new InternetAddress(iter.next());
			xx++;
		}
		helper.setTo(internetAddress);

		// 发送内容
		helper.setText(content);

		// 附件
		if (filenames != null)
			for (String filename : filenames) {
				FileSystemResource file = new FileSystemResource(new File(filename));
				helper.addAttachment(file.getFilename(), file);
			}
		// 发送邮件
		for (int i = 0; i < this.retryTimes; i++) {
			try {
				this.sender.send(message);
				this.logger.info("Sent mail successfully");
				break;
			} catch (Exception e) {
				e.printStackTrace();
				if (i == this.retryTimes - 1) {
					this.logger.error("Send mail failed after retry {} times!", this.retryTimes);
					break;
				}
				try {
					Thread.sleep(this.retryInterval);
				} catch (InterruptedException e1) {
					this.logger.warn("Send mail process has been blocked. Wait {} seconds and retry {}", this.retryInterval / 1000, i + 1);
				}
			}

		}
	}

	public void setSender(JavaMailSenderImpl sender) {
		this.sender = sender;
	}

	public static void main(String[] args) throws AddressException, MessagingException, UnsupportedEncodingException {
		ApplicationContext context = new ClassPathXmlApplicationContext("./spring/applicationContext-mail.xml");
		MailService demo = (MailService) context.getBean("mailService");
		demo.sendAttachmentEmail();
	}
}
