package com.rongyi.cheat.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.rongyi.cheat.BaseTest;
import com.rongyi.cheat.mail.MailService;

public class MailServiceTest extends BaseTest{
	
	@Autowired
	MailService mailService;
	
	@Test
	public void testSendMail(){
		try {
			mailService.sendAttachmentEmail();
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
