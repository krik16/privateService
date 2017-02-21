package com.rongyi.easy.solr;

import com.rongyi.core.util.ListUtil;
import com.rongyi.core.util.Pinyin4jUtil;
import com.rongyi.easy.entity.BrandEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.solr.client.solrj.beans.Field;
import org.bson.types.ObjectId;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangzehui on 2016/1/21.
 */
public class BrandDocument implements Serializable{

    private static final long serialVersionUID = -6516058338575306580L;

    @Field
    private String id;
    @Field("name")
    private String name;
    @Field("cname")
    private String cname;
    @Field("ename")
    private String ename;
    @Field("operator_id")
    private String operator_id;
    @Field("icon")
    private String icon;//品牌图标
    @Field("key_tags")
    private String key_tags;//关键标签，shop需要
    @Field("created_at")
    private Date created_at;//创建时间
    @Field("updated_at")
    private Date updated_at;//更新时间
    @Field("category_ids")
    private List<String> category_ids;
    @Field("category_tags")
    private List<String> category_tags;//品类
    @Field("aliases")
    private List<String> aliases;//别名
    @Field("shopcount")
    private Long shopcount;
    //进行空值判断，不建索引，1表示有值
    @Field("tags")
    private String tags;
    @Field("description")
    private String description;
    @Field("average_consumption")
    private String average_consumption;
    @Field("valid")
    private String valid;
    @Field("slug")
    private String slug;//名称拼音

    public BrandDocument() {
    }

    public BrandDocument(BrandEntity brand) throws Exception {
        if(brand==null)
            return;
        BeanUtils.copyProperties(brand,this);
        if(CollectionUtils.isNotEmpty(brand.getCategory_ids()))
            category_ids= ListUtil.toStringList(brand.getCategory_ids());
        icon="/system/brand/icon/"+brand.getId().toString()+"/"+brand.getIcon();
        if(StringUtils.isNotBlank(brand.getTags()))
            tags="1";
        if(StringUtils.isNotBlank(brand.getDescription()))
            description="1";
        if(StringUtils.isNotBlank(brand.getAverage_consumption()))
            average_consumption="1";
        if(StringUtils.isBlank(valid))
            valid="0";
        //slug
        if(StringUtils.isNotBlank(brand.getName())){
            List<String> pinyins = Pinyin4jUtil.converterToSpell(brand.getName());
            if (CollectionUtils.isNotEmpty(pinyins)) {
                slug=pinyins.get(0);
            } else {
                slug=brand.getName();
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

    public List<String> getCategory_ids() {
        return category_ids;
    }

    public void setCategory_ids(ArrayList<String> category_ids) {
        this.category_ids = category_ids;
    }

    public List<String> getCategory_tags() {
        return category_tags;
    }

    public void setCategory_tags(ArrayList<String> category_tags) {
        this.category_tags = category_tags;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Long getShopcount() {
        return shopcount;
    }

    public void setShopcount(Long shopcount) {
        this.shopcount = shopcount;
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
