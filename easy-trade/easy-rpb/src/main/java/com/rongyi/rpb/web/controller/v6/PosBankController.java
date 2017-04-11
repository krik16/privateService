package com.rongyi.rpb.web.controller.v6;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.rpb.dto.PosBankSynNotifyDto;
import com.rongyi.rpb.Exception.TradeException;
import com.rongyi.rpb.bizz.PayNotifyBizz;
import com.rongyi.rpb.constants.ConstantEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * pos银行卡
 * conan
 * 2017/3/29 10:29
 **/
@Controller
@RequestMapping("/posBank")
public class PosBankController {

    private static final Logger log = LoggerFactory.getLogger(PosBankController.class);

    @Autowired
    PayNotifyBizz payNotifyBizz;

    /**
     * pos银行卡支付同步通知
     *
     * @param posBankSynNotifyDto 参数
     * @return ResponseVO
     */
    @RequestMapping(value = "/synPayNotify", method = RequestMethod.POST)
    @ResponseBody
    public ResponseVO synPayNotify(@RequestBody PosBankSynNotifyDto posBankSynNotifyDto) {
        log.info("pos银行卡支付pos端同步结果通知,posBankSynNotifyDto={}", posBankSynNotifyDto);
        try {

            payNotifyBizz.posBankSynPayNotify(posBankSynNotifyDto);
            return ResponseVO.success();

        } catch (TradeException e){
            log.warn("pos银行卡支付pos端同步结果通知失败e={}",e.getMessage(),e);
            return ResponseVO.failure(Integer.valueOf(e.getCode()),e.getMessage());
        }catch (Exception e) {
            log.error("pos银行卡支付pos端同步结果通知失败e={}", e.getMessage());
            e.printStackTrace();
        }
        return ResponseVO.failure(ConstantEnum.EXCEPTION_POS_BANK_SYN_NTIFY_FAIL.getCodeInt(), ConstantEnum.EXCEPTION_POS_BANK_SYN_NTIFY_FAIL.getValueStr());
    }
}
