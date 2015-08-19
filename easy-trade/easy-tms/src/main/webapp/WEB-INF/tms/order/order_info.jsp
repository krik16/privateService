<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/_include/_jsp_tags.jsp"%>
<%@include file="/_include/_jsp_variable.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>订单详情</title>
</head>
<frameset rows="100,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="${ctx}/main/top" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
    <frame src="${ctx}/orderManager/infoDetails?orderId=${orderId}&module=${module}&type=${type}" name="mainFrame" id="mainFrame" title="mainFrame" style="border: 1px solid #d9dadc;border-left: 0px;" />
</frameset>
<noframes><body>
</body>
</noframes></html>