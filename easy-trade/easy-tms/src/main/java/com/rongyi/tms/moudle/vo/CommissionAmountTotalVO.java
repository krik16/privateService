
/**   
 * @Title: CommissionAmountTotalVO.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月27日 下午4:03:19 
 */


package com.rongyi.tms.moudle.vo;

import java.math.BigDecimal;

/** 
 * @Description 
 * @author 袁波
 * @date 2015年5月27日 下午4:03:19 
 */

public class CommissionAmountTotalVO {
    private int id;
    private String guideId;
    private BigDecimal commissionAmount;
    private long version;
    private byte  type;//返佣类型(0:推广返佣,1:首单返佣,2:小票返佣)
    public String getGuideId() {
        return guideId;
    }
    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }
    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }
    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
  
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public long getVersion() {
        return version;
    }
    public void setVersion(long version) {
        this.version = version;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }
}
