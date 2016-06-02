/**
 * 
 */
package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.rmmm.entity.ExpressOrderInfoEntity;
import com.rongyi.easy.rmmm.param.SalerDeliveryParam;
import com.rongyi.easy.rmmm.vo.ExpressVO;

/**
 * Copyright (C),上海容易网电子商务有限公司
 * author chenjun
 * Description ：商品订单物流接口
 * time ：2015年10月13日
 * History: 变更记录
 * <author>           <time>             <version>        <desc>
 * chenjun            2015年10月13日               1.0              创建文件
 */
public interface IExpressOrderInfoService {
	
	/**
	 * 根据主键查询物流单信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ExpressOrderInfoEntity selectInfoById(Integer id) throws Exception;

	/**
	 * 添加物流信息，返回主键
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer insertExpressInfo(ExpressOrderInfoEntity entity);
	
	/**
	 * 商家后台修改订单发货方式
	 * @param param  logisticsBillId(物流单号) expressName(快递公司名称) expressId(物流公司id) userId(卖家id) expressInfoId(主键id,有修改，无添加)，orderNum:订单号
	 * @return 主键id
	 * @throws Exception
	 */
	public String updateExpressInfo(SalerDeliveryParam param) throws Exception;
	
	/**
	 * 获取用户常用快递公司列表
	 * @param guideId
	 * @return
	 * @throws Exception
	 */
	public List<ExpressVO> selectCommonExpressByGuideId(String guideId) throws Exception;

}
