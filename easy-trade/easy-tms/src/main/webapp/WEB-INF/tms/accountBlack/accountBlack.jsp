<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<%@ include file="../common/massageBox.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>付款</title>
        <link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
        <link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css"
              type="text/css" rel="stylesheet" />
        <link href="${ctx}/css/jquery.timepicker.css" type="text/css"
              rel="stylesheet" />
        <!-- 日期控件css -->
        <link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
              type="text/css" />
        <script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/util.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/msgBoxBg.js" type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery.poshytip.min.js" type="text/javascript"></script>
        <script src="${ctx}/js/accountBlack/accountBlack.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/list_common.js" type="text/javascript"></script>
        <script src="${ctx}/js/common.js" type="text/javascript"></script>
        <link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
        <script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
        <!-- 日期控件js -->
        <script src="${ctx}/js/jquery/jquery.jtimepicker.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery-ui-timepicker-addon.js"
        type="text/javascript"></script>
        <!-- 日期控件js end-->
        <script src="${ctx}/js/jquery/jquery.nicescroll.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/jquery/jquery-ui-timepicker-zh-CN.js"
        type="text/javascript"></script>
        <script src="${ctx}/js/index.js" type="text/javascript"></script>
        <script src="${ctx}/js/util/bootstrap/bootstrap.min.js"
        type="text/javascript"></script>
        <style type="text/css">
            body {
                background: #fff;
            }
            .memSuper-search span{
            	line-height:0px;
            }
             .memSuper-search li {
			  margin-left: 0px;
			}
        </style>
    </head>

    <body>
        <div class="memSuper">
            <div class="memSuper-title">防作弊 >黑名单</div>
	           <div class="memSuper-main">
				<div class="memSuper-search" style="height: auto !important;min-height:60px; width: 100%">
					<input type="hidden" value="1" name="pageNo" id="currpage">
					<ur>
						<li>
							账号：
							<input id="payAccount" class="payAccount" type="text" maxlength="50" /></input>
						</li>
						<li>
							<a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
						</li>
					</ur>
				</div>
		
                <div id="result" style="margin: 0 30px;"></div>

            </div>

        </div>
    </body>
</html>
