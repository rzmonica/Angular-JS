<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Users</title>
<meta charset="UTF-8">
</head>
<body data-ng-app="userApp" style="font-family: sans-serif;">
	<div data-ng-controller="userController">
		<h3 style="color: blue; font-family: sans-serif;">User List:</h3>
		<span>{{hello}}</span>

		<a href="<c:url value="/User/home"/>">Return to Index</a> <br />
		<br />

		<table border="1" style="width: 100%;">
			<tr>
				<th width="5%">Username</th>
				<th width="10%">Name</th>
				<th width="10%">Role</th>
				<th width="10%">Active</th>
				<th width="11%">Delete</th>
			</tr>
			<c:forEach var="user" items="${users}">
				<tr>
					<td><a
						href="<c:url value="/User/edit?username=${user.username}&status="/>">${user.username}</a></td>
					<td>${user.name}</td>
					<td>${user.role.description}</td>
					<td>${user.status}</td>
					<td><c:if test="${'Registered User'==user.role.description}">Delete</c:if></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>