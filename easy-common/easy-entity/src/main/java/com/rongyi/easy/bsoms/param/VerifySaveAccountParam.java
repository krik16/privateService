package com.rongyi.easy.bsoms.param;

import java.io.Serializable;
import java.util.Date;

public class VerifySaveAccountParam  implements Serializable{
	
	private static final long serialVersionUID = 385086252904386601L;
	
	private Integer id;
	private Integer verifyStatus;//审核状态
	private String reason;//不通过理由
	private Integer industryId;
	private Integer industryVersionId;
	private Integer childAccountNum;
	private String validStartAtStamp;//有效期开始时间戳
	private String validEndAtStamp;//有效期结束时间戳
	private boolean bShowChiefInfo;
	private String mallMid;
	private String shopMid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVerifyStatus() {
		return verifyStatus;
	}
	public void setVerifyStatus(Integer verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public Integer getIndustryVersionId() {
		return industryVersionId;
	}
	public void setIndustryVersionId(Integer industryVersionId) {
		this.industryVersionId = industryVersionId;
	}
	public Integer getChildAccountNum() {
		return childAccountNum;
	}
	public void setChildAccountNum(Integer childAccountNum) {
		this.childAccountNum = childAccountNum;
	}
	public boolean isbShowChiefInfo() {
		return bShowChiefInfo;
	}
	public void setbShowChiefInfo(boolean bShowChiefInfo) {
		this.bShowChiefInfo = bShowChiefInfo;
	}
	
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getShopMid() {
		return shopMid;
	}
	public void setShopMid(String shopMid) {
		this.shopMid = shopMid;
	}
	
	public Date getValidStartAt(){
		Date date = null;
		try {
			if(this.validStartAtStamp != null){
				long lt = new Long(this.validStartAtStamp);
				date = new Date(lt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return date;
		}
	}
	
	public Date getValidEndAt(){
		Date date = null;
		try {
			if(this.validEndAtStamp != null){
				long lt = new Long(this.validEndAtStamp);
				date = new Date(lt);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return date;
		}
	}
	
}
