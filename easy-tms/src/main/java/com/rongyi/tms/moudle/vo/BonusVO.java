
/**   
 * @Title: BonusVO.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月16日 上午11:29:11 
 */


package com.rongyi.tms.moudle.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 *
 * @Description 考核奖金VO
 * @author 袁波
 * @date 2015年6月16日 上午11:29:11 
 */

public class BonusVO implements Serializable{
    private int id;
    /**流水号*/
    private String sdNo;
    /**卖家id*/
    private String sellerId;
    /**卖家账号*/
    private String sellerAccount;
    /**类型  1：奖金  2：惩罚*/
    private int bonusType;
    /**金额*/
    private BigDecimal amount;
    private Date createAt;
    private String createUser;
    private String updateUser;
    private int status;
    private String marks;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSdNo() {
        return sdNo;
    }
    public void setSdNo(String sdNo) {
        this.sdNo = sdNo;
    }
    public String getSellerId() {
        return sellerId;
    }
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }
    public String getSellerAccount() {
        return sellerAccount;
    }
    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }
    public int getBonusType() {
        return bonusType;
    }
    public void setBonusType(int bonusType) {
        this.bonusType = bonusType;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "BonusVO [id=" + id + ", sdNo=" + sdNo + ", sellerId=" + sellerId + ", sellerAccount=" + sellerAccount
                + ", bonusType=" + bonusType + ", amount=" + amount + ", createAt=" + createAt + ", createUser="
                + createUser + ", updateUser=" + updateUser + ", status=" + status + ", marks=" + marks + "]";
    }
    
}
