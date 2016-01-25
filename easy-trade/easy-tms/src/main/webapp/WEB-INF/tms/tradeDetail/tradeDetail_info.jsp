<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易商业管理后台</title>
<link href="${ctx}/css/index.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/poshytip/tip-yellowsimple/tip-yellowsimple.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/activities.css" type="text/css" rel="stylesheet" />
<!-- 日期控件css -->
<link href="${ctx}/js/util/bootstrap/bootstrap.css" rel="stylesheet"
	type="text/css" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
<script src="${ctx}/js/util/msgBoxBg.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.poshytip.min.js"
	type="text/javascript"></script>
<script src="${ctx}/js/util/list_common.js" type="text/javascript"></script>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<style type="text/css">
body {
	background: #FFF;
}
.max-input {
	width: 135px;
}
.brandLinkList {
	height : 182px;
}
.shopsImg .pic .cancel {
/* 	top:0px; */
/* 	right:0px; */
	z-index:0;
}
.shops-main-left {
	width: 424px;
}
.shopsName {
	width: 20%;
}
.shopsData {
	width: 80%;
}
</style>
</head>
<body>
	<div class="shops_min_width">
		<div class="shops">
 			<div class="shops-title">
				对账管理 >交易明细
			</div>
			<div class="shops-main">
					<div class="shops-main-left">
						<div class="line-heights shopsName">交易流水号:</div>
						<div class="shopsData">
							<p class="p_text"><c:out value='${trade.tradeNo}'/></p>
						</div>
						<div class="line-heights shopsName">订单号:</div>
						<div class="shopsData">
							<p class="p_text">
								 ${trade.orderNo}
							</p>
						</div>
						<div class="line-heights shopsName">订单类型:</div>
						<div class="shopsData">
							<p class="p_text">
								<c:choose>
									<c:when test="${trade.tradeType eq 0}">
										商品订单
									</c:when>
									<c:otherwise>优惠券订单</c:otherwise>
								</c:choose>
							</p>
						</div>
						<div class="line-heights shopsName">打款方式:</div>
						<div class="shopsData">
							<p class="p_text">
								${trade.payChannel eq '0' ? '支付宝 ' : ''}
								${trade.payChannel eq '1' ? '微信' : ''}
								${trade.payChannel eq '2' ? '银行卡 ' : ''}
							</p>
						</div>
						<%--<div class="line-heights shopsName">商场:</div>
						<div class="shopsData">
							<p class="p_text">
								${trade.mallName}
							</p>
						</div>--%>
						<div style="clear: both;"></div>
					<c:choose>
						<c:when test="${trade.tradeType eq '0'}">
							<c:choose>
								<c:when test="${trade.payChannel eq 0}">
									<div class="line-heights shopsName" style="width: 30%">容易网支付宝帐号:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${rongyiAccount}</p>
									</div>
								</c:when>
								<c:when test="${trade.payChannel eq 2}">
									<div class="line-heights shopsName" style="width: 30%">容易网银行帐号:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${rongyiAccount}</p>
									</div>
								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
						<c:choose>
							<c:when test="${trade.payChannel eq 0}">
									<div class="line-heights shopsName" style="width: 30%">买家支付宝帐号:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${trade.buyerAccount}</p>
									</div>
								</c:when>
								<c:when test="${trade.payChannel eq 2}">
									<div class="line-heights shopsName" style="width: 30%">买家银行帐号:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${trade.buyerAccount}</p>
									</div>
								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
						</c:otherwise>

					</c:choose>
					<div class="line-heights shopsName" style="width: 20%">优惠金额:</div>
					<div class="shopsData" style="width: 70%">
						${trade.hbDiscount + trade.score/100 }（元）
					</div>
				</div>
					<div class="shops-main-right">
						<div class="line-heights shopsName">交易时间:</div>
						<div class="shopsData">
							<p class="p_text"><fmt:formatDate value="${trade.tradeTime}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
						</div>
						<div class="line-heights shopsName">收支类型:</div>
						<div class="shopsData">
							<p class="p_text">
								${trade.tradeType eq '0' ? '收入 ' : ''}
								${trade.tradeType eq '1' || trade.payChannel eq '3' ? '支出 ' : ''}
							</p>
						</div>
						<div class="line-heights shopsName" style="color: red;font-weight: bold;font-size: 14px">交易金额:</div>
						<div class="shopsData" style="color: red;font-weight: bold;font-size: 14px">
							<p class="p_text" style="color: red">
							<c:choose>
								<c:when test="${trade.tradeType eq '0'}">+</c:when>
								<c:otherwise>-</c:otherwise>
							</c:choose>
							${trade.orderPrice}&nbsp;元
							</p>
						</div>
						<div class="line-heights shopsName">优惠方式:</div>
						<div class="shopsData">
							<p class="p_text" style="color: #ff4a8f;font-weight: bold;font-size: 14px">
							<c:if test="${ not empty trade.score && trade.score > 0}">
									积分 
									(${trade.score})
									<c:if
									test="${trade.couponDiscountInt > 0}">
									、
									</c:if>
							</c:if>
							<c:if
								test="${trade.couponDiscountInt > 0}">
									红包(${trade.couponDiscountInt}元)
							</c:if>
							</p>
						</div>
						<%--<div style="clear: both;"></div>
						<div class="line-heights shopsName">店铺:</div>
						<div class="shopsData">
							<p class="p_text">
								${trade.shopName} 
							</p>
						</div>--%>
						<div style="clear: both;"></div>
						<div class="line-heights shopsName">买家支付账号:</div>
						<div class="shopsData">
							<p class="p_text">
								${trade.buyerPayAccount}
							</p>
						</div>
						<div style="clear: both;"></div>
					<c:choose>
						<c:when test="${trade.tradeType eq '0'}">
							<c:choose>
								<c:when test="${trade.payChannel eq 0}">
									<div class="line-heights shopsName" style="width: 30%">容易网支付宝帐号姓名:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${rongyiName}</p>
									</div>
								</c:when>
								<c:when test="${trade.payChannel eq 2}">
									<div class="line-heights shopsName" style="width: 30%">容易网持卡人姓名:</div>
									<div class="shopsData" style="width: 70%">
										<p class="p_text">${rongyiName}</p>
									</div>
								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
					<c:if test="${trade.guideType != null}">
						<div class="line-heights shopsName" style="width: 20%">渠道:</div>
						<div class="shopsData" style="width: 70%">
							<p class="p_text">
								<c:choose>
									<c:when test="${trade.guideType==1 }">商家</c:when>
									<c:when test="${trade.guideType==2 }">买手</c:when>
								</c:choose>
							</p>
						</div>
					</c:if>
				</div>
			</div>
			<div class="shopsButton">
				<a href="javascript:window.close();" class="Button" id="returnButton">关闭</a>		
			</div>
		</div>
	</div>
</body>
</html>
