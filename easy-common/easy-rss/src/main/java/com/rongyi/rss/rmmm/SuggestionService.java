package com.rongyi.rss.rmmm;

import com.rongyi.easy.rmmm.param.SuggestionParam;

/**
 * 意见反馈接口映射service
 * @author chenjun
 *
 */
public interface SuggestionService {
	
	/**
	 * 提交意见
	 * @throws Exception 
	 */
	public int submitSuggestion(SuggestionParam param,Integer userId) throws Exception;

}
