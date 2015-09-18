

//获取浏览器高度
function getWinHeight() {
	if ($.browser.msie) {
		return document.compatMode == "CSS1Compat" ? document.documentElement.clientHeight
				: document.body.clientHeight;
	} else {
		return self.innerHeight;
	}
}
// 获取浏览器宽度
function getWinWidth() {
	if ($.browser.msie) {
		return document.compatMode == "CSS1Compat" ? document.documentElement.clientWidth
				: document.body.clientWidth;
	} else {
		return self.innerWidth;
	}
}

//判断是否需要增加超链接
function isHref(id){
	var _href=new Array("batchDisplay"); //定义超链接数组 
	var len = _href.length;
	for(var i=0;i<len;i++){
		if(id==_href[i]){
			return true;
		}
	}
	return false;
}
/**
 * @author jack.zhang
 * 把一个字符类型的数字转化为数字类型数字
 * @param num
 * @returns
 */
function msNumber(num){
	if(typeof(num) == 'undefined'){
		return 0;
	}
	if(!/\-?[0-9]+(\.[0-9]+)?$/g.test(""+num)){
		return 0;
	}
	return Number(num);
}
/**
 * @author jack.zhang
 * @param jqObj jquery 对象
 * @returns 返回值
 * example:getValue($("#input"));
 */
function getValue(jqObj){
	if(typeof(jqObj)=='undefined')
		return '';
	var value = '';
	if (jqObj.is("input[thousep][check^='number']")){
		value = clearThousandSeprator(jqObj.val());
		if (jqObj.is("input[multiply]")){
			value = Math.round(msNumber(value)*msNumber(jqObj.attr("multiply"))*100)/100;
		}
	}else if (jqObj.is("input[multiply][check^='number']")){
		value = Math.round(msNumber(jqObj.val())*msNumber(jqObj.attr("multiply"))*100)/100;
	}else if (jqObj.is("input,textarea,select")) {
		value = jqObj.val();
	}else if (jqObj.is("span[thousep],div[thousep],td[thousep]")) {
		value = clearThousandSeprator(jqObj.html());
		if (jqObj.is("span[multiply],div[multiply],td[multiply]")) {
			value = Math.round(msNumber(value)*msNumber(jqObj.attr("multiply"))*100)/100;
		}
	}else if (jqObj.is("span[multiply],div[multiply],td[multiply]")) {
		value = Math.round(msNumber(jqObj.html())*msNumber(jqObj.attr("multiply"))*100)/100;
	}else if (jqObj.is("span,div,td,a,li")) {
		value = jqObj.html();
	}
	return ''+value;
}



/**
 * 对比时间
 * compareDate
 * @param startDate
 * @param endDate
 * @returns {Boolean}
 */
function compareDate(startDate, endDate) {

	if ((startDate === '' || startDate === 'undefined')&& (endDate === '' || endDate === 'undefined')) {
		return false;
	}

	if ((startDate === '' || startDate === 'undefined')&& (endDate != '' || endDate != 'undefined')) {
		return false;
	}

	if ((startDate != '' || startDate != 'undefined')&& (endDate === '' || endDate === 'undefined')) {
		return true;
	}

	startDate = startDate.replace(/-/g, "/");
	endDate = endDate.replace(/-/g, "/");

	var firstDate = new Date(startDate);
	var secondDate = new Date(endDate);

	if (Date.parse(firstDate) - Date.parse(secondDate) == 0) {
		return false;
	}

	if (Date.parse(firstDate) - Date.parse(secondDate) < 0) {
		return true;
	}

	if (Date.parse(firstDate) - Date.parse(secondDate) > 0) {
		return false;
	}
	return false;
} 

/**
 * @author jack.zhang
 * @param jqObj jquery 对象
 * @param value
 * example:setValue($("#input"),"这是一个setValue方法");
 */
