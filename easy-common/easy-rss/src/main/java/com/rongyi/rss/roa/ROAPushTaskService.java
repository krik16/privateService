package com.rongyi.rss.roa;

import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.easy.activity.entity.PushTask;
import com.rongyi.easy.activity.entity.vo.PushListVo;


/**
 * service 层接口
 * @author yb
 *
 */
public interface ROAPushTaskService {
	
	/**
	 * 
	 * @param vo.name 名称 vo.status 状态 vo.pageno 页数
	 * @return
	 */
	public Map<String,Object> getPushTaskList(PushListVo vo);
	
	/**
	 * 获取推送详情
	 * @param id
	 * @return
	 */
	public PushTask getPushDetail(ObjectId id);
	
	/**
	 * 删除推送
	 * @param id
	 */
	public void deletePushTask(ObjectId id,String user);
	/**
	 * 更新
	 * @param push
	 */
	public boolean updatePushTask(PushTask push);
	/**
	 * 获取用户数量
	 */
	public Long getUserCount();
}
