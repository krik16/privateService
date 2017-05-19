package com.rongyi.rpb.bizz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SendFactory {

	@Autowired
	private SendMail sendMail;

	public SendProvider sendMail() {
		return sendMail;
	}
}