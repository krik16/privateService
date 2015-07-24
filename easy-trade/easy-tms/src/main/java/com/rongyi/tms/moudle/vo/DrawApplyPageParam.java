
/**   
 * @Title: DrawApplyPageParam.java 
 * @Package: com.rongyi.tms.listener 
 * @Description: TODO
 * @author user  
 * @date 2015年5月14日 下午2:38:10 
 */


package com.rongyi.tms.moudle.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.Validate;

import com.rongyi.core.common.util.DateTool;
import com.rongyi.core.common.util.DateUtil;
import com.rongyi.tms.constants.Constant;

/** 
 * @Description  
 * @author 袁波
 * @date 2015年5月14日 下午2:38:10 
 */

public class DrawApplyPageParam {
    private String id;
    private String mall;
    private String shop;
    private String seller;
    private String start;//提现申请开始时间
    private String end;//提现申请结束时间
    private String amountMin;
    private String amountMax;
    private String page;
    private String channel;
    private String check;
    private String drawNo;//提现流水号
    private String tradeNo;//交易流水号
    private String tradeStart;//交易开始时间
    private String tradeEnd;//交易结束时间
    
    public String getTradeNo() {
        return tradeNo;
    }
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
    public String getTradeStart() {
        return tradeStart;
    }
    public void setTradeStart(String tradeStart) {
        this.tradeStart = tradeStart;
    }
    public String getTradeEnd() {
        return tradeEnd;
    }
    public void setTradeEnd(String tradeEnd) {
        this.tradeEnd = tradeEnd;
    }
    public String getDrawNo() {
        return drawNo;
    }
    public void setDrawNo(String drawNo) {
        this.drawNo = drawNo;
    }
    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMall() {
        return mall;
    }
    public void setMall(String mall) {
        this.mall = mall;
    }
    public String getShop() {
        return shop;
    }
    public void setShop(String shop) {
        this.shop = shop;
    }
    public String getSeller() {
        return seller;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }
    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }
    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }
    public String getAmountMin() {
        return amountMin;
    }
    public void setAmountMin(String amountMin) {
        this.amountMin = amountMin;
    }
    public String getAmountMax() {
        return amountMax;
    }
    public void setAmountMax(String amountMax) {
        this.amountMax = amountMax;
    }
    
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public String getCheck() {
        return check;
    }
    public void setCheck(String check) {
        this.check = check;
    }
    public Map<String,Object> toParamsMap(){
        Map<String ,Object> params=new HashMap<String,Object>();
        if(StringUtils.isNotBlank(this.getId())){
            params.put("id",this.getId());
        }
        if(StringUtils.isNotBlank(this.getMall())){
            params.put("mall",this.getMall());
        }
        if(StringUtils.isNotBlank(this.getShop())){
            params.put("shop",this.getShop());
        }
        if(StringUtils.isNotBlank(this.getDrawNo())){
            params.put("drawNO",this.getDrawNo());
        }
        if(StringUtils.isNotBlank(this.getSeller())){
            params.put("sellerName","%"+this.getSeller()+"%");
        }
        if(StringUtils.isNotBlank(this.getStart())){
            params.put("start",DateUtil.stringToDate(this.getStart(), DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(this.getEnd())){
            params.put("end",DateUtil.stringToDate(this.getEnd(), DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(this.getAmountMin())){
            params.put("amountStart", Double.parseDouble(this.getAmountMin()));
        }
        if(StringUtils.isNotBlank(this.getAmountMax())){
            params.put("amountEnd", Double.parseDouble(this.getAmountMax()));
        }
        if(StringUtils.isNotBlank(this.getChannel())){
            params.put("channel", Integer.parseInt(this.getChannel()));
        }
        if(StringUtils.isNotBlank(tradeNo)){
            params.put("tradeNo",tradeNo);
        }
        if(StringUtils.isNotBlank(tradeStart)){
            params.put("tradeStart",DateUtil.stringToDate(this.getTradeStart(),DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(tradeEnd)){
            params.put("tradeEnd",DateUtil.stringToDate(this.getTradeEnd(),DateTool.FORMAT_DATETIME));
        }
        if(StringUtils.isNotBlank(page)){
            params.put("begin", Constant.PAGE.PAGESIZE*(Integer.parseInt(page)-1));
            params.put("pageNo", Integer.parseInt(page));
        }else{
            params.put("begin", 0);
            params.put("pageNo", 1);
        }
        List<Integer> checks=new ArrayList<Integer>();
        if(StringUtils.isNotBlank(check)){
            String []checkArray=check.split(",");
            if(checkArray.length>0){
                for(int i=0;i<checkArray.length;i++){
                    checks.add(Integer.parseInt(checkArray[i]));
                }
            }
        }
        params.put("status",checks);
        params.put("size", Constant.PAGE.PAGESIZE);
        params.put("orderBy", "-create_at");
        
        return params;
    }
    @Override
    public String toString() {
        return "DrawApplyPageParam [id=" + id + ", mall=" + mall + ", shop=" + shop + ", seller=" + seller + ", start="
                + start + ", end=" + end + ", amountMin=" + amountMin + ", amountMax=" + amountMax + ", page=" + page
                + ", channel=" + channel + "]";
    }
    
}
