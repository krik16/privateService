package com.rongyi.easy.flopgo.vo;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import com.rongyi.easy.flopgo.entity.FlopgoRecordEntity;

public class FlopRecordVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ObjectId id;// 翻牌购记录id
	private String userName;//翻牌用户的账号
	private ObjectId flopActivityId;//关联的翻牌购		
	private String flopName;//翻牌购的名字
	private String prizeId;//翻牌购的奖品
	private String prizeCode;//翻牌购奖品的卷码
	private String prizeName;//奖品名称	
	private String prizeType;//奖品类型 与优惠券表中的类型对应  01优惠卷  02现金卷
	private Date flopTime;//翻牌日期
	private String userScr;//用户来源  mall_life  qq  wechat weibo
	public FlopRecordVo(){
		
	}
	public FlopRecordVo(FlopgoRecordEntity flopgoRecordEntity){
		this.id=flopgoRecordEntity.getId();
		this.userName=flopgoRecordEntity.getUserName();
		this.flopActivityId=flopgoRecordEntity.getFlopActivityId();
		this.flopName=flopgoRecordEntity.getFlopName();
		this.prizeId=flopgoRecordEntity.getPrizeId();
		this.prizeName=flopgoRecordEntity.getPrizeName();
		this.prizeType=flopgoRecordEntity.getPrizeType();
		this.flopTime=flopgoRecordEntity.getFlopTime();
		this.userScr=flopgoRecordEntity.getUserScr();
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ObjectId getFlopActivityId() {
		return flopActivityId;
	}
	public void setFlopActivityId(ObjectId flopActivityId) {
		this.flopActivityId = flopActivityId;
	}
	public String getFlopName() {
		return flopName;
	}
	public void setFlopName(String flopName) {
		this.flopName = flopName;
	}
	public String getPrizeId() {
		return prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}
	public String getPrizeCode() {
		return prizeCode;
	}
	public void setPrizeCode(String prizeCode) {
		this.prizeCode = prizeCode;
	}
	public String getPrizeName() {
		return prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}
	public String getPrizeType() {
		return prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}
	public Date getFlopTime() {
		return flopTime;
	}
	public void setFlopTime(Date flopTime) {
		this.flopTime = flopTime;
	}
	public String getUserScr() {
		return userScr;
	}
	public void setUserScr(String userScr) {
		this.userScr = userScr;
	}

	
}	
