package com.rongyi.easy.page;

import java.io.Serializable;

/**
 * Descriptions:
 * Created by 袁波
 * Created at 2015/8/19 18:31.
 */
public class Form implements Serializable{
    private String formName;//表名
    private String asName;//表别名

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }

    public Form(String formName) {
        this.formName = formName;
    }
}
