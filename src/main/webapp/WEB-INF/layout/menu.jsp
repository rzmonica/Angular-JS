<%@ page language= "java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>	

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	
<ul class="breadcrumb">
	<li><a href="<c:url value="/Cart/List"/>">Carts</a></li>
	<li><a href="<c:url value="/User/List"/>">Users</a></li>
</ul>
	
</body>
</html>
