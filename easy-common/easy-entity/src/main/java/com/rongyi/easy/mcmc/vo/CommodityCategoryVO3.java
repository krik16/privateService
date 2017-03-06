package com.rongyi.easy.mcmc.vo;



import com.rongyi.easy.mcmc.CommodityCategory;
import com.rongyi.easy.mcmc.vo.commodity.CommoditySpecColumnVo3;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by xuying on 2017/2/22.
 */
public class CommodityCategoryVO3 implements Serializable{

    /**
	 *
	 */
	private static final long serialVersionUID = -239360496140548419L;
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
    private List<CommoditySpecColumnVo3> commoditySpecColumnVo3List;

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

    public static  CommodityCategoryVO3 copyTovo3(CommodityCategory commodityCategory){
        CommodityCategoryVO3 vo3=new CommodityCategoryVO3();
        vo3.setId(commodityCategory.getId().toString());
        vo3.setName(commodityCategory.getName());
        vo3.setLogoUrl(commodityCategory.getLogoUrl());
        vo3.setCreateAt(commodityCategory.getCreateAt());
        vo3.setParentids(CollectionUtils.isEmpty(commodityCategory.getParentids())?null:getStrForObjectId(commodityCategory.getParentids()));
        vo3.setParentid(null ==commodityCategory.getParentid()?"":commodityCategory.getParentid().toString()) ;
        vo3.setType(commodityCategory.getType());
        vo3.setColumnIds(CollectionUtils.isEmpty(commodityCategory.getColumnIds())?null:getStrForObjectId(commodityCategory.getColumnIds()));
        vo3.setPopularImg(commodityCategory.getPopularImg());
        vo3.setSequence(commodityCategory.getSequence());
       return vo3;
    }

    public List<CommoditySpecColumnVo3> getCommoditySpecColumnVo3List() {
        return commoditySpecColumnVo3List;
    }

    public void setCommoditySpecColumnVo3List(List<CommoditySpecColumnVo3> commoditySpecColumnVo3List) {
        this.commoditySpecColumnVo3List = commoditySpecColumnVo3List;
    }

    public static List<String> getStrForObjectId(List<ObjectId> objectIds){
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
