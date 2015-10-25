package com.rongyi.easy.bdata.shop;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 品牌
 * @author rongyi
 *
 */
@Entity("brands")
public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 品牌id
     */
    @Id
    private ObjectId id;
    /**
     * 品牌地址
     */
    private String address;
    /**
     * 品牌别名
     */
    private List<String> aliases;
    /**
     * 中文名
     */
    private String cname;
    /**
     * 英文名
     */
    private String ename;
    /**
     * 平均消费
     */
    private String average_consumption;
    /**
     * 品牌logo
     */
    private String icon;
    /**
     * 备注
     */
    private String slug;
    /**
     * 电话
     */
    private String telephone;
    /**
     * 品牌分类tag
     */
    private String categories_tags;
    /**
     * 品牌分类id
     */
    private List<ObjectId> category_ids;
    /**
     * 品牌名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date created_at;
    /**
     * 描述
     */
    private String description;
    /**
     * 状态
     */
    private int valid;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public String getCategories_tags() {
        return categories_tags;
    }

    public void setCategories_tags(String categories_tags) {
        this.categories_tags = categories_tags;
    }

    public List<ObjectId> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(List<ObjectId> category_ids) {
        this.category_ids = category_ids;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValid() {
        return valid;
    }

    public void setValid(int valid) {
        this.valid = valid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAverage_consumption() {
        return average_consumption;
    }

    public void setAverage_consumption(String average_consumption) {
        this.average_consumption = average_consumption;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
