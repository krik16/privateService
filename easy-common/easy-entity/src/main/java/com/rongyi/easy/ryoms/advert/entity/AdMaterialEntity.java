package com.rongyi.easy.ryoms.advert.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 广告/默认素材与素材关联 实体
 * Created by shaozhou on 2016/8/1.
 */
public class AdMaterialEntity implements Serializable {
    private Integer id;//id
    private Integer adfault_id;//广告/默认素材 id
    private Integer material_id;//素材id
    private Integer create_by;// 创建人
    private Date create_at;//创建时间
    private Integer update_by;//更新人
    private Date update_at;//更新时间
    private Integer type;//关联类型 1 广告 2 默认素材
    private Integer position;//素材对应的位置

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdfault_id() {
        return adfault_id;
    }

    public void setAdfault_id(Integer adfault_id) {
        this.adfault_id = adfault_id;
    }

    public Integer getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(Integer material_id) {
        this.material_id = material_id;
    }

    public Integer getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Integer create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Integer getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(Integer update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
