package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.CommodityCategory;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品类目类
 *
 * @author yaoyiwei
 * @date 2016-09-20
 * @version 1.0
 */
public class CategoryNodeVO implements Serializable {
    private static final long serialVersionUID = -4158506094352422238L;
    private String id;
    private String name;
    private String logoUrl;//图标
    private Date createAt;//创建时间
    private List<ObjectId> parentIds;// 所有父类id
    private ObjectId parentId;// 直属父类id
    private int type;// 分类级别 1 2 3
    private List<ObjectId> columnIds;// 商品分类对应的规格项id
    private int commodityCount;// 该分类下属商品数量
    private boolean isPopular;// 是否是热门分类 true表示热门分类
    private String popularImg;// 热门分类图片
    private int sequence; // 排序字段,数字越大越靠前
    private List<CategoryNodeVO> children = new ArrayList<>();

    public CategoryNodeVO(CommodityCategory commodityCategory) {
        this.id = commodityCategory.getId().toString();
        this.name = commodityCategory.getName();
        this.logoUrl = commodityCategory.getLogoUrl();
        this.createAt = commodityCategory.getCreateAt();
        this.sequence = commodityCategory.getSequence();
        this.type = commodityCategory.getType();
        this.parentId = commodityCategory.getParentid();
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public List<ObjectId> getParentIds() {
        return parentIds;
    }

    public void setParentIds(List<ObjectId> parentIds) {
        this.parentIds = parentIds;
    }

    public ObjectId getParentId() {
        return parentId;
    }

    public void setParentId(ObjectId parentId) {
        this.parentId = parentId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<ObjectId> getColumnIds() {
        return columnIds;
    }

    public void setColumnIds(List<ObjectId> columnIds) {
        this.columnIds = columnIds;
    }

    public int getCommodityCount() {
        return commodityCount;
    }

    public void setCommodityCount(int commodityCount) {
        this.commodityCount = commodityCount;
    }

    public boolean isPopular() {
        return isPopular;
    }

    public void setIsPopular(boolean isPopular) {
        this.isPopular = isPopular;
    }

    public String getPopularImg() {
        return popularImg;
    }

    public void setPopularImg(String popularImg) {
        this.popularImg = popularImg;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<CategoryNodeVO> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryNodeVO> children) {
        this.children = children;
    }
}