function setValue(jqObj, value) {
	if (typeof(jqObj)=='undefined' || typeof(value)=='undefined')
		return;
	value = (''+value).replace(/(^\s+)|(\s+$)|(\t+)|(\.0+\s*$)/gi, '');
	if (jqObj.is("input[thousep][check^='number']")){
		if (jqObj.is("input[multiply]")){
			value = Math.round(msNumber(value)*100/msNumber(jqObj.attr("multiply")))/100;
		}
		jqObj.val(addThousandSeprator(value));
	}else if (jqObj.is("input[multiply][check^='number']")){
		jqObj.val(Math.round(msNumber(value)*100/msNumber(jqObj.attr("multiply")))/100);
	}else if (jqObj.is("input,textarea")) {
		jqObj.val(value);
	}else if (jqObj.is("select")) {
		if(jqObj.is("select[multiple='multiple']")){
			var optionVal = value.split(",");
			for (var j = 0; j < optionVal.length; j++) {
				jqObj.find("option[value='" + optionVal[j] + "']").attr("selected", "selected");
			}
		}else{
			jqObj.find("option[value='" + value + "']").attr("selected", "selected");
		}
		
	}else if (jqObj.is("span[thousep],div[thousep],td[thousep]")) {
		if (jqObj.is("span[multiply],div[multiply],td[multiply]")) {
			value = Math.round(msNumber(value)*100/msNumber(jqObj.attr("multiply")))/100;
		}
		jqObj.html(addThousandSeprator(value));
	}else if (jqObj.is("span[multiply],div[multiply],td[multiply]")) {
		jqObj.html(Math.round(msNumber(value)*100/msNumber(jqObj.attr("multiply")))/100);
	}else if (jqObj.is("span,div,td,a")) {
		jqObj.html(value);
	}else{//其他情况
	     jqObj.html(value)
	}
}
/**
 * @author jack.zhang
 * @param request 请求参数
 * @param callback 回调函数
 * 
 */
function dataSub(request,callback){
	var async = true;//true为同步
	if(request.async===false)
		async = false;
	var buddle = [];
	buddle.push( {
		name : "request_json",
		value : $.toJSON(request)
	});
	if(request.source ){
		if(!callback)
			onGetCommonCodes(request);
	}else{
		$.ajax( {
			type : "POST",
			url : contextPath +"/commonCodesQuery.do",
			async:async,
			data : buddle,
			dataType : "JSON",
			success : callback,
			error : function(e){
				alert("后台调用错误");
			}
		});
	}
}
/**
 * @author jack.zhang
 * @param request 请求参数  对jquery AJAX方法进行了封装
 * request.url 请求地址，
 * request.data 数据对象
 * request.async
 * @param callback 回调函数
 * @param errorCallback  通信错误回调函数
 * 
 */
function dataSubSingle(request,callback,errorCallback){
	var async = true;//true为异步
	if(request.async===false)
		async = false;//false为同步
	var buddle = [];
	buddle.push( {
		name : "request_json",
		value : $.toJSON(request.data)
	});
	$.ajax({
		 type: "POST",
		 timeout: 60000,
		 url:contextPath+request.url,
		 async:async,
		 dataType: 'json',      
		 data:buddle,
		 contentType: "application/x-www-form-urlencoded; charset=UTF-8",
		 success:callback,
		 error: errorCallback || function(xmlHttpReq){
		    showResultMessage("请求服务器发生错误，请查看您的网络是否正常后重试！", false);
			return null;
		}
	});
}
/**
 * 去掉所有的空格
 * @param str
 * @returns
 */
function trimAll(str) {
	if(str==null || str=="" || typeof(str)=="undefined") {
		return str;
	}
  	return str.replace(/(^\s+)|(\s+$)|(\t+)|(\.0+\s*$)/g,"");
}
/**
 * @author Jack.Zhang
 * 得到当前的时间：2013-11-07 11:02:09
 */
