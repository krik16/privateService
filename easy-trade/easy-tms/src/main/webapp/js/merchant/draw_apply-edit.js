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
		var drawNo = $("#liushui-no").val();
		var name = $('#name').val();
		var mall = $("input[name='mallid']").val();
		var shop = $("input[name='shopid']").val();
		var channel = $("#channel").val();
		
		var amountStart = $("#jine-start").val();
		var amountEnd = $('#jine-end').val();
		if(mall.replace(/(^\s*)|(\s*$)/g, "")==""&&shop.replace(/(^\s*)|(\s*$)/g, "")!=""){
			_util.cmsTip("请先选择商场！");
			return;
		}
		ajaxloadApplys(null,status,drawNo,mall,shop,amountStart,amountEnd,name,channel);
	});
});
function ajaxloadApplys(page,status,drawNo,mall,shop,amountStart,amountEnd,name,channel) {
	var url_ = "../bs/list?module=merchant";
	var param = $("#isChecked").val();
	var currpage;
	var start = $("input[name='start']").val();
	var end = $("input[name='end']").val();
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	}
	if (param == "-1,1,2,-2,3") {
		if (status == "0"||status==null||status=='undefined') {
			param = "-1,1,2,-2,3"
		} else {
			param = status;
		}
	}
	$.ajax({
		url : url_,
		type : 'get',
		data : {
			"drawNo" : drawNo,
			"mall" : mall,
			"shop" : shop,
			"start" : start,
			"end" : end,
			"amountMin" : amountStart,
			"amountMax" : amountEnd,
			"seller" : name,
			"page" : currpage,
			"check" : param,
			"channel" : channel
		},
		success : function(data) {
			$("#resultList").html(data);
			checkListener();
			pageListener();
		},
		error : function(data) {

		}
	});
}

function checkApplys(ids, status, reason) {
	$.ajax({ 
		url: "../bs/check", 
		type:"POST",
		data:{
			ids : ids,
			status : status,
			operateBiz:1,
			reason : reason
		}, 
		success: function(data) {
			if (data.success == true) {
				_util.cmsTip("操作成功!");
			} else {
				_util.cmsTip("操作失败！");
			}
			ajaxloadApplys();
		},
		dataType:"json"
		});
}
function batchCheck(){
	var ids = [];
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			ids.push(this.id);
		}
	});
	if (ids.length != 0) {
		checkApplys(ids.join(","), 1);
	}else{
		_util.cmsTip("您至少要选中一条提现明细！");
		return;
	}
};
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
	if (check == 0) {
		$("#uncheck").addClass("change-color");
		$("#uncheck").removeClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#batchCheck").css("display", "block");
		$("#isChecked").val(0);
		$("#checkLi").css("display", "none");

	} else {
		$("#checkLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#batchCheck").css("display", "none");
		$("#isChecked").val("-1,1,2,-2,3");
	}
	setDefaultTime();
	ajaxloadApplys();
}

function checkUnpass(id) {
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
						checkApplys(id, -1, reason);
					}
				}
			});
}


