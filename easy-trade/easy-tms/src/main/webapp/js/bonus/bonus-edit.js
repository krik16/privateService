/**
 * 考核奖金 Author:袁波
 */
$.ajaxSetup({
	cache : false
});
$(document).ready(function() {
	setDefaultTime();
	ajaxloadApplys();

	bindEvent();
	$("#search").click(function(event) {
		var status = $("#select-checked").val();
		var adno = $("#liushui-no").val();
		var account = $('#account').val();
		var type = $("#type").val();
		var operateType = $("#operateType").val();
		ajaxloadApplys(null, adno, account, type, status,operateType);
	});
});
function ajaxloadApplys(page, adno, account, type, status,operateType) {
	var url_ = "../bonus/list";
	var param = $("#isChecked").val();
	var start = $("#startTime").val();
	var end = $("#endTime").val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = page;
	}
	if (param == "-1,1,2") {
		if (status == "0" || status == null || status == 'undefined') {
			param = "-1,1,2"
		} else {
			param = status;
		}
	}
	$
			.ajax({
				url : url_,
				type : 'get',
				data : {
					"id" : adno,
					"sellerAccount" : account,
					"type" : type,
					"createStartTime" : start,
					"createEndTime" : end,
					"page" : currpage,
					"status" : param,
					"operateType":operateType
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
		url : "../bonus/check",
		type : "POST",
		data : {
			ids : ids,
			status : status,
			operateBiz : 3,
			reason : reason
		},
		success : function(data) {
			if (data.success == true) {
				_util.cmsTip("操作成功!");
			} else {
				_util.cmsTip("操作失败！");
			}
			ajaxloadApplys();
		},
		dataType : "json"
	});
}
function batchCheck() {
	var ids = [];
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			ids.push(this.id);
		}
	});
	if (ids.length != 0) {
		checkApplys(ids.join(","), 1);
	} else {
		_util.cmsTip("您至少要选中一条考核明细！");
		return;
	}
};
function checkListener() {
	$("#select-all").click(function() {
		$('input[name="subBox"]').attr("checked", this.checked);
	});
	var $subBox = $("input[name='subBox']");
	$subBox.click(function() {
		$("#select-all").attr(
				"checked",
				$subBox.length == $("input[name='subBox']:checked").length
						? true
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
		$("#batch-check").css("display", "block");
		$("#isChecked").val(0);
		$("#checkLi").css("display", "none");
		$("#li-checked").css("display", "none");
		$("#create").css("display", "");
		$("#input").css("display", "");
		$("#td-select-all").css("display", "");
		$("#td-check").css("display", "none");
		$("#td-operate").css("display", "");
	} else {
		$("#checkLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("-1,1,2");
		$("#li-checked").css("display", "");
		$("#input").css("display", "none");
		$("#create").css("display", "none");
		$("#td-select-all").css("display", "none");
		$("#td-check").css("display", "");
		$("#td-operate").css("display", "none");
	}
	setDefaultTime();
	ajaxloadApplys();
}
function deleteBonus(id, sdNo) {
	_util.cmsConfirm("您确认要删除流水号  " + sdNo + " 考核明细吗？", function() {
		checkApplys(id, -2);
	});
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
function upPage() {
	var currentPage = parseInt($("#currpage").val());
	var totalPage = parseInt($("#rowCont").val());
	if (currentPage <= 1) {
		_util.cmsTip("已经是第一页了！");
		return;
	} else {
		ajaxloadApplys(currentPage - 1);
	}
};
function downPage() {
	
	var currentPage = parseInt($("#currpage").val());
	var totalPage = parseInt($("#rowCont").val());
	if (currentPage >= totalPage) {
		_util.cmsTip("已经是最后一页了！");
		return;
	} else {
		var page=currentPage + 1;
		ajaxloadApplys(page);
	}
};
function goPage(){
	var currentPage = parseInt($("#currpage").val());
	var totalPage = parseInt($("#rowCont").val());
	var temppage = parseInt($('#jumpPageIn').val());
	if (temppage != "" && temppage != undefined && !isNaN(temppage)) {
		if (temppage >= 1 && temppage <= totalPage) {
			$("#currpage").val(temppage);
			ajaxloadApplys();
		} else if (temppage > totalPage) {
			_util.cmsTip("请输入正确的数字!");
		} else if (temppage == 0) {
			temppage = 1;
			$("#jumpPage").val(1);
			$("#currpage").val(1);
			ajaxloadApplys();
		} else {
			_util.cmsTip("请输入大于0的数字!");
		}
	} else if (temppage == 0) {
		temppage = 1;
		$("#jumpPage").val(1);
		$("#currpage").val(1);
		ajaxloadApplys();
	} else {
		_util.cmsTip("请输入数字!");
	}

};