function getNowDate(){
	 var date = new Date();
	    var seperator1 = "-";
	    var seperator2 = ":";
	    var month = date.getMonth() + 1;
	    var strDate = date.getDate();
	    if (month >= 1 && month <= 9) {
	        month = "0" + month;
	    }
	    if (strDate >= 0 && strDate <= 9) {
	        strDate = "0" + strDate;
	    }
	    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
	            + " " + date.getHours() + seperator2 + date.getMinutes()
	            + seperator2 + date.getSeconds();
	    return currentdate;
}
/**
 * 阻止浏览器的默认行为
 * @param e
 */
function stopDefault(e) {
	//如果提供了事件对象，则这是一个非IE浏览器 
	if(e && e.preventDefault) {//阻止默认浏览器动作(W3C)
		e.preventDefault();
	} else {
		//IE中阻止函数器默认动作的方式 
		window.event.returnValue = false; 
	}
	return false;
}

/**
 * 停止事件冒泡
 * @param e
 * @returns {Boolean}
 */
function stopBubble(e) {
    //如果提供了事件对象，则这是一个非IE浏览器
    if(e && e.stopPropagation) {
    	//因此它支持W3C的stopPropagation()方法
    	e.stopPropagation(); 
    } else {
    	//否则，我们需要使用IE的方式来取消事件冒泡 
    	window.event.cancelBubble = true;
    }
    return false;
}
/**
 * 得到字符串的长度 utf-8一个字符为3个字节
 * @author Jack.Zhang
 * @param str
 * @returns {Number}
 */
function getStrLeng(str){
    var realLength = 0;
    var len = str.length;
    var charCode = -1;
    for(var i = 0; i < len; i++){
        charCode = str.charCodeAt(i);
        if (charCode >= 0 && charCode <= 128) { 
            realLength += 1;
        }else{ 
            // 如果是中文则长度加3
            realLength += 3;
        }
    }
    return realLength;
}


/**
 * 
 * @param jqObj  jqueryObject
 * @param optionData 数据源对象
 */
function fillSelectOptions(jqObj, optionData) {
	if (typeof(jqObj)=="undefined"||typeof(optionData)=="undefined")
		return;
	var defval = (typeof(jqObj.attr("defval"))=='undefined')?"":jqObj.attr("defval");
	var cascade = (typeof(jqObj.attr("cascade"))=='undefined')?"":jqObj.attr("cascade");
	var options = "<option value='0'>请选择</option>";
	for ( var i = 0; i < optionData.length; i++) {
		var code = optionData[i].code;
		options += "<option value='" + optionData[i].code + "'";
		if(defval!="" && code == defval){//默认值为select放值
			options += " selected='selected'";
			if(cascade!=""){//给级联项目放值
				setValue($("input[name='"+cascade+"']"),optionData[i].desc);
			}
		}
		options += ">";
		options += optionData[i].desc;
		options += "</option>";
	}
	jqObj.empty().append(options);
	
	if(jqObj.attr("multiple")=="multiple"){
		var defvalArray = jqObj.attr("defval");
		if(defvalArray!="" && typeof defvalArray !="undefined"){
			setValue(jqObj,jqObj.attr("defval").split(","));
		}
	}
}
/**
 * 把select 设置值用于查询用
 * @param jqObj
 * @param optionData
 */
function fillSelectOptionsToQuery(jqObj, optionData) {
	if (typeof(jqObj)=="undefined"||typeof(optionData)=="undefined")
		return;
	var defval = (typeof(jqObj.attr("defval"))=='undefined')?"":jqObj.attr("defval");
	var cascade = (typeof(jqObj.attr("cascade"))=='undefined')?"":jqObj.attr("cascade");
	var options = "<option value='0'>全部</option>";
	for ( var i = 0; i < optionData.length; i++) {
		var code = optionData[i].code;
		options += "<option value='" + optionData[i].code + "'";
		if(defval!="" && code == defval){//默认值为select放值
			options += " selected='selected'";
			if(cascade!=""){//给级联项目放值
				setValue($("input[name='"+cascade+"']"),optionData[i].desc);
			}
		}
		options += ">";
		options += optionData[i].desc;
		options += "</option>";
	}
	jqObj.empty().append(options);
	
	/*if(jqObj.attr("multiple")=="multiple"){
		var defvalArray = jqObj.attr("defval");
		if(defvalArray!="" && typeof defvalArray !="undefined"){
			setValue(jqObj,jqObj.attr("defval").split(","));
		}
	}*/
}
/**
 * 得到资源
 * @param obj
 * @param key
 * 例  getDictValue("importanceType",1)  return "紧急"
 * @author Jack.Zhang
 */
