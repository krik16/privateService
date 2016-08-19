package com.rongyi.easy.tms.vo.v2;

import java.io.Serializable;
import java.util.List;

/**
 * 推广返佣配置
 * Created by user on 2016/8/4.
 */
public class CommissionAppVo implements Serializable{
    private static final long serialVersionUID = -2650029984125281049L;

    private CommissionConfigAppVo easyConfig;  //邀请容易逛用户返佣规则
    private List<CommissionConfigAppVo> massageShopConfigList ;  //邀请摩店用户返佣规则

    public CommissionConfigAppVo getEasyConfig() {
        return easyConfig;
    }

    public void setEasyConfig(CommissionConfigAppVo easyConfig) {
        this.easyConfig = easyConfig;
    }

    public List<CommissionConfigAppVo> getMassageShopConfigList() {
        return massageShopConfigList;
    }

    public void setMassageShopConfigList(List<CommissionConfigAppVo> massageShopConfigList) {
        this.massageShopConfigList = massageShopConfigList;
    }
}
