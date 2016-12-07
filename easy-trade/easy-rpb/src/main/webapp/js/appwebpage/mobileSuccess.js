

window.Rongyi = {}

if(typeof AndroidWebAppInterface != 'undefined'){
	window.Rongyi = {
		HtmlNavigatePaySuccess: function(isSuccess,msg){
			AndroidWebAppInterface.HtmlNavigatePaySuccess(isSuccess,msg);
		},
		gotoCategory: function(id){
			AndroidWebAppInterface.HtmlNavigateToTypeList(id);
		},
		gotoActivity: function(id){
			AndroidWebAppInterface.HtmlNavigateToActivity(id);
		},
		gotoArticle: function(id){
			AndroidWebAppInterface.HtmlNavigateToSurpriseDay(id);
		},
		go: function(type){
			AndroidWebAppInterface["HtmlNavigateTo"+type]();
		},
		gotoDetail: function(type,id){
			AndroidWebAppInterface.HtmlNavigateToDetail(type,id);
		},
		getCityName: function(){
			return AndroidWebAppInterface.HtmlGetCityName();
		},
		getMap: function(type,id){
			return  AndroidWebAppInterface.HtmlNavigateToMap(type,id);
		},
		getLogin: function(){
			return  AndroidWebAppInterface.HtmlNavigateToLogin();
		},
		getshowToast: function(tag){
			return  AndroidWebAppInterface.showToast(tag);
		},
		gotoSearchList: function(id){
			AndroidWebAppInterface.HtmlNavigateToSearchList(id);
		},
		gotoInformationList: function(id){
			AndroidWebAppInterface.HtmlNavigateToInformationList();
		},
		type: 'Android'
	}
	Rongyi.getCityName();
}

function defineIOS(bridge){

	if (bridge.init) {
		bridge.init(function(message, responseCallback) {
			var data = { 'Javascript Responds':'Wee!' }
			responseCallback(data)
		})
	}else if (bridge.registerHandler) {
		bridge.registerHandler('startIOS', function(data, responseCallback) {
			responseCallback(responseData)
		})
	}


	window.Rongyi = {
		HtmlNavigatePaySuccess : function(isSuccess,msg){
			bridge.callHandler('HtmlNavigatePaySuccess', {'isSuccess':isSuccess,'msg':msg});
		},
		getMap: function(type,id){
			bridge.callHandler('HtmlNavigateToMap', {'name':type,'id':id});
		},
		gotoCategory: function(id){
			bridge.callHandler('HtmlNavigateToTypeList', {'name': id});
		},
		gotoActivity: function(id){
			bridge.callHandler('HtmlNavigateToActivity', {'name': id});
		},
		gotoArticle: function(id){
			bridge.callHandler('HtmlNavigateToSurpriseDay', {'name': id});
		},
		go: function(type){
			bridge.callHandler("HtmlNavigateTo"+type);
		},
		gotoDetail: function(type,id){
			bridge.callHandler('HtmlNavigateToDetail', {'name':type,'id':id});
		},
		getCityName: function(){
			var citystr;
			bridge.callHandler('HtmlGetCityName', {'foo': 'bar'}, function(response) {
				citystr = response;
			})
		},
		getLogin: function(tag){
			bridge.callHandler('HtmlNavigateToLogin');
		},
		getshowToast: function(tag){
			bridge.callHandler('showToast',{"tag":tag});
		},
		gotoSearchList: function(id){
			bridge.callHandler('HtmlNavigateToSearchList', {'name': id});
		},
		gotoInformationList: function(){
			bridge.callHandler('HtmlNavigateToInformationList');
		},
		type: 'iOS'
	}
	Rongyi.getCityName();
	Rongyi.HtmlNavigatePaySuccess(true,"Success!");
}

function connectWebViewJavascriptBridge(callback) {
	if (window.WebViewJavascriptBridge) {
		callback(WebViewJavascriptBridge)
	} else {
		document.addEventListener('WebViewJavascriptBridgeReady', function() {
			callback(WebViewJavascriptBridge)
		}, false)
	}
}

function setupWebViewJavascriptBridge(callback) {
	if (window.WebViewJavascriptBridge) {
		return callback(WebViewJavascriptBridge);


	}
	if (window.WVJBCallbacks) {
		return window.WVJBCallbacks.push(callback);
	}
	window.WVJBCallbacks = [callback];
	var WVJBIframe = document.createElement('iframe');
	WVJBIframe.style.display = 'none';
	WVJBIframe.src = 'wvjbscheme://__BRIDGE_LOADED__';
	document.documentElement.appendChild(WVJBIframe);
	setTimeout(function() {
		document.documentElement.removeChild(WVJBIframe)
	}, 0)
}

var version = getQueryString('version');
var client = getQueryString('client');
if (version >= 730 && client == 'iOS') {
	setupWebViewJavascriptBridge(defineIOS);
} else {
	connectWebViewJavascriptBridge(defineIOS);
}

function getQueryString(name) {

	var search = window.location.search || window.location.hash;
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = search.substr(1).match(reg);
	if (r != null) return unescape(r[2]); return null;
}


$(function(){
	$(".vote li span.radio").each(function(i){
		$(this).click(function(){
			$(".vote li span.radio").removeClass("check").eq(i).addClass(" voted check");
		});
	});

});
