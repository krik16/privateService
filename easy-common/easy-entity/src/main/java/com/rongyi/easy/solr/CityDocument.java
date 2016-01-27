package com.rongyi.easy.solr;

import com.mongodb.BasicDBObject;
import com.rongyi.core.util.Pinyin4jUtil;
import com.rongyi.easy.mcmc.Zones;
import com.rongyi.easy.roa.entity.CategoriesEntity;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by wangzehui on 2016/1/22.
 */
public class CityDocument implements Serializable{

    private static final long serialVersionUID = -6516058338575306587L;

    private String id;

    //private String icon;
    private String var_name_chinese;

    private String text;

    private String type;

    private String area1;

    private String area2;

    private String area3;

    private String area4;

    private String zone;

    /*private String slug;

    private String location;

    private String address;

    private String description;

    private ArrayList<String> zoneList;

    private ArrayList<String> zoneIds;

    private ArrayList<String> tags;

    private String rank;

    private String valid;

    private String appearance_pic;

    private String telephone; //新增电话 app四期*/

    public CityDocument(Zones zone) {
        if(zone==null)
            return;
        if(StringUtils.isNotBlank(zone.getName())){
            this.setVar_name_chinese(Pinyin4jUtil.tripBracket(zone.getName()));
            this.setText(Pinyin4jUtil.tripBracket(zone.getName()));
        }
        this.setType(zone.get_type());
        if(StringUtils.isNotBlank(zone.get_type())
                &&(zone.get_type().equals("City")||zone.get_type().equals("District")))
            this.setZone("1");
        if(CollectionUtils.isNotEmpty(zone.getParent_ids())){
            if(zone.getParent_ids().size()>=1)
                this.setArea1(zone.getParent_ids().get(0).toString());
            if(zone.getParent_ids().size()>=2)
                this.setArea1(zone.getParent_ids().get(1).toString());
            if(zone.getParent_ids().size()>=3)
                this.setArea3(zone.getParent_ids().get(2).toString());
            if(zone.getParent_ids().size()>=4)
                this.setArea4(zone.getParent_ids().get(3).toString());
        }

        /*if(StringUtils.isNotBlank(zone.getName())){
            this.setName(Pinyin4jUtil.tripBracket(zone.getName()));
        }
        if(zone.getMall_valid()!=0)
                this.setValid("1");
        else
            this.setValid("0");
        if(CollectionUtils.isNotEmpty(zone.getMain_categories())){
            if(CollectionUtils.isNotEmpty(zone.getMain_categories())){
                ArrayList<String> list = new ArrayList<String>();
                for(CategoriesEntity categoriesEntity:zone.getMain_categories())
                    list.add(categoriesEntity.getName());
                this.setTags(list);
            }
        }
        this.setRank(Integer.toString(zone.getRank()));
        this.setType(zone.get_type());
        this.setSlug(zone.getSlug());
        this.setAddress(zone.getAddress());
        if(CollectionUtils.isNotEmpty(zone.getLocation())){
            this.setLocation(zone.getLocation().toString());
        }
        if(StringUtils.isNotBlank(zone.getIcon())){
            this.setIcon("/system/mall/icon/"+zone.getId().toString()+"/"+this.getIcon());
        }
        if(StringUtils.isNotBlank(zone.getAppearance_pic())&&zone.getCreated_at()!=null){
            this.setAppearance_pic("/system/mall/appearance_pic/"+(zone.getCreated_at().getYear()+1900)
                    +"/"+(zone.getCreated_at().getMonth()+1)+"/"+zone.getId().toString()+"/"
                    +zone.getAppearance_pic().toString());
        }
        if(StringUtils.isNotBlank(zone.getTelephone())){
            if(zone.getTelephone().indexOf("(")>0){
                this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("(")).replaceAll(" ", "-"));
            }else if(zone.getTelephone().indexOf("（")>0){
                this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("（")).replaceAll(" ", "-"));
            }else if(zone.getTelephone().indexOf("/")>0){
                this.setTelephone(zone.getTelephone().substring(0, zone.getTelephone().indexOf("/")).replaceAll(" ", "-"));
            }else{
                this.setTelephone(zone.getTelephone().replaceAll(" ", "-"));
            }
        }
        if(CollectionUtils.isNotEmpty(zone.getParent_ids())){
            ArrayList<String> parent_ids=new ArrayList<String>();
            for(ObjectId parent_id:zone.getParent_ids()){
                parent_ids.add(parent_id.toString());
            }
            this.setZoneList(parent_ids);
        }*/
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVar_name_chinese() {
        return var_name_chinese;
    }

    public void setVar_name_chinese(String var_name_chinese) {
        this.var_name_chinese = var_name_chinese;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea1() {
        return area1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public String getArea2() {
        return area2;
    }

    public void setArea2(String area2) {
        this.area2 = area2;
    }

    public String getArea3() {
        return area3;
    }

    public void setArea3(String area3) {
        this.area3 = area3;
    }

    public String getArea4() {
        return area4;
    }

    public void setArea4(String area4) {
        this.area4 = area4;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
