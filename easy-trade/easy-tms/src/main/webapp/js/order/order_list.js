$.ajaxSetup({ cache: false });

$(document).ready(function() {
	ajaxSearchOrderList();
	$('.search-button1').off().on().click(function(event){
		$("#currpage").val("1");
		ajaxSearchOrderList();
	});
	
	$('#mall').typeahead({
        source: function (query, process) {
        	$("#mallId").val("");
            m_names = [];
            map = {};
            var paramsJson = {};

            paramsJson['keywords'] = encodeURIComponent(query);
            paramsJson['timeStamp_'] = new Date().getTime();
            $.post('../orderManager/ajaxGetMalls',{paramsJson:JSON.stringify(paramsJson)},function(result){
                $.each(result.msg, function (i, mall) {
                    map[mall.mallName] = mall.id;
                    m_names.push(mall.mallName);
                });
                process(m_names);
                return process(result.msg);
            });
        },
        items: 20,
        minLength: 1,
        updater: function(selection){
            $('#mallId').val(map[selection]);
            return selection;
        }
    });
	$('#shop').typeahead({
		source: function (query, process) {
			$("shopId").val("");
			m_names = [];
			map = {};
			var paramsJson = {};
			
			paramsJson['keywords'] = encodeURIComponent(query);
			paramsJson['mallId'] = $("#mallId").val();
			$.post('../orderManager/ajaxGetShops',{paramsJson:JSON.stringify(paramsJson)},function(result){
				$.each(result.msg, function (i, shop) {
					map[shop.shopName] = shop.id;
					m_names.push(shop.shopName);
				});
				process(m_names);
				return process(result.msg);
			});
		},
		items: 20,
		minLength: 1,
		updater: function(selection){
			$('#shopId').val(map[selection]);
			return selection;
		}
	});
	$('#nickname').typeahead({
		source: function (query, process) {
			m_names = [];
			map = {};
			var paramsJson = {};
			
			paramsJson['keyWords'] = encodeURIComponent(query);
			$.post('../orderManager/ajaxGetUsers',{paramsJson:JSON.stringify(paramsJson)},function(result){
				$.each(result.msg, function (i, user) {
					map[user.userName] = user.userId;
					m_names.push(user.nickName);
				});
				process(m_names);
				return process(result.msg);
			});
		},
		items: 20,
		minLength: 1,
		updater: function(selection){
			$('#userId').val(map[selection]);
			return selection;
		}
	});
});
	
//ajax查询订单列表信息
function ajaxSearchOrderList() {
	var url_ = "../orderManager/ajaxSearchOrderList";
	var orderNo = $('#orderNo').val();
	var mallId = $('#mallId').val();
	var shopName = $('#shop').val();
	var nickname = $('#nickname').val();
	var username = $('#username').val();
	var status = $('#status').val();
	var currpage = $('#currpage').val();
	var guideType = $("#guideType").val();

	var paramsJson_ = { };
	paramsJson_["currpage"] = currpage;
	if(orderNo != ""){
		paramsJson_["orderNo"] = orderNo;
	}
	if(guideType != ""){
		paramsJson_["guideType"] = guideType;
	}
	if(mallId != ""){
		paramsJson_["mallId"] = mallId;
	}
	if(mallId!="" && shopName!=""){
		shopName = encodeURI(shopName);
		paramsJson_["shopName"] = shopName;
	}
	if(nickname != ""){
		nickname = encodeURI(nickname);
		paramsJson_["nickname"] = nickname;
	}
	if(username != ""){
		username = encodeURI(username);
		paramsJson_["username"] = username;
	}
	if(status != ""){
		paramsJson_["status"] = status;
	}
	$.ajax({
		url: url_,
		type: 'get',
		contentType: "application/json; charset=UTF-8",
		data:{"paramsJson":JSON.stringify(paramsJson_)},
		success: function(data){
			$("#result").html(data);

			$("#upPage").click(function(){
				var currpageVal = parseInt($("#currpage").val());
				if (currpageVal <= 1) {
					return false;
				} else {
					$("#currpage").val(currpageVal - 1);
				}
				$("#jumpPage").val("");
				ajaxSearchOrderList();
			});

			$("#downPage").click(function(){
				var currpageVal = parseInt($("#currpage").val());
				var totalPageVal = parseInt($("#rowCont").val());
				if (currpageVal >= totalPageVal) {
					return false;
				} else {
					$("#currpage").val(currpageVal + 1);
				}
				$("#jumpPage").val("");
				ajaxSearchOrderList();
			});

			$("#gopage").click(function(){
				var temppage = parseInt($('#jumpPageIn').val()), totalPage = parseInt($("#rowCont").val());
				if (temppage != "" && temppage != undefined && !isNaN(temppage)) {
					if (temppage >= 1 && temppage <= totalPage) {
						$("#currpage").val(temppage);
						ajaxSearchOrderList();
					} else if(temppage > totalPage){
						temppage = totalPage;
						$("#jumpPage").val(totalPage);$("#currpage").val(totalPage);
						ajaxSearchOrderList();
					}else if(temppage == 0){
						temppage = 1;
						$("#jumpPage").val(1);$("#currpage").val(1);
						ajaxSearchOrderList();
					} else{
						_util.cmsTip("请输入大于0的数字!");
					}
				} else if (temppage == 0) {
					temppage = 1;
					$("#jumpPage").val(1);$("#currpage").val(1);
					ajaxSearchOrderList();
				} else {
					_util.cmsTip("请输入数字!");
				}
			});
		},
		error: function(data) {

        }
	});
}	