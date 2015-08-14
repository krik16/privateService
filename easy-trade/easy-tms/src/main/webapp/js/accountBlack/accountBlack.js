$.ajaxSetup({
	cache : false
});
var url_ = "../accountBlack/accountBlackList";
$(document).ready(function() {
	ajaxCommonSearch(url_, getParamsJson());
	$("#search-button").click(function() {
		$("#currpage").val("1");
		ajaxCommonSearch(url_, getParamsJson());
	});
});

function getParamsJson() {
	var currpage = $('#currpage').val();
	var payAccount = $('#payAccount').val();

	var paramsJson_ = {
		'currpage' : currpage,
		'payAccount' : payAccount
	};
	return paramsJson_;
}

/**
 * 冻结黑名单账号
 * 
 * @param id
 */
function frozenAccount(id,status) {
	$.post("../accountBlack/frozenAccount", {
		id : id,
		status:status
	}, function(data) {
		_util.cmsTip(data.message);
		ajaxCommonSearch(url_, getParamsJson());
	}, "json");
}
