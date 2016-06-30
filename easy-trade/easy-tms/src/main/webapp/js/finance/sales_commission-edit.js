/**
 * 提现申请 Author:袁波
 */
$.ajaxSetup({
	cache : false
});
$(document).ready(function() {
	setDefaultTime();
	ajaxloadApplys();
	
	bindEvent();

	$("#search").click(function(event) {
		var status = $("#hadChecked").val();
		var vaStatus = $("#vaStatus").val();
		
		var commissionNo = $("#liushui-no").val();
		if(commissionNo!=null&&commissionNo!=""&&!isNaN(commissionNo)){
			commissionNo=parseInt(commissionNo)-100000000;
		}
		var guideType = $("#guideType").val();
		var name = $('#name').val();
		
		var mall = $("input[name='mallid']").val();
		var shop = $("input[name='shopid']").val();

		
		var amountStart = $("#jine-start").val();
		var amountEnd = $('#jine-end').val();
		if(mall.replace(/(^\s*)|(\s*$)/g, "")==""&&shop.replace(/(^\s*)|(\s*$)/g, "")!=""){
			_util.cmsTip("请先选择店铺！");
			return;
		}
		
		ajaxloadApplys(null,commissionNo,guideType,mall,shop,amountStart,amountEnd,name,status,vaStatus);
	});
	$('.fancybox').fancybox();
	$('.fancybox-buttons').fancybox({
		openEffect  : 'none',
		closeEffect : 'none',

		prevEffect : 'none',
		nextEffect : 'none',

		closeBtn  : false,

		helpers : {
			title : {
				type : 'inside'
			},
			buttons	: {}
		},

		afterLoad : function() {
			
			this.title = 'Image ' + (this.index + 1) + ' of ' + this.group.length + (this.title ? ' - ' + this.title : '');
		}
	});

});
function ajaxloadApplys(page,commissionNo,guideType,mall,shop,amountStart,amountEnd,name,status,vaStatus) {
	var url_ = "../sc/list?module=finance";
	var param = $("#isChecked").val();
	var start = $("input[name='start']").val();
	var end = $("input[name='end']").val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	}
	if (param == "-2,3,4,5,6") {
		if (status == "0"||status==null||status=='undefined'||status=='') {
			param = "-2,3,4,5,6"
		} else {
			param = status;
		}
	}
	$.ajax({
		url : url_,
		type : 'get',
		data : {
			"commissionNo" : commissionNo,
			"guideType" : guideType,
			"mallName" : mall,
			"shopName" : shop,
			"uploadStartTime" : start,
			"uploadEndTime" : end,
			"amountStart" : amountStart,
			"amountEnd" : amountEnd,
			"sellerName" : name,
			"page" : currpage,
			"status" : param,
			"vaStatus":vaStatus
		},
		success : function(data) {
			$("#resultList").html(data);
			checkListener();
			pageListener();
			$("img[name='fangda']").click(function(){
				var url=$(this).attr("src");
				$("#tt1").attr("href",url);
				$("#tt1").click();
			})
		},
		error : function(data) {

		}
	});
}

function checkApplys(ids, guideType, status, reason) {
	$.post("../sc/check", {
		ids : ids,
		guideType : guideType,
		status : status,
		operateBiz:2,
		reason : reason
	}, function(data) {
		if (data.success == true) {
			_util.cmsTip("操作成功!");
		} else {
			_util.cmsTip("操作失败！");
		}
		ajaxloadApplys();
	}, "json");
	;
}
function batchCheck(){
	var ids = [];
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			ids.push(this.id);
		}
	});
	if (ids.length != 0) {
		checkApplys(ids.join(","), 3);
	}else{
		_util.cmsTip("您至少要选中一条返佣！");
		return;
	}
}
function checkListener() {
	$("#select-all").click(function() {
		$('input[name="subBox"]').attr("checked", this.checked);
	});
	var $subBox = $("input[name='subBox']");
	$subBox
			.click(function() {
				$("#select-all")
						.attr(
								"checked",
								$subBox.length == $("input[name='subBox']:checked").length ? true
										: false);
			});
}
function switchCheck(check) {
	$("#currpage").val(1);
	if (check == 2) {
		$("#uncheck").addClass("change-color");
		$("#uncheck").removeClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#overLimit").removeClass("change-color");
		$("#overLimit").addClass("now");
		$("#batch-check").css("display", "block");
		$("#isChecked").val(2);
		$("#checkLi").css("display", "none");
		$("#vaStatusLi").css("display", "none");

	} else if(check == 5){
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#overLimit").addClass("change-color");
		$("#overLimit").removeClass("now");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("5");
	}else {
		$("#checkLi").css("display", "block");
		$("#vaStatusLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#overLimit").removeClass("change-color");
		$("#overLimit").addClass("now");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("-2,3,4,6");
	}
	ajaxloadApplys();
}

function checkUnpass(id, guideType) {
	confirmMSG(
			"理由：<textarea rows='5' cols='42' id='reason' placeholder='请输入100字符以内未通过理由'></textarea>",
			function() {
				var reason = $("#reason").val();
				if (trimAll(reason) == '') {
					_util.cmsTip("请输入审核不通过理由");
					return -1;
				} else {
					if (reason.length > 100) {
						_util.cmsTip("字数超过限制！");
						return -1;
					} else {
						checkApplys(id, guideType, -2, reason);
					}
				}
			});
}
function payingNow(){
	_util.cmsConfirm("您确认要立即打款给卖家吗？", function() {
		$.get("../sc/payingNow",function(data){
			if(data.success==true){
				_util.cmsTip("打款请求已经发送!请稍后查看账户是否收到打款！");
			}
		},"json")
	});
}