function getDictValue(obj,key){
	var optionData = dictData[obj];
	for ( var i = 0; i < optionData.length; i++) {
		var code = optionData[i].code;
		if(code == key){
			return optionData[i].desc;
		}
	}
	return "查询无此值";
}

/**
 * 初始化select对象 
 * @param jqObj 
 * @param dictData
 * @author Jack.Zhang
 */
function initSelects(jqObj, dictData) {
	if (typeof(jqObj)=="undefined" || typeof(dictData)=="undefined")
		return;
	jqObj.find("select[dictKey]").each(function() {
		var dictKey = $(this).attr("dictKey");
		var optionData = dictData[dictKey];
		fillSelectOptions($(this), optionData);
	});
	jqObj.find("select[defval]").each(function(){
		var defval = $(this).attr("defval");
		setValue($(this),defval);
	});
	//生成年份的选择框
	/** var curYear = new Date().getFullYear();
	jqObj.find("select[name^='year'][term]").each(function(){
		var addYear = (typeof($(this).attr("addyear"))=='undefined'?0:msNumber($(this).attr("addyear")));
		for(var i=(curYear+addYear); i>=2003; i--){
			$(this).append("<option value='"+i+"'>"+i+"</option>");
		}
		$(this).find("option[value='"+curYear+"']").attr("selected", "selected");
	});
	jqObj.find("select[name^='month'][term]").each(function(){
		for(var i=12; i>=1; i--){
			$(this).append("<option value='"+i+"'>"+i+"</option>");
		}
	});
	$("tbody[initial]").each(function(){//要初始化的函数
		eval($(this).attr("initial"));
	});**/
}

/**
 * 
 * @param 根据selectID 给值
 * @param dictKey
 */
function reInitSelect(selectID, dictDate){
	var id = "#"+selectID;
	fillSelectOptions($(id), dictDate);
}



/**
 * 禁用页面的元素 
 * @param modelName  entityName
 * @param isHideInteractionBut 是否禁用交互组件
 * @author Jack.Zhang
 */
function hideModel(modelName,isHideInteractionBut){
	 $("[model='"+modelName+"']").each(function(){
		 setElementHide($(this));
	 });
	 /*if(isHideInteractionBut == true){
		 $("#interaction").remove();
	 }*/
}
/**
 * 设置元素为只读
 * @param obj jqueryObject
 * @author Jack.Zhang
 */
function setElementHide(obj){
	 obj.attr("disabled",true);
}


/**
 * 通过实体类来收集数据
 * @param modelName
 */
function dataCollection(modelName){
	var Entity = new Object();
		$("input,select,textarea").each(function(){
			if($(this).attr("model")==modelName){
				var field = $(this).attr("name");
				if($(this).attr("valueType")=="number"){//写了这个属性是number
					Entity[$(this).attr("name")]= msNumber(getValue($(this)));
				}else{
					Entity[$(this).attr("name")]= getValue($(this));
				}
			}
		});
	return Entity;
}

/**
 * 注册级联事件 
 * select 选择之后把text()的值放入<input type='hidden' />
 * 多个以逗号分隔
 * @author Jack.Zhang
 */
function selectCascadeEvenListener(){
	$("select[cascade]").each(function(){
	 var cascade = $(this).attr("cascade");
	 var  elModel= $(this).attr("model");
	 setValue($("input[model='"+elModel+"'][name='"+cascade+"']"),$(this).find("option:selected").text());
	 $(this).live("change",function(){
		 var optionV = "";
		 $(this).find("option:selected").each(function() {
			 optionV += $(this).text()+',';
	        });
		 setValue($("input[model='"+elModel+"'][name='"+cascade+"']"),optionV.substring(0,optionV.length-1));
	 });
	});
}


