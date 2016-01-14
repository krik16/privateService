/** 
 * @Title: DrawApplySearchVO.java 
 * @Package com.rongyi.easy.tms.vo 
 * @Description: TODO
 * @author 郑亦梁  zhengyiliang@rongyi.com
 * @date 2015年5月28日 上午11:27:15 
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
public class DrawApplyListVO extends PageVO implements Serializable {
    private static final long serialVersionUID = -7647979818874548559L;
    
    /** 提现记录列表 */
    private List<DrawApplyDetailVO> drawApplyDetailList;

	public List<DrawApplyDetailVO> getDrawApplyDetailList() {
		return drawApplyDetailList;
	}

	public void setDrawApplyDetailList(List<DrawApplyDetailVO> drawApplyDetailList) {
		this.drawApplyDetailList = drawApplyDetailList;
	}
 

}
