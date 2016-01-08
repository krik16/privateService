$.ajaxSetup({
    cache: false
});
var url_ = "../pay/drawApplyList";
var defalutCheck=0;
$(document).ready(function() {
	$("#morePay").val(1);
	setDefaultTime();
	ajaxCommonSearch(url_,getParamsJson());
	$("#search-button").click(function() {
		$("#currpage").val("1");
		ajaxCommonSearch(url_,getParamsJson());
	});
	
	$('.startTime').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			$('#tradeStartTime').val(dt);
		}
	});
	$('.endTime').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			$('#tradeEndTime').val(dt);
			
		}
	});
	$('input[name="mallId"]').typeahead({
		source : function(query, process) {
			$("input[name='mallId']").attr("id", "");
			m_names = [];
			map = {};

			var paramsJson = {};
			paramsJson['keywords'] = query;
			paramsJson['timeStamp_'] = new Date().getTime();
			 $.ajax({
			        url: '../main/ajaxGetMalls',
			        type: 'post',
			        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			        data: {
			            "paramsJson": JSON.stringify(paramsJson)
			        },
			        success: function(data) {
			        	if(data.msg != undefined){
							$.each(data.msg, function(i, mall) {
								map[mall.name] = mall.id;
								m_names.push(mall.name);
							});
							process(m_names);
			        	}
			        }
			 });
		},
		items : 20,
		updater : function(selection) {
			$("input[name='mallId']").attr("id", map[selection]);
			$("input[name='mallId']").val(selection);
			return selection;
		}
	});

	$('input[name="shopId"]').typeahead({
		source : function(query, process) {
			var mall = $("input[name='mallId']").val();
			if(mall.replace(/(^\s*)|(\s*$)/g, "")==""){
				_util.cmsTip("请先选择商场！");
				$("input[name='shopId']").val("");
				return;
			}
			$("input[name='shopId']").attr("id", "");
			m_names = [];
			map = {};
			var paramsJson = {};
			paramsJson['keywords'] = query;
			paramsJson['mallId'] = $("input[name='mallId']").attr("id");
			paramsJson['timeStamp_'] = new Date().getTime();
			 $.ajax({
			        url: '../main/ajaxGetShops',
			        type: 'post',
			        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
			        data: {
			            "paramsJson": JSON.stringify(paramsJson)
			        },
			        success: function(data) {
			        	if(data.msg != undefined){
							$.each(data.msg, function(i, shop) {
								map[shop.name] = shop.id;
								m_names.push(shop.name);
							});
							process(m_names);
						}
			        }
			 });
		},
		items : 20,
		updater : function(selection) {
//			var qwe = map[selection];
			$("input[name='shopId']").attr("id", map[selection]);
			$("input[name='shopId']").val(selection);
			return selection;
		}
	});
});

function getParamsJson(){
	  var currpage = $('#currpage').val();
	  var orderNo = $('#drawNo').val();
	  if($('#orderNo').val() != null && $('#orderNo').val() != '')
		  orderNo = $('#orderNo').val();
	  var payNo = $('#payNo').val();
	  var mallName = $("input[name='mallId']").val();
	  var shopName = $("input[name='shopId']").val();
	  var sellerName = $('#sellerName').val();
	  var buyerAccount = $('#buyerAccount').val();
	  var buyerName = $('#buyerName').val();
	  var payChannel = $('#payChannel').val();
	  var tradeStartTime = $('#payStartTime').val();
	  var tradeEndTime = $('#payEndTime').val();
	  var minTotalPrice = $('#minTotalPrice').val();
	  var maxTotalPrice = $('#maxTotalPrice').val();
	  var guideType = $('#guideType').val();
	  var batchNo = $('#batchNo').val();
	  var bussinessType = $('#bussinessType').val();
	  var bussinessName = $('#bussinessName').val();
	  if(defalutCheck == 1){
		  orderNo = $('#orderNo').val();
	  }
	 var paramsJson_ = {
		        'currpage': currpage,
		        'orderNo':orderNo,
		        'payNo':payNo,
		        'mallName':mallName,
		        'shopName':shopName,
		        'sellerName':sellerName,
		        'buyerAccount':buyerAccount,
		        'buyerName':buyerName,
		        'payChannel':payChannel,
		        'tradeStartTime':tradeStartTime,
		        'tradeEndTime':tradeEndTime,
		        'minTotalPrice':minTotalPrice,
		        'maxTotalPrice':maxTotalPrice,
		 		'guideType':guideType,
		        'batchNo':batchNo,
		        'bussinessType':bussinessType,
		        'bussinessName':bussinessName
		    };
	 return paramsJson_;
}

