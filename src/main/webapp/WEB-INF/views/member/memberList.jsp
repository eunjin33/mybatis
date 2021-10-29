<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 리스트</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div class="container mt-3">
		<h2>회원 리스트</h2>
		 <table class="table table-bordered">
			<thead>
				<tr>
					<th>이름</th>
					<th>아이디</th>
					<th>주소</th>
					<th>전화번호</th>
					<th>권한</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${members }" var="member">
					<tr>
						<td>${member.name }</td>
						<td>${member.id }</td>
						<td>${member.address }</td>
						<td>${member.tel }</td>
						<td>${member.author }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>