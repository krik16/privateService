package com.rongyi.easy.malllife.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

@Entity(value = "articles", noClassnameStored = true)
public class ArticlesEntity implements Serializable{
	@Id
    private ObjectId id;
	@Property("abstract")
	private String abstractT;//摘要
	@Property("article_image")
	private String articleImage;//文章图片   图片的名称
	@Property("author")
	private String author;//作者
	@Property("belonger_id")
	private String belongerId;//这个文章属于那个类型的id
	@Property("belonger_type")
	private String belongerType;//这个是文章属于的类型
	@Property("categories")
	private List<String> categories;//商场id
	@Property("category")
	private String category;//描述
	@Property("content")
	private String content;//内容
	@Property("copyright")
	private String copyRight;//版权声明
	@Property("hits")
	private Integer hits;//热度
	@Property("is_a_draft")
	private Boolean isADdraft;
	@Property("published_at")
	private Date publishedAt;//时间
	@Property("slug")
	private String slug;//起止时间
	@Property("source")
	private String soruce;//资源名称
	@Property("tags")
	private List<String> tags;//标签
	@Property("title")
	private String title;//标题
	@Property("updated_at")
	private Date updateAt;//修改时间
	@Property("updated_time")
	private Date updateTime;//修改时间
	@Property("user_id")
	private String userId;//用户id
	@Property("city_id")
	private ObjectId cityId;//id
	@Property("created_at")
	private Date createAt;//创建时间
	@Property("operator")
	private String operator;//操作人
	@Property("article_type")
	private Integer articleType;//文章类型
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getAbstractT() {
		return abstractT;
	}
	public void setAbstractT(String abstractT) {
		this.abstractT = abstractT;
	}
	public String getArticleImage() {
		return articleImage;
	}
	public void setArticleImage(String articleImage) {
		this.articleImage = articleImage;
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
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
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
	public String getCopyRight() {
		return copyRight;
	}
	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}
	public Boolean getIsADdraft() {
		return isADdraft;
	}
	public void setIsADdraft(Boolean isADdraft) {
		this.isADdraft = isADdraft;
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
	public String getSoruce() {
		return soruce;
	}
	public void setSoruce(String soruce) {
		this.soruce = soruce;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ObjectId getCityId() {
		return cityId;
	}
	public void setCityId(ObjectId cityId) {
		this.cityId = cityId;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Integer getArticleType() {
		return articleType;
	}
	public void setArticleType(Integer articleType) {
		this.articleType = articleType;
	}
	
}
