package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Property;

import com.rongyi.easy.flopgo.entity.FlopgoActivity;
import com.rongyi.easy.flopgo.entity.FlopgoActivity.Prize;

public class FlopPrizeListVo implements Serializable{
	private static final long serialVersionUID = 2456735233592807478L;
	private ObjectId id;// 翻牌购id
	private String name;// 翻牌购名称

	private Integer state;//  翻牌购状态 0代表关闭，1代表发布  3草稿  4结束  默认草稿（2作为全部查询的状态）
	private int count;// 翻牌购的张数
	
	private int eachFlopCount;// 每个人的翻牌次数
	
	private Date validBeginDate;// 翻牌购有效期开始时间
	
	private Date validEndDate;// 翻牌购的有效期结束时间

	private Integer type;// 表示这个翻牌购是为新增还是修改类型，0表示新增（默认），1表示修改 2,表示删除
	
	private Date createDate;// 创建翻牌购时间
	
	private Date updateDate;// 修改翻牌购时间

	private String createUser;// 创建翻牌购的人
	
	private String mallId;//mallid
	
	private String mallName;//商场名字
	
	private String rule;//规则

	private String updateUser;// 修改翻牌购的人
	private Integer isUsed;// 代表是否有人参与了这个翻牌购活动，0为默认 没有参与 1为有人参与了这个活动
   
	private String sourceTarget;//信息同步终端  0：容易逛    （默认）  1：互动屏   2：微信
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
	public Integer getIsUsed() {
		return isUsed;
	}
	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}

	private List<FlopPrizeVO> prizeList = new ArrayList<FlopPrizeVO>();// 所有奖品的id，

	public FlopPrizeListVo(){
		
	}
	public FlopPrizeListVo(FlopgoActivity flopa){
		this.id=flopa.getId();
		this.name=flopa.getName();
		this.count=flopa.getCount();
		this.eachFlopCount=flopa.getEachFlopCount();
		this.type=flopa.getType();
		this.validBeginDate=flopa.getValidBeginDate();
		this.validEndDate=flopa.getValidEndDate();
		this.state=flopa.getState();
		this.createDate=flopa.getCreateDate();
		this.updateDate=flopa.getUpdateDate();
		this.createUser=flopa.getCreateUser();
		this.updateUser=flopa.getUpdateUser();
		this.isUsed=flopa.getIsUsed();
		this.sourceTarget=flopa.getSourceTarget();
		this.mallId=flopa.getMallId();
		this.rule=flopa.getRule();
	}
	
	public String getSourceTarget() {
		return sourceTarget;
	}
	public void setSourceTarget(String sourceTarget) {
		this.sourceTarget = sourceTarget;
	}
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

	

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getEachFlopCount() {
		return eachFlopCount;
	}
	public void setEachFlopCount(int eachFlopCount) {
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<FlopPrizeVO> getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(List<FlopPrizeVO> prizeList) {
		this.prizeList = prizeList;
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
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	
	
														
}
