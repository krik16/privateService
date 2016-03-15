package com.rongyi.rss.roa;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.roa.vo.BrandVO;
import com.rongyi.easy.roa.vo.BrandsCategoryVO;

import java.util.List;
import java.util.Map;


/**
 * 品牌相关接口
 *
 * @author Ventures
 */
public interface RoaBrandService {

    /**
     * 条件
     *
     * @param params
     * @param currentPage
     * @param pageSize
     * @return
     */
    PagingVO<BrandVO> getBrandListByMap(Map<String, Object> params, Integer currentPage, Integer pageSize) throws Exception;

    List<BrandsCategoryVO> getCategories(String cate) throws Exception;

    BrandVO findBrandVOById(String brandId) throws Exception;

    /**
     * 查询一级分类 通过名字
     * @param cateName
     * @return
     * @throws Exception
     */
    List<BrandsCategoryVO> getCategoriesName(String cateName) throws Exception;
}
