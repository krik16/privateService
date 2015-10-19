$.ajaxSetup({
    cache: false
});
$(document).ready(function() {
	 var url_ = "../tradeDetail/list";
	 setDefaultTime();
	ajaxCommonSearch(url_,getParamsJson());
	$("#search-button").click(function() {
		$("#currpage").val("1");
		ajaxCommonSearch(url_,getParamsJson());
	}); 
	$("#exportExcel").click(function() {
		validateExcelCount();
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

/**
 * 导出报表之前验证是否允许导出
 */
function validateExcelCount() {
	$.post("../tradeDetail/validateExcelCount", {
		 "paramsJson": JSON.stringify(getParamsJson())
	}, function(data) {
		if (data.success == false) {
			_util.cmsTip("导出报表的总数超出5000条，无法导出!");
		} else{
			exportExcel();
		}
	}, "json");
	;
}

/**
 * 导出报表
 */
function exportExcel() {
	 var url = "../tradeDetail/exportExcel?paramsJson="+JSON.stringify(getParamsJson());
	 var val = encodeURI(url);    
	 val = encodeURI(val);
	 window.open(val);
}
/**
 * 查询参数
 */
function getParamsJson(){
	  var currpage = $('#currpage').val();
	  var tradeNo = $('#tradeNo').val();
	  var payNo =  $('#payNo').val();
	  var orderNo = $('#orderNo').val();
	  var mallName = $("input[name='mallId']").val();
	  var shopName = $("input[name='shopId']").val();
	  var buyerAccount = $('#buyerAccount').val();
	  var buyerName = $('#buyerName').val();
	  var sellerAccount = $('#sellerAccount').val();
	  var tradeType = $('#tradeType').val();
	  var payChannel = $('#payChannel').val();
	  var tradeStartTime = $('#tradeStartTime').val();
	  var tradeEndTime = $('#tradeEndTime').val();
	  var minTotalPrice = $('#minTotalPrice').val();
	  var maxTotalPrice = $('#maxTotalPrice').val();
	  var orderType = $('#orderType').val();
	  var favorType = $('#favorType').val();
	 var paramsJson = {
		        'currpage': currpage,
		        'tradeNo':tradeNo,
		        'payNo':payNo,
		        'orderNo':orderNo,
		        'mallName':mallName,
		        'shopName':shopName,
		        'buyerAccount':buyerAccount,
		        'buyerName':buyerName,
		        'sellerAccount':sellerAccount,
		        'tradeType':tradeType,
		        'payChannel':payChannel,
		        'tradeStartTime':tradeStartTime,
		        'tradeEndTime':tradeEndTime,
		        'minTotalPrice':minTotalPrice,
		        'maxTotalPrice':maxTotalPrice,
		        'orderType':orderType,
		        'favorType':favorType
		    };
	 return paramsJson;
}
/**
 * 设置默认时间
 */
function setDefaultTime(){
	var curDate = new Date();
	var startDate = curDate.getFullYear()+"/"+(curDate.getMonth()+1)+"/"+curDate.getDate();
	$(".startTime").val(getFormatDate(new Date(startDate)));
	$('.endTime').val(getFormatDate());
}
