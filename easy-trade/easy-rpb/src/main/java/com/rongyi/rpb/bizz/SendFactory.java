package com.rongyi.rpb.bizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SendFactory {

	@Autowired
	private static SendMail sendMail;

	public static SendProvider sendMail() {
		return sendMail;
	}

	public static SendMail getSendMail() {
		return sendMail;
	}

	@Autowired
	public void setSendMail(SendMail sendMail) {
		SendFactory.sendMail = sendMail;
	}
	
}