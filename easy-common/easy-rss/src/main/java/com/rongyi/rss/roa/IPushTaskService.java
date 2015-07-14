package com.rongyi.rss.roa;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.activity.entity.PushTask;
import com.rongyi.easy.activity.entity.vo.PushListVo;
import com.rongyi.easy.activity.entity.vo.PushTaskParam;
import com.rongyi.easy.activity.entity.vo.PushUserCouponVO;

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
	
	/**
	 * 推送服务
	 *  params.push_type(int) 推送类型 1 广播 2 单体 3 部分tag
	 * 	params.device 设备类型 必须  int 类型
	 *  params.channelId(long) params.userId(String)  单体消息 必须 
	 *  params.msg_type(int)  1 单通知消息  0  单透传消息  默认0
	 *  params.deploy(int) 部署状态 1 开发状态 2 生产状态   该功能只支持ios设备类型  默认 为2
	 *  params.tag(string) 用户标签
	 *  params.msg(string) 消息内容
	 *  		   1 透体消息  xxxxx
	 *  		   2 通知 {
						//android必选，ios可选
						"title" : "hello" ,   “description: "hello world" 
						//android特有字段，可选
						"notification_builder_id": 0,"notification_basic_style": 7,"open_type":0,"net_support" : 1,
						"user_confirm": 0,"url": "http://developer.baidu.com","pkg_content":"","pkg_name" : "com.baidu.bccsclient","pkg_version":"0.1",
						//android自定义字段
						"custom_content": {"key1":"value1", "key2":"value2"},  
						//ios特有字段，可选
						"aps": {"alert":"Message From Baidu Push","sound":"","badge":0},
						//ios的自定义字段
						"key1":"value1", "key2":"value2"
						}
	 * @return
	 * 成功			1 发送成功
	 * 			
	 * 失败 			-11 设备类型不为空
	 * 				-12 消息内容不为空
	 * 				-13 deploy参数为ios设备特有
	 * 				-14 推送类型不能为空
	 * 				-15 推送类型不正确
	 * 				-16 tag标签不为空
	 * 				-17 userid channelid 不为空
	 * 				-1  客户端异常
	 * 				-2 服务端异常，可能原因msg参数有误！
	 * 				-3 参数传递有误
	 * 				-4 未知异常
	 
	public int sendPushMsgToDivce(Map<String,Object> params);
	*/
	/**
	 * 
	 * @Description create a UserCoupon
     * @author yb
	 * @param vo
	 */
	public void saveUserCoupons(List<PushUserCouponVO> vos,String couponId) throws Exception;
}
