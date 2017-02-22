package com.rongyi.easy.mcmc.vo;



import com.rongyi.easy.mcmc.CommodityCategory;
import org.apache.commons.collections.CollectionUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2017/2/22.
 */
public class CommodityCategoryVO3 implements Serializable{

    private String id;
    private String name;//分类名
    private String logoUrl;//图标
    private Date createAt;//创建时间
    private List<String> parentids;//所有父类id
    private String parentid;//直属父类id
    private int type;//分类级别 1 2 3
    private List<String> columnIds;//商品分类对应的规格项id
    private boolean isPopular;//是否是热门分类 true表示热门分类
    private String popularImg;//热门分类图片
    private int sequence ; ///< 排序字段,数字越大越靠前

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

    public List<String> getParentids() {
        return parentids;
    }

    public void setParentids(List<String> parentids) {
        this.parentids = parentids;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<String> getColumnIds() {
        return columnIds;
    }

    public void setColumnIds(List<String> columnIds) {
        this.columnIds = columnIds;
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

    public CommodityCategoryVO3 (CommodityCategory commodityCategory){
        this.id=commodityCategory.getId().toString();
        this.name=commodityCategory.getName();
        this.logoUrl=commodityCategory.getLogoUrl();
        this.createAt=commodityCategory.getCreateAt();
        this.parentids=this.getStrForObjectId(commodityCategory.getParentids());
        this.parentid=commodityCategory.getParentid().toString();
        this.type=commodityCategory.getType();
        this.columnIds=this.getStrForObjectId(commodityCategory.getColumnIds());
        this.popularImg=commodityCategory.getPopularImg();
        this.sequence=commodityCategory.getSequence();

    }

    private List<String> getStrForObjectId(List<ObjectId> objectIds){
        List<String> strList=new ArrayList<>();
        if(CollectionUtils.isNotEmpty(objectIds)){
            for(ObjectId objectId:objectIds){
                strList.add(objectId.toString());
            }
        }
        return strList;
    }


    public static List<ObjectId> getObjectIdsForsrt(List<String> strs){
        List<ObjectId> objectIdList=new ArrayList<>();
        if(CollectionUtils.isNotEmpty(strs)){
            for(String str:strs){
                if(str.matches("[\\da-zA-Z]{24}")){
                    objectIdList.add(new ObjectId(str));
                }
            }
        }
        return objectIdList;
    }

    @Override
    public String toString() {
        return "CommodityCategory{" +
                "columnIds=" + columnIds +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", createAt=" + createAt +
                ", parentids=" + parentids +
                ", parentid=" + parentid +
                ", type=" + type +
                ", sequence=" + sequence +
                ", isPopular=" + isPopular +
                ", popularImg='" + popularImg + '\'' +
                '}';
    }
}
