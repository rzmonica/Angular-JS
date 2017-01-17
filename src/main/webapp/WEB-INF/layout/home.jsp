<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:importAttribute name="scripts" />
<tiles:importAttribute name="stylesheet" />

<!DOCTYPE html>
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:forEach var="script" items="${scripts}">
	<script src="<c:url value="${script}"/>"></script>
</c:forEach>
<c:forEach var="css" items="${stylesheet}">
	<link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
</c:forEach>

<title><tiles:getAsString name="title" ignore="true"
		defaultValue="Softtek Project"></tiles:getAsString></title>
</head>

<body>

	<tiles:insertAttribute name="header" />

	<br>
	<br>

	<tiles:insertAttribute name="menu" />

	<br>
	<br>

	<tiles:insertAttribute name="body" />

	<br>
	<br>
	<tiles:insertAttribute name="footer" />

</body>
</html>