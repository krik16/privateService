package com.rongyi.easy.rmmm.param.user;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  标签参数
 * time:  2015/10/16
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/10/16              1.0            创建文件
 *
 */

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;
import java.util.List;

public class LavelParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    List<String> labelList;

    private String labelName;

    private Integer labelId;

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
