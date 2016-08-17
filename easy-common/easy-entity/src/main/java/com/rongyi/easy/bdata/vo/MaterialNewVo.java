package com.rongyi.easy.bdata.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/2.
 */
public class MaterialNewVo implements Serializable {
    private int material_id;//素材id
    private int  content_type;//素材类型 1:jpg,2:mov,3:mp4,4:f4v,5:swf
    private int position;//素材位置
    private String content;//素材内容

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public int getContent_type() {
        return content_type;
    }

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MaterialNewVo{" +
                "material_id=" + material_id +
                ", content_type=" + content_type +
                ", position=" + position +
                ", content='" + content + '\'' +
                '}';
    }
}
