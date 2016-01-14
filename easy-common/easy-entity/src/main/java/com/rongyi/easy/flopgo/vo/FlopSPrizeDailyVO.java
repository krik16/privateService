package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;

import com.rongyi.easy.flopgo.entity.FlopPrizeDEntity;
import com.rongyi.easy.flopgo.entity.FlopgoActivity;
import com.rongyi.easy.flopgo.entity.FlopgoActivity.Prize;

/**
 * 这是翻牌购信息与每天的奖品的返回VO
 * @author lijing
 * @since 2015 07 20 11.20
 *
 */
public class FlopSPrizeDailyVO implements Serializable{
	/**翻牌购的id*/
	private String id;
	/**翻牌购名字*/
	private String name;
	/** 翻牌购状态 0代表关闭，1代表发布  3草稿  4结束  默认草稿（2作为全部查询的状态） */
	private Integer state;
	/** 翻牌购的张数*/
	private  Integer count;
	/**每个人的翻牌次数*/
	private Integer eachFlopCount;
	 /**有效的开始时间*/
	private Date validBeginDate;
	/**有效的结束时间*/
	private Date validEndDate;
	/**表示这个翻牌购是为新增还是修改类型，0表示新增（默认），1表示修改 2,表示删除*/
	private Integer type;
	/**信息同步终端  0：容易逛    （默认）  1：互动屏   2：微信*/
	private String sourceTarget;
	/**奖品*/
	private List<Prize> prizeList;
	
	/**翻牌购的每日奖品*/
	private List<FlopPrizeDEntity> flopPDaily;

	
	public FlopSPrizeDailyVO(){
		
	}
	
	public FlopSPrizeDailyVO(FlopgoActivity flopAct){
		if(flopAct!=null){
			this.id=flopAct.getId().toString();
			this.name=flopAct.getName();
			this.count=flopAct.getCount();
			this.eachFlopCount=flopAct.getEachFlopCount();
			this.prizeList=flopAct.getPrizeList();
			this.state=flopAct.getState();
			this.validBeginDate=flopAct.getValidBeginDate();
			this.validEndDate=flopAct.getValidEndDate();
			this.type=flopAct.getType();
			this.sourceTarget=flopAct.getSourceTarget();
		}
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSourceTarget() {
		return sourceTarget;
	}

	public void setSourceTarget(String sourceTarget) {
		this.sourceTarget = sourceTarget;
	}

	public List<Prize> getPrizeList() {
		return prizeList;
	}

	public void setPrizeList(List<Prize> prizeList) {
		this.prizeList = prizeList;
	}

	public List<FlopPrizeDEntity> getFlopPDaily() {
		return flopPDaily;
	}

	public void setFlopPDaily(List<FlopPrizeDEntity> flopPDaily) {
		this.flopPDaily = flopPDaily;
	}
	
	
}
