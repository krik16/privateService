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
	$("#morePay").click(function() {
		var ids = [];
		var payChannels = [];
		var payChannel = null;
		$(":checkbox[name='subBox']").each(function() {
			if (this.checked == true) {
				ids.push(this.id);
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
		if (ids.length <= 0) {
			_util.cmsTip("您至少选中一条付款明细");
			return;
		}
		if (ids.length != 0) {
			var payType = $("#morePay").val();
			validateAccount(ids.join(","), payType,payChannel);
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
		        'maxTotalPrice':maxTotalPrice
		    };
	 return paramsJson_;
}

function selectAll() { // 全选or取消全选;
    if ($("#select-all").attr("checked") == 'checked') {
        $('input[name="subBox"]').attr("checked", true);
    } else {
        $('input[name="subBox"]').attr("checked", false);
    }
}

/**
 * 验证账号合法性
 * @param ids
 */
function validateAccount(ids,type,payChannel) {
	$.post("../pay/validateAccount", {
		ids : ids
	}, function(data) {
		if (data.success == false) {
			_util.cmsTip(data.message);
		} else{
			morePay(ids, type, payChannel);
		}
	}, "json");
}

/**
 * 微信手动退款
 * @param paymentId
 */
function weixinRefund(paymentId) {
	$.post("../pay/weixinRefund", {
		paymentId : paymentId
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_,getParamsJson());
	}, "json");
}

/**
 * 批量操作
 * @param ids
 * @param type
 * @param payChannel
 */
function morePay(ids, type,payChannel) {
	var url = '../pay/pay?paymentId=' + ids + '&type=' + type+'&payChannel=' + payChannel;
	 window.open(url);
}

function switchCheck(check) {
	clearSearch();
	setDefaultTime();
	url_ = "../pay/drawApplyList";
	defalutCheck = check;
	$("#currpage").val(1);
	if (check == 0) {//交易付款
		$("#morePay").val(1);
		$("#drawApply").addClass("change-color");
		$("#drawApply").removeClass("now");
		
		$("#tradeRefund").addClass("now");
		$("#tradeRefund").removeClass("change-color");
		$("#exceTrade").addClass("now");
		$("#exceTrade").removeClass("change-color");
		$("#paySeller").addClass("now");
		$("#paySeller").removeClass("change-color");
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","block");
		$("#search-orderNo").css("display","none");
		$("#search-sellerName").css("display","block");
		$("#search-buyerName").css("display","none");
		$("#search-buyerAccount").css("display","none");
		
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
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","none");
		$("#search-orderNo").css("display","block");
		$("#search-sellerName").css("display","none");
		$("#search-buyerName").css("display","block");
		$("#search-buyerAccount").css("display","block");
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
		
		$("#search-payNo").css("display","block");
		$("#search-drawNo").css("display","none");
		$("#search-orderNo").css("display","block");
		$("#search-sellerName").css("display","none");
		$("#search-buyerName").css("display","block");
		$("#search-time").html('异常交易时间段：');
		$("#search-price").html('异常付款金额：');
		$("#search-price").width(86);
	}else if (check == 3) {//打款给卖家
		 url_ = "../pay/paySellerList";
		$("#morePay").val(1);
		$("#paySeller").addClass("change-color");
		$("#paySeller").removeClass("now");
		
		$("#drawApply").addClass("now");
		$("#drawApply").removeClass("change-color");
		$("#tradeRefund").addClass("now");
		$("#tradeRefund").removeClass("change-color");
		$("#exceTrade").addClass("now");
		$("#exceTrade").removeClass("change-color");
		
		$("#search-payNo").css("display","none");
		$("#search-drawNo").css("display","block");
		$("#search-orderNo").css("display","none");
		$("#search-sellerName").css("display","block");
		$("#search-buyerName").css("display","none");
		
		$("#search-drawNo-label").html('付款流水号:');
		$("#search-price").html('付款金额：');
		$("#search-time").html('付款申请时间段：');
		$("#search-price").width(60);
	}
	ajaxCommonSearch(url_, getParamsJson());
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