/**
 * arr 为 json 对象 list数组
 * 根据树结构数据，创建树形select选项 
 * selectNode 为要添加树型选择的节点（id）
 * type 分组选择的类型，默认为 创建， query为查询
 * @author fafu.yi
 */
function createSelectTree(arr,selectNode,type){
  	var node = selectNode;
  	selectNode.find("option").remove();
	for(var i=0 ;i<arr.length;i++){
		if(arr[i].parentID == 0){
			var options = "<optgroup label='"+arr[i].productLineName+"'  id = 'p_"+ arr[i].productLineID+"'></optgroup>";
			selectNode.append(options);
		}
	}
	for(var i=0 ;i<arr.length;i++){
		if(arr[i].parentID != 0){
			var pID = arr[i].parentID;
			var pNode = $("#p_"+pID);
			var options = "<option value = '"+arr[i].productLineID+"'>"+ arr[i].productLineName +"</option>";
			pNode.append(options);
		}
	}
	if(typeof type !="undefined" && type == "query"){
  		selectNode.append("<optgroup label='全部' > <option value='0'  selected='true'>全部</option></optgroup>");
  	}else{
  		selectNode.append("<optgroup label=' ' > <option value='0'  selected='true'>--请选择--</option></optgroup>");
  	}
	
	return selectNode;
}

//项目详情中，多个产品线用一个方法生成会 产生ID覆盖，导致显示不正常
function createOtherTree(arr,selectNode,type){
  	var node = selectNode;
  	selectNode.find("option").remove();
	for(var i=0 ;i<arr.length;i++){
		if(arr[i].parentID == 0){
			var options = "<optgroup label='"+arr[i].productLineName+"'  id = 's_"+ arr[i].productLineID+"'></optgroup>";
			selectNode.append(options);
		}
	}
	for(var i=0 ;i<arr.length;i++){
		if(arr[i].parentID != 0){
			var pID = arr[i].parentID;
			var pNode = $("#s_"+pID);
			var options = "<option value = '"+arr[i].productLineID+"'>"+ arr[i].productLineName +"</option>";
			pNode.append(options);
		}
	}
	if(typeof type !="undefined" && type == "query"){
  		selectNode.append("<optgroup label='全部' > <option value='0'  selected='true'>全部</option></optgroup>");
  	}else{
  		selectNode.append("<optgroup label=' ' > <option value='0'  selected='true'>--请选择--</option></optgroup>");
  	}
	
	return selectNode;
}

/**
 * 设置元素为默认值
 * @param obj jqueryObj
 * @author Jack.Zhang
 */
function setValueReset(obj){
	if(obj.is("input,textarea")){
		setValue(obj,"");
	}else if(obj.is("select")){
		obj.find("option").eq(0).attr("selected", "selected");
	}
}
/**
 * 注册事件重置事件
 * @param obj
 */
function resetClickListener(obj){
	if (typeof(obj)=='undefined' || typeof(obj)=='undefined')
		return;
	$("[model='"+obj+"']").each(function(){
		if(!($(this).attr("readonly")=="readonly")){
			setValueReset($(this));
		}
	});
	removeAllErrTip();
	
}

/**  
*转换日期对象为日期字符串  
* @author Jack.Zhang
* @param l long值  
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss  
* @return 符合要求的日期字符串  
*/  
function getFormatDate(date, pattern) {
    if (date == undefined) {
        date = new Date();
    }
    if (pattern == undefined) {
        pattern = "yyyy-MM-dd hh:mm:ss";
    }
    return date.format(pattern);
}
/**
 * Date的扩展程序
 * @author Jack.Zhang
 */
