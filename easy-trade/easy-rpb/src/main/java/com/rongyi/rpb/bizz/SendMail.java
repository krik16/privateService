package com.rongyi.rpb.bizz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rongyi.easy.rpb.dto.SendDto;
import com.rongyi.rpb.unit.EmailUnit;

@Repository
public class SendMail implements SendProvider {

	private static final Logger log = LoggerFactory.getLogger(SendMail.class);

	private static String SUBJECT = "微众对账单";
	private static String FROM_ADRS = "cwjs@rongyi.com";

	@Autowired
	private EmailUnit emailUnit;

	@Override
	public void send(SendDto sendDto) {
		log.info("发送邮件！！！");
		try {
			emailUnit.sendAttachmentEmail(SUBJECT, FROM_ADRS, sendDto.getToAddsSet(), sendDto.getFileName(),
					sendDto.getFileNameList());
		} catch (Exception e) {
			log.error("发送邮件异常: sendDto: " + sendDto.toString(), e);
		}
	}

}
