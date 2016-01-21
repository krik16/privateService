package com.rongyi.easy.redi.param;

import java.util.List;

import com.rongyi.easy.base.param.BaseParam;
import com.rongyi.easy.redi.param.AdvertiseParam;

/**
 * 营销广告排期信息同步   参数
 * @author user 2015年1月4日 上午10:25:28
 */
public class MarketAdvertiseParam extends BaseParam{

    private final static String ownerId = com.rongyi.core.constant.Constants.OWNERID.BAILIAN;
    
    /** 资源id */
    private String resourceId;
    
    private List<AdvertiseParam> contentList;

    public String getResourceId() {
        return resourceId;
    }
    
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    public String getOwnerId() {
        return ownerId;
    }
    
    public List<AdvertiseParam> getContentList() {
        return contentList;
    }

    public void setContentList(List<AdvertiseParam> contentList) {
        this.contentList = contentList;
    }

	@Override
	public String toString() {
		return "MarketAdvertiseParam [resourceId=" + resourceId
				+ ", contentList=" + contentList + "]";
	}
    
}