Date.prototype.format = function (format) {
    var o = {
        "M+": this.getMonth() + 1,
        "d+": this.getDate(),
        "h+": this.getHours(),
        "m+": this.getMinutes(),
        "s+": this.getSeconds(),
        "q+": Math.floor((this.getMonth() + 3) / 3),
        "S": this.getMilliseconds()
    }
    if (/(y+)/.test(format)) {
        format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)) {
            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
}
/**
 * Array 数组快速查找是否存
 * arr 数组对象
 * value 元素的值
 * @author Jack.Zhang
 */
Array.prototype.IsContain = function(arr,value){
	for(var i=0;i<arr.length;i++)
	  {
	     if(arr[i]===value)
	      return true;
	  }
	  return false;
}
/**
 * 通过 Long整形数据得到格式化后的数据
 * @author Jack.Zhang
 * @param l
 * @param pattern
 * @returns {符合要求的日期字符串}
 */
function getFormatDateByLong(l, pattern) {
	if(typeof l == "undefined"){
		return "";
	}
	if(!l){
		return "";
	}
    return getFormatDate(new Date(l), pattern);
}

/**
 * 格式化数据
 * @param str
 * @author Jack.Zhang
 */
function formTD(str){
	if(str!=null && typeof str!='undefined'){
		var len = str.length;
		if(len>12){
			return str.substring(0,10)+"...";
		}
		return str;
	}
	if(typeof str!='undefined' && str == null){
		return "";
	}
	return str;
	
}

/**
 * 刷缓存
 * @param request
 * @param callback
 * @author Jack.Zhang
 */
function dataSubLoadCache(request,callback){
	var async = true;//true为异步
	if(request.async===false)
		async = false;//false为同步
	var buddle = [];
	buddle.push( {
		name : "request_json",
		value : $.toJSON(request.data)
	});
	$.ajax({
		 type: "POST",
		 timeout: 60000,
		 url:request.url,
		 async:async,
		 dataType: 'json',      
		 data:buddle,
		 success:callback,
		 error: function(xmlHttpReq){
		    showResultMessage("请求服务器发生错误，请查看您的网络是否正常后重试！", false);
			return null;
		}
	});
}

/**
 *  
 * @param obj 导航div对象
 * @param total 总页数
 * @param pageNu 当前页数
 * @param url 请求
 */
function showPageDataSub(obj,total, pageNu,url){
	var objID = obj.attr("id");//用来区别不同的分页导航
	total = Math.ceil(total / 10);
	if (total == 0) {
		obj.hide();
	} else {
		obj.show();
		var options = {
			currentPage : pageNu,
			totalPages : total,
			numberOfPages : 5,
			alignment : 'right',
			onPageClicked: function(e,originalEvent,type,page){
				if("productListPaginator"==objID){
					var request = new Object();//请求对象
					request.url = "/showProduct.do";
					var requestData = new Object();
					requestData = collectionProductSearch("productSearch");
					requestData.pageNu = page;
					request.data = requestData ;
					request.async = false;
					dataSubSingle(request,function(json){
						var success = json.success;
						if(success == true){
							setProductToTbody($("#product_tbody"),json.dataMap.ProductList);
						}else{
							alert("查询失败!");
						}
					});
				}else if("productCasPaginator"==objID){
					var request = new Object();//请求对象
					request.url = "/queryProductCasByProjectID.do";
					var requestData = new Object();
					requestData.projectID =msNumber(getValue($("#projectID"))) ;
					requestData.pageNu = page;
					request.data = requestData ;
					request.async = false;
					dataSubSingle(request,function(json){
						var success = json.success;
						if(success == true){
							setProductToProductListTbody($("#productList"),json.dataMap.ProductList);
						}else{
							alert("查询失败!");
						}
					});
				}else if("productList" == objID){
					var request = new Object();//请求对象
					request.url = "/queryProductCasByProjectID.do";
					var requestData = new Object();
					requestData.projectID =msNumber(getValue($("#projectID"))) ;
					requestData.pageNu = page;
					request.data = requestData ;
					request.async = false;
					dataSubSingle(request,function(json){
						var success = json.success;
						if(success == true){
							setProductToProductListTbody($("#productList"),json.dataMap.ProductList);
						}else{
							alert("查询失败!");
						}
					});
				}
			}
		};
		obj.bootstrapPaginator(options);
		obj.bootstrapPaginator("setOptions");
	}
}

