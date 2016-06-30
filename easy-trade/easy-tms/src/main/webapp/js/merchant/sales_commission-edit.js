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
		var name = $('#name').val();
		var commissionNo = $("#liushui-no").val();	
		var guideType = $("#guideType").val();
		var mall = $("input[name='mallid']").val();
		var shop = $("input[name='shopid']").val();
		var status = $("#hadChecked").val();
		var vaStatus = $("#vaStatus").val();
		var amountStart = $("#jine-start").val();
		var amountEnd = $('#jine-end').val();
		if(mall.replace(/(^\s*)|(\s*$)/g, "")==""&&shop.replace(/(^\s*)|(\s*$)/g, "")!=""){
			_util.cmsTip("请先选择店铺！");
			return;
		}
		if(commissionNo!=null&&commissionNo!=""&&!isNaN(commissionNo)){
			commissionNo=parseInt(commissionNo)-100000000;
		}
		
		ajaxloadApplys(null,status,commissionNo,guideType,name,mall,shop,amountStart,amountEnd,vaStatus);
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
function ajaxloadApplys(page,status,commissionNo,guideType,name,mall,shop,amountStart,amountEnd,vaStatus) {
	var url_ = "../sc/list?module=merchant";
	var param = $("#isChecked").val();
	var start = $("input[name='start']").val();
	var end = $("input[name='end']").val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	}
	if (param == "-1,2,-2,3,4,5,6") {
		if (status == "0"||status==null||status=='undefined') {
			param = "-1,2,-2,3,4,5,6"
		} else {
			param = status;
		}
	}
	$.ajax({
		url : url_,
		type : 'get',
		data : {
			"commissionNo" : commissionNo,
			"guideType":guideType,
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



function checkApplys(ids, status, reason,guideType) {
	
	$.ajax({ 
		url: "../sc/check", 
		type:"POST",
		data:{
			ids : ids,
			guideType : guideType,
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
	var guideType = '';
	var flag = false;
	$(":checkbox[name='subBox']").each(function() {
		if (this.checked == true) {
			ids.push(this.id);
			if(guideType=='')
				guideType = ($(this).attr("guideType"))
			if($(this).attr("guideType")==null || guideType!=$(this).attr("guideType")){
				flag = true;
			}
		}
	});
	if(guideType=='' || flag){
		_util.cmsTip("请选择同一渠道类型的进行批量审核！");
		return;
	}

	if (ids.length != 0) {
		checkApplys(ids.join(","), 2, guideType);
	}else{
		_util.cmsTip("您至少要选中一条返佣！");
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
	if (check == 0) {
		$("#uncheck").addClass("change-color");
		$("#uncheck").removeClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#overLimit").addClass("now");
		$("#overLimit").removeClass("change-color");
		$("#batch-check").css("display", "block");
		$("#isChecked").val(1);
		$("#checkLi").css("display", "none");
		$("#vaStatusLi").css("display", "none");

	} else if(check == 1) {
		$("#checkLi").css("display", "block");
		$("#vaStatusLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").addClass("change-color");
		$("#checked").removeClass("now");
		$("#overLimit").addClass("now");
		$("#overLimit").removeClass("change-color");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("-1,2,-2,3,4,6");
	} else{
		$("#vaStatusLi").css("display", "block");
		$("#uncheck").removeClass("change-color");
		$("#uncheck").addClass("now");
		$("#checked").removeClass("change-color");
		$("#checked").addClass("now");
		$("#overLimit").addClass("change-color");
		$("#overLimit").removeClass("now");
		$("#batch-check").css("display", "none");
		$("#isChecked").val("5");
	}

	setDefaultTime();
	ajaxloadApplys();
}

function checkUnpass(id,guideType) {
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
						checkApplys(id, -1, reason, guideType);
					}
				}
			});
}
function tankuang(url){
	alert(1);
	
}
