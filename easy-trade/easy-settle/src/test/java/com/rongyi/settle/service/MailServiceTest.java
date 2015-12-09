package com.rongyi.settle.service;

import com.rongyi.settle.BaseTest;
import com.rongyi.settle.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.UnsupportedEncodingException;

public class MailServiceTest extends BaseTest {
	
	@Autowired
	MailService mailService;
	
//	@Test
	public void testSendMail(){
		try {
			mailService.sendAttachmentEmail();
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
