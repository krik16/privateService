package com.rongyi.easy.flopgo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 翻牌购实体类
 * 
 * @author lijing
 * @time 2015/3/31
 */
@SuppressWarnings("serial")
@Entity(value = "flop_activity", noClassnameStored = true)
public class FlopgoActivity implements Serializable {

	@Id
	private ObjectId id;// 翻牌购id
	private String name;// 翻牌购名称
	
	@Property("status")
	private Integer state;// 翻牌购状态 0代表关闭，1代表发布  3草稿  4结束  默认草稿（2作为全部查询的状态） 
	
	
	@Property("totol_count")
	private Integer count;// 翻牌购的张数
	
	@Property("flop_max_times")
	private Integer eachFlopCount;// 每个人的翻牌次数
	@Property("start_time")
	private Date validBeginDate;// 翻牌购有效期开始时间
	@Property("end_time")
	private Date validEndDate;// 翻牌购的有效期结束时间
	@Property("mallId")
	private String mallId;//商场id
	@Property("rule")
	private String rule;//翻牌规则
	@Property("create_at")
	private Date createDate;// 创建翻牌购时间
	@Property("update_at")
	private Date updateDate;// 修改翻牌购时间
	@Property("create_by")
	private String createUser;// 创建翻牌购的人
	@Property("update_by")
	private String updateUser;// 修改翻牌购的人
	private Integer type;// 表示这个翻牌购是为新增还是修改类型，0表示新增（默认），1表示修改 2,表示删除
	
	@Property("source_target")
	private String sourceTarget;//信息同步终端  0：容易逛    （默认）  1：互动屏   2：微信
	
	@Embedded("prizes")
	private List<Prize> prizeList = new ArrayList<Prize>();


	public static class Prize implements Serializable{
		private ObjectId id;
		private String type;
		private Integer view;//0不显示 1显示

		public ObjectId getId() {
			return id;
		}

		public void setId(ObjectId id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getView() {
			return view;
		}

		public void setView(Integer view) {
			this.view = view;
		}
	}
	@Property("is_used")
	private Integer isUsed;// 代表是否有人参与了这个翻牌购活动，0为默认 没有参与 1为有人参与了这个活动

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getEachFlopCount() {
		return eachFlopCount;
	}

	public void setEachFlopCount(Integer eachFlopCount) {
		this.eachFlopCount = eachFlopCount;
	}

	public Date getValidBeginDate() {
		return validBeginDate;
	}

	public void setValidBeginDate(Date validBeginDate) {
		this.validBeginDate = validBeginDate;
	}

	public Date getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<Prize> getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(List<Prize> prizeList) {
		this.prizeList = prizeList;
	}

	public Integer getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	public String getSourceTarget() {
		return sourceTarget;
	}

	public void setSourceTarget(String sourceTarget) {
		this.sourceTarget = sourceTarget;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

}
