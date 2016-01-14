package com.rongyi.easy.flopgo.entity;

import java.io.Serializable;
import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 翻牌购的记录
 * @author user
 *
 */
@SuppressWarnings("serial")
@Entity(value = "flop_record", noClassnameStored = true)
public class FlopgoRecordEntity implements Serializable{
	
	@Id
	private ObjectId id;// 翻牌购记录id
	@Property("user_id")
	private String userName;//翻牌用户的账号
	@Property("flop_activity_mid")
	private ObjectId flopActivityId;//关联的翻牌购			
	@Property("flop_name")
	private String flopName;//翻牌购的名字
	
	@Property("prize_id")
	private String prizeId;//翻牌购的奖品
	@Property("prize_code")
	private String prizeCode;//翻牌购奖品的卷码
	@Property("prize_name")
	private String prizeName;//奖品名称	
	@Property("prize_type")
	private String prizeType;//奖品类型 与优惠券表中的类型对应  01优惠卷  02现金卷
	@Property("flop_time")
	private Date flopTime;//翻牌日期
	@Property("user_scr")
	private String userScr;//用户来源 0 mall_life  1.qq  2.wechat 3.weibo
	private String type;//0表示新增（默认），1表示修改 2表示删除
	/**领取的到期时间*/
	@Property("receive_time")
	private Date receiveExpirationTime;//预定是领取时间的+30分钟
	/**是否已经领取了 1表示默认的抽到了奖品没有领取，2表示已经领取了，3表示回库存操作了 4表示用于自己不领取的操作*/
	@Property("is_receive")
	private String receiveTrue;
	/**用户手机号*/
	private String userphone;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserScr() {
		return userScr;
	}
	public void setUserScr(String userScr) {
		this.userScr = userScr;
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
	public Date getReceiveExpirationTime() {
		return receiveExpirationTime;
	}
	public void setReceiveExpirationTime(Date receiveExpirationTime) {
		this.receiveExpirationTime = receiveExpirationTime;
	}
	public String getReceiveTrue() {
		return receiveTrue;
	}
	public void setReceiveTrue(String receiveTrue) {
		this.receiveTrue = receiveTrue;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	@Override
	public String toString() {
		return "FlopgoRecordEntity [id=" + id + ", userName=" + userName
				+ ", flopActivityId=" + flopActivityId + ", flopName="
				+ flopName + ", prizeId=" + prizeId + ", prizeCode="
				+ prizeCode + ", prizeName=" + prizeName + ", prizeType="
				+ prizeType + ", flopTime=" + flopTime + ", userScr=" + userScr
				+ ", type=" + type + ", receiveExpirationTime="
				+ receiveExpirationTime + ", receiveTrue=" + receiveTrue
				+ ", userphone=" + userphone + "]";
		
	}
	
	
}
