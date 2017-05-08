package com.rongyi.rss.tradecenter.osm;

import com.rongyi.core.bean.ResponseVO;
import com.rongyi.easy.tradecenter.param.RefundParam;

import java.util.Map;

/**
 * @author chenjun
 * @date 2017/4/10 10:23
 */
public interface IOrderRefundService {

    /**
     * 获取最大可退款金额
     * @param param={"memberId":"买家id","orderNo":"订单号","sonOrderNo":"子订单号"}
     * @return
     */
    public Map<String,Object> getMaxRefundAmount(RefundParam param);

    /**
     * 买家申请退款
     * @param param={"memberId":"买家id","orderNo":"订单号","sonOrderNo":"子订单号","refundReasonId":"退款原因id","refundTypeId":"退款类型id",
     *             "refundAmount":"退款金额","refundExplain":"退款说明","pics":"退款图片列表"}
     * @return
     */
    public ResponseVO requestRefund(RefundParam param);

    /**
     * 买家取消退款
     * @param param={"memberId":"买家id","refundNo":"退款单号"}
     * @return
     */
    public ResponseVO buyerCancelRefund(RefundParam param);

    /**
     * 买家删除退款单
     * @param param={"memberId":"买家id","refundNo":"退款单号"}
     * @return
     */
    public ResponseVO buyerDeleteRefund(RefundParam param);

    /**
     * 卖家拒绝退款申请
     * @param param={"refundNo":"退款单号","createId":"操作人id","createBy":"操作人","source":"1摩店 2商家后台","remark":"拒绝原因"}
     * @return
     */
    public ResponseVO sellerRefuseRefundRequest(RefundParam param);

    /**
     * 卖家同意退款
     * @param param={"refundNo":"退款单号","createId":"操作人id","createBy":"操作人","source":"1摩店 2商家后台"}
     * @return
     */
    public ResponseVO sellerAgreeRefundMoney(RefundParam param);

    /**
     * 卖家同意退款退货申请
     * @param param={"refundNo":"退款单号","createId":"操作人id","createBy":"操作人","source":"1摩店 2商家后台","receiverAddress":"退货收货地址","receiverName":"退货收货人","receiverPhone":"退货收货人手机号"}
     */
    public ResponseVO sellerAgreeRefundMoneyAndGoods(RefundParam param);

    /**
     * 买家发货
     * @param param={"memberId":"买家id","refundNo":"退款单号","logisticsBillId":"物流单号","expressId":"快递公司id,自填时为 0","expressName":"快递公司名称"}
     */
    public ResponseVO buyerDelivery(RefundParam param);

    /**
     * 卖家确认收货
     * @param param={"refundNo":"退款单号","createId":"操作人id","createBy":"操作人","source":"1摩店 2商家后台"}
     */
    public ResponseVO sellerConfirmOrder(RefundParam param);

    /**
     * 卖家拒绝确认收货
     * @param param={"refundNo":"退款单号","createId":"操作人id","createBy":"操作人","source":"1摩店 2商家后台","remark":"拒绝原因"}
     */
    public ResponseVO sellerRefuseConfirmOrder(RefundParam param);

    /**
     * 提醒卖家收货
     * @param param={"memberId":"买家id","refundNo":"退款单号"}
     * @return
     */
    public ResponseVO remindSellerReceive(RefundParam param);

    /**
     * 卖家补发收货地址
     *
     * @param param={"refundNo":"退款单号"}
     * @return
     */
    ResponseVO sellerSupplementAddr(RefundParam param);
}