function selectAll() { // 全选or取消全选;
	$('#select-all').each(function(){
			if($(this).prop('checked')){
				$(':checkbox').each(function(){
					if(!$(this).is(':disabled')){

						$(this).prop('checked',true);
					}
				})

			}else{
				$(":checkbox").each(function(){
					$(this).prop('checked',false);

				})
			}
	})
}
/**
 * 批量操作按钮点击事件
 */
function morePayClick(){
	var ids = [];
	var statementIds = [];
	var payChannels = [];
	var payChannel = null;
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			if($("#morePay").val() ==7){
				ids.push(this.attributes['paymentId'].value);
				statementIds.push(this.id);
			}else{
				ids.push(this.id);
			}
			payChannel = this.attributes['payChannel'].value;
			if ($.inArray(payChannel, payChannels) == -1) {
				payChannels.push(payChannel);
			}
		}
	});
	if (payChannels.length > 1) {
		_util.cmsTip("您只能选择一种打款方式进行批量付款");
		return;
	}
	if(payChannel==1){
		_util.cmsTip("抱歉！微信不允许批量退款");
		return;
	}
	if (ids.length <= 0) {
		_util.cmsTip("您至少选中一条付款明细");
		return;
	}
	if (ids.length != 0) {
		var payType = $("#morePay").val();
		validateAccount(ids.join(","),statementIds.join(","), payType,payChannel);
	}

}

/**
 * 验证账号合法性
 * @param ids
 */
function validateAccount(ids,statementIds,type,payChannel) {
	$.post("../pay/validateAccount", {
		ids : ids
	}, function(data) {
		if (data.success == false) {
			_util.cmsTip(data.message);
		} else if(payChannel == 0){
			morePay(ids, type, payChannel);
		}else{
			offPay(ids,statementIds);
		}
	}, "json");
}

/**
 * 微信同意/拒绝退款操作
 * @param paymentId
 */
function weixinRefundRejected(paymentId,refundRejected) {
	$.post("../pay/refundRejected", {
		paymentId : paymentId,
		refundRejected:refundRejected
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_,getParamsJson());
	}, "json");
}

/**
 * 微信手动退款
 * @param paymentId
 */
function weixinRefund(paymentId,refundRejected) {
	if(refundRejected == 1){
		_util.cmsTip("此笔退款已被拒绝退款操作，无法退款，如需退款，请先同意退款操作！");
		return;
	}
	$.post("../pay/weixinRefund", {
		paymentId : paymentId
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_,getParamsJson());
	}, "json");
}

/**
 * 批量操作退款/付款
 * @param ids
 * @param type
 * @param payChannel
 */
function morePay(ids, type,payChannel) {
	$.post("../pay/validatePay", {
		ids:ids,
		operateType:type
	}, function(data) {
		if (data.success == false)
			_util.cmsTip(data.message);
		else{
			var url = '../pay/pay?paymentId=' + ids + '&type=' + type+'&payChannel=' + payChannel;
			 window.open(url);
			setTimeout('ajaxCommonSearch(url_,getParamsJson());', 1000);
		}
	}, "json");
	
}


function setDefaultTime(){
	var curDate = new Date();
	var startDate = curDate.getFullYear()+"/"+(curDate.getMonth()+1)+"/"+curDate.getDate();
	$(".startTime").val(getFormatDate(new Date(startDate)));
	$('.endTime').val(getFormatDate());
}

