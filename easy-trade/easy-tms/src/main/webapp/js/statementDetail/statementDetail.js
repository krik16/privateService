$.ajaxSetup({
    cache: false
});
$(document).ready(function() {
	 var url_ = "../statementDetail/list";
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
			$('#payStartTime').val(dt);
		}
	});
	$('.endTime').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			$('#payEndTime').val(dt);
			
		}
	});
});

/**
 * 导出报表之前验证是否允许导出
 */
function validateExcelCount() {
	$.post("../statementDetail/validateExcelCount", {
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
	 var url = "../statementDetail/exportExcel?paramsJson="+JSON.stringify(getParamsJson());
	 window.open(url);
}
/**
 * 查询参数
 */
function getParamsJson(){
	  var currpage = $('#currpage').val();
	  var batchNo = $('#batchNo').val();
	  var tradeNo = $('#tradeNo').val();
	  var payNo =  $('#payNo').val();
	  var bussinessName = $('#bussinessName').val();
	  var payAccount = $('#payAccount').val();
	  var payChannel = $('#payChannel').val();
	  var payStartTime = $('#payStartTime').val();
	  var payEndTime = $('#payEndTime').val();
	  var minTotalPrice = $('#minTotalPrice').val();
	  var maxTotalPrice = $('#maxTotalPrice').val();
	 var paramsJson = {
		        'currpage': currpage,
		        'batchNo':batchNo,
		        'tradeNo':tradeNo,
		        'payNo':payNo,
		        'bussinessName':bussinessName,
		        'payAccount':payAccount,
		        'payChannel':payChannel,
		        'payStartTime':payStartTime,
		        'payEndTime':payEndTime,
		        'minTotalPrice':minTotalPrice,
		        'maxTotalPrice':maxTotalPrice
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
