<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>交易管理系统</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/ui.fancytree.css" type="text/css" rel="stylesheet" />     <!-- 树状插件css-->
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />

<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<!-- 树状插件js-->
<script src="${ctx}/js/jquery/jquery-ui.custom.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.fancytree.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${ctx}/js/index.js" type="text/javascript"></script>
<style type="text/css">
li ul li span.fancytree-title{
	margin-left: 16px;
}
</style>
<!-- 树状插件 end-->
<script type="text/javascript">
	$(function(){ 

		

		// --- Initialize sample trees
		$("#tree").fancytree({
			autoActivate: false, // we use scheduleAction()
			autoCollapse: true,
			//autoFocus: true,
			autoScroll: true,
			clickFolderMode: 3, // expand with single click
			minExpandLevel: 1,
			tabbable: false, // we don't want the focus frame
			// scrollParent: null, // use $container
			focus: function(event, data) {
				var node = data.node;
				// Auto-activate focused node after 1 second
				if(node.data.href){
					node.scheduleAction("activate", 1000);
				}
			},
			blur: function(event, data) {
				data.node.scheduleAction("cancel");
			},
			activate: function(event, data){
				var node = data.node,
					orgEvent = data.originalEvent;

				if(node.data.href){
					window.open(node.data.href, (orgEvent.ctrlKey || orgEvent.metaKey) ? "_blank" : node.data.target);
				}
			},
			click: function(event, data){ // allow re-loads
				var node = data.node,
					orgEvent = data.originalEvent;

				if(node.isActive() && node.data.href){
					// data.tree.reactivate();
					window.open(node.data.href, (orgEvent.ctrlKey || orgEvent.metaKey) ? "_blank" : node.data.target);
				}
			}
		});

		/* $(".fancytree-title").eq(1).addClass("titletop"); */
		$("span.fancytree-node").click(function(){
			$("span.fancytree-title").attr("style","color:black;");
			$(this).find(".fancytree-title").attr("style","color:#1ca822;");
		});
	});
</script>
</head>

<body>
	<div class="left">
		<div id="tree">
			<ul>
				<sec:authorize ifAnyGranted="TMS_ORDER_VIEW">
					<li class="folder expanded">订单管理
						<ul>
							<li><a href="${ctx}/orderManager/search?module=order" target="mainFrame">商品订单</a></li>
							<li><a href="${ctx}/couponOrder/search?currpage=1" target="mainFrame">优惠券订单</a></li>
						</ul>
					</li>
				</sec:authorize>
				<sec:authorize ifAnyGranted="TMS_BS_VIEW,TMS_SC_VIEW" >
					<li class="folder expanded">商家服务
						<ul>
							<sec:authorize ifAnyGranted="TMS_BS_VIEW" >
								<li><a href="${ctx}/bs/search?module=merchant" target="mainFrame">提现审核</a></li>
							</sec:authorize>
							<sec:authorize ifAnyGranted="TMS_SC_VIEW" >
								<li><a href="${ctx}/sc/search?module=merchant" target="mainFrame">返佣审核</a></li>
							</sec:authorize>
						</ul>
					</li>
				</sec:authorize>
				<sec:authorize ifAnyGranted="TMS_TRADE_VIEW,TMS_DRAW_VIEW" >
				<li class="folder expanded">对账管理
					<ul>
					<sec:authorize ifAnyGranted="TMS_TRADE_VIEW" >
						<li><a href="${ctx}/tradeDetail/search?currpage=1" target="mainFrame">交易明细</a></li>
					</sec:authorize>
					<sec:authorize ifAnyGranted="TMS_DRAW_VIEW" >
						<li><a href="${ctx}/drawDetail/search" target="mainFrame">提现明细</a></li>
					</sec:authorize>
					</ul>
				</li>
				</sec:authorize>
				<sec:authorize ifAnyGranted="TMS_F_BS_VIEW,TMS_F_SC_VIEW,TMS_F_EXM_VIEW,TMS_F_AB_VIEW,TMS_F_PAY_VIEW" >
				<li class="folder expanded">财务管理
					<ul>
						<sec:authorize ifAnyGranted="TMS_F_BS_VIEW" ><li><a href="${ctx}/bs/search?module=finance" target="mainFrame">提现审核</a></li></sec:authorize>
						<sec:authorize ifAnyGranted="TMS_F_SC_VIEW" ><li><a href="${ctx}/sc/search?module=finance" target="mainFrame">返佣审核</a></li></sec:authorize>
						<sec:authorize ifAnyGranted="TMS_F_EXM_VIEW" ><li><a href="${ctx}/bonus/search" target="mainFrame">考核奖金</a></li></sec:authorize>
						<sec:authorize ifAnyGranted="TMS_F_AB_VIEW" ><li><a href="${ctx}/ab/search" target="mainFrame">异常账务</a></li></sec:authorize>
						<sec:authorize ifAnyGranted="TMS_F_PAY_VIEW" ><li><a href="${ctx}/pay/search?currpage=1" target="mainFrame">付款</a></li></sec:authorize>
					<%-- 	<sec:authorize ifAnyGranted="TMS_F_PAY_VIEW" ><li><a href="${ctx}/tradeDetail/queryOrder?currpage=1" target="mainFrame">订单查询</a></li></sec:authorize> --%>
					</ul>
				</li>
				</sec:authorize>
				
				<sec:authorize ifAnyGranted="TMS_F_BS_VIEW,TMS_F_SC_VIEW,TMS_F_EXM_VIEW,TMS_F_AB_VIEW,TMS_F_PAY_VIEW" >
				<li class="folder expanded">防作弊管理
					<ul>
						<sec:authorize ifAnyGranted="TMS_F_BS_VIEW" ><li><a href="${ctx}/accountBlack/search" target="mainFrame">黑名单</a></li></sec:authorize>
					</ul>
				</li>
				</sec:authorize>
			</ul>
		</div>
	</div>
</body>
</html>
