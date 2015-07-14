/** 
* @Title: DrawApplyDetailVO.java 
* @Package com.rongyi.easy.tms.vo 
* @Description: TODO
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年5月28日 上午11:03:10 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.tms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ZhengYl
 *
 */
public class DrawApplyDetailVO implements Serializable {
    private static final long serialVersionUID = -7647979818874548559L;
    
    /** 提现账号 */
    private String drawApplyAccount;
    
    /** 提现申请时间 */
    private Date createAt;
    
    /** 状态 */
    private Integer status;
    
    /** 提现金额 */
    private BigDecimal drawAmount;

	public String getDrawApplyAccount() {
		return drawApplyAccount;
	}

	public void setDrawApplyAccount(String drawApplyAccount) {
		this.drawApplyAccount = drawApplyAccount;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public BigDecimal getDrawAmount() {
		return drawAmount;
	}

	public void setDrawAmount(BigDecimal drawAmount) {
		this.drawAmount = drawAmount;
	}
    
    

}
