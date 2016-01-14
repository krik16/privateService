package com.rongyi.easy.rmmm.dto.userlabel;
/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  用户标签信息
 * time:  2015/10/13
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/13              1.0            创建文件
 *
 */

import java.io.Serializable;

public class LabelDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /** 标签名 */
    private String labelName;

    /** 标签类型 ： 1为常用标签  2为用户自定义标签 */
    private Integer labelType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public Integer getLabelType() {
        return labelType;
    }

    public void setLabelType(Integer labelType) {
        this.labelType = labelType;
    }


}
