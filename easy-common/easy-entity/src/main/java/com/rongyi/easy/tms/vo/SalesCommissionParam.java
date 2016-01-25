
/**   
 * @Title: SalesCommissionParam.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月25日 上午10:01:11 
 */


package com.rongyi.easy.tms.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;

/** 
 * @Description 
 * @author yb
 * @date 2015年5月25日 上午10:01:11 
 */

public class SalesCommissionParam {
    private String commissionNo;
    private String mallName;
    private String shopName;
    private String guideType;
    private String sellerName;
    private String uploadStartTime;
    private String uploadEndTime;
    private String amountStart;
    private String amountEnd;
    private String status;
    private int page;
    private int pageSize;
    private int pageStart;
    
    /**
     * @author kejun
     * 佣金是否已到账（6已到账，其余未到账）
     */
    private String vaStatus;
    
    public String getGuideType() {
		return guideType;
	}
	public void setGuideType(String guideType) {
		this.guideType = guideType;
	}
	public String getCommissionNo() {
        return commissionNo;
    }
    public void setCommissionNo(String commissionNo) {
        this.commissionNo = commissionNo;
    }
    public String getMallName() {
        return mallName;
    }
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public String getSellerName() {
        return sellerName;
    }
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    public String getUploadStartTime() {
        return uploadStartTime;
    }
    public void setUploadStartTime(String uploadStartTime) {
        this.uploadStartTime = uploadStartTime;
    }
    public String getUploadEndTime() {
        return uploadEndTime;
    }
    public void setUploadEndTime(String uploadEndTime) {
        this.uploadEndTime = uploadEndTime;
    }
    public String getAmountStart() {
        return amountStart;
    }
    public void setAmountStart(String amountStart) {
        this.amountStart = amountStart;
    }
    public String getAmountEnd() {
        return amountEnd;
    }
    public void setAmountEnd(String amountEnd) {
        this.amountEnd = amountEnd;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getPageStart() {
        return pageStart;
    }
    public void setPageStart(int pageStart) {
        this.pageStart = pageStart;
    }
    
    public String getVaStatus() {
		return vaStatus;
	}
	public void setVaStatus(String vaStatus) {
		this.vaStatus = vaStatus;
	}
	public Map<String, Object> paramsToMap(){
        Map<String,Object> paramsMap=new HashMap<String, Object>();
        if(StringUtils.isNotBlank(this.getCommissionNo())){
            paramsMap.put("commissionNo", this.getCommissionNo());
        }
        if(StringUtils.isNotBlank(this.getMallName())){
            paramsMap.put("mall", this.getMallName());
        }
        if(StringUtils.isNotBlank(this.getShopName())){
            paramsMap.put("shop",this.getShopName());
        }
        if(StringUtils.isNotBlank(this.getSellerName())){
            paramsMap.put("sellerAccount", "%"+this.getSellerName()+"%");
        }
        if(StringUtils.isNotBlank(this.getUploadStartTime())){
            paramsMap.put("uploadStart", DateUtil.stringToDate(this.getUploadStartTime(), DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(this.getUploadEndTime())){
            paramsMap.put("uploadEnd", DateUtil.stringToDate(this.getUploadEndTime(), DateTool.FORMAT_DATETIME));
        }
        if(NumberUtils.isNumber(this.getAmountStart())){
            paramsMap.put("amountStart", new BigDecimal(this.getAmountStart()));
        }
        if(NumberUtils.isNumber(this.getAmountEnd())){
            paramsMap.put("amountEnd", new BigDecimal(this.getAmountEnd()));
        }
        if(StringUtils.isNotBlank(this.getGuideType())){
        	paramsMap.put("guideType", Integer.valueOf(this.getGuideType()));
        }
        List<Integer> checks=new ArrayList<Integer>();
        if(StringUtils.isNotBlank(this.getStatus())){
            String []checkArray=this.getStatus().split(",");
            if(checkArray.length>0){
                for(int i=0;i<checkArray.length;i++){
                    checks.add(Integer.parseInt(checkArray[i]));
                }
            }
        }
        if(!checks.isEmpty()){
            paramsMap.put("status", checks);
        }
        if(page==0){
            page=1;
        }
        if(pageSize==0){
            pageSize=15;
        }
        paramsMap.put("begin", (page-1)*15);
        paramsMap.put("size",pageSize);
        paramsMap.put("orderBy", "-create_at");
        
        //TODO ADD BY KEJUN
        if(StringUtils.isNotBlank(this.getVaStatus())){
            String [] vaStatusArray=this.getVaStatus().split(",");
//            List<String> vaStatusList = Arrays.asList(vaStatusArray);    
            paramsMap.put("vaStatus",vaStatusArray);
        }
        
        return paramsMap;
    }
	@Override
	public String toString() {
		return "SalesCommissionParam [commissionNo=" + commissionNo + ", mallName=" + mallName + ", shopName=" + shopName + ", guideType=" + guideType + ", sellerName=" + sellerName
				+ ", uploadStartTime=" + uploadStartTime + ", uploadEndTime=" + uploadEndTime + ", amountStart=" + amountStart + ", amountEnd=" + amountEnd + ", status=" + status + ", page=" + page
				+ ", pageSize=" + pageSize + ", pageStart=" + pageStart + ", vaStatus=" + vaStatus + "]";
	}
	
}
