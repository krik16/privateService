package com.rongyi.easy.bdata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class BrandVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brandId;
    private String address;
    private List<String> aliases;
    private String cateTags;
    private List<String> cateIds;
    private String name;
    private Date createdAt;
    private String description;
    private int valid;
    private String cname;
    private String ename;
    private String averageConsumption;
    private String icon;
    private String slug;
    private String telephone;
    private List<BrandsCategoryVO> categories;
    private String tags;

    public String getBrandId() {
        return brandId;
    }

    public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setBrandId(String brandId) {
        this.brandId = brandId;
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

    public String getCateTags() {
        return cateTags;
    }

    public void setCateTags(String cateTags) {
        this.cateTags = cateTags;
    }

    public List<String> getCateIds() {
        return cateIds;
    }

    public void setCateIds(List<String> cateIds) {
        this.cateIds = cateIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public String getAverageConsumption() {
        return averageConsumption;
    }

    public void setAverageConsumption(String averageConsumption) {
        this.averageConsumption = averageConsumption;
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

    public List<BrandsCategoryVO> getCategories() {
        return categories;
    }

    public void setCategories(List<BrandsCategoryVO> categories) {
        this.categories = categories;
    }
}