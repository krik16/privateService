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
	var output;
	$("#search").click(function(event) {
		var drawNo = $("#liushui-no").val();
		var guideType = $("#guideType").val();
		var name = $('#name').val();
		var mall = $("input[name='mallid']").val();
		var shop = $("input[name='shopid']").val();
		var tradeNo = $("#trade-no").val();
		
		var amountStart = $("#jine-start").val();
		var amountEnd = $('#jine-end').val();
		var payType=$("#payType").val();
		if(mall.replace(/(^\s*)|(\s*$)/g, "")==""&&shop.replace(/(^\s*)|(\s*$)/g, "")!=""){
			_util.cmsTip("请先选择店铺！");
			return;
		}
		ajaxloadApplys(null,drawNo,guideType,name,mall,shop,tradeNo,amountStart,amountEnd,payType);
	});
	
});
function ajaxloadApplys(page,drawNo,guideType,name,mall,shop,tradeNo,amountStart,amountEnd,payType) {
	var url_ = "../drawDetail/list";
	var tradeStart = $("input[name='start']").val();
	var tradeEnd = $("input[name='end']").val();
	var currpage;
	if (page == "undefined" || page == "" || page == null) {
		currpage = $('#currpage').val();
	} else {
		currpage = 1;
	} 
	$.ajax({
		url : url_,
		type : 'get',
		data : {
			"drawNo" : drawNo,
			"guideType" : guideType,
			"tradeNo":tradeNo,
			"mall" : mall,
			"shop" : shop,
			"tradeStart" : tradeStart,
			"tradeEnd" : tradeEnd,
			"amountMin" : amountStart,
			"amountMax" : amountEnd,
			"channel":payType,
			"seller" : name,
			"page" : currpage,
			"check" : 3
		},
		success : function(data) {
			$("#resultList").html(data);
			output=new OutPut(drawNo,name,mall,shop,tradeNo,tradeStart,tradeEnd,amountStart,amountEnd,payType);
			pageListener();
		},
		error : function(data) {
			_util.cmsTip(data.msg);
		}
	});
}
 function OutPut(drawNo,name,mall,shop,tradeNo,tradeStart,tradeEnd,amountStart,amountEnd,payType){
	this.drawNo=drawNo;
	this.name=name;
	this.mall=mall;
	this.shop=shop;
	this.tradeNo=tradeNo;
	this.tradeStart=tradeStart;
	this.tradeEnd=tradeEnd;
	this.amountStart=amountStart;
	this.amountEnd=amountEnd;
	this.payType=payType;
}
 function outExcel(){
	 judeOutput(output);
	 var url="../drawDetail/output?drawNo="+output.drawNo+"&tradeNo="+output.tradeNo+"&mall="+output.mall+
	 	"&shop="+ output.shop+"&tradeStart="+output.tradeStart+"&tradeEnd="+output.tradeEnd+"&amountMin="+ output.amountStart
	 	+"&amountMax="+output.amountEnd+"&channel="+output.payType+"&seller="+output.name+"&page=1&check=3"
		$.get(url,function(data){
			if(data.result=='ok'){
				
				window.location.href=url+"&temp=1";
			}else{
				
			}
		},"json");
	};
function judeOutput(outTemp){
	
	if(outTemp.drawNo=='undefined'||outTemp.drawNo==null){
		outTemp.drawNo="";
	}
	if(outTemp.name=='undefined'||outTemp.name==null)
		outTemp.name="";
	if(outTemp.mall=='undefined'||outTemp.mall==null)
		outTemp.mall="";
	if(outTemp.shop=='undefined'||outTemp.shop==null)
		outTemp.shop="";
	if(outTemp.tradeNo=='undefined'||outTemp.tradeNo==null)
		outTemp.tradeNo="";
	if(outTemp.tradeStart=='undefined'||outTemp.tradeStart==null)
		outTemp.tradeStart="";
	if(outTemp.tradeEnd=='undefined'||outTemp.tradeEnd==null)
		outTemp.tradeEnd="";
	if(outTemp.amountStart=='undefined'||outTemp.amountStart==null)
		outTemp.amountStart="";
	if(outTemp.amountEnd=='undefined'||outTemp.amountEnd==null)
		outTemp.amountEnd="";
	if(outTemp.payType=='undefined'||outTemp.payType==null)
		outTemp.payType="";
	
}
