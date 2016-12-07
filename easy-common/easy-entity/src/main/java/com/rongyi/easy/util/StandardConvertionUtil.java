package com.rongyi.easy.util;

import com.rongyi.easy.mcmc.constant.CommodityDataStatus;
import com.rongyi.easy.mcmc.constant.CommodityTerminalType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  商品礼品字段标准转换类
 *
 *  @author yaoyiwei
 *  @date 2016-11-16
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
    public static Integer convertPlatformToTerminalType(final String platform) {
        String flag;
        if(null == platform || platform.isEmpty()) {
            flag = "3";
        } else {
            List<String> platforms = Arrays.asList(platform.split(","));
            flag = (platforms.size() > 1) ? "3" : platforms.get(0);
        }

        Integer terminalType;
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
                terminalType = null;
        }
        return terminalType;
    }

    /**
     * 将礼品的终端参数值转换成现有商品的规则
     *
     * @param platform
     * @return terminalType
     */
    public static List<Integer> convertPlatformToTerminalTypeList(final String platform) {
        String flag;
        if (null == platform || platform.isEmpty()) {
            flag = "3";
        } else {
            List<String> platforms = Arrays.asList(platform.split(","));
            flag = (platforms.size() > 1) ? "3" : platforms.get(0);
        }

        List<Integer> terminalType = new ArrayList<>();
        switch (flag) {
            case "1":
                terminalType.add(CommodityTerminalType.TERMINAL_TYPE_4);
                terminalType.add(CommodityTerminalType.TERMINAL_TYPE_6);
                break;
            case "2":
                terminalType.add(CommodityTerminalType.TERMINAL_TYPE_2);
                terminalType.add(CommodityTerminalType.TERMINAL_TYPE_6);
                break;
            case "3":
                terminalType.add(CommodityTerminalType.TERMINAL_TYPE_6);
                break;
            default:
                terminalType = null;
        }
        return terminalType;
    }

    public static String convertTerminalTypeToPlatform(final Integer terminalType) {
        if(null == terminalType) {
            return "0";
        }

        String platform;
        switch(terminalType) {
            case CommodityTerminalType.TERMINAL_TYPE_4:
                platform = "1";
                break;
            case CommodityTerminalType.TERMINAL_TYPE_2:
                platform = "2";
                break;
            case CommodityTerminalType.TERMINAL_TYPE_6:
                platform = "1,2";
                break;
            default:
                platform = "0";
                break;
        }
        return platform;
    }

    /**
     * 将礼品的状态参数值转换成现有商品的规则
     *
     * @param giftStatus
     * @return status
     *
     */
    public static Integer convertStatus(final Integer giftStatus) {
        if(giftStatus == null) {
            return null;
        }

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
            case 5:
                status = CommodityDataStatus.STATUS_COMMODITY_SHELVE_WAITING;
                break;
            default:
                status = CommodityDataStatus.STATUS_COMMODITY_SHELVE;
                break;
        }
        return status;
    }

    /**
     * 将商品的状态定义转换成礼品的定义
     *
     * @param commodityStatus
     * @return status
     *
     */
    public static Integer reverseStatus(final Integer commodityStatus) {
        if(commodityStatus == null) {
            return null;
        }

        int status;
        switch (commodityStatus) {
            case CommodityDataStatus.STATUS_COMMODITY_UNSHELVE:
                status = 2;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_SHELVE:
                status = 1;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_DELETED:
                status = 4;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_SHELVE_WAITING:
                status = 5;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_PENDING:
                status = 6;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_CHECK_PENDING:
                status = 0;
                break;
            case CommodityDataStatus.STATUS_COMMODITY_CHECK_FAIL:
                status = 3;
                break;
            default:
                status = 1;
                break;
        }
        return status;
    }

}
