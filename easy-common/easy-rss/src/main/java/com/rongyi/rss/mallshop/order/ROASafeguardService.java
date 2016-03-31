package com.rongyi.rss.mallshop.order;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.RequestSafeguardParam;
import com.rongyi.easy.rmmm.param.SafeguardDetailParam;
import com.rongyi.easy.rmmm.param.SafeguardInfoParam;
import com.rongyi.easy.rmmm.param.UpdateSafeguardPicParam;
import com.rongyi.easy.rmmm.vo.SafeguardDetailVO;
import com.rongyi.easy.rmmm.vo.SafeguardInfoVO;

public interface ROASafeguardService {
	
	/**
	 * 获取维权信息
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SafeguardInfoVO getSafeguardInfoVO(SafeguardInfoParam param) throws Exception;
	
	/**
	 * 申请维权
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestSafeguard(RequestSafeguardParam param) throws Exception;
	
	/**
	 * 取消维权
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult cancelSafeguard(RequestSafeguardParam param) throws Exception;
	
	/**
	 * 卖家版维权详情
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public SafeguardDetailVO getSafeguardDetailVO(SafeguardDetailParam param) throws Exception;
	
	/**
	 * 通过维权id更新申请维权图片
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public void  updateSafeguardPic(UpdateSafeguardPicParam param) throws Exception;

}
