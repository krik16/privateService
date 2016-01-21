package com.rongyi.rss.ryoms.callcenter;

import com.rongyi.easy.ryoms.callcenter.entity.OrderEntity;
import com.rongyi.easy.ryoms.callcenter.param.OrderSaveParam;
import com.rongyi.easy.ryoms.callcenter.param.OrderSearchParam;
import com.rongyi.easy.ryoms.callcenter.vo.OrderInfoVO;
import com.rongyi.easy.ryoms.callcenter.vo.OrderListVO;

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
	public OrderInfoVO info(int id);

	/**
	 * 查询列表
	 * 
	 * @param param
	 * @return
	 */
	public OrderListVO list(OrderSearchParam param);
	
	/**
	 * 查询列表记录数
	 * 
	 * @param param
	 * @return
	 */
	public int listCnt(OrderSearchParam param);

	/**
	 * 列表导出(全部导出)
	 * @param param
	 * @return
	 */
	public OrderListVO listExport(OrderSearchParam param);
	
	/**
	 * 根据客户账号查询最近的一次的工单编号
	 * 
	 * @param customerCode
	 * @return
	 */
	public int lasterId(String customerCode);
}
