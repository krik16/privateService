/**
 * 首页
 */
$(document).ready(function() {
	_main.init();
});
var _main = {
	init:function() {
		//同步
		if($('.Platform').length > 0) {
			$('.Platform').die().live({
				mouseenter:function(ev){
					ev.stopPropagation();
					$('.PlatformList').show();
				},
				mouseleave:function(ev){
					ev.stopPropagation();
					$('.PlatformList').hide();
				}	
			});
			var releaseFlag = "1";
			$('.release').off().on({
				'click':function( ev ){
					var url_ = '../release/release';
					var paramsJson_ = {};
					$(this).text('同步中');
					var obj_ = $(this);
					if(releaseFlag == "1"){
						releaseFlag = "0";
						_util.ajaxSubmitTimeout(url_, paramsJson_, function(data){
							if(data.status == 1) {
								msgBoxBg(data.msg);
							}else { 
								msgBoxBg(data.msg);
							}
							releaseFlag = "1";
							obj_.text('同步');
						});
					}
					
				}
			});
		}
		
		//审核
			$('.check_integral_comm').off().on({
				'click':function( ev ){ 
					var obj_ = $(this);
					var id = $(this).attr('itemId');
					var operate = $(this).attr('operate');
					if(operate == 1 || operate == 3 || operate == 5)
						_main.check(obj_, id,operate);
					else
						_main.checkNot(obj_, id,operate);
				}
			});
	},
	check:function(obj_, id,operate){
		layer.confirm("您确认要通过审核吗？",function(){
			if(operate=="5"||operate=="6"){
				signinCheck(null,operate);
				return;
			}else{
				_main.checkSubmit(id,operate,null);
			}
			
		});
	},
	checkNot:function(obj_,id,operate) {
		var content_ = "<div class='verify_no_box'>" + $(".verify-no-box").html() + "</div>";
		
		var layer_verify_no = $.layer({
			type: 1,
			title: "审核未通过理由",
			closeBtn: [0, true],
			border : [5, 0.5, '#666', true],
			offset: ['100px',''],
			move: ['.juanmove', true],
			area: ['400px','300px'],
			page : {
				html : content_
			},
			success : function() {
				$('.verify_no_box').find('.save_').off().on({
					'click':function( ev ){
						var checkMemo = $('.verify_no_box').find('.reason_text').val();
						if(checkMemo == null || checkMemo.length == 0){
							alert("审核理由不能为空！！");
							return false;
						}else if($.trim(checkMemo).length == 0){
							alert("审核理由不能全为空格！！");
							return false;
						}
						if(operate=="5"||operate=="6"){
							signinCheck(checkMemo,operate,layer_verify_no);
							return;
						}else{
							_main.checkSubmit(id,operate,checkMemo,layer_verify_no);
						}
						
					}
				});
				$('.verify_no_box').find('.cancel_').off().on({
					'click':function( ev ){
						layer.close(layer_verify_no);
					}
				});
			}
		});
	},
	checkSubmit:function(id,operate,checkMemo,layer_verify_no){
		var url_ = '../integral/saveCheck';
		var paramsJson_ = {};
		paramsJson_["id"] = id;
		paramsJson_["operate"] = operate;
		paramsJson_["memo"] = checkMemo;
		_util.ajaxSubmit(url_, paramsJson_, function(data){
			if(data.status == 1) {
				if(_type == "mallActivityMove"){
					$(".moveMallActivitiesTr").remove();
				}else{
					obj_.parents('tr').remove();
				}
			}else {
				_util.saveOkTip("审核成功！");
			}
			if(layer_verify_no)
				layer.close(layer_verify_no);
			returnlist();
		});
	}
	
}
function returnlist(){
	parent.location.href="../main/index";
}
/**
 * 签到规则审核 add by bin.zhang
 */
function signinCheck(memo,opeate,layer_verify_no){
	var request = new Object();//请求对象
	request.url = "/sign_in/check";
	var signIn = new Object();
	if(memo){
		signIn.memo = memo;
	}
	if(opeate=="5"){
		signIn.status="HAS_CHECK";
	}else if(opeate=="6"){
		signIn.status="NOT_CHECK";
	}
	request.data = signIn;
	request.async = true;
	dataSubSingle(request,function(result){
		var code = result.code;
		if(code== "200"){
			_util.saveOkTip("审核成功！");
		}
		if(layer_verify_no)
			layer.close(layer_verify_no);
		returnlist();
	},function(){
		_util.cmsTip('保存异常!');
	});
}