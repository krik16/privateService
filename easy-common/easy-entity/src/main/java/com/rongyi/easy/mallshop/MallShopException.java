package com.rongyi.easy.mallshop;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/5/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/5/13              1.0            创建文件
 *
 */
public class MallShopException extends Exception {


    public MallShopException(){

    }

    public MallShopException(String message) {
        super(message) ;
    }

    public MallShopException(String message, Throwable cause) {
        super(message, cause);
    }

    public MallShopException(Throwable cause) {
        super(cause);
    }

    public MallShopException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
