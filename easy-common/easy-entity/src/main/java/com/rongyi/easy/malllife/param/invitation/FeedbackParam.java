package com.rongyi.easy.malllife.param.invitation;

import com.rongyi.easy.rmmm.base.BaseParam;

/*
 * Description:  
 * time:  2016/8/26
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * yuzhijian             2016/8/26              1.0            创建文件
 * Author   yuzhijian@rongyi.com || yuxia2217@163.com
 * Copyright (C),上海容易网电子商务有限公司
 */
public class FeedbackParam extends BaseParam {


    private String content;
    private String userName;
    private String userPhone;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
