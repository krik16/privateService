package com.rongyi.rss.activity.push;

import com.rongyi.easy.activity.entity.PushTask;
import com.rongyi.easy.activity.entity.vo.PushListVo;
import com.rongyi.easy.activity.entity.vo.PushTaskParam;
import org.bson.types.ObjectId;

import java.util.Map;

/**
 * 推送roa端实现接口
 * @author yb
 *
 */


public interface IPushTaskService {
	
	/**
	 * 获取推送列表
	 * @param vo
	 * @return
	 */
	public Map<String,Object>getPushTaskList(PushListVo vo);
	/**
	 * 根据id 查询推送
	 * @param id
	 * @return
	 */
	public PushTask getPushDetail(ObjectId id);
	/**
	 * 更新推送 新建或者修改
	 * @param push
	 * @param user
	 * @throws Exception
	 */
	public void updatePushTask(PushTaskParam push,String user) throws Exception ;
	/**
	 * 删除推送任务
	 * @param id
	 * @param user
	 */
	public void deletePushTask(ObjectId id,String user);
	/**
	 * 获取用户数量
	 * @return
	 */
	public Long getUserCount();
	
}
