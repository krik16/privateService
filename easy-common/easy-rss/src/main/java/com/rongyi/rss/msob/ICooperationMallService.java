package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.entity.MallEntity;
import com.rongyi.easy.malllife.domain.CooperateMallEntity;
import com.rongyi.easy.rmmm.entity.MallCooperateEntity;
import com.rongyi.easy.rmmm.param.MallListParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.CooperateMallListVO;

public interface ICooperationMallService {

	/**
	 * 通过mongoId获取mongo数据库中的商场信息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MallEntity getMallEntityByMongoId(PrincipalAndCategoryParam param) throws Exception;

	public List<MallCooperateEntity> getMallEntityByGroupId(Integer groupId) throws Exception;
	/**
	 * 插入商场信息 注：添加负责人使用
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public Integer insertCooperationMall(PrincipalAndCategoryParam param) throws Exception;

	/**
	 * 通过mall name 得到合作商场列表
	 */
	public CooperateMallListVO getCooperationMallByNameList(MallListParam param) throws Exception;

	/**
	 * 通过mongoId获取商场信息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MallCooperateEntity getCooperateMallByMongoId(PrincipalAndCategoryParam param) throws Exception;

	/**
	 * 通过id获得正常的商场
	 * 
	 * @param mallId
	 * @return
	 * @throws Exception
	 */
	public MallCooperateEntity getMallByMallId(Integer mallId) throws Exception;

	/**
	 * 通过mongoId查找，不管是否已删除
	 * 
	 * @param mongoId
	 * @return
	 * @throws Exception
	 */
	public MallCooperateEntity getCooperateMallByMongoId(String mongoId) throws Exception;

	/**
	 * rePackage
	 * 閫氳繃mallMongoId寰楀埌rmmm搴撲腑鐨処nteger绫诲瀷mallId
	 * @param mallMid
	 * @return
	 */
	public Integer getAndSaveCooperateMallByMallMid(String mallMid) throws Exception ;
	
	/** 以下两个方法是 从rongyi.app.content 移过来的方法 */
	public CooperateMallEntity selectMallInfoById(Integer id);

	public Integer selectIdByMongoId(String mallId);

	/**
	 * 根据商场名模糊获取商场列表
	 * 
	 * @param mallName
	 * @return
	 * @throws Exception
	 */
	public List<MallCooperateEntity> getMallListByMallName(String mallName) throws Exception;
	
	/**
	 * 通过店铺id查找商场的MongoId
	 */
	public String getMallMIdByshopId(Integer shopId) throws Exception;
	
	/**
	 * 通过mongoId获取mongo数据库中的商场信息
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public MallEntity getMallEntityByMongoId(String mallId) throws Exception;
	
	/**
	 * 通过摩店用户id查询该用户关联商场的MongoId
	 */
	public String getMallMidByUserId(Integer userId) throws Exception;

}
