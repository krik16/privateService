package com.rongyi.core.framework.exception;


import java.io.Serializable;
import com.rongyi.core.constant.IErrorCode;
/**
 * Description:
 * Author: 袁波
 * DATE: 2016/5/25 18:13
 * Package:com.rongyi.code.exception
 * Project:easy-market
 */
public class CodeServiceException extends RuntimeException implements Serializable {
        private IErrorCode iErrorCode;

        private int errorNo;

        public CodeServiceException(){
            super();
        }

        public CodeServiceException(IErrorCode code){
            super(code.getErrorMessage());
            this.errorNo=code.getErrorNo();
            this.iErrorCode=code;
        }
        public CodeServiceException(int errorNo, String message){
            super(message);
            this.errorNo=errorNo;
        }

        public CodeServiceException(String message){
            super(message);
        }

        public IErrorCode getiErrorCode() {
            return iErrorCode;
        }

        public void setiErrorCode(IErrorCode iErrorCode) {
            this.iErrorCode = iErrorCode;
        }

        public int getErrorNo() {
            return errorNo;
        }

        public void setErrorNo(int errorNo) {
            this.errorNo = errorNo;
        }
    }
