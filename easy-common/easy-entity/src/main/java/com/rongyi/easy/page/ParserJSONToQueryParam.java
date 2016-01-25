package com.rongyi.easy.page;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.framework.exception.IllegalParamterException;
import net.sf.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Descriptions: 把前端传递过来的json字符串解析成查询参数
 * Created by 袁波
 * Created at 2015/8/10 16:49.
 * example:
 * {"pageNo":1,"pageSize":10,"fiters":"name#EQ#VARCHAR#满300减80#AND,create_at#ET#DATE#2015-11-10 12:12:34#AND","orders":"-create_at,name"}
 */
public class ParserJSONToQueryParam {
    public  static QueryParam parser(String jsonString){
        QueryParam queryParam=new QueryParam();
        JSONObject jsonObject=JSONObject.fromObject(jsonString);
        if(jsonObject.containsKey("pageNo")){
            queryParam.setCurrentPage(jsonObject.getInt("pageNo"));
        }
        if(jsonObject.containsKey("pageSize")){
            queryParam.setPageSize(jsonObject.getInt("pageSize"));
        }
        if(jsonObject.containsKey("fiters")){
            String fitersString=jsonObject.getString("fiters");
            String []fitersArray=fitersString.split(",");
            List<QueryFilter> filters=new ArrayList<>();
            for(int i=0;i<fitersArray.length;i++){
                filters.add(parserFromString(fitersArray[i]));
            }
            queryParam.setQueryFilters(filters);
        }
        if(jsonObject.containsKey("orders")){
            String ordersString=jsonObject.getString("orders");
            String []ordersArray=ordersString.split(",");
            List<QueryOrder> ordersList=new ArrayList<>();
            for(int i=0;i<ordersList.size();i++){
                ordersList.add(new QueryOrder(ordersArray[i]));
            }
            queryParam.setQueryOrders(ordersList);
        }
        return queryParam;
    }

    /**
     *
     * @param filter
     * @return
     */
    public static QueryFilter parserFromString(String filter){
        String []params=filter.split("#");
        if(params.length!=5){
            throw new IllegalParamterException("参数传递错误！");
        }
        QueryFilter queryFilter=new QueryFilter();
        queryFilter.setName(params[0]);
        if(FilterType.toType(params[1])==null){
            throw new IllegalParamterException("参数比较类型传递错误！");
        }
        queryFilter.setType(FilterType.toType(params[1]));
        if(ValueType.toType(params[2])==null){
            throw new IllegalParamterException("参数值类型传递错误！");
        }
        queryFilter.setValueType(ValueType.toType(params[2]));
        if(ValueType.toType(params[2]).equals(ValueType.DATE))
            queryFilter.setValue(DateTool.string2Date(params[3], DateTool.FORMAT_DATETIME));
        else if(ValueType.toType(params[2]).equals(ValueType.INTEGER))
            queryFilter.setValue(Integer.parseInt(params[3]));
        else if (ValueType.toType(params[2]).equals(ValueType.DECIMAL))
            queryFilter.setValue(new BigDecimal(params[3]));
        else if (ValueType.toType(params[2]).equals(ValueType.FLOAT))
            queryFilter.setValue(Float.parseFloat(params[3]));
        else
            queryFilter.setValue(params[3]);
        if(!"ADN".equals(params[4])&&!"OR".equals(params[4])){
            throw new IllegalParamterException("参数关联类型传递错误！");
        }
        queryFilter.setFilterRelation(params[4]);
        return queryFilter;
    }
}
