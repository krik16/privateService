package com.rongyi.easy.mcmc.vo.commodity;

import java.io.Serializable;

/**
 * Created by xuying on 2017/2/23.
 */
public class CommodityCheckSensitiveWordsVo implements Serializable{

    private String  content;

    private Integer type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CommodityCheckSensitiveWordsVo(String a,Integer b){
        this.content=a;
        this.type=b;
    }
}
