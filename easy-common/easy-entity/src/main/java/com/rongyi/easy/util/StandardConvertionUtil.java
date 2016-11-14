package com.rongyi.easy.util;

import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;

import java.util.Arrays;
import java.util.List;

/**
 *  商品礼品字段标准转换类
 *
 *  @author yaoyiwei
 *  @date 2016-11-14
 *  @version 1.0
 *
 */
public class StandardConvertionUtil {

    /**
     * 将礼品的终端参数值转换成现有商品的规则
     *
     * @param platform
     * @return terminalType
     *
     */
    public static int convertPlatformToTerminalType(final String platform) {
        List<String> platforms = Arrays.asList(platform.split(","));
        String flag = (platforms.size() > 1) ? "3" : platforms.get(0);

        int terminalType;
        switch (flag) {
            case "1":
                terminalType = CommodityTerminalType.TERMINAL_TYPE_4;
                break;
            case "2":
                terminalType = CommodityTerminalType.TERMINAL_TYPE_2;
                break;
            case "3":
                terminalType = CommodityTerminalType.TERMINAL_TYPE_6;
                break;
            default:
                terminalType = CommodityTerminalType.TERMINAL_TYPE_4;
        }
        return terminalType;
    }

    /**
     * 将礼品的状态参数值转换成现有商品的规则
     *
     * @param giftStatus
     * @return status
     *
     */
    public static int convertStatus(final int giftStatus) {
        int status;
        switch (giftStatus) {
            case 0:
                status = CommodityDataStatus.STATUS_COMMODITY_CHECK_PENDING;
                break;
            case 1:
                status = CommodityDataStatus.STATUS_COMMODITY_SHELVE;
                break;
            case 2:
                status = CommodityDataStatus.STATUS_COMMODITY_UNSHELVE;
                break;
            case 3:
                status = CommodityDataStatus.STATUS_COMMODITY_CHECK_FAIL;
                break;
            case 4:
                status = CommodityDataStatus.STATUS_COMMODITY_DELETED;
                break;
            default:
                status = CommodityDataStatus.STATUS_COMMODITY_SHELVE;
                break;
        }
        return status;
    }

}
