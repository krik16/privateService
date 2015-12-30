$.ajaxSetup({ cache: false });

$(document).ready(function() {
	ajaxSearchOrderCartList();
	$('.search-button1').off().on().click(function(event){
		$("#currpage").val("1");
		ajaxSearchOrderCartList();
	});
	
});
	
//ajax查询订单列表信息
function ajaxSearchOrderCartList() {
	var url_ = "../orderManager/ajaxOrderCartList";
	var orderNo = $('#orderNo').val();
	var userAccount = $('#userAccount').val();
	var orderSource = $('#orderSource').val();
	var payChannel = $('#payChannel').val();
	var timeType = $('#timeType').val();
	var timeBegin = $('#timeBegin').val();
	var timeEnd = $('#timeEnd').val();
	var status = $("#status").val();
	var amountType = $("#amountType").val();
	var amountBegin = $("#amountBegin").val();
	var amountEnd = $("#amountEnd").val();
	var currPage = $("currpage").val();
	var pageSize = 10;
	var paramsJson_ = { };
	paramsJson_["currPage"] = currPage;
	paramsJson_["pageSize"] = pageSize;
	if(orderNo != ""){
		paramsJson_["orderNo"] = orderNo;
	}
	if(userAccount != ""){
		paramsJson_["userAccount"] = userAccount;
	}
	if(orderSource != ""){
		paramsJson_["orderSource"] = orderSource;
	}
	if(payChannel!=""){
		paramsJson_["payChannel"] = payChannel;
	}
	if(timeBegin!=''){
		if(timeType==1){
			paramsJson_["createAtBegin"] = timeBegin;
		}
		else if(timeType==2){
			paramsJson_["payAtBegin"] = timeBegin;
		}
	}
	if(timeEnd!=''){
		if(timeType==1){
			paramsJson_["createAtEnd"] = timeEnd;
		}
		else if(timeType==2){
			paramsJson_["payAtEnd"] = timeEnd;
		}
	}
	if(status != ""){
		paramsJson_["status"] = status;
	}
	if(amountBegin != ""){
		if(amountType=1){
			paramsJson_["realAmountBegin"] = amountBegin;
		}else if(amountType==2){
			paramsJson_["payAmountBegin"] = amountBegin;
		}
	}
	if(amountEnd != ""){
		if(amountType=1){
			paramsJson_["realAmountEnd"] = amountEnd;
		}else if(amountType==2){
			paramsJson_["payAmountEnd"] = amountEnd;
		}
	}
	$.ajax({
		url: url_,
		type: 'get',
		contentType: "application/json; charset=UTF-8",
		data:{"paramsJson":JSON.stringify(paramsJson_)},
		success: function(data){
			$("#result").html(data);

			$("#upPage").click(function(){
				var currpageVal = parseInt($("#currpage").val());
				if (currpageVal <= 1) {
					return false;
				} else {
					$("#currpage").val(currpageVal - 1);
				}
				$("#jumpPage").val("");
				ajaxSearchOrderList();
			});

			$("#downPage").click(function(){
				var currpageVal = parseInt($("#currpage").val());
				var totalPageVal = parseInt($("#rowCont").val());
				if (currpageVal >= totalPageVal) {
					return false;
				} else {
					$("#currpage").val(currpageVal + 1);
				}
				$("#jumpPage").val("");
				ajaxSearchOrderList();
			});

			$("#gopage").click(function(){
				var temppage = parseInt($('#jumpPageIn').val()), totalPage = parseInt($("#rowCont").val());
				if (temppage != "" && temppage != undefined && !isNaN(temppage)) {
					if (temppage >= 1 && temppage <= totalPage) {
						$("#currpage").val(temppage);
						ajaxSearchOrderList();
					} else if(temppage > totalPage){
						temppage = totalPage;
						$("#jumpPage").val(totalPage);$("#currpage").val(totalPage);
						ajaxSearchOrderList();
					}else if(temppage == 0){
						temppage = 1;
						$("#jumpPage").val(1);$("#currpage").val(1);
						ajaxSearchOrderList();
					} else{
						_util.cmsTip("请输入大于0的数字!");
					}
				} else if (temppage == 0) {
					temppage = 1;
					$("#jumpPage").val(1);$("#currpage").val(1);
					ajaxSearchOrderList();
				} else {
					_util.cmsTip("请输入数字!");
				}
			});
		},
		error: function(data) {

        }
	});
}	