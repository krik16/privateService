
/**   
 * @Title: ROACommodityCommentService.java 
 * @Package: com.rongyi.rss.malllife.roa 
 * @Description: TODO
 * @author 袁波 
 * @date 2015年6月5日 下午7:22:46 
 */


package com.rongyi.rss.malllife.roa;

import java.util.Date;
import java.util.List;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.malllife.vo.CommodityCommentVO;
import com.rongyi.easy.mcmc.param.CommodityCommentParam;

/** 
 *
 * @Description 
 * @author 袁波
 * @date 2015年6月5日 下午7:22:46 
 */

public interface ROACommodityCommentService {
    public List<CommodityCommentVO> getCommentByCommodityId(String commodityId);
    public ResponseResult commentCommodity(List<CommodityCommentParam> commentList,
			Date transDate);

	public ResponseResult getCommentList(String commodityId, int pageSize,
			int currentPage, int commentLevel);

	public ResponseResult getCommodityComments(String commodityId, int pageSize);
}
