package com.rongyi.easy.roa.param;

import java.io.Serializable;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * 俞志坚       2017/1/22    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class SensitiveParam  implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String content;//检查 内容

   /* (0, "未知类型"), (1,"评论"), (3,"昵称"), (2,"商品名称"),(4,"商品描述"), (5,"商品规格"),
            (6,"卡券名称"),
            (7,"卡券使用限制"),
            (8,"卡券使用方式"),
            (9,"店铺公告"),
            (10,"直播名称"),
            (11,"买手简介"),
            (12,"手机短信");*/
    private int type=0;//


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
