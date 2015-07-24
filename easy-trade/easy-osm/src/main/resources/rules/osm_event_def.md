# 总体结构

    type: String
    body: Object
    source: String
    timestamp: Long


# 事件类型来自 

    com.rongyi.core.constant.OrderEventType
    以下事件均定义事件的主体body部分

    所有消息的body部分均包含以下元素：
    orderNum: String,
    orderDetailNum: String,

# 事件的返回结果均为：

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    	code: Integer, // 0 - 表示成功   非0表示失败
    	message: String, // 失败时候，可以填写失败原因
    }

## 以下事件均来自于  ROB

## PLACE_ORDER = "1" 买家下单

    body : {
    	orderNum: String,
    	orderDetailNum: String,
        order: OrderFormEntity,  // 大订单对象
        orderDetailList: List<OrderDetailFormEntity>, // 子订单列表
    }
    
## PAID = "2" 买家支付成功

    body : {
    	orderNum: String,
    	orderDetailNum: String,
        paymentId: Integer
    }

## DELIVER_GOOD = "3" 卖家发货

    body : {
    	orderNum: String, // 订单号
    	orderDetailNum: String,
    	logisticsBillId: String, // 物流单主键id
    }

## CONFIRM_RECEIPT = "4" 买家确认收货

    body : {
    	orderNum: String, // 订单号
    	orderDetailNum: String,
    }

## APPLY_REFUND = "8" 买家申请退款

    body : {
    	orderNum: String,
    	orderDetailNum: String,
        application: ApplicationFormEntity, // 退款详情
        refundMoney: BigDecimal    //退款金额
    }

## AGREE_APPLY_REFUND = "10" 卖家同意退款申请

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    }

## REFUSE_APPLY_REFUND = "11" 卖家拒绝退款申请

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    	rejectReason: String
    }

## APPLY_ADULTS = "12" 买家申请维权

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    	applicationForm: ApplicationFormEntity
    }

## CANCEL_ADULTS = "13" 买家取消维权

    body : {
    	orderNum : String,
    	orderDetailNum: String,
    }

## JUDGE_REFUND = "14" 客服判定退款

    body : {
        orderNum: String,
        orderDetailNum: String,
        conclusion: String,  // 维权结论
        officialDescribe: String, // 官方描述
    }

## JUDGE_NO_REFUND = "15" 客服判定不退款

    body : {
        orderNum: String,
        orderDetailNum: String,
        conclusion: String,  // 维权结论
        officialDescribe: String, // 官方描述
    }

## MANUAL_CLOSED = "16" 用户下单后，支付前，卖家主动关闭

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    }

## MODIFY_PRICE = "17" 卖家修改价格

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    	discount: BigDecimal,	// 折扣价
    	postage: BigDecimal,	// 运费
    }

## CANCEL_REFUND = "18" 买家取消退款

    body : {
    	orderNum: String,
    	orderDetailNum: String,
    }