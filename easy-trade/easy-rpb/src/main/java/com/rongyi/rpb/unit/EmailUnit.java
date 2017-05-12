package com.rongyi.rpb.unit;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: 柯军
 * @Description: 邮件服务
 * @datetime:2015年8月13日下午1:41:59
 **/
@Repository
public class EmailUnit {

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailUnit.class);

    private int retryTimes = 5;

    private long retryInterval = 60000;

    // 发送带附件的邮件
    public boolean sendAttachmentEmail(String subject, String fromAdrs, Set<String> toAdrs, String content, List<String> filenames) throws MessagingException,
            UnsupportedEncodingException {
        boolean result = false;//发送结果
        System.setProperty("file.encoding", "UTF-8");

        MimeMessage message = this.javaMailSender.createMimeMessage();

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
                this.javaMailSender.send(message);
                LOGGER.info("Sent mail successfully");
                result = true;
                break;
            } catch (Exception e) {
                e.printStackTrace();
                if (i == this.retryTimes - 1) {
                    LOGGER.error("Send mail failed after retry {} times!", this.retryTimes);
                    break;
                }
                try {
                    Thread.sleep(this.retryInterval);
                } catch (InterruptedException e1) {
                    LOGGER.warn("Send mail process has been blocked. Wait {} seconds and retry {}", this.retryInterval / 1000, i + 1);
                }
            }

        }
        return result;
    }
}
