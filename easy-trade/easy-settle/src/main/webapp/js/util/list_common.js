$.ajaxSetup({
    cache: false
});
function ajaxCommonSearch(url_,paramsJson_) {
	if(!paramsJson_.pagesize)
		paramsJson_.pagesize = '10';
    $.ajax({
        url: url_,
        type: 'post',
        contentType: "application/x-www-form-urlencoded; charset=UTF-8",
        data: {
            "paramsJson": JSON.stringify(paramsJson_)
        },
        success: function(data) {
            $("#result").html(data);
            $("#upPage").click(function() {
                var currpageVal = parseInt($("#currpage").val());
                if (currpageVal <= 1) {
                    return false;
                } else {
                	paramsJson_.currpage = (currpageVal - 1).toString();
                    $("#currpage").val(currpageVal - 1);
                }
                $("#jumpPage").val("");
                ajaxCommonSearch(url_,paramsJson_);
            });

            $("#downPage").click(function() {
                var currpageVal = parseInt($("#currpage").val());
                var totalPageVal = parseInt($("#rowCont").val());
                if (currpageVal >= totalPageVal) {
                    return false;
                } else {
                	paramsJson_.currpage = (currpageVal + 1).toString();
                    $("#currpage").val(currpageVal + 1);
                }
                $("#jumpPage").val("");
                ajaxCommonSearch(url_,paramsJson_);
            });

            $("#gopage").click(function() {
                var temppage = parseInt($('#jumpPageIn').val()),
                totalPage = parseInt($("#rowCont").val());
                if (temppage != "" && temppage != undefined && !isNaN(temppage)) {
                    if (temppage >= 1 && temppage <= totalPage) {
                        $("#currpage").val(temppage);
                        paramsJson_.currpage = temppage.toString();
                        ajaxCommonSearch(url_,paramsJson_);
                    } else if (temppage > totalPage) {
                        temppage = totalPage;
                        $("#jumpPage").val(totalPage);
                        $("#currpage").val(totalPage);
                        paramsJson_.currpage = totalPage.toString();
                        ajaxCommonSearch(url_,paramsJson_);
                    } else {
                        _util.cmsTip("请输入大于0的数字!");
                    }
                } else if (temppage == 0) {
                    temppage = 1;
                    $("#jumpPage").val(1);
                    $("#currpage").val(1);
                    paramsJson_.currpage = '1';
                    ajaxCommonSearch(url_,paramsJson_);
                } else {
                    _util.cmsTip("请输入数字!");
                }
            });
            $("#pagesize").change(function(){
            	var pagesize = $('#pagesize').val();
            	 paramsJson_.pagesize = pagesize;
                 ajaxCommonSearch(url_,paramsJson_);
            });
        },
    	error : function(e) {
    		   _util.cmsTip("加载数据列表失败，请稍后重试");
		}
    });
}

