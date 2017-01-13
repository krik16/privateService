package com.rongyi.easy.malllife.param;

import com.rongyi.easy.rmmm.base.BaseParam;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/1/11    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class ShareTitleParam extends BaseParam {

    private static final long serialVersionUID = 1L;

    //类型参数Id
    private String objId;

    //0特卖
    private int type;


    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
