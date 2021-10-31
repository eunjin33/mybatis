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
<title>회원가입</title>
<script type="text/javascript">
	function CallValidation() {
		var pw = frm.password.value;
		var pw1 = frm.password1.value;

		if (frm.name.value == "") {
			alert("이름을 넣어주세요");
			frm.name.focus();
			return false;
		}

		if (pw == pw1) {
			frm.submit();
		} else {
			alert("패스워드가 일치 하지 않습니다");
			frm.password.value = "";
			frm.password1.value = "";
			frm.password.focus();
			return false;
		}
	}
</script>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div class="container mt-3">
		<h2>회원가입</h2>
		<form id="frm" action="memberJoin.do" method="post">
			<div class="mb-3 mt-3">
				<label for="id">아이디:</label> <input type="text" class="form-control"
					id="id" placeholder="아이디" name="id">
			</div>

			<div class="mb-3">
				<label for="password">비밀번호:</label> <input type="password"
					class="form-control" id="password" placeholder="비밀번호"
					name="password">
			</div>

			<div class="mb-3">
				<label for="password">비밀번호 확인:</label> <input type="password"
					class="form-control" id="password1" placeholder="비밀번호 확인"
					name="password1" required="required">
			</div>

			<div class="mb-3">
				<label for="password">이름:</label> <input type="text"
					class="form-control" id="name" placeholder="이름" name="name"
					required="required">
			</div>

			<div class="mb-3">
				<label for="password">주소:</label> <input type="text"
					class="form-control" id="address" placeholder="주소"
					name="address" required="required">
			</div>

			<div class="mb-3">
				<label for="password">전화번호:</label> <input type="text"
					class="form-control" id="tel" placeholder="전화번호:" name="tel"
					required="required">
			</div>

			<input type="hidden" id="author" name="author" value="USER">
			<input type="button" class="btn btn-primary" value="회원가입"
				onclick="CallValidation()">&nbsp;&nbsp;&nbsp; <input
				type="reset" class="btn btn-primary" value="취 소">
		</form>
	</div>


</body>
</html>