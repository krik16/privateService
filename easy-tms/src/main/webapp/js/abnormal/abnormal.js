/**
 * 异常账务 Author:ZhengYl
 */
$.ajaxSetup({
	cache : false
});
$(document)
		.ready(
				function() {
					ajaxloadApplys();
					setDefaultTime();
					bindEvent();
					$("#search")
							.click(
									function(event) {
										var status = $("#hadChecked").val();
										var id = $("#liushui-no").val();
										var userAccount = $(
												"input[name='userAccount']")
												.val();
										var orderNo = $("input[name='orderNo']")
												.val();
										var start = $("input[name='start']")
												.val();
										var end = $("input[name='end']").val();
										var paymentType = $("#channel").val();
										var amountMin = $("#amountMin")
												.val();
										var amountMax = $('#amountMax').val();
										ajaxloadApplys(null, status, id,
												userAccount, orderNo, start,
												end, paymentType, amountMin,
												amountMax);
									});
				});

function ajaxloadApplys(page, status, id, userAccount, orderNo, start, end,
		paymentType, amountMin, amountMax) {
	var url_ = "../ab/list";
	var param = $("#isChecked").val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	}
	if (param == "-1,1") {
		if (status == "0" || status == null || status == 'undefined') {
			param = "-1,1";
		} else {
			param = status;
		}
	}
	$.ajax({
		url : url_,
		type : 'get',
		data : {
			"id" : id,
			"userAccount" : userAccount,
			"orderNo" : orderNo,
			"start" : start,
			"end" : end,
			"paymentType" : paymentType,
			"amountMin" : amountMin,
			"amountMax" : amountMax,
			"page" : currpage,
			"status" : param
		},
		success : function(data) {
			$("#resultList").html(data);
			checkListener();
			pageListener();
			$('a:[name="remote"]').poshytip({ 
				className: 'tip-green',
				offsetX: -7,
				offsetY: 16,
				allowTipHover: false,
			    content: function(updateCallback) { 
			    	var rejectReason="原因：" + $(this).attr("reason");
			    	return rejectReason;
			    } 
			}); 
		},
		error : function(data) {

		}
	});
}

function switchCheck(check) {
	$("#currpage").val(1);
	if (check == 0) {
		$("#uncheck").addClass("change-color");
		$("#uncheck").removeClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#batchCheck").css("display", "");
		$("#create").css("display", "");
		$("#isChecked").val(0);
		$("#checkLi").css("display", "none");
	} else {
		$("#checkLi").css("display", "");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#batchCheck").css("display", "none");
		$("#create").css("display", "none");
		$("#isChecked").val("-1,1");
	}
	setDefaultTime();
	ajaxloadApplys();
}

function checkApplys(ids, status, reason) {
	$.ajax({
		url : "../ab/check",
		type : "POST",
		data : {
			ids : ids,
			status : status,
			operateBiz : 1,
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
		_util.cmsTip("您至少要选中一条明细！");
		return;
	}
};

function checkUnpass(id, remarks) {
	confirmMSG(
			"理由：<textarea rows='5' cols='42' id='reason' placeholder='请输入200字符以内未通过理由'>"
					+ remarks + "</textarea>", function() {
				var reason = $("#reason").val();
				if (trimAll(reason) == '') {
					_util.cmsTip("请输入审核不通过理由");
					return -1;
				} else {
					if (reason.length > 200) {
						_util.cmsTip("字数超过限制！");
						return -1;
					} else {
						checkApplys(id, -1, reason);
					}
				}
			});
}

function setDeleted(ids) {
	confirmMSG(
			"是否确认要删除当前记录？", function() {
				$.ajax({
					url : "../ab/del",
					type : "POST",
					data : {
						ids : ids,
						status : 1,
						operateBiz : 1,
						reason : ""
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
			});
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
