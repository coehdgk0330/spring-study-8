<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="b" items="${basicList}">
		<p>${b.id}${b.pw} ${b.name} ${b.type}</p>
	</c:forEach>


	<c:forEach var="m" items="${managerList}">
		<p>${m.id}${m.pw} ${m.name} ${m.type}</p>
	</c:forEach>

	<c:forEach var="a" items="${admin}">
		<p>${a.id}${a.pw} ${a.name} ${a.type}</p>
	</c:forEach>



</body>
</html>