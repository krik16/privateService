package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/6/30    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class RedConfigVo implements Serializable {

    static final long serialVersionUID = 1L;

    private  String redTitle;//标题
    private  String redContent;//内容
    private  String redButton;//按钮
    private  String redPic;//背景图片

    public String getRedTitle() {
        return redTitle;
    }

    public void setRedTitle(String redTitle) {
        this.redTitle = redTitle;
    }

    public String getRedContent() {
        return redContent;
    }

    public void setRedContent(String redContent) {
        this.redContent = redContent;
    }

    public String getRedButton() {
        return redButton;
    }

    public void setRedButton(String redButton) {
        this.redButton = redButton;
    }

    public String getRedPic() {
        return redPic;
    }

    public void setRedPic(String redPic) {
        this.redPic = redPic;
    }
}
