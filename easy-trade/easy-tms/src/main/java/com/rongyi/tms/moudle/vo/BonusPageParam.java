
/**   
 * @Title: BonusPageParam.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月28日 上午10:35:09 
 */


package com.rongyi.tms.moudle.vo;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.util.ValidateUtil;

/** 
 * @Description 考核奖金查询参数类 
 * @author 袁波
 * @date 2015年5月28日 上午10:35:09 
 */

public class BonusPageParam {
    private Integer id;
    private String sellerAccount;
    private Integer type;
    private String createStartTime;
    private String createEndTime;
    private Integer page;
    private String status;
    
    private Integer start;
    private Integer size;
    public Integer getStart() {
        if(page==0){
            page=1;
        }
        return (page-1)*Constant.PAGE.PAGESIZE;
    }
    public void setStart(Integer start) {
        this.start = start;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getSellerAccount() {
        return sellerAccount;
    }
    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }
   
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getCreateStartTime() {
        return createStartTime;
    }
    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }
    public String getCreateEndTime() {
        return createEndTime;
    }
    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }
    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public BonusPageParam(){
        size=Constant.PAGE.PAGESIZE;
    }
    public Map<String, Object> paramsToMap(){
        Map<String, Object> paramMap=new HashMap<String, Object>();
        if(StringUtils.isNotBlank(sellerAccount)){
            paramMap.put("sellerAccount", sellerAccount);
        }
        if(id!=null){
            paramMap.put("id", id-100000000);
            paramMap.put("sd_no", id);
        }
        if(type!=null){
            paramMap.put("type",type);
        }
        if(StringUtils.isNotBlank(this.createStartTime)){
            if(DateUtil.checkDate(this.createStartTime))
                paramMap.put("createStartTime",DateUtil.stringToDate(this.createStartTime, DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(this.createEndTime)){
            if(DateUtil.checkDate(this.createEndTime))
                paramMap.put("createEndTime",DateUtil.stringToDate(this.createEndTime, DateTool.FORMAT_DATETIME));
        }
        if(page==null){
            page=1;
        }
        paramMap.put("start", (page-1)*Constant.PAGE.PAGESIZE);
        paramMap.put("size", Constant.PAGE.PAGESIZE);
        if(StringUtils.isBlank(status))
            status="0";
        paramMap.put("status",ValidateUtil.StringToIntList(status));
        return paramMap;
    }
    
    
    @Override
    public String toString() {
        return "BonusPageParam [id=" + id + ", sellerAccount=" + sellerAccount + ", type=" + type
                + ", createStartTime=" + createStartTime + ", createEndTime=" + createEndTime + ", page=" + page
                + ", status=" + status + ", start=" + start + ", size=" + size + "]";
    }
    
}
