package com.rongyi.easy.malllife.param;

import com.rongyi.easy.rmmm.base.BaseParam;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian      2016/6/29    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class UninstallParam extends BaseParam implements Serializable {

    private static final long serialVersionUID = 1L;

    private int isAgain ;//0 卸载 1回心转意,
    /*卸载原因 1 界面不美、2 商品太贵啦、3 太费流量啦、4 没想要的优惠信息、5 喜欢上别人啦 6 我要吐槽,*/
    private int  unType=0;

    private String content;//吐槽内容,


    public int getIsAgain() {
        return isAgain;
    }

    public void setIsAgain(int isAgain) {
        this.isAgain = isAgain;
    }

    public int getUnType() {
        return unType;
    }

    public void setUnType(int unType) {
        this.unType = unType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
