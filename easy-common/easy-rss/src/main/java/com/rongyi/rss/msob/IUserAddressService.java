package com.rongyi.rss.msob;

import org.bson.types.ObjectId;

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
	public String operateAddress(OperateAddressParam param, ObjectId userId) throws Exception;
	
	/**
	 * 获取用户地址列表
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult getUserAddressList(UserAddressListParam param,ObjectId userId) throws Exception;
	
	/**
	 * 获取用户默认地址
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public ResponseResult getUserDefaultAddress(ObjectId userId) throws Exception;
	
	/**
	 * 设置默认地址  1为默认，2为非默认
	 * @param addressId
	 * @param userId
	 * @throws Exception
	 */
	public void setDefaultAddress(String addressId,ObjectId userId) throws Exception;

}
