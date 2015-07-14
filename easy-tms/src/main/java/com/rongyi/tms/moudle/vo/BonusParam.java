/**   
 * @Title: BonusParam.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月18日 上午11:30:04 
 */


package com.rongyi.tms.moudle.vo;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;

/** 
 *
 * @Description 
 * @author 袁波
 * @date 2015年6月18日 上午11:30:04 
 */

public class BonusParam {
    private Integer id;
    private String sellerAccount;
    private Integer type;
    private BigDecimal amount;
    private String marks;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSellerAccount() {
        return sellerAccount;
    }
    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "BonusParam [id=" + id + ", sellerAccount=" + sellerAccount + ", type=" + type + ", amount=" + amount
                + ", marks=" + marks + "]";
    }
    public BonusVO paramsToVO(){
        BonusVO vo=new BonusVO();
        if (id!=null) {
            vo.setId(id);
        }
        if(StringUtils.isNotBlank(sellerAccount)){
            vo.setSellerAccount(sellerAccount);
        }
        if(type!=null){
            vo.setBonusType(type);
        }
        if(amount!=null){
            vo.setAmount(amount);
        }
        if(StringUtils.isNotBlank(marks)){
            vo.setMarks(marks);
        }
        return vo;
    }
    
}
