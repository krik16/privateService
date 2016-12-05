package com.rongyi.easy.msgcenter.wx;

import java.io.Serializable;

/**
 * Description:
 * Author: 袁波
 * DATE: 2016/3/21 14:46
 * Package:com.rongyi.message.entity.dto
 * Project:easy-common
 */
public class WXMsgContent implements Serializable {
    private String first;
    private String keyword1;
    private String keyword2;
    private String keyword3;
    private String keyword4;
    private String keyword5;
    private String remark;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(String keyword1) {
        this.keyword1 = keyword1;
    }

    public String getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(String keyword2) {
        this.keyword2 = keyword2;
    }

    public String getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(String keyword3) {
        this.keyword3 = keyword3;
    }

    public String getKeyword4() {
        return keyword4;
    }

    public void setKeyword4(String keyword4) {
        this.keyword4 = keyword4;
    }

    public String getKeyword5() {
        return keyword5;
    }

    public void setKeyword5(String keyword5) {
        this.keyword5 = keyword5;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WXMsgContent{");
        sb.append("first='").append(first).append('\'');
        sb.append(", keyword1='").append(keyword1).append('\'');
        sb.append(", keyword2='").append(keyword2).append('\'');
        sb.append(", keyword3='").append(keyword3).append('\'');
        sb.append(", keyword4='").append(keyword4).append('\'');
        sb.append(", keyword5='").append(keyword5).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
