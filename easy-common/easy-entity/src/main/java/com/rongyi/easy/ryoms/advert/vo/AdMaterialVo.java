package com.rongyi.easy.ryoms.advert.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/1.
 */
public class AdMaterialVo implements Serializable {
    private int id;//id
    private int adfault_id;//广告或默认素材id
    private int material_id;//素材id
    private int  content_type;//素材类型
    private int position;//素材位置
    private String content;//素材内容
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAdfault_id() {
        return adfault_id;
    }
    public void setAdfault_id(int adfault_id) {
        this.adfault_id = adfault_id;
    }
    public int getMaterial_id() {
        return material_id;
    }
    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public int getContent_type() {
        return content_type;
    }
    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "AdMaterialVo{" +
                "id=" + id +
                ", adfault_id=" + adfault_id +
                ", material_id=" + material_id +
                ", content_type=" + content_type +
                ", position=" + position +
                ", content='" + content + '\'' +
                '}';
    }
}
