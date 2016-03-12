package com.rongyi.easy.rmmm.param.system;/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  
 * time:  2016/3/11
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2016/3/11              1.0            创建文件
 *
 */

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

public class RegionParam  extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private  Integer parentId ; //parentId （查询所有省传1）


    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}