function clearSearch(){
	$("input").val("");
	$("#payChannel").val("");
}

/**
 * 对账单付款操作
 * @param ids
 * @param type
 * @param payChannel
 */
function statementPay(paymentIds, type,payChannel,statementIds){
	if(payChannel == 3 || payChannel == 4){
		offPay(paymentIds,statementIds);
	}else{
		morePay(paymentIds, type,payChannel);
	}	
}

/**
 * 线下退款
 * @param ids
 */
function offPay(paymentIds,statementIds) {
	confirmMSG(
			"单号：<textarea rows='5' cols='42' id='tradeNo' placeholder='请输入付款凭据单号'></textarea>",
			function() {
				var tradeNo = $("#tradeNo").val();
				if (trimAll(tradeNo) == '') {
					_util.cmsTip("请输入付款凭据单号");
					return;
				} else {
					if (tradeNo.length > 100) {
						_util.cmsTip("字数超过限制！");
						return;
					} else {
						statementOffPay(paymentIds,statementIds,tradeNo);
					}
			}
	});
}

/**
 * 
 */
function statementOffPay(paymentIds,statementIds,tradeNo){
	$.post("../pay/statementOffPay", {
		paymentIds:paymentIds,
		statementIds:statementIds,
		tradeNo:tradeNo
	}, function(data) {
		if (data.success == false)
			_util.cmsTip(data.message);
		else{
			_util.cmsTip("操作成功");		
			ajaxCommonSearch(url_,getParamsJson());
		}
	}, "json");
}

/**
 * 退款冻结
 * @param id
 * @param status
 */
function payFreeze(id,status) {
	$.post("../pay/freeze", {
		statementIds : id,
		status:status
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_,getParamsJson());
	}, "json");
}

/**
 * 异常付款取消
 * @param id
 * @param refundRejected
 */
function excePayCancel(id,refundRejected){

	$.post("../pay/excePayCancel", {
		paymentId : id,
		refundRejected:refundRejected
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_,getParamsJson());
	}, "json");
}

