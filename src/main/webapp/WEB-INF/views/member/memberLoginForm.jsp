<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div class="container mt-3">
		<h2>로그인</h2>
		<form id="frm" action="memberLogin.do" method="post">
			<div class="mb-3 mt-3">
				<label for="id">아 이 디:</label> <input type="text"
					class="form-control" id="id" placeholder="아이디를 입력해주세요"
					name="id" style="width:300px;">
			</div>
			<div class="mb-3">
				<label for="password">비밀번호:</label> <input type="password"
					class="form-control" id="password" placeholder="비밀번호를 입력해주세요"
					name="password" style="width:300px;">
			</div>
			<button type="submit" class="btn btn-primary">로그인</button>
		</form>
	</div>
</body>
</html>