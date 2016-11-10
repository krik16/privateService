package com.rongyi.easy.mcmc.vo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by yaoyiwei on 2016/11/10.
 */
@Entity(value="mcmc_gift_tag", noClassnameStored=true)
public class GiftTag implements Serializable, Cloneable {
    @Id
    private ObjectId id;
    // 所属ids
    private List<Long> mappingIds;
    // 名称
    private String name;
    // 创建时间
    private Date createAt;



}
