/** 
* @Title: BonusListVO.java 
* @Package com.rongyi.easy.tms.vo 
* @Description: 奖金列表
* @author 郑亦梁  zhengyiliang@rongyi.com
* @date 2015年6月5日 下午2:07:44 
* @version V1.0   
* Copyright (C),上海容易网电子商务有限公司
*/
package com.rongyi.easy.tms.vo;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.content.entity.vo.PageVO;

/**
 * @author ZhengYl
 *
 */
public class BonusListVO extends PageVO implements Serializable {
    private static final long serialVersionUID = -7647979818874548559L;
    
    /** 奖金记录列表 */
    private List<BonusDetailVO> detailList;

	public List<BonusDetailVO> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<BonusDetailVO> detailList) {
		this.detailList = detailList;
	}
}