package com.rongyi.easy.solr;

import com.rongyi.core.util.Pinyin4jUtil;
import com.rongyi.easy.entity.BrandEntity;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangzehui on 2016/1/21.
 */
public class BrandDocument implements Serializable{

    private static final long serialVersionUID = -6516058338575306587L;

    private String id;

    @Field
    private String name;
    @Field
    private String cname;
    @Field
    private String ename;
    @Field
    private String operator_id;//
    @Field
    private String icon;//品牌图标
    @Field
    private String key_tags;//关键标签，shop需要
    @Field
    private Date created_at;//创建时间
    @Field
    private Date updated_at;//更新时间
    @Field
    private ArrayList<ObjectId> category_ids;
    @Field
    private ArrayList<String> category_tags;//品类
    @Field
    private ArrayList<String> aliases;//别名
    @Field
    private String shopCount;
    //进行空值判断，不建索引，1表示有值
    @Field
    private String tags;
    @Field
    private String description;
    @Field
    private String average_consumption;
    @Field
    private String valid;
    @Field
    private String slug;//名称拼音

    public BrandDocument() {
    }

    public BrandDocument(BrandEntity brand) throws Exception {
        if(brand==null)
            return;
        BeanUtils.copyProperties(this,brand);
        brand.setIcon("/system/brand/icon/"+brand.getId().toString()+"/"+brand.getIcon());
        if(StringUtils.isNotBlank(brand.getTags()))
            this.setTags("1");
        else
            this.setTags(null);
        if(StringUtils.isNotBlank(brand.getDescription()))
            this.setDescription("1");
        else
            this.setDescription(null);
        if(StringUtils.isNotBlank(brand.getAverage_consumption()))
            this.setAverage_consumption("1");
        //slug
        if(StringUtils.isNotBlank(brand.getName())){
            List<String> pinyins = Pinyin4jUtil.converterToSpell(brand.getName());
            if (CollectionUtils.isNotEmpty(pinyins)) {
                this.setSlug(pinyins.get(0));
            } else {
                this.setSlug(brand.getName());
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getOperator_id() {
        return operator_id;
    }

    public void setOperator_id(String operator_id) {
        this.operator_id = operator_id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKey_tags() {
        return key_tags;
    }

    public void setKey_tags(String key_tags) {
        this.key_tags = key_tags;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public ArrayList<ObjectId> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(ArrayList<ObjectId> category_ids) {
        this.category_ids = category_ids;
    }

    public ArrayList<String> getCategory_tags() {
        return category_tags;
    }

    public void setCategory_tags(ArrayList<String> category_tags) {
        this.category_tags = category_tags;
    }

    public ArrayList<String> getAliases() {
        return aliases;
    }

    public void setAliases(ArrayList<String> aliases) {
        this.aliases = aliases;
    }

    public String getShopCount() {
        return shopCount;
    }

    public void setShopCount(String shopCount) {
        this.shopCount = shopCount;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAverage_consumption() {
        return average_consumption;
    }

    public void setAverage_consumption(String average_consumption) {
        this.average_consumption = average_consumption;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
