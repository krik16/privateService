package com.rongyi.easy.malllife.param;

import java.io.Serializable;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2015/7/1
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/7/1              1.0            创建文件
 *
 */
public class MalllifeQrCode implements Serializable {

    private static final long serialVersionUID = 1L;


    private String devCode; //机器码

    private String qrCode;//二维码


    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
