/**
 * 异常账务 Author:袁波
 */
$.ajaxSetup({
	cache : false
});
$(document).ready(function() {
	ajaxloadApplys();
	$('#date1').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			/*
			 * var now = new Date(); if (dt < now) {
			 * $("input[name='time']").val(""); layer.alert("推送时间不小于当前时间！"); }
			 */
		}
	});
	$('#date2').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			/*
			 * var now = new Date(); if (dt < now) {
			 * $("input[name='time']").val(""); layer.alert("推送时间不小于当前时间！"); }
			 */
		}
	});
	$('input[name="mallid"]').typeahead({
		source : function(query, process) {
			$("input[name='mallid']").attr("id", "");
			m_names = [];
			map = {};

			var paramsJson = {};
			paramsJson['keywords'] = query;
			paramsJson['timeStamp_'] = new Date().getTime();
			$.get('../main/ajaxGetMalls', {
				paramsJson : JSON.stringify(paramsJson)
			}, function(result) {
				$.each(result.msg, function(i, mall) {
					map[mall.name] = mall.id;
					m_names.push(mall.name);
				});
				process(m_names);
			});
		},
		items : 20,
		updater : function(selection) {
			$("input[name='mallid']").attr("id", map[selection]);
			$("input[name='mallid']").val(selection);
			return selection;
		}
	});

	$('input[name="shopid"]').typeahead({
		source : function(query, process) {
			var mall = $("input[name='mallid']").val();
			if(mall.replace(/(^\s*)|(\s*$)/g, "")==""){
				_util.cmsTip("请先选择店铺！");
				$("input[name='shopid']").val("")
				return;
			}
			$("input[name='shopid']").attr("id", "");
			m_names = [];
			map = {};
			var paramsJson = {};
			paramsJson['keywords'] = query;
			paramsJson['mallId'] = $("input[name='mallid']").attr("id");
			paramsJson['timeStamp_'] = new Date().getTime();
			$.get('../main/ajaxGetShops', {
				paramsJson : JSON.stringify(paramsJson)
			}, function(result) {
				$.each(result.msg, function(i, shop) {
					map[shop.name] = shop.id;
					m_names.push(shop.name);
				});
				process(m_names);
			});
		},
		items : 20,
		updater : function(selection) {
			var qwe = map[selection];
			$("input[name='shopid']").attr("id", map[selection]);
			$("input[name='shopid']").val(selection);
			return selection;
		}
	});

});
function ajaxloadApplys(page) {
	var status = $("#hadChecked").val();
	var param = $("#isChecked").val();
	var url_ = "../bs/list?module=merchant";
	var drawNo = $("#liushui-no").val();
	var name = $('#name').val();
	var mall = $("input[name='mallid']").val();
	var shop = $("input[name='shopid']").val();
	var channel = $("#channel").val();
	var start = $("input[name='start']").val();
	var end = $("input[name='end']").val();
	var amountStart = $("#jine-start").val();
	var amountEnd = $('#jine-end').val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	}
	if(mall.replace(/(^\s*)|(\s*$)/g, "")==""&&shop.replace(/(^\s*)|(\s*$)/g, "")!=""){
		_util.cmsTip("请先选择店铺！");
		return;
	}
	if (param == "-1,1") {
		if (status == "0") {
			param = "-1,1"
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

$("#search").click(function(event) {
	ajaxloadApplys();
});

function checkApplys(ids, status, reason) {
	$.post("../bs/check", {
		ids : ids,
		status : status,
		operateBiz:1,
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
$("#batch-check").click(function() {
	var ids = [];
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			ids.push(this.id);
		}
	});
	if (ids.length != 0) {
		checkApplys(ids.join(","), 1);
	}
});
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
		$("#batch-check").css("display", "block");
		$("#isChecked").val(0);
		$("#checkLi").css("display", "none");

	} else {
		$("#checkLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("-1,1");
	}
	ajaxloadApplys();
}
function pageListener() {
	$("#upPage").click(function() {
		var currpageVal = parseInt($("#currpage").val());
		if (currpageVal <= 1) {
			_util.cmsTip("已经是第一页了");
			return false;
		} else {
			$("#currpage").val(currpageVal - 1);
		}
		$("#jumpPage").val("");
		ajaxloadApplys();
	});

	$("#downPage").click(function() {

		var currpageVal = parseInt($("#currpage").val());
		var totalPageVal = parseInt($("#rowCont").val());
		if (currpageVal >= totalPageVal) {
			_util.cmsTip("已经是最后一页了");
			return false;
		} else {
			$("#currpage").val(currpageVal + 1);
		}
		$("#jumpPage").val("");
		ajaxloadApplys();
	});

	$("#gopage")
			.click(
					function() {
						var temppage = parseInt($('#jumpPageIn').val()), totalPage = parseInt($(
								"#rowCont").val());
						if (temppage != "" && temppage != undefined
								&& !isNaN(temppage)) {
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
function confirmMSG(msg, fn) {
	var bh = $("body").height();
	var bw = $("body").width();
	$(".MsgBoxConfirm .MsgBoxMain p").html(msg);
	$(".MsgBoxBg").css({
		height : bh,
		width : bw
	}).show();
	$(".MsgBoxConfirm").fadeIn(function() {
		$(".MsgBoxConfirm .MsgBoxMain .cancel").click(function() {
			$(".MsgBoxBg,.MsgBoxConfirm").fadeOut(function() {
				$(".MsgBoxConfirm .MsgBoxMain p").html("");
			});
		});
		$("#MsgBoxBtn").off().on({
			'click' : function(ev) {
				var result = fn();
				if (result == -1) {

				} else {
					$(".MsgBoxBg,.MsgBoxConfirm").fadeOut(function() {
						$(".MsgBoxConfirm .MsgBoxMain p").html("");
					});
				}
			}
		});
	});
}
