/**
 * 20150122 lim
 * 会员搜索
 */
$(document).ready(function() {
	MEMBER_SEARCH.searchMall();//搜索商场
	MEMBER_SEARCH.showSearchTxt();
	MEMBER_SEARCH.bindSearchBtnEvent();
	MEMBER_SEARCH.bindSearchByResultBtnEvent();//在结果中搜索
	$('.btnsearch').click();
});
var MEMBER_SEARCH = {
	searchMall : function() {
		$('#super-admin-search-mall').typeahead({
	        source: function (query, process) {
	          m_names = [];
	          map = {};
	          map_name_id = {};
	          var paramsJson = {};
	  		  paramsJson['name'] = encodeURIComponent(query);
	  		  paramsJson['timeStamp_'] = new Date().getTime();
	  		  
	  		jQuery.post(App['contextPath'] + '/search/malls' , {paramsJson:JSON.stringify(paramsJson)},   function (data, textStatus){ // data 可以是 xmlDoc, jsonObj, html, text, 等等.  
	  			// 这个Ajax请求的选项配置信息，请参考jQuery.get()说到的this 
	  			$.each(data, function (i, mall) {
	                map[mall.name] = mall.id;
	                m_names.push(mall.area1+'-'+mall.area2+'-'+mall.area3+'-'+mall.area4+'-'+mall.name);
	                map_name_id[mall.area1+'-'+mall.area2+'-'+mall.area3+'-'+mall.area4+'-'+mall.name] = mall.id;
	            });
	            process(m_names);
	  			},  
	  		"json"); 
	        },
	        items: 20,
	        minLength: 1,
	        updater: function(selection){
//	        	console.log(">>>selection>>>"+selection); 
	        	var currentMallId = map_name_id[selection];
	        	$('#super-admin-search-mall').attr('currentMallId', currentMallId);
	        	top.location.href = App['contextPath'] + '/mm/index.htm?currentMallId='+currentMallId;
	            return selection;
	        }
	      });
	},
	addMemberNoEvent : function() {
		$('.member-no').off().on({
			'click':function(ev){
				var memberNo = $(this).text();
				//http://127.0.0.1:8081/easy-mms/mm/memberDetail.htm?memberNo
				window.open (App['contextPath'] + "/mm/memberDetail.htm?memberNo=" + memberNo);
				return false;
			}
		});
	},
	showSearchTxt : function() {//切换
		$('.show-search-txt').off().on({
			'click':function(ev){
				$('#super-admin-search-mall').show();
				return false;
			}
		});
	},
	bindSearchBtnEvent : function() {//搜索
		$('.btnsearch').off().on({
			'click':function(ev){
				$('#_exact_form')[0].reset();
				var paramsJson_ = {};
				MEMBER_SEARCH.searchMember(paramsJson_);
				return false;
			}
		});
		/*$('.search-keyword').keydown(function(e){
			if(e.keyCode==13){
				var paramsJson_ = {};
				MEMBER_SEARCH.searchMember(paramsJson_);
				return false;
			}
		});*/
		document.onkeydown = function(e){ 
		    var ev = document.all ? window.event : e;
		    if(ev.keyCode==13) {
		    	var paramsJson_ = {};
				MEMBER_SEARCH.searchMember(paramsJson_);
				return false;
		     }
		};
	},
	bindSearchByResultBtnEvent : function() {//结果中搜索
		$('.btnsearchExact').off().on({
			'click':function(ev){
				var paramsJson_ = MEMBER_SEARCH.searchByResultMember();
				MEMBER_SEARCH.searchMember(paramsJson_);
				return false;
			}
		});
	},
	searchMember : function(paramsJson_) {
//		var search_layer_index = layer.load('请稍候...');
		var keyword = $('.search-keyword').val();
		var url_ = App['contextPath'] + "/search/members";
		var currentMallId = $('.currentMallId').attr('currentMallId');
		paramsJson_['currentMallId'] = currentMallId;
		paramsJson_['keyword'] = encodeURIComponent(keyword);
		var _currentPage = $('.jump-to-num').val();
		paramsJson_['_currentPage'] = _currentPage;
		paramsJson_['timeStamp_'] = new Date().getTime();
		$(".member-search-list").load(url_, {paramsJson : JSON.stringify(paramsJson_)}, function() {
//			layer.close(search_layer_index);
			//添加事件
			MEMBER_SEARCH.addMemberNoEvent();
		});
	},
	searchByResultMember : function() {
		var paramsJson_ = {};
		var _member_type = '';//会员类型和是否绑定
		$('._member_type:checked').each(function(){
			_member_type += $(this).val();
		});
		var _member_name = $('._member_name').val();//会员名称
		var _member_mobile = $('._member_mobile').val();//手机号
		var _member_no = $('._member_no').val();//会员编号
		var _member_sex = '';
		$('._member_sex:checked').each(function(){
			_member_sex += $(this).val();
		});
		var _member_birthday = $('._member_birthday').val();
		//当前积分
		var _member_integral_min = $('._member_integral_min').val();
		var _member_integral_max = $('._member_integral_max').val();
		//首次交易时间
		var _first_consume_time_start = $('._first_consume_time_start').val();
		var _first_consume_time_end = $('._first_consume_time_end').val();
		//最后交易时间
		var _last_consume_time_start = $('._last_consume_time_start').val();
		var _last_consume_time_end = $('._last_consume_time_end').val();
		
		paramsJson_['_member_type'] = _member_type;
		paramsJson_['_member_name'] = encodeURIComponent(_member_name);
		paramsJson_['_member_mobile'] = _member_mobile;
		paramsJson_['_member_no'] = _member_no;
		paramsJson_['_member_sex'] = _member_sex;
		paramsJson_['_member_birthday'] = _member_birthday;
		paramsJson_['_member_integral_min'] = _member_integral_min;
		paramsJson_['_member_integral_max'] = _member_integral_max;
		paramsJson_['_first_consume_time_start'] = _first_consume_time_start;
		paramsJson_['_first_consume_time_end'] = _first_consume_time_end;
		paramsJson_['_last_consume_time_start'] = _last_consume_time_start;
		paramsJson_['_last_consume_time_end'] = _last_consume_time_end;
//		console.log('_member_type:'+_member_type);
		return paramsJson_;
	},
	keydownEve : function() {//回车事件
		var theEvent = window.event || arguments.callee.caller.arguments[0];
		var key = theEvent ? theEvent.keyCode : theEvent.which;
	    if(key == "13")    
	    { 
	    	$('.search-keyword').focus();
	    	$('.btnsearch').click();
	    }
	},
	 _jump : function(p) {
		 if(typeof(p) == "undefined") {
			 p = $('.jump-to-num').val();
		 }
		 var _totalPage = $('.total_page').attr('total_page');
		 if(parseInt(p) > parseInt(_totalPage)) {
			 p = _totalPage;
		 }else if(parseInt(p) <= 0) {
			 p = 1;
		 }
		 $('.jump-to-num').val(p);
//		 location.href=App['contextPath'] + "/mm/index.htm?currentMallId="+$('.currentMallId').attr('currentMallId')+"&currentPage="+p;
		 $('.btnsearch').click();
	 }
};
