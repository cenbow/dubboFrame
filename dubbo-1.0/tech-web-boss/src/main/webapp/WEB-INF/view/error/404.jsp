<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/include/taglib.jsp"%>
<c:set var="basePath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="../include/meta.jsp" />
<title>404</title>
	<link rel="stylesheet" href="${basePath}/static/css/public.css" />
	<script src="${basePath}/static/js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">
	
		
	</script>
</head>
<body>
	
	<jsp:include page="../include/header.jsp"></jsp:include>

<!-- 	<div class="" style="width: 100%; text-align: center; height: 768px;"> -->
<!-- 		<div class="page-header"><h1>页面不存在....404</h1></div> -->
<!-- 		<div><a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a></div> -->
<!-- 	</div> -->
	<div class="" style="text-align: center;">
       <img class="img-responsive" src="${basePath}/static/images/404.jpg">
    </div>
	
	<!-- 尾部 -->
	<jsp:include page="../include/footer.jsp"></jsp:include>
</body>