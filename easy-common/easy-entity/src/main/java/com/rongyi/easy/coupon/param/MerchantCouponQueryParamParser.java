package com.rongyi.easy.coupon.param;

import com.google.inject.internal.Join;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.framework.exception.IllegalParamterException;
import com.rongyi.easy.activitymanage.consts.ActivityConstants;
import com.rongyi.easy.page.*;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Descriptions: coupon query parser params
 * Created by 袁波
 * Created at 2015/8/20 14:14.
 */
public class MerchantCouponQueryParamParser {
    public static QueryParam parserParms(String params) {
        try {
            QueryParam queryParam=new QueryParam();
            if(StringUtils.isNotBlank(params)) {
                JSONObject jsonObject = JSONObject.fromObject(params);
                if (jsonObject.containsKey("filters")&&jsonObject.get("filters")!=null) {
                    List<QueryFilter> queryFilterList = new ArrayList<>();
                    JSONArray paramsArray = jsonObject.getJSONArray("filters");
                    if (paramsArray.size() != 0) {
                        for (int i = 0; i < paramsArray.size(); i++) {
                            String filterString = paramsArray.getString(i);
                            QueryFilter filter = parserFilter(filterString);
                            queryFilterList.add(filter);
                        }
                        queryParam.setQueryFilters(queryFilterList);
                    }
                }
                if (jsonObject.containsKey("orders")&&jsonObject.get("orders")!=null) {
                    List<QueryOrder> queryOrderList = new ArrayList<>();
                    JSONArray paramsArray = jsonObject.getJSONArray("orders");
                    if (paramsArray.size() != 0) {
                        for (int i = 0; i < paramsArray.size(); i++) {
                            String orderString = paramsArray.getString(i);
                            QueryOrder order = new QueryOrder(orderString);
                            queryOrderList.add(order);
                        }
                        queryParam.setQueryOrders(queryOrderList);
                    }
                }
                List<JoinFilter> joinFilters = new ArrayList<>();
                List<QueryFilter> joinQueryFilters = new ArrayList<>();
                joinQueryFilters.add(new QueryFilter("coupon.id",FilterType.BEQ,ValueType.VARCHAR,"activity_goods.goods_id",QueryParam.RELATION_AND));
                joinQueryFilters.add(new QueryFilter("activity_goods.type",FilterType.EQUALS,ValueType.INTEGER, ActivityConstants.GoodsLabelType.ACTIVITYCOUPON,QueryParam.RELATION_AND));
                joinFilters.add(new JoinFilter(0,"activity_goods",joinQueryFilters));
                queryParam.setJoinFilters(joinFilters);
                if(jsonObject.get("pageNo")!=null){
                    Integer pageno=jsonObject.getInt("pageNo");
                    queryParam.setCurrentPage(pageno);
                }
                if(jsonObject.get("pageSize")!=null){
                    Integer pagesize=jsonObject.getInt("pageSize");
                    queryParam.setPageSize(pagesize);
                }
                if(jsonObject.containsKey("reserve")&&jsonObject.get("reserve")!=null){
                    queryParam.setReserve(jsonObject.getInt("reserve"));
                }
            }
            return queryParam;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalParamterException("参数传递错误！");
        }
    }
    public static QueryFilter parserFilter(String filterString){
        try {
            String array[] = filterString.split("\\$");
            QueryFilter filter = new QueryFilter();
            filter.setName(array[0]);
            filter.setType(FilterType.toType(array[1]));
            filter.setValueType(ValueType.toType(array[2]));
            if (array[2].equals("VARCHAR")) {
                filter.setValue(array[3]);
            } else if (array[2].equals("TIMESTAMP")) {
            	if(array[3].contains("/")){
                filter.setValue(DateTool.string2Date(array[3],"yyyy/MM/dd HH:mm:ss"));
            	}else if(array[3].contains("-")){
            		filter.setValue(DateTool.string2Date(array[3], "yyyy/MM/dd HH:mm:ss"));
            	}
            } else {
                filter.setValue(Integer.parseInt(array[3]));
            }
            filter.setFilterRelation(array[4]);
            return filter;
        }catch (Exception e){
            e.printStackTrace();
            throw new IllegalParamterException("参数传递错误！");
        }
    }
}
