$(document).ready(function() {
	_mcmc.init();
});
_mcmc = {
		which_position : 0,
		init:function() {
			_mcmc.showBigImg();
		},
		
		//预览图片
		showBigImg:function() {
			$('.upload_photo_icon').off().on({
				'click':function(ev){
					imgPre($(this).attr('src'));
				}
			});
		}
	}
/**
 * layer 预览图片
 */
function imgPre(url) {
	if (url.indexOf("pic_add.png") != -1) {
		return false;
	}
	var width='600px';
	var height='400px';
	var layer_oneLineOneName = $.layer({
		type : 1,
		title : false,
		shadeClose : true,
		closeBtn : [ 0, true ],
		border : [ 5, 0.5, '#666', true ],
		offset : [ '100%', '50%' ],
		move : [ '.juanmove', true ],
		area : [ width, height ],
		page : {
			html : "<img src='" + url + "' style='width: " + width + "; height: " + height + ";' />"
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

/*
function returnlist(){
	parent.location.href="../commodity/index?shopId=&currpage=1";
}*/
