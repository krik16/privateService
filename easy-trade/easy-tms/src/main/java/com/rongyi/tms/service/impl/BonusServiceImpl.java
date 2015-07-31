package com.rongyi.tms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rongyi.core.constant.Constants;
import com.rongyi.core.constant.VirtualAccountEventType;
import com.rongyi.core.constant.VirtualAccountEventTypeEnum;
import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.malllife.vo.PagingVO;
import com.rongyi.easy.mq.MessageEvent;
import com.rongyi.easy.va.entity.VirtualAccountDetailEntity;
import com.rongyi.tms.moudle.vo.BonusPageParam;
import com.rongyi.tms.moudle.vo.BonusVO;
import com.rongyi.tms.moudle.vo.CheckParam;
import com.rongyi.tms.mq.Sender;
import com.rongyi.tms.service.BonusService;
import com.rongyi.tms.service.SalesCommissionAuditLogService;
import com.rongyi.tms.util.ValidateUtil;
@Service
public class BonusServiceImpl extends BaseServiceImpl implements BonusService {
    private static final Log LOGGER=LogFactory.getLog(BonusServiceImpl.class);
    private static final String NAMESPACE_SALESCOMMISSION = "com.rongyi.tms.mapper.xml.SalesCommissionMapper";
    
    @Autowired
    private SalesCommissionAuditLogService logService;
    
    @Autowired
    Sender sender;
    
    @Override
    public PagingVO<BonusVO> findByPage(BonusPageParam params) {
        Map<String, Object> paramsMap=params.paramsToMap();
        LOGGER.info("paramsMap:"+paramsMap);
        int count=this.getBaseDao().count(NAMESPACE_SALESCOMMISSION+".selectTotalBonus", params.paramsToMap());
        List<BonusVO> bonuslList=this.getBaseDao().selectListBySql(NAMESPACE_SALESCOMMISSION+".selectPageBonus",params.paramsToMap());
        PagingVO<BonusVO> pagingVO=new PagingVO<BonusVO>(params.getSize(),params.getPage(), count);
        pagingVO.setDataList(bonuslList);
        return pagingVO;
    }

    @Override
    public int updateBonus(BonusVO bonus) {
        LOGGER.info("bonus:"+bonus);
        if(bonus.getId()!=0){
            bonus.setStatus(0);
            return this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION+".updateBonus", bonus);
        }else{
            return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION+".insertBonus", bonus);
        }
    }

    @Override
    public int inputBonusByExcel() {
        return 0;
    }

    @Override
    public BonusVO getById(int id) {
        Map<String, Object> paramMap=new HashMap<String, Object>();
        paramMap.put("id",id);
        return this.getBaseDao().selectOneBySql(NAMESPACE_SALESCOMMISSION+".getOneBonus", paramMap);
    }
    	
    @Override
    public int batchInsertBonus(List<BonusVO> vos) {
        return this.getBaseDao().insertBySql(NAMESPACE_SALESCOMMISSION+".batchInsertBonus", vos);
    }
    	
    @Override
    public int batchUpdate(CheckParam params,String userString) {
        Map<String, Object> paramsMap = params.paramDrawApplyToMap();
        LOGGER.info("传入sql的map:" + paramsMap);
        int result=this.getBaseDao().updateBySql(NAMESPACE_SALESCOMMISSION + ".batchUpdateBonus", paramsMap);
        if(result>0){
            //更新成功之后，生成更新日志
            paramsMap.put("operate",1);
            paramsMap.put("createUser",userString);
            if(StringUtils.isNotBlank(params.getReason())){
                paramsMap.put("memo", params.getReason());
            }
            result= logService.batachInsertCommissionAuditLog(paramsMap);
            //发送消息到VA
            if(params.getStatus()>0){
                List<Integer> idsList=ValidateUtil.StringToIntList(params.getIds());
                for(int i=0;i<idsList.size();i++){
                    BonusVO vo=this.getById(idsList.get(i));
                    VirtualAccountDetailEntity accountDetail = new VirtualAccountDetailEntity();
                    accountDetail.setUserId(vo.getSellerId());
                    accountDetail.setAmount(vo.getAmount());
                   
                   
                    if(vo.getBonusType()==1){
                        //交易奖励
                        accountDetail.setSign(1);
                        accountDetail.setItemType(VirtualAccountEventType.BONUS);
                        accountDetail.setRemark("bonus: " + vo.getMarks()==null?"":vo.getMarks());
                    }else if(vo.getBonusType() == 2){
                        //交易惩罚
                        accountDetail.setSign(-1);
                        accountDetail.setItemType(VirtualAccountEventType.FINE);
                        accountDetail.setRemark("punishment: " + vo.getMarks()==null?"":vo.getMarks());
                    }else if(vo.getBonusType() == 3){
                    	//优惠券佣金奖励
                    	accountDetail.setSign(1);
                    	accountDetail.setItemType(VirtualAccountEventType.COUPON_COMMISSION);
                    	accountDetail.setRemark("coupon commission : " + vo.getMarks()==null?"":vo.getMarks());
                    }else{
                    	//优惠券佣金惩罚
                    	accountDetail.setSign(-1);
                    	accountDetail.setItemType(VirtualAccountEventType.COUPON_COMMISSION);
                    	accountDetail.setRemark("coupon commission : " + vo.getMarks()==null?"":vo.getMarks());
                    }
                    try {
                        Map<String, Object> body = new HashMap<String, Object>();
                        body.put("userId", vo.getSellerId());
                        body.put("detail", accountDetail);
                        MessageEvent event = MessageEvent.getMessageEvent(JSONObject.fromObject(body), Constants.MQRequestParam.REQUEST_QUEUENAME_TMS, Constants.MQRequestParam.REQUEST_QUEUENAME_VA, VirtualAccountEventTypeEnum.ACCOUNT_POST.getCode());
                        sender.convertAndSend(event);
                    } catch (Exception e) {
                        LOGGER.error(e.getMessage());
                        e.printStackTrace();
                    }
                }
            }
        }
        return  result;
    }
    
}
