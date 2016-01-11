package com.rongyi.rss.ryoms.callcenter;

import java.util.List;

import com.rongyi.easy.ryoms.callcenter.entity.OrderEntity;
import com.rongyi.easy.ryoms.callcenter.param.OrderParam;
import com.rongyi.easy.ryoms.callcenter.vo.OrderVO;

/**
 * 客服管理-工单接口
 * 
 * @author wangjianhua
 *
 */
public interface OrderService {

	/**
	 * 新增工单
	 * 
	 * @param entity
	 * @return
	 */
	public int add(OrderEntity entity);

	/**
	 * 修改工单
	 * 
	 * @param entity
	 * @return
	 */
	public int upt(OrderEntity entity);

	/**
	 * 查看工单详情
	 * 
	 * @param id
	 * @return
	 */
	public OrderVO info(int id);

	/**
	 * 查询列表
	 * 
	 * @param param
	 * @return
	 */
	public List<OrderVO> list(OrderParam param);

	/**
	 * 根据客户账号查询最近的一次的工单编号
	 * 
	 * @param customerCode
	 * @return
	 */
	public int lasterId(String customerCode);
}
