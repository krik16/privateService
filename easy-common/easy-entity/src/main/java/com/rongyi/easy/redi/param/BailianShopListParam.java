package com.rongyi.easy.redi.param;

import java.util.List;

import com.rongyi.easy.base.param.BaseParam;

/**
 * 商场信息同步   参数
 * @author user 2015年1月4日 上午10:25:28
 */
public class BailianShopListParam extends BaseParam{

    private final static String ownerId = com.rongyi.core.constant.Constants.OWNERID.BAILIAN;
    
    
    private List<BailianShopParam> contentList;

    public String getOwnerId() {
        return ownerId;
    }

	public List<BailianShopParam> getContentList() {
		return contentList;
	}

	public void setContentList(List<BailianShopParam> contentList) {
		this.contentList = contentList;
	}

	@Override
	public String toString() {
		return "BailianShopListParam [contentList=" + contentList + "]";
	}


    
    
}