//禁止用F5键   
document.onkeydown = function (e) { 
	var ev = window.event || e; 
	var code = ev.keyCode || ev.which; 
	if (code == 116) { 
		ev.keyCode ? ev.keyCode = 0 : ev.which = 0; 
		cancelBubble = true; 
		return false; 
	}
};


/**
 * 文件管理
 */
function fileUploadManagerClick(){
	var fileUploadDiv = "";
	 fileUploadDiv += " <iframe src='fileUploadPage.do' frameborder='0' border='0' marginwidth='0' marginheight='0' scrolling='yes' allowtransparency='yes' height='550px' width='990px'>"+
							"</iframe>";
	
	setValue($("#fileUploadIframe"),fileUploadDiv);
	$('#edit_window').modal('show');
}
/**
 * 日志显示
 */
function logDetailClick(){
	var fileUploadDiv = "";
	fileUploadDiv += " <iframe src='filedHistoryDetail.do' frameborder='0' border='0' marginwidth='0' marginheight='0' scrolling='yes' allowtransparency='yes' height='550px' width='990px'>"+
	"</iframe>";
	
	setValue($("#fileUploadIframe"),fileUploadDiv);
	$('#edit_window').modal('show');
}

/**
 * 获取url中的请求参数
 * @param name
 * @returns
 */
function getUrlParam(name) { 
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); 
	var r = window.location.search.substr(1).match(reg); 
	if (r != null) 
	return unescape(r[2]); 
	return null; 
} 

/**
 * 传入全名，返回中文名
 * 例如："鹿海波.dylan" 返回 “鹿海波”
 * @param fullName
 * @returns
 */
function getEmployeeName(fullName){
	if(typeof fullName == "undefined" || fullName == null){
		return "";
	}
	if(fullName != null){
		return fullName.split(".")[0];
	}
}
/**
 * 判断用户是否有权限
 * @param permisson
 * @param value
 */
function checkPermisson(permisson,code){
	  var flag = false;
	  flag =  _.contains(permisson, code);
	   return flag;
}

//进度条控件 add by dylan.lu 2014/8/14
var processBar = {};
processBar.process = function (elementID /*需要显示进度条的元素*/, autoLoad/*是否自动加载进度条*/) {
    /*需要放在html中的body标签后面使用本控件*/
    var count = 0;
    var processBarDiv = 
		'<!--进度条begin-->'+
		'<div class="progress progress-striped active">'+
		'  <div class="bar" style="width: 20%;" id="processBar"></div>'+
		'</div>'+
		'<!--进度条end-->';
    $("#" + elementID).prepend(processBarDiv);
    
    /*更新进度条*/
    this.updateProcess = function (percent) {
    	setTimeout(function(){$("#processBar").css("width", percent + "%")}, ++count * 100);
        if (percent == 100) {           /*100%就从页面移除loading标签*/
        	setTimeout(function(){$(".progress.progress-striped.active").remove()}, count * 500 + 800);
        }
    };
    
    if(autoLoad){
    	this.updateProcess(40);
 		this.updateProcess(57);
 		this.updateProcess(62);
 		this.updateProcess(80);
 		this.updateProcess(90);
    }
    
}

/**
 * 指定元素禁止编辑
 */
function uneditable(selecter){
	$(selecter).find(":input").each(function() { 
		$(this).attr("disabled", "disabled"); 
	}); 	
}

/**
 * 字段对象
 * fieldName 字段名称
 * fieldType 字段类型
 * display 是否显示 boolean
 * appendClass 添加样式
 * defaultValue 默认值
 */
