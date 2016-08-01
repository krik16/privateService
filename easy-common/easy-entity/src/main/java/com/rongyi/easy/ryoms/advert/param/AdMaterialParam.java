package com.rongyi.easy.ryoms.advert.param;

import java.io.Serializable;

/**
 * Created by shaozhou on 2016/8/1.
 */
public class AdMaterialParam implements Serializable {
    private String material_id;//关联素材id 多个用逗号隔开 素材模板为 13 全屏模板-C的时候 传两个素材
    private Integer position;//图片位置

    public String getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(String material_id) {
        this.material_id = material_id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "AdMaterialParam{" +
                "material_id='" + material_id + '\'' +
                ", position=" + position +
                '}';
    }
}
