package com.rongyi.rss.msob;

import com.rongyi.easy.usercenter.entity.MalllifeUserAddressEntity;
import com.rongyi.core.bean.ResponseResult;
import com.rongyi.easy.rmmm.param.OperateAddressParam;
import com.rongyi.easy.rmmm.param.UserAddressListParam;

public interface IUserAddressService {
	
	/**
	 * 操作（新建、编辑、删除）用户地址API
	 * 
	 * @param param
	 * @param userId
	 * @throws Exception
	 */
	public String operateAddress(OperateAddressParam param, String userId) throws Exception;
	
	/**
	 * 获取用户地址列表
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult getUserAddressList(UserAddressListParam param,String userId) throws Exception;
	
	/**
	 * 获取用户默认地址
	 * @return
	 * @throws Exception
	 */
	public ResponseResult getUserDefaultAddress(String userId) throws Exception;
	
	/**
	 * 设置默认地址  1为默认，2为非默认
	 * @param addressId
	 * @param userId
	 * @throws Exception
	 */
	public void setDefaultAddress(String addressId,String userId) throws Exception;
	
	/**
	 * 根据用户id和地址id查用户地址信息
	 * @param userId
	 * @param addressId
	 * @return
	 * @throws Exception
	 */
	public MalllifeUserAddressEntity getUserAddressInfo(String userId,String addressId) throws Exception;

}
