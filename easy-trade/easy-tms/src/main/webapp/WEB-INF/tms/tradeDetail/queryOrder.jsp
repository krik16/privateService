<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<%@ include file="../common/massageBox.jsp"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<script src="${ctx}/js/util/msgBoxBg.js" type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
</script>
</head>
<body>
	<div class="coupon-min-width">
		   <div class="memSuper-title">付款>订单查询</div>
		<div class="query-order">
	            <div class="memSuper-main">
	                <div class="search" style="height: 60px;">
	                    <input id="currpage" type="hidden" name="currpage" value="${currpage}" />
	                    <div class="memSuper-search" style="height:50px;width: 100%;">
						<ur>
							<li>
							交易流水号:
							<input id="search-tradeNo" type="text" maxlength="50" style="vertical-align:middle;width: 250px;"/></input>
							</li>
							<li>
								付款单号：
								<input id="search-payNo"  class="detail" type="text" maxlength="50" /></input>
							</li>
							
							<li style="margin-top: 25px;">订单类型：
							<select id="payChannel">
								<option value="0" selected="selected">支付宝</option>
								<option value="1">微信</option>
							</select>
							</li>
							<li>
								<a href="javascript:void(0);" class="btnsearch checked" id="search-button">查询</a>
							</li>
						</ur>
					</div>
	                </div>
	          </div>
			<form id="account_form" name="account_form" action="" method="post">
				<div class="query-order-main">
					<div class="query-order">
						<div class="w_100" style="font-size: 16px;">
							<ul>
								<li class="li1">商品名称：</li>
								<li class="li2"><span id='subject'></span></li>
								<li class="li1">商品价格：</li>
								<li class="li2" ><span id='totalFee'></span></li>
								<li class="li1">买家账号：</li>
								<li class="li2" ><span id='buyerEmail'></span></li>
								<li class="li1">商品描述：</li>
								<li class="li2" ><span id='body'></span></li>
								<li class="li1">订单创建时间：</li>
								<li class="li2" ><span id='gmtCreate'></span></li>
							</ul>
							<ul>
								<li class="li1">交易流水号：</li>
								<li class="li2"><span id='tradeNo'></span></li>
								<li class="li1">付款单号：</li>
								<li class="li2" ><span id='payNo'></span></li>
								<li class="li1">订单状态：</li>
								<li class="li2" ><span id='tradeStatus'></span></li>
								<li class="li1">累计已退款金额：</li>
								<li class="li2" ><span id='toBuyerFee'></span></li>
								<li class="li1">付款时间</li>
								<li class="li2" ><span id='gmtPayment'></span></li>
								
							</ul>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
$('#search-button').click(function(){
	var tradeNo = $('#search-tradeNo').val();
	var payNo = $('#search-payNo').val();
	if(tradeNo == '' && payNo == ''){
		_util.cmsTip('请输入交易流水号或付款单号！');
		   return;
		}
			
	var payChannel = $('#payChannel').val();
	 var paramsJson_ = {
		        'tradeNo': tradeNo,
		        'payNo':payNo,
		        'payNo':payNo,
		        'payChannel':payChannel
		    };
	$.post("../tradeDetail/orderInfo", {
		 "paramsJson": JSON.stringify(paramsJson_)
	}, function(data) {
			if(data.is_success == 'F'){
				_util.cmsTip(data.error);
			   return;
			}
			$('#subject').html(data.subject);
			$('#totalFee').html(data.total_fee);
			$('#buyerEmail').html(data.buyer_email);
			$('#body').html(data.body);
			$('#gmtCreate').html(data.gmt_create);
			$('#tradeNo').html(data.trade_no);
			$('#payNo').html(data.out_trade_no);
			$('#tradeStatus').html(data.trade_status);
			$('#toBuyerFee').html(data.to_buyer_fee);
			$('#gmtPayment').html(data.gmt_payment);
	}, "json");
});

</script>
</html>