function field(fieldName, fieldType, display, appendClass, defaultValue){
	this.fieldName = fieldName;
	this.fieldType = fieldType;
	this.display = (display == undefined)?true:display;
	this.appendClass = (appendClass == undefined)?"":appendClass;
	this.defaultValue = defaultValue;
}

/**
 * 刷新页面表格
 * @param fieldList 需要显示的字段列表
 * @param dataList 列表数据
 * @param tbodyDiv 需要刷新的页面对象
 * @param operateCallBack计算操作列的参数
 */
function loadTbody(fieldList, dataList, tbodyDiv, operateCallBack){
	 $("#"+ tbodyDiv).empty();//清空table
	 
	 $.each(dataList,function(n,entity) {
		 var tr = document.createElement("tr"); 
		 $.each(fieldList, function(n, field){
			 td = document.createElement("td");
			 var textStr = "";
			 
		     if(entity[field.fieldName] != null){
		    	 if(field.fieldType == "Date"){//日期特殊处理
		    		 textStr = getFormatDate(new Date(parseInt(entity[field.fieldName])), "yyyy-MM-dd");
		    	 }else if(field.fieldType == "checkbox"){
		    		 textStr = '<input type="checkbox" class="' + field.appendClass + '" name="item" value="' + entity[field.fieldName] + '"/>';
		    	 }else{
		    		 td.setAttribute("class", field.appendClass);
		    		 textStr = entity[field.fieldName];
		    		 td.setAttribute("title", entity[field.fieldName]);
		    	 }
		     }
		     
		     if(!field.display){
		    	 td.style.display = "none";
		     }
		     
			 td.innerHTML = textStr;
			 tr.appendChild(td);
		 });
		 
		 //添加操作列
		 var tdOperate = document.createElement("td");
		 tdOperate.innerHTML = operateCallBack(entity);

		 tr.appendChild(tdOperate);
		 $("#"+ tbodyDiv).append(tr);
	 });
	 
}

/**
 * 数组删除
 */
Array.prototype.remove = function(el){  
    return this.splice(this.indexOf(el),1);  
} ;

/**
 * 页面显示  去掉null
 * @param value
 * @returns
 */
function getValueDisplay(value){
	if(value&& typeof value  !== 'undefined' ){
		return value;
	}else{
		return "";
	}	
}

function setDefaultTime(){
	var curDate = new Date();
	var startDate = curDate.getFullYear()+"/"+(curDate.getMonth()+1)+"/"+curDate.getDate();
	var endDate = curDate.getFullYear()+"/"+(curDate.getMonth()+1)+"/"+curDate.getDate()+" 23:59:59";
	$(".startTime").val(getFormatDate(new Date(startDate)));
	$('.endTime').val(getFormatDate(new Date(endDate)));
}
function bindEvent(){
	$('.startTime').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			$('#tradeStartTime').val(dt);
		}
	});
	$('.endTime').datetimepicker({
		timeFormat : "HH:mm:ss",
		dateFormat : "yy-mm-dd",
		onSelect : function(dateText, inst) {
			var dt = new Date(Date.parse(dateText.replace(/-/g, "/")));
			$('#tradeEndTime').val(dt);
			
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
				_util.cmsTip("请先选择商场！");
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
function imgPre(url) {
	if (url.indexOf("pic_add.png") != -1) {
		return false;
	}
	var layer_oneLineOneName = $.layer({
		type : 1,
		title : false,
		shadeClose : true,
		closeBtn : [ 0, true ],
		border : [ 5, 0.5, '#666', true ],
		offset : [ '100%', '50%' ],
		move : [ , true ],
		area : [ 'auto', 'auto' ],
		page : {
			html : "<img  src='" + url  + "' />"
		},
		end : function() {
			_util.ifShowPopWin = 0;
		},
		success : function() {
			_util.ifShowPopWin = 1;
			$('.pop-one-line-one-name').find('.cancelPop').click(function() {
				_util.ifShowPopWin = 0;
				layer.close(layer_oneLineOneName);
			});
		}
	});
	// 现在 imgWidth 和 imgHeight 就是图像真实的尺寸
}
