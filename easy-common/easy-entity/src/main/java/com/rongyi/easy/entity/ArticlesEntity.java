package com.rongyi.easy.entity;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/*
 * Copyright (C),上海容易网电子商务有限公司
 * Author:  俞志坚
 * Description:  文章管理
 * time:  2015/6/5
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * 俞志坚             2015/6/5              1.0            创建文件
 *
 */
@Entity(value = "articles", noClassnameStored = true)
public class ArticlesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;// 表id

    @Property("abstract")
    private String abstracts;

    private String article_image;// : "001.jpg",

    private String author;//作者

    @Property("belonger_id")
    private String belongerId;

    @Property("belonger_type")
    private String belongerType;


    @Property("categories")
    private Set<String> categories;


    @Property("category")
    private String category;
    private String content;
    private String copyright;

    @Property("created_at")
    private Date createdAt;
    private String hits;


    @Property("is_a_draft")
    private Boolean isADraft;

    @Property("published_at")
    private Date publishedAt;

    private String slug;
    private String source;
    private String tags;
    private String title;

    @Property("updated_at")
    private Date updatedAt;


    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getArticle_image() {
        return article_image;
    }

    public void setArticle_image(String article_image) {
        this.article_image = article_image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBelongerId() {
        return belongerId;
    }

    public void setBelongerId(String belongerId) {
        this.belongerId = belongerId;
    }

    public String getBelongerType() {
        return belongerType;
    }

    public void setBelongerType(String belongerType) {
        this.belongerType = belongerType;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getHits() {
        return hits;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public Boolean getIsADraft() {
        return isADraft;
    }

    public void setIsADraft(Boolean isADraft) {
        this.isADraft = isADraft;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }
}
