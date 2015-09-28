$.ajaxSetup({
	cache : false
});
$(document).ready(function() {
	var url_ = "../couponOrder/list";
	setDefaultTime();
	ajaxCommonSearch(url_, getParamsJson());
	$("#search-button").click(function() {
		$("#currpage").val("1");
		ajaxCommonSearch(url_, getParamsJson());
	});
});

/**
 * 查询参数
 */
function getParamsJson() {
	var currpage = $('#currpage').val();
	var orderNo = $('#orderNo').val();
	var userName = $('#userName').val();
	var userPhone = $('#userPhone').val();
	var status = $('#status').val();
	var paramsJson = {
		'currpage' : currpage,
		'orderNo' : orderNo,
		'userName' : userName,
		'userPhone' : userPhone,
		'status' : status
	};
	return paramsJson;
}
