
/**   
 * @Title: CheckParam.java 
 * @Package: com.rongyi.tms.moudle.vo 
 * @Description: TODO
 * @author user  
 * @date 2015年5月19日 下午5:24:49 
 */


package com.rongyi.tms.moudle.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rongyi.tms.util.ValidateUtil;

/** 
 * @Description 审核参数对象
 * @author 袁波
 * @date 2015年5月19日 下午5:24:49 
 */

public class CheckParam {
    private String ids;
    private Integer status;
    private Integer operateBiz;
    private String reason;
    private Integer guideType;
    public String getIds() {
        return ids;
    }
    public void setIds(String ids) {
        this.ids = ids;
    }

    public Integer getGuideType() {
        return guideType;
    }

    public void setGuideType(Integer guideType) {
        this.guideType = guideType;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getOperateBiz() {
        return operateBiz;
    }
    public void setOperateBiz(Integer operateBiz) {
        this.operateBiz = operateBiz;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Map<String,Object> paramToMap(){
//        List<Integer> idsList=ValidateUtil.StringToIntList(ids);
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("commission_ids",ids);
        params.put("check_status", status);
        params.put("guideType", this.guideType);
        return params;
        
    }
    public Map<String,Object> paramDrawApplyToMap(){
        List<Integer> idsList=ValidateUtil.StringToIntList(ids);
        Map<String,Object> params=new HashMap<String,Object>();
        params.put("ids",idsList);
        params.put("status", status);
        return params;
        
    }
    public List<Integer> idsToList(){
        List<Integer> idsList=new ArrayList<Integer>();
        if(ids!=null){
            idsList=ValidateUtil.StringToIntList(this.getIds());
        }
        return idsList;
    }

    @Override
    public String toString() {
        return "CheckParam{" +
                "ids='" + ids + '\'' +
                ", status=" + status +
                ", operateBiz=" + operateBiz +
                ", reason='" + reason + '\'' +
                ", guideType=" + guideType +
                '}';
    }
}
