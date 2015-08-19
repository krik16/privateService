<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>商品详情</title>

<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/jquery.timepicker.css" type="text/css" rel="stylesheet" /><!-- 日期控件css -->
<link href="${ctx}/css/index6.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/coupon_index.css" type="text/css" rel="stylesheet" />

<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery.nicescroll.js" type="text/javascript"></script>
<script src="${ctx}/js/layer/layer.js" type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
<script src="${ctx}/js/order/mcmc_image.js" type="text/javascript"></script>

<script src="${ctx}/js/index.js" type="text/javascript"></script>

</head>
<%-- <script src="${ctx}/js/index.js" type="text/javascript"></script> --%>







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
</style>
</head>
<body>
		<div class="coupon-min-width">
		<div class="coupon">
			<div class="coupon-title">商品 > 商品详情</div>
			<form id="account_form" name="account_form" action="" method="post">
			<div class="coupon-main">
				<div class="coupon-new">
				<input type="hidden" name="id" class="accountId" value="<c:out value='${commodityvo.id}'/>"> </input>
					<div class="coupon-new-title">商品信息</div>
					<div class="w_100">
						<ul>
							<li class="li1" style="text-align:right">系统编码：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.id }</span>
							</li>

							<li class="li1" style="text-align:right">商品名称：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.name }</span>
							</li>
							<li class="li1" style="text-align:right">商场：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.mallName }</span>
							</li>
							<li class="li1" style="text-align:right">运费：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.postage }元</span>
							</li>
							
							<li class="li1" style="text-align:right">商品描述：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.descrite }</span>
							</li>
						</ul>
						<ul>
							<li class="li1" style="text-align:right">商品编码：</li>
							<li class="li2" style="text-align:left">
								
								<span class="msg" style="color:#222222">${commodityvo.code }</span>
							</li>

							<li class="li1" style="text-align:right">分类：</li>
							<li class="li2" style="text-align:left">
								<span class="msg" style="color:#222222">${commodityvo.commodityCategory }</span>
							</li>
							
							<li class="li1" style="text-align:right">店铺：</li>
							<li class="li2" style="text-align:left">
								<span class="msg" style="color:#222222">${commodityvo.shopName }</span>
							</li>
							
							<li class="li1" style="text-align:right">状态：</li>
							<li class="li2" style="text-align:left">
								<span class="msg" style="color:#222222">
									<c:if test="${commodityvo.status != true}">
										已下架
									</c:if>
									<c:if test="${commodityvo.status == true}">
										已上架
									</c:if>
								</span>
							</li>
						</ul>
					</div>
					
					
	
				</div>
			</div>
		<!-- 商品规格 -->
		
			<div class="coupon-main">
				<div class="coupon-new">
					<div class="coupon-new-title">商品规格</div>
					<c:choose>
						<c:when test="${not empty columnValues}">
						<c:set var="abc" value="1" />
						<c:forEach var="columnV" items="${columnValues}" varStatus="status">
						 
								<div class="w_100">
									<ul>
										<li class="li1" style="text-align:right">尺寸：</li>
										<li class="li2" style="text-align:left">
											
											<span class="msg" style="color:#222222">${columnV[4] }</span>
										</li>
			
										<li class="li1" style="text-align:right">库存：</li>
										<li class="li2" style="text-align:left">
											
											<span class="msg" style="color:#222222">${columnV[1] }</span>
										</li>
										<li class="li1" style="text-align:right">原价：</li>
										<li class="li2" style="text-align:left">
											
											<span class="msg" style="color:#222222">${columnV[2] }元</span>
										</li>
										
									</ul>
									<ul>
										<li class="li1" style="text-align:right">颜色：</li>
										<li class="li2" style="text-align:left">
											
											<span class="msg" style="color:#222222">${columnV[5] }</span>
										</li>
			
										<li class="li1" style="text-align:right">已售：</li>
										<li class="li2" style="text-align:left">
											<span class="msg" style="color:#222222"></span>
										</li>
										
										<li class="li1" style="text-align:right">现价：</li>
										<li class="li2" style="text-align:left">
											<span class="msg" style="color:#222222">${columnV[3] }元</span>
										</li>
										
										
									</ul>
								</div>
								  
								
								<c:if test="${abc != columnValuesSize}">
									<hr style="height:1px; border:none; border-top:1px #000 dashed ;width : 850px;margin-left:36px;"/>
								</c:if>
							
								<c:set var="abc" value="${abc +1}" /> 
							</c:forEach>
					</c:when>
				</c:choose>
					
					
				</div>
			</div>
		<!-- 商品规格 -->
		
		<!-- 商品图片开始 -->
		<div class="coupon-main">
				<div class="coupon-new">
					<div class="coupon-new-title">商品图片</div>
					<div class="active-pic detail-pic">
						<div class="active-pic-title" id="detail_img_title">
							<span>商品图片</span>
						</div>
						<div class="active-pic-img" id="detail_img_count">
								
						<c:choose>
							<c:when test="${not empty picList}">
								<c:forEach var="picListT" items="${picList}" varStatus="status">
									<div class="shopsImg minheight" style="margin-top: 10px; ">
											<div class="pic">
												<div class="cancel deleteClick" style="display:none;"></div>
												<c:if test="${picListT != null && picListT != ''}">
													<img src="${picListT}" id="pict" photoId="1" class="upload_photo_icon" fileName="${picListT}" fileNameHow="update" suffix_type=".jpg" pixel_x="640" pixel_y="352" style="width: 80px; height: 80px;"/>
												</c:if>
												<c:if test="${picListT == null || picListT == ''}">
													<img src="../images/logo.png" id="pict" photoId="1" class="upload_photo_icon" fileName="" fileNameHow="" suffix_type=".jpg" pixel_x="640" pixel_y="352" style="width: 80px; height: 80px;">
												</c:if>
		
												<input type="hidden" class="fileName" name="img" value="${picListT}"/>
												
											</div>
									</div>
								</c:forEach>
							</c:when>
						</c:choose>	
								
								
							
										<%-- 
											<div class="shopsImg minheight" style="margin-top: 10px;">
									<div class="pic">
										<div class="cancel deleteClick" style="display:none"></div>
										<c:if test="${detailImg4 != null && detailImg4 != ''}">
											<img src="${detailImg4}" id="pict" photoId="1" class="upload_photo_icon" fileName="${detailImg4}" fileNameHow="update" suffix_type=".jpg" pixel_x="640" pixel_y="352" style="width: 80px; height: 80px;"/>
										</c:if>
										<c:if test="${detailImg4 == null || detailImg4 == ''}">
											<img src="../images/pic_add.png" id="pict" photoId="1" class="upload_photo_icon" fileName="" fileNameHow="" suffix_type=".jpg" pixel_x="640" pixel_y="352" style="width: 80px; height: 80px;">
										</c:if>

										<input type="hidden" class="fileName" name="img" value="${detailImg4}"/>
										<input type="file" id="myfiles" class="myfiles" name="myfiles" style="display: none;"/>
									</div>
										</div> --%>
											
								</div>
					</div>
				</div>
		</div>
		<!-- 商品图片 -->
			<div class="shopsButton">
				<a href="javascript:history.go(-1)" onclick="" class="Button">返回</a>
			</div>
			</form>
		</div>
	</div>	

</div>
</body>
</html>
