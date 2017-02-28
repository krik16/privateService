package com.rongyi.core.framework.spring.file;

import org.springframework.util.Assert;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;



/**
 * Description:
 * Author: yb
 * DATE: 2017/2/14 12:51
 * Package:com.rongyi.coupon.convertor
 * Project:easy-market
 */

public class MailMultipartFile implements MultipartFile ,Serializable{

        private final String name;

        private String originalFilename;

        private String contentType;

        private final byte[] content;



        public MailMultipartFile(String name, byte[] content) {
            this(name, "", null, content);
        }


        public MailMultipartFile(String name, InputStream contentStream) throws IOException {
            this(name, "", null, FileCopyUtils.copyToByteArray(contentStream));
        }


        public MailMultipartFile(String name, String originalFilename, String contentType, byte[] content) {
            Assert.hasLength(name, "Name must not be null");
            this.name = name;
            this.originalFilename = (originalFilename != null ? originalFilename : "");
            this.contentType = contentType;
            this.content = (content != null ? content : new byte[0]);
        }


        public MailMultipartFile(String name, String originalFilename, String contentType, InputStream contentStream)
            throws IOException {

            this(name, originalFilename, contentType, FileCopyUtils.copyToByteArray(contentStream));
        }

        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public String getOriginalFilename() {
            return this.originalFilename;
        }

        @Override
        public String getContentType() {
            return this.contentType;
        }

        @Override
        public boolean isEmpty() {
            return (this.content.length == 0);
        }

        @Override
        public long getSize() {
            return this.content.length;
        }

        @Override
        public byte[] getBytes() throws IOException {
            return this.content;
        }

        @Override
        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(this.content);
        }

        @Override
        public void transferTo(File dest) throws IOException, IllegalStateException {
            FileCopyUtils.copy(this.content, dest);
        }
    }

