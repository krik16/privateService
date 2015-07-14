<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>容易会员管理后台</title>
<link href="${ctx}/css/jquery-ui.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/css/index2.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/js/jquery/jquery.js" type="text/javascript"></script>
<script src="${ctx}/js/jquery/jquery-ui.js" type="text/javascript"></script>

<script src="${ctx}/js/jquery/jquery.nicescroll.js"
	type="text/javascript"></script>

<script src="${ctx}/js/util/bootstrap/bootstrap.min.js"
	type="text/javascript"></script>
<script src="${ctx}/js/util/util.js" type="text/javascript"></script>
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

.errorData{
	color: red;
}
</style>
</head>
<body>
	
	<div class="role-min-width" style="width:100%;">
		<div class="role">
			<div class="role-title">考核奖金> 导入考核明细</div>
			<form style="padding-left:200px;height: 100%;" id="account_form" name="account_form" action="${ctx}/bonus/uploadExcel" method="post" enctype ="multipart/form-data" >
				<input type="hidden" id="isSubmit" value="-1"></input>
			<div class="role-main">
				<div class="role-new">
					
					<ul>
						
						<li class="w_100 lvse size-14">导入考核明细</li>
						<li class="name">
								请上传文件</li>
							
						<li class="detail" >
								<input id="file" name="file" type="file" style="border: 0;" onchange="isUsedFile(this);"/>
								<c:if test="${total!=null&&total>5000 }">
								<span class="msg" style="color: red;">(*请上传excel格式文件，文件最多支持5000条记录)</span>
								</c:if>
								<c:if test="${total==null}">
									<span class="msg" style="width:300px;">(*请上传excel格式文件，文件最多支持5000条记录)</span>
								</c:if>
						</li>
						<li  class="w_100 lvse size-14">
							<input type="button" id="uploadExcel" value="上传" style="cursor: pointer;"/> 
							<input type="button" id="downModel" value="下载考核明细模板" style="cursor: pointer;"/> 
						</li>
					</ul>
				
				</div>
				<c:if test="${result!=null }">
				<div style="border: 1 solid red;width:300px;height: 150px;">
					一共上传${total }条记录；成功上传${success }条记录；失败${fail }条记录。
					<a href="javascript:void(0);" style="color:red;" onclick="downLoadFailList(${fail},${temp });">下载上传失败记录</a>
				</div>
				</c:if>
				
			</div>
			<div class="shopsButton">
				<a href="javascript:history.back()" class="Button saveAccount  checked">返回</a>
			</div>
			</form>
		</div>
	</div>
	<div class="MsgBoxBg"></div>
	<div class="MsgBoxConfirm">
		<div class="MsgBoxTitle">提示</div>
		<div class="MsgBoxMain">
			<p></p>
			<a href="javascript:;" class="Button cancel">取消</a>
			<a href="javascript:void(0);" class="Button checked" id="MsgBoxBtn">确定</a>
		</div>
	</div>
	
	<div class="MsgBoxTip">
	    <div class="MsgBoxTitle">提示</div>
	    <div class="MsgBoxMain">
		<p></p>
		<a style="margin: 0 auto;display: block;float: none;" href="javascript:;" class="Button checked" id="MsgBoxTipBtn">确定</a>
		</div>
	</div> 
</body>
<script type="text/javascript">
$("#uploadExcel").click(function(){
	if($("#isSubmit").val()=='1'){
		$("form:first").submit();
	}
})
function downLoadFailList(fail,temp){
	
	if(fail==0){
		_util.cmsTip("没有失败记录！");
		return;
	}
	window.location.href="../bonus/downLoadFailList?temp="+temp
}
$("#downModel").click(function(){
	window.location.href="../bonus/downLoadModel";
})
function isUsedFile(input)
{
	var filename=input.value;
	if(filename.length>1&&filename){
		var ldot=filename.lastIndexOf(".");
		var type=filename.substring(ldot+1);
		if(type!='xlsx'){
			_util.cmsTip("文件的类型错误！");
			$(input).next(".msg").css("color","red");
			$("#isSubmit").val("-1");
			return;
		}
		$(input).next(".msg").css("color","#9c9c9c");
		$("#isSubmit").val("1");
	}
	/* var ext = ['.xlsx'];
	var s = src.toLowerCase();
	var r = false;
	for(var i = 0; i < ext.length; i++)
	{
		if (s.indexOf(ext[i]) > 0)
		{
			alert(ext[i]);
			r = true;
			break;
		}
	}	
	return r; */
}
</script>
</html>

