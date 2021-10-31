<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
<title>내 정보 조회</title>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div class="container mt-3">
		<h2>내 정보</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>아이디</th>
					<td>${member.id }</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>${member.name }</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>${member.address }</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>${member.tel }</td>
				</tr>
				<tr>
					<th>권한</th>
					<td>${member.author }</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>