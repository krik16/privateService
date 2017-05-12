package com.rongyi.rpb.bizz;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rongyi.core.common.PropertyConfigurer;
import com.rongyi.easy.rpb.dto.SendDto;
import com.rongyi.pay.core.webank.config.WebankConfigure;
import com.rongyi.pay.core.webank.util.HttpUtil;
import com.rongyi.rpb.util.FTPHelper;
import com.rongyi.rpb.util.FtpUtil;

@Repository
public class StatementBizz implements InitializingBean {

	@Autowired
	private PropertyConfigurer propertyConfigurer;

	private FTPHelper ftpHelper;

	private static Set<String> TO_ADRS_SET = new HashSet<>();
	static {
		TO_ADRS_SET.add("wudi@rongyi.com");
	}
	/**
	 * @Description 接受对账单文件流, 并写入到服务器
	 */
	public void writeStatementFile(Map<String, String> paramMap) {
		// 调用微众获取对账单请求
		String url = MessageFormat.format(propertyConfigurer.getProperty("WEBANK_STATEMENT_URL"),
				paramMap.get("app_id"), paramMap.get("token"), paramMap.get("file_id"), "1.0.0");
		String DateStr = DateUtils.formatDate(new Date(), "yyyyMMdd");
		String fileName = "webank-" + DateStr + ".txt";
		try {
			InputStream is = HttpUtil.httpGet(url, WebankConfigure.getInstance());

			this.writeFile(is, fileName);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		SendDto sendDto = new SendDto();
		sendDto.setToAddsSet(TO_ADRS_SET);
		sendDto.setFileName(fileName);
		// 发送邮件
		this.syncSendMail(sendDto);
	}

	// 异步发送邮件
	private void syncSendMail(final SendDto sendDto) {
		new Thread() {
			public void run() {
				this.sendMail(sendDto);
			}

			// 发送邮件
			private void sendMail(SendDto sendDto) {
				SendProvider sendMail = SendFactory.sendMail();
				sendMail.send(sendDto);
			}
		}.start();
	}

	private void writeFile(InputStream is, String fileName) throws IOException {
		// upload
		FtpUtil.uploadFile(ftpHelper, is, fileName, "utf-8");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		String url = propertyConfigurer.getProperty("ftp.ip");
		String port = propertyConfigurer.getProperty("ftp.port");
		if (StringUtils.isBlank(port)) {
			port = "21";
		}
		String username = propertyConfigurer.getProperty("ftp.userName");
		String password = propertyConfigurer.getProperty("ftp.password");
		String remotePath = propertyConfigurer.getProperty("ftp.path");
		ftpHelper = new FTPHelper(url, Integer.parseInt(port), username, password, remotePath);
	}
}