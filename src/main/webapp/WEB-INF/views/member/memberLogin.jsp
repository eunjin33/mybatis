<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div align="center">
		<div>
			<h1>${message }</h1>
		</div>
		<a href="home.do">홈 가기</a>
	</div>
</body>
</html>