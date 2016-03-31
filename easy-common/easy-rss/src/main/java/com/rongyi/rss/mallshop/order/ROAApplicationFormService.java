package com.rongyi.rss.mallshop.order;

import org.bson.types.ObjectId;

import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.osm.entity.ApplicationFormEntity;
import com.rongyi.easy.rmmm.param.AfterSaleParam;
import com.rongyi.easy.rmmm.param.RefundDetailParam;
import com.rongyi.easy.rmmm.param.RefundParam;
import com.rongyi.easy.rmmm.param.RequestRefundParam;
import com.rongyi.easy.rmmm.vo.RefundDetailVO;
import com.rongyi.easy.rmmm.vo.RefundVO;

public interface ROAApplicationFormService {
	
	/**
	 * 获取退款详情
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public RefundDetailVO getRefundDetail(RefundDetailParam param) throws Exception;
	
	/**
	 * 申请退款更新图片
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public void updateRefundPic(AfterSaleParam param) throws Exception;
	
	/**
	 * 查看退款详情
	 * 
	 * @return
	 * @throws Exception
	 */
	public RefundVO getRefundVOById(AfterSaleParam param) throws Exception;
	
	/**
	 * 更新售后物流信息
	 * 
	 * @param param
	 * @throws Exception
	 */
	public void updateExpressInfo(AfterSaleParam param) throws Exception;
	
	/**
	 * 申请退货或退款
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult requestRefund(RequestRefundParam param, ObjectId buyerNum) throws Exception;
	
	/**
	 * 取消退款
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult cancelRefund(RefundParam param, ObjectId buyerNum) throws Exception;
	
	/**
	 * 根据主键查询
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public ApplicationFormEntity selectById(Integer id) throws Exception;

}
