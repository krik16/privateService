/**
 * @Copyright (C), 上海容易网电子商务有限公司
 * @Author: 柯军
 * @datetime:2015年9月17日上午11:10:16
 * @Description: TODO
 **/

package com.rongyi.settle.service.impl;

import com.rongyi.core.framework.mybatis.service.impl.BaseServiceImpl;
import com.rongyi.easy.bsoms.entity.UserInfo;
import com.rongyi.easy.roa.entity.MallEntity;
import com.rongyi.easy.roa.vo.ShopPositionVO;
import com.rongyi.easy.roa.vo.ShopVO;
import com.rongyi.easy.settle.entity.BussinessInfo;
import com.rongyi.easy.settle.entity.ConfigShop;
import com.rongyi.easy.settle.entity.OperationLog;
import com.rongyi.easy.settle.entity.StatementConfig;
import com.rongyi.easy.settle.vo.ConfigShopVO;
import com.rongyi.easy.settle.vo.StatementConfigVO;
import com.rongyi.rss.bsoms.IUserInfoService;
import com.rongyi.rss.roa.ROAMallService;
import com.rongyi.rss.roa.ROAShopService;
import com.rongyi.rss.shop.IShopService;
import com.rongyi.settle.constants.ConstantEnum;
import com.rongyi.settle.constants.SettleConstant;
import com.rongyi.settle.mapper.OperationLogMapper;
import com.rongyi.settle.mapper.StatementConfigMapper;
import com.rongyi.settle.service.BussinessInfoService;
import com.rongyi.settle.service.ConfigShopService;
import com.rongyi.settle.service.StatementConfigService;
import com.rongyi.settle.web.controller.vo.UserInfoVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @User 柯军
 * @Description: 对账单配置实现
 * @datetime:2015年9月17日上午11:10:16
 **/
@Service
public class StatementConfigServiceImpl extends BaseServiceImpl implements StatementConfigService {

    private static final String NAMESPACE = "com.rongyi.settle.mapper.StatementConfigMapper";

    private Logger logger = LoggerFactory.getLogger(StatementConfigServiceImpl.class);

    @Autowired
    private OperationLogMapper operationLogMapper;

    @Autowired
    private StatementConfigMapper statementConfigMapper;

    @Autowired
    BussinessInfoService bussinessInfoService;

    @Autowired
    ROAShopService roaShopService;
    @Autowired
    private ROAMallService rOAMallService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private ConfigShopService configShopService;
    @Autowired
    private IShopService iShopService;

    @Override
    public List<StatementConfigVO> selectPageList(Map<String, Object> map, Integer currentPage, Integer pageSize) {
        map.put("currentPage", (currentPage - 1) * pageSize);
        map.put("pageSize", pageSize);
        List<StatementConfigVO> list = this.getBaseDao().selectListBySql(NAMESPACE + ".selectPageList", map);
        if (CollectionUtils.isNotEmpty(list))
        {
            for (StatementConfigVO vo : list){
                if (vo.getStatus()!=null && vo.getStatus().byteValue()==ConstantEnum.STATUS_2.getCodeByte()){
                    Map<String, Object> paramsMap = new HashMap<>();
                    paramsMap.put("opId", vo.getId());
                    paramsMap.put("opType", ConstantEnum.STATUS_2.getCodeInt());
                    paramsMap.put("opModel", ConstantEnum.OP_MODEL_0.getCodeInt());
                    OperationLog opLog = operationLogMapper.getOpByMap(paramsMap);
                    if (opLog!=null)
                        vo.setVerifyDesc(opLog.getDesc());
                }
            }
        }
        return list;
    }

    @Override
    public Integer selectPageListCount(Map<String, Object> map) {
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectPageListCount", map);
    }

    @Override
    public int insert(StatementConfig statementConfig) {
        return this.getBaseDao().insertBySql(NAMESPACE + ".insert", statementConfig);
    }

    @Override
    public void update(StatementConfig statementConfig) {
        this.getBaseDao().updateBySql(NAMESPACE + ".update", statementConfig);
    }

