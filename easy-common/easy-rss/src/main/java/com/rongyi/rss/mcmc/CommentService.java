package com.rongyi.rss.mcmc;

import java.util.Date;
import java.util.List;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.mcmc.param.CommodityCommentParam;

public interface CommentService {

	public ResponseResult commentCommodity(List<CommodityCommentParam> commentList,
			Date transDate);

	public ResponseResult getCommentList(String commodityId, int pageSize,
			int currentPage, int commentLevel);

	public ResponseResult getCommodityComments(String commodityId, int pageSize);

}
