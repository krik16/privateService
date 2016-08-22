package com.rongyi.settle.service;

import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.settle.BaseTest;
import com.rongyi.settle.constants.ConstantEnum;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.util.List;

/**
 * Created by kejun on 2015/12/8.
 */
public class PaymentStatementServiceTest extends BaseTest{

    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentStatementServiceTest.class);

    @Autowired
    StatementConfigService statementConfigService;

    @Autowired
    ConfigShopService configShopService;

    @Test
    public void testStatus(){
        Integer status = 1;
        System.err.println("result="+(ConstantEnum.STATUS_1.getCodeInt().equals(status) || ConstantEnum.STATUS_3.getCodeInt().equals(status)));
    }

    @Test
    @Rollback(false)
    public void testAdd() throws Exception {
        this.addMallNewShopConfig("51f9d7f631d6559b7d000120",394);
    }

    /**
     * 商场对账单配置为所有的时候去获取该商场下所有店铺，防止后续新增店铺未加在配置中
     * @param mallId 商场id
     * @param configId 配置id
     * @throws Exception
     */
    private void addMallNewShopConfig(String mallId, Integer configId) throws Exception {
        List<String> shopIdList = statementConfigService.findAllShopByMallId(mallId);
        LOGGER.info("size={},shopidList={}",shopIdList.size(),shopIdList);
        List<String> configShopList = configShopService.getConfigShopIdsByConfigId(configId);
//        List<ConfigShop> configShopList = configShopService.getConfigShopsByConfigId(configId);
        LOGGER.info("size={},configShopList={}",configShopList.size(),configShopList);
        for (String shopId : shopIdList) {
            if(!configShopList.contains(shopId)){
                ConfigShop configShop = new ConfigShop();
                configShop.setConfigId(configId);
                configShop.setShopId(shopId);
                configShopService.insert(configShop);
            }
        }
    }


}