    @Override
    public StatementConfig selectById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectById", map);
    }

    @Override
    public void saveStatementConfigAndInfo(StatementConfig statementConfig, BussinessInfo bussinessInfo, List<ConfigShop> shopConfigs) {
        String desc;
        if (statementConfig.getId() == null) {//新增
            statementConfig.setStatus(ConstantEnum.STATUS_0.getCodeByte());
            insert(statementConfig);
            bussinessInfo.setConfigId(statementConfig.getId());
            bussinessInfoService.insert(bussinessInfo);
            desc = ConstantEnum.OP_DESC_0.getValueStr();
        } else {//修改
            if (!validateUpdate(statementConfig, bussinessInfo, shopConfigs)) {
                statementConfig.setStatus(ConstantEnum.STATUS_0.getCodeByte());
                desc = ConstantEnum.OP_DESC_2.getValueStr();
            } else {
                desc = ConstantEnum.OP_DESC_1.getValueStr();
            }
            update(statementConfig);
            bussinessInfo.setId(null);
            bussinessInfo.setConfigId(statementConfig.getId());
            bussinessInfoService.updateByConfigId(bussinessInfo);
            configShopService.deleteConfigShopByConfigId(statementConfig.getId());
        }
        insertShopConfigNysn(shopConfigs,statementConfig.getId());
        if (statementConfig.getStatus()==null) {
            statementConfig.setStatus((byte) 0);
        }
        saveOperationLog(statementConfig.getId(), statementConfig.getStatus().intValue(), desc, statementConfig.getCreateBy());
    }

    public void insertShopConfigNysn(final List<ConfigShop> shopConfigs,final Integer configId) {
        logger.info("异步更新店铺配置信息开始,configId={}",configId);
        final Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    for (ConfigShop configShop : shopConfigs) {
                        configShop.setConfigId(configId);
                        configShopService.insert(configShop);
                        logger.info("异步更新店铺配置信息结束,configId={}", configId);
                    }
                } catch (Exception e) {
                    logger.error("异步更新店铺配置信息失败,configId={}",configId);
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }

    /**
     * 验证修改是否需要重新审核
     *
     * @param statementConfig
     * @param bussinessInfo
     * @param shopConfigs
     * @return
     */
    private boolean validateUpdate(StatementConfig statementConfig, BussinessInfo bussinessInfo, List<ConfigShop> shopConfigs) {
        StatementConfigVO oldStatementConfigVO = selectConfigInfoById(statementConfig.getId());
        BussinessInfo oldBussinessInfo = bussinessInfoService.selectByConfigId(statementConfig.getId());
        if (oldStatementConfigVO == null || oldBussinessInfo == null)
            return false;
        if (!oldStatementConfigVO.getVerifyType().equals(statementConfig.getVerifyType())) {//对账单审核方式
            return false;
        } else if (!oldStatementConfigVO.getDatumType().equals(statementConfig.getDatumType())) {//付款基准类型
            return false;
        } else if (!oldStatementConfigVO.getPayMode().equals(statementConfig.getPayMode())) {//付款模式
            return false;
        } else if (StringUtils.isNotBlank(oldStatementConfigVO.getRegularDay()) && !oldStatementConfigVO.getRegularDay().equals(statementConfig.getRegularDay())) {//固定日期
            return false;
        } else if (StringUtils.isNotBlank(oldStatementConfigVO.getRollDay()) && !oldStatementConfigVO.getRollDay().equals(statementConfig.getRollDay())) {//滚动日期
            return false;
        } else if (oldStatementConfigVO.getCountCycle() != null && !oldStatementConfigVO.getCountCycle().equals(statementConfig.getCountCycle())) {//计算周期类型
            return false;
        } else if (oldStatementConfigVO.getCycleDay() != null && !oldStatementConfigVO.getCycleDay().equals(statementConfig.getCycleDay())) {//固定计算周期
            return false;
        } else if (StringUtils.isNotBlank(oldStatementConfigVO.getCycleRegularDay()) && !oldStatementConfigVO.getCycleRegularDay().equals(statementConfig.getCycleRegularDay())) {//滚动计算周期
            return false;
        } else if (!oldStatementConfigVO.getPayChannel().equals(statementConfig.getPayChannel())) {//付款结算方式
            return false;
        } else if (!oldStatementConfigVO.getEffectStartTime().equals(statementConfig.getEffectStartTime()) || !oldStatementConfigVO.getEffectEndTime().equals(statementConfig.getEffectEndTime())) {//生效日期
            return false;
        } else if (oldBussinessInfo.getBussinessAccount() != null && !oldBussinessInfo.getBussinessAccount().equals(bussinessInfo.getBussinessAccount())) {//商家财务联系人ID
            return false;
        } else if (oldBussinessInfo.getBlankName() != null && !oldBussinessInfo.getBlankName().equals(bussinessInfo.getBlankName())) {//商户结算开户银行
            return false;
        } else if (!oldBussinessInfo.getPayAccount().equals(bussinessInfo.getPayAccount())) {//商户结算账户
            return false;
        } else if (!oldBussinessInfo.getPayName().equals(bussinessInfo.getPayName())) {//商户结算姓名
            return false;
        } else if (oldBussinessInfo.getBussinessAddress() != null && !oldBussinessInfo.getBussinessAddress().equals(bussinessInfo.getBussinessAddress())) {//商户结算地址
            return false;
        } else if (oldBussinessInfo.getBlankAddress() != null && !oldBussinessInfo.getBlankAddress().equals(bussinessInfo.getBlankAddress())) {//开户网点
            return false;
        }
        //关联店铺
        List<ConfigShop> oldShopConfigs = configShopService.getConfigShopsByConfigId(statementConfig.getId());
        return oldShopConfigs != null && oldShopConfigs.size() == shopConfigs.size() && oldShopConfigs.containsAll(shopConfigs);
    }

	/* (non-Javadoc)
	 * @see com.rongyi.settle.service.StatementConfigService#selectForScheduleDaily()
	 */
	@Override
	public List<StatementConfig> selectForScheduleDaily() {
		Map<String, Object> map = new HashMap<>();
		map.put("currentTime", new Date());
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForSchedule", map);
	}

	/* (non-Javadoc)
	 * @see com.rongyi.settle.service.StatementConfigService#selectForScheduleSpacing()
	 */
	@Override
	public List<StatementConfig> selectForScheduleSpacing() {
        Map<String, Object> map = new HashMap<>();
        map.put("currentTime", new Date());
        map.put("cycleType", SettleConstant.CountCycleType.DAY);
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForScheduleSpacing", map);
	}
	
	/* (non-Javadoc)
	 * @see com.rongyi.settle.service.StatementConfigService#selectForScheduleJumping()
	 */
	@Override
	public List<StatementConfig> selectForScheduleJumping() {
		Map<String, Object> map = new HashMap<>();

		Calendar cal = Calendar.getInstance();
		// 对账单是第二天凌晨生成前一天的数据，所以要减一天再判断是否在配置的时间段内
		cal.add(Calendar.DATE, -1);

		map.put("currentTime", cal.getTime());
        map.put("cycleType", SettleConstant.CountCycleType.OTHER);
		return this.getBaseDao().selectListBySql(NAMESPACE + ".selectForScheduleJumping", map);
	}
	
    @Override
    public boolean updatePaymentStatusByIds(List<Integer> ids, Integer status, String desc, String userId) {
        boolean result = false;
        try {
            if (CollectionUtils.isNotEmpty(ids) && status != null) {
                Map<String, Object> paramsMap = new HashMap<>();
                paramsMap.put("ids", ids);
                paramsMap.put("status", status);
                statementConfigMapper.updateStatusByIds(paramsMap);
                for (Integer id : ids) {
                    saveOperationLog(id, status, desc, userId);
                }
                result = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.info(e.getMessage());
        }
        return result;
    }

    /**
     * 插入日志记录
     *
     * @param id
     * @param status
     * @param desc
     * @param userId
     */
    private void saveOperationLog(Integer id, Integer status, String desc, String userId) {
        OperationLog operatioLog = new OperationLog();
        operatioLog.setCreateUserId(userId);
        operatioLog.setDesc(desc);
        operatioLog.setOperationModel((byte) 0);
        operatioLog.setOperationType(Byte.valueOf(status.toString()));
        operatioLog.setCreateAt(new Date());
        operatioLog.setOperationId(id);
        operatioLog.setIsDelete((byte) 0);
        operationLogMapper.insertSelective(operatioLog);
    }

    @Override
    public StatementConfig selectByRuleCode(String ruleCode) {
        Map<String, Object> map = new HashMap<>();
        map.put("ruleCode", ruleCode);
        return this.getBaseDao().selectOneBySql(NAMESPACE + ".selectByRuleCode", map);
    }

    @Override
    public StatementConfigVO selectConfigInfoById(Integer id) {
        StatementConfigVO statementConfigVO = null;
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("id", id);
            statementConfigVO = this.getBaseDao().selectOneBySql(NAMESPACE + ".selectConfigInfoById", map);
            if (statementConfigVO!=null && statementConfigVO.getLinkType()!=0) {
                map.clear();
                map.put("configId", id);
                statementConfigVO.setConfigShops(selectConfigShopsPage(map, 1, 10000));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statementConfigVO;
    }

    @Override
    public List<ConfigShopVO> selectConfigShopsPage(Map<String, Object> paramsMap, int currPage, int pageSize) throws Exception {
        paramsMap.put("startRecord", (currPage - 1) * pageSize);
        paramsMap.put("pageSize", pageSize);
        List<ConfigShopVO> configShops = configShopService.getConfigShopsPage(paramsMap);
        for (ConfigShopVO vo : configShops) {
            ShopVO shop = roaShopService.getShopVOById(vo.getShopId());
            if (shop != null) {
                vo.setBizName(shop.getName());
                ShopPositionVO positionVo = shop.getPosition();
                String address = "[" + positionVo.getPro() + "," + positionVo.getCity() + "," + positionVo.getArea() + "] " + positionVo.getBusiness() + positionVo.getFloor();
                vo.setBizRealAddress(address);
            }
        }
        return configShops;
    }

    @Override
    public int selectConfigShopsPageCount(Map<String, Object> paramsMap) {
        return configShopService.selectConfigShopsPageCount(paramsMap);
    }

    @Override
    public Map<String, Object> validateIsExist(StatementConfig statementConfig, List<Byte> statuses, String[] linkShopIds) throws Exception {
        boolean result = false;
        Byte bussinessType = statementConfig.getBussinessType();
        String bussinessId = statementConfig.getBussinessId();
//        Byte linkShopOp = statementConfig.getLinkShopOp() == null ? 0 : statementConfig.getLinkShopOp();
        Byte lintType = statementConfig.getLinkType();
        Map<String, Object> ReMap = new HashMap<>();
        Map<String, Object> map = new HashMap<>();
        map.put("cooperateType", statementConfig.getCooperateType());
        map.put("bussinessType", bussinessType);
        map.put("bussinessId", bussinessId);
        map.put("statuses", statuses);
        map.put("effectStartTime", statementConfig.getEffectStartTime());
        map.put("effectEndTime", statementConfig.getEffectEndTime());
        if (statementConfig.getId() != null) {
            map.put("excludeId", statementConfig.getId() );//excludeId: 修改时需要排除的配置id
        }
        List<ConfigShop> shopConfigs = new ArrayList<>();
        if (lintType == null) {
            result = true;
        } else {
            if (lintType == 0)//全部: 1、自身（商场/集团）  2、全部店铺
            {
                if (bussinessType == 1 || bussinessType == 4) {
                    if (checkConfigExist(map, shopConfigs)) {
                        logger.info("全部: 1、验自身 ---配置已有");
                        ReMap.put("result", true);
                        return ReMap;
                    }
                }
                //2、全部店铺
                List<ShopVO> shopVOs = getShopIdByParam(bussinessType, bussinessId);
                if (CollectionUtils.isNotEmpty(shopVOs)) {
                    List<String> linkShopList = new ArrayList<>();
                    for (ShopVO shopVO : shopVOs) {
                        linkShopList.add(shopVO.getId());
                    }
                    map.put("linkShopIds",linkShopList);
                    if (checkConfigExist(map, shopConfigs)) {
                        ReMap.put("result", true);
                        return ReMap;
                    }
//                    for (ShopVO shopVO : shopVOs) {
//                        map.put("shopId", shopVO.getId());
//                        if (checkConfigExist(map, shopConfigs)) {
//                            ReMap.put("result", true);
//                            return ReMap;
//                        }
//                    }
                }
            } else if (lintType == 1)//  自身(商场/集团)
            {
                if (bussinessType == 1 || bussinessType == 4) {
                    if (checkConfigExist(map, shopConfigs)) {
                        ReMap.put("result", true);
                        return ReMap;
                    }
                    if (linkShopIds != null) {
                        map.put("linkShopIds",Arrays.asList(linkShopIds));
                        if (checkConfigExist(map, shopConfigs)) {
                            ReMap.put("result", true);
                            return ReMap;
                        }
//                        for (String shopId : linkShopIds) {
//                            map.put("shopId", shopId);
//                            if (checkConfigExist(map, shopConfigs)) {
//                                ReMap.put("result", true);
//                                return ReMap;
//                            }
//                        }
                    }
                } else {
                    logger.info("参数错误  //自身");
                    ReMap.put("result", true);
                    return ReMap;
                }
            } else if (lintType == 2)//部分
            {
                if (linkShopIds != null) {
//                    List<String> linkShopList = new ArrayList<>();
//                    linkShopList.toArray(linkShopIds);
                    map.put("linkShopIds",Arrays.asList(linkShopIds));
                    if (checkConfigExist(map, shopConfigs)) {
                        ReMap.put("result", true);
                        return ReMap;
                    }
//                    for (String shopId : linkShopIds) {
//                        map.put("shopId", shopId);
////                        logger.info("linkType=2  map="+map.toString());
//                        if (checkConfigExist(map, shopConfigs)) {
//                            ReMap.put("result", true);
//                            return ReMap;
//                        }
//                    }
                } else {
                    logger.info(" lintType==2 参数错误  //自身");
                    ReMap.put("result", true);
                    return ReMap;
                }
            } else {
                result = true;
            }
        }
        ReMap.put("result", result);
        ReMap.put("shopConfigs", shopConfigs);
        return ReMap;
    }

    /**
     * 根据配置id查询该配置下配置的所有账号id
     * @param configId
     * @return
     */
    public List<Integer> getUserIdByConfigId(Integer configId){
        if (configId==null){
            return null;
        }
        logger.info("getUserAccountByConfigId start configId = {}", configId);
        List<Integer> result = new ArrayList<>();
        try {
            StatementConfigVO config = selectConfigInfoById(configId);
            if (config!=null)
            {
                List<UserInfoVo> userInfoVos = new ArrayList<>();
                if (config.getLinkType()!=null && config.getLinkType()==0)//全部
                {
                    List<UserInfoVo> selfUsers = getAccountInfoByParam(ConstantEnum.IS_ONESELF.getCodeInt(), Integer.valueOf(config.getBussinessType()), null, config.getBussinessId(), null);
                    if(CollectionUtils.isNotEmpty(selfUsers)) {
                        userInfoVos.addAll(selfUsers);
                    }
                    List<ShopVO> shops = getShopIdByParam(config.getBussinessType(), config.getBussinessId());
                    for (ShopVO shop : shops){//getAccountInfoByParam(isOneself, null, 1, businessId, null);
                        List<UserInfoVo> shopUsers = getAccountInfoByParam(ConstantEnum.NOT_ONESELF.getCodeInt(), null, 1, shop.getId(), null);
                        if(CollectionUtils.isNotEmpty(shopUsers))
                            userInfoVos.addAll(shopUsers);
                    }
                }
                else if (config.getLinkType()!=null && (config.getLinkType()==1|| config.getLinkType()==2))//自身 or 部分
                {
                    if (config.getConfigShops()!=null)
                    {
                        List<String> shopIds = new ArrayList<>();
                        List<String> realShopIds = new ArrayList<>();
                        for(ConfigShopVO configShop : config.getConfigShops()){
                            if (StringUtils.isNotBlank(configShop.getShopId())){
                                shopIds.add(configShop.getShopId());
                            }
                        }
                        if (config.getLinkShopOp()==0)
                            realShopIds = shopIds;
                        else {
                            List<ShopVO> shops = getShopIdByParam(config.getBussinessType(), config.getBussinessId());
                            for (ShopVO shop : shops){
                                realShopIds.add(shop.getId());
                            }
                            realShopIds.removeAll(shopIds);
                        }
                        for (String shopId : realShopIds){
                            List<UserInfoVo> shopUsers = getAccountInfoByParam(ConstantEnum.NOT_ONESELF.getCodeInt(), null, 1, shopId, null);
                            if(CollectionUtils.isNotEmpty(shopUsers))
                                userInfoVos.addAll(shopUsers);
                        }
                    }
                    if (config.getLinkType()==1)
                    {
                        List<UserInfoVo> selfUsers = getAccountInfoByParam(ConstantEnum.IS_ONESELF.getCodeInt(), Integer.valueOf(config.getBussinessType()), null, config.getBussinessId(), null);
                        if(CollectionUtils.isNotEmpty(selfUsers)) {
                            userInfoVos.addAll(selfUsers);
                        }
                    }
                }
                for (UserInfoVo userInfoVo : userInfoVos){
                    result.add(userInfoVo.getId());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("getUserAccountByConfigId end result = {}", result);
        return result;
    }


    @Override
    public boolean validateNeedPay(String shopId, String userId, Integer guideType) {
        Map<String, Object> map = new HashMap<>();
        map.put("shopMysqlId", shopId);
        map.put("status", ConstantEnum.CONFIG_STATUS_1.getCodeInt());
        map.put("nowTime", new Date());
        if (StringUtils.isNotBlank(userId)) {
            map.put("userId", userId);
        }
        map.put("linkRole", guideType);//
        return !checkConfigExist(map, null);
    }

    @Override
    public List<StatementConfig> checkeffectStart(Map<String, Object> paramsMap) {
        return this.getBaseDao().selectListBySql(NAMESPACE + ".selectStatementConfigByMap", paramsMap);
    }

    /**
     * 判断对账配置是否存在
     *
     * @param paramsMap
     * @param configShops  配置中间表
     * @return
     */
    private boolean checkConfigExist(Map<String, Object> paramsMap, List<ConfigShop> configShops) {
        logger.info("linkShopIds={}",paramsMap.get("linkShopIds"));

        if (paramsMap.get("linkShopIds") != null){
            List<String> linkShopIds = (List<String>)paramsMap.get("linkShopIds");
            for(String shopId : linkShopIds){
                ConfigShop configShop = new ConfigShop();
                configShop.setShopId(shopId);
                configShops.add(configShop);
            }
        }
        int count = this.getBaseDao().selectOneBySql(NAMESPACE + ".validateIsExist", paramsMap);
        logger.info("校验完成count={}",count);
        return count > 0;
    }

    private List<ShopVO> getShopIdByParam(byte bussinessType, String bussinessId) throws Exception {
        Map<String, Object> searchMap = new HashMap<>();
        Map reMap;
        List<ShopVO> shopVOs = new ArrayList<>();
        switch (bussinessType) {
            case 0:
                searchMap.put("id", bussinessId);
                break;
            case 1:
                searchMap.put("mallId", bussinessId);
                break;
            case 2:
                searchMap.put("brandId", bussinessId);
                break;
            case 3:
                searchMap.put("filiale_id", new ObjectId(bussinessId));
                List<com.rongyi.easy.shop.entity.ShopEntity> shopEntities = iShopService.searchShop(searchMap, 0, 2000);
                List<ObjectId> shopIds = null;
                if (CollectionUtils.isNotEmpty(shopEntities)) {
                    shopIds = new ArrayList<>();
                    for (com.rongyi.easy.shop.entity.ShopEntity shopEntity : shopEntities) {
                        shopIds.add(shopEntity.getId());
                    }
                }
                if (CollectionUtils.isNotEmpty(shopIds)) {
                    shopVOs = roaShopService.getShopsByIds(shopIds);
                }
                return shopVOs;
            case 4:
                List<MallEntity> mallEntities = rOAMallService.getMallEntitysByGroupId(bussinessId);
                List<String> mallIds = new ArrayList<>();
                if (CollectionUtils.isNotEmpty(mallEntities)) {
                    for (MallEntity mallEntity : mallEntities) {
                        mallIds.add(mallEntity.getId().toString());
                    }
                }
                searchMap.put("zoneIds", mallIds);
                break;
            default:
                return shopVOs;
        }
        int pagesize = 50;
        int currpage = 1;
        while (pagesize == 50) {
            reMap = roaShopService.getShops(searchMap, currpage, 50);
            currpage++;
            List<ShopVO> vos = (List<ShopVO>) reMap.get("list");
            if (CollectionUtils.isNotEmpty(vos)) {
                pagesize = vos.size();
                shopVOs.addAll(vos);
            } else
                pagesize = 0;
        }
        return shopVOs;
    }

    /**
     * 查询账户
     * @param isOneself: 1：自身账号    0：非自身账号
     * @param type   商户类型
     * @param guideType   导购类型
     * @param id   商户id
     * @param userAccount   账号（查询条件用）
     * @return
     */
    @Override
    public List<UserInfoVo> getAccountInfoByParam(Integer isOneself, Integer type, Integer guideType, String id, String userAccount) {
        List<UserInfoVo> userAccounts = new ArrayList<>();
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("isDisabled", 0);
        if (StringUtils.isNotBlank(userAccount)) {
            paramsMap.put("userAccount", userAccount);
        }
        if (isOneself == 1) {
            switch (type) {
                case 0:
                    paramsMap.put("shopId", id);
                    paramsMap.put("identity", 4);
                    break;
                case 1:
                    paramsMap.put("mallId", id);
                    paramsMap.put("identity", 1);
                    break;
                case 2:
                    paramsMap.put("brandId", id);
                    paramsMap.put("identity", 2);
                    break;
                case 3:
                    paramsMap.put("filialeId", id);
                    paramsMap.put("identity", 3);
                    break;
                case 4:
                    paramsMap.put("groupId", id);
                    paramsMap.put("identity", 0);
                    break;
                default:
                    return userAccounts;
            }
        } else if (isOneself == 0) {
            if (guideType == 1) //产品确认该情况（店长+导购）
            {
                List<Integer> identitys = new ArrayList<>();
                identitys.add(5);
                identitys.add(4);
                paramsMap.put("identitys", identitys);
            }
            if (guideType == 2) {
                paramsMap.put("identity", 6);
            }
            paramsMap.put("shopId", id);
        }
        List<UserInfo> userInfos = iUserInfoService.getFullUserInfoByRelevanceId(paramsMap);
        if (CollectionUtils.isNotEmpty(userInfos)) {
            for (UserInfo userInfo : userInfos) {
                UserInfoVo userInfoVo = new UserInfoVo();
                userInfoVo.setId(userInfo.getId());
                userInfoVo.setUserAccount(userInfo.getUserAccount());
                userAccounts.add(userInfoVo);
            }
        }
        return userAccounts;
    }

}
