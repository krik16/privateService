package com.rongyi.rss.msob;

import java.util.List;

import com.rongyi.easy.entity.BrandEntity;
import com.rongyi.easy.malllife.vo.UserInfoVO;
import com.rongyi.easy.rmmm.entity.BrandInfoEntity;
import com.rongyi.easy.rmmm.param.BrandListParam;
import com.rongyi.easy.rmmm.param.BrandParam;
import com.rongyi.easy.rmmm.param.PrincipalAndCategoryParam;
import com.rongyi.easy.rmmm.vo.BrandDetailVO;
import com.rongyi.easy.rmmm.vo.BrandWallListVO;
import com.rongyi.easy.rmmm.vo.CooperateBrandListVO;



public interface ICooperationBrandService {

	
	/**
	 * 通过mongoId获取mongo数据库中的品牌信息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public BrandEntity getBrandEntityByMongoId(PrincipalAndCategoryParam param) throws Exception;
	/**
	 * 插入品牌信息 注：添加负责人使用
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	 public Integer insertCooperationBrand(PrincipalAndCategoryParam param) throws Exception;
	 public Integer getAndSaveCooperateBrandByBrandMid(String brandMid) throws Exception;
	/**
	 * 通过mall name 得到合作商场品牌列表
	 */
	public CooperateBrandListVO getCooperationMallByNameList(BrandListParam param) throws Exception ;

	

	/**
	 * 通过mongo id 获取品牌信息
	 * 
	 * @param param
	 * @return
	 * @throws Exception
	 */
	public BrandInfoEntity getBrandByMongoId(PrincipalAndCategoryParam param) throws Exception;

	/**
	 * 通过mongo id 获取品牌信息
	 * @param
	 * @return
	 * @throws Exception
	 */
	public BrandInfoEntity getCooperationBrandByMongoId(String brandMId) throws Exception;
	/**
	 * 通过id获得正常的品牌
	 * 
	 * @param brandId
	 * @return
	 * @throws Exception
	 */
	public BrandInfoEntity getBrandByBrandId(Integer brandId) throws Exception;

	/**
	 * 获得所有品牌
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<BrandInfoEntity> selectAllBrand() throws Exception;

	/**
	 * 品牌墙信息
	 * 
	 * @return
	 * @throws Exception
	 */
	public BrandWallListVO getBrandWallListVO() throws Exception;
	

	/**
	 * 品牌详情API
	 * 
	 * @param
	 * @return
	 * @throws Exception
	 */
	public BrandDetailVO getBrandDetail(BrandParam brandParam, UserInfoVO user) throws Exception;

	/**
	 * 通过mongo id 获取品牌信息
	 * 
	 * @param
	 * @return
	 * @throws Exception
	 */
	public BrandInfoEntity getBrandByMongoId(String mongoId) throws Exception;
	
	/**
	 * 通过mongo id 获取品牌信息，不管是否已删除
	 * @param
	 * @return
	 * @throws Exception
	 */
	public BrandInfoEntity selectBrandByMongoId(String mongoId) throws Exception;
	
	/**
	 * 根据品类搜索品牌
	 * 
	 * @return
	 * @throws Exception
	 */
	public BrandWallListVO getBrandWallListVO(String categoryId) throws Exception;
	
	/**
	 * 通过mongoId获取mongo数据库中的品牌信息
	 * 
	 * @param
	 * @return
	 * @throws Exception
	 */
	public BrandEntity getBrandEntityByMongoId(String brandMid) throws Exception;
}
