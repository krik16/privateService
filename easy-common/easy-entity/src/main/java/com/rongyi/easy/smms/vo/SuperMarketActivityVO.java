package com.rongyi.easy.smms.vo;

import java.io.Serializable;

public class SuperMarketActivityVO implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 4218901610790406684L;
    
    /**  */
    private Long id;

    
    private String pic_url;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getPic_url() {
        return pic_url;
    }


    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

}