function switchCheck(check) {
	clearSearch();
	setDefaultTime();
	url_ = "../pay/drawApplyList";
	defalutCheck = check;
	$("#currpage").val(1);
	$("#payChannel").empty().append("<option value=''>--全部--</option>" +
									"<option value='0'>支付宝</option>" +
									"<option value='1'>微信</option>" +
									"<option value='2'>银行卡</option>");
	if (check == 0) {//提现付款
		$("#morePay").val(1);
		$("#drawApply").addClass("change-color");
		$("#drawApply").removeClass("now");
		
		$("#tradeRefund").addClass("now");
		$("#tradeRefund").removeClass("change-color");
		$("#exceTrade").addClass("now");
		$("#exceTrade").removeClass("change-color");
		$("#paySeller").addClass("now");
		$("#paySeller").removeClass("change-color");
		$("#statementPay").addClass("now");
		$("#statementPay").removeClass("change-color");
		
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","inline-block");
		$("#search-orderNo").css("display","none");
		$("#search-sellerName").css("display","inline-block");
		$("#search-buyerName").css("display","none");
		$("#search-buyerAccount").css("display","none");
		$("#search-guideType").css("display","inline-block");
		$("#search-mallId").css("display","inline-block");
		$("#search-shopId").css("display","inline-block");
		$("#search-sellerName").css("display","inline-block");
		
		$("#search-batchNo").css("display","none");
		$("#search-bussinessType").css("display","none");
		$("#search-bussinessName").css("display","none");
		
		$("#search-drawNo-label").html('提现流水号:');
		$("#search-price").html('提现金额：');
		$("#search-time").html('提现申请时间段：');
		$("#search-price").width(60);
	} else if(check == 1) {//交易退款
		$("#morePay").val(3);
		 url_ = "../pay/refundList";
		$("#tradeRefund").addClass("change-color");
		$("#tradeRefund").removeClass("now");
		
		$("#drawApply").addClass("now");
		$("#drawApply").removeClass("change-color");
		$("#exceTrade").addClass("now");
		$("#exceTrade").removeClass("change-color");
		$("#paySeller").addClass("now");
		$("#paySeller").removeClass("change-color");
		$("#statementPay").addClass("now");
		$("#statementPay").removeClass("change-color");
		
		$("#search-mallId").css("display","inline-block");
		$("#search-shopId").css("display","inline-block");
		$("#search-sellerName").css("display","inline-block");
		
		
		$("#search-batchNo").css("display","none");
		$("#search-bussinessType").css("display","none");
		$("#search-bussinessName").css("display","none");
		$("#search-mallId").css("display","none");
		$("#search-shopId").css("display","none");
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","none");
		$("#search-orderNo").css("display","inline-block");
		$("#search-sellerName").css("display","none");
		$("#search-buyerName").css("display","inline-block");
		$("#search-buyerAccount").css("display","inline-block");
		$("#search-guideType").css("display","inline-block");
		$("#search-price").html('退款金额：');
		$("#search-time").html('退款申请时间段：');
		$("#search-price").width(60);
	}else if(check == 2){//异常支付
		 url_ = "../pay/exceList";
		$("#exceTrade").addClass("change-color");
		$("#exceTrade").removeClass("now");
		
		$("#tradeRefund").addClass("now");
		$("#tradeRefund").removeClass("change-color");
		$("#drawApply").addClass("now");
		$("#drawApply").removeClass("change-color");
		$("#paySeller").addClass("now");
		$("#paySeller").removeClass("change-color");
		$("#statementPay").addClass("now");
		$("#statementPay").removeClass("change-color");
		
		$("#search-mallId").css("display","inline-block");
		$("#search-shopId").css("display","inline-block");
		$("#search-sellerName").css("display","inline-block");
		
		
		$("#search-batchNo").css("display","none");
		$("#search-bussinessType").css("display","none");
		$("#search-bussinessName").css("display","none");
		
		$("#search-payNo").css("display","inline-block");
		$("#search-drawNo").css("display","none");
		$("#search-orderNo").css("display","inline-block");
		$("#search-sellerName").css("display","none");
		$("#search-buyerName").css("display","inline-block");
		$("#search-guideType").css("display","none");
		$("#search-time").html('异常交易时间段：');
		$("#search-price").html('异常付款金额：');
		$("#search-price").width(86);
	}else if (check == 3) {//对账单付款
		$("#morePay").val(7);
		$("#payChannel").append("<option value='3'>现金</option>");
		 url_ = "../pay/statementList";
		$("#statementPay").addClass("change-color");
		$("#statementPay").removeClass("now");
		
		$("#exceTrade").addClass("now");
		$("#exceTrade").removeClass("change-color");
		$("#tradeRefund").addClass("now");
		$("#tradeRefund").removeClass("change-color");
		$("#drawApply").addClass("now");
		$("#drawApply").removeClass("change-color");
		$("#paySeller").addClass("now");
		$("#paySeller").removeClass("change-color");
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","inline-block");
		$("#search-orderNo").css("display","none");
		$("#search-sellerName").css("display","inline-block");
		$("#search-batchNo").css("display","inline-block");
		$("#search-bussinessType").css("display","inline-block");
		$("#search-bussinessName").css("display","inline-block");

		$("#search-payNo").css("display","inline-block");
		$("#search-drawNo").css("display","none");
		$("#search-mallId").css("display","none");
		$("#search-shopId").css("display","none");
		$("#search-sellerName").css("display","none");
		$("#search-buyerName").css("display","none");
		$("#search-guideType").css("display","none");
		
		$("#search-drawNo-label").html('付款流水号:');
		$("#search-orderNo").css("display","none");
		$("#search-time").html('创建时间：');
		$("#search-price").html('付款金额：');
	}
	ajaxCommonSearch(url_, getParamsJson());
}
