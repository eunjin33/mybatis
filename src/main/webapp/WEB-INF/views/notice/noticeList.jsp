<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
		function CallNotice(n) {
			frm.nid.value = n;
			frm.submit();
		}

	</script>
</head>
<body>
	<jsp:include page="../home/header.jsp"></jsp:include>
	<div class="container mt-3">
		<h2>공지사항 목록</h2>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th width="100">글번호</th>
					<th width="150">작성자</th>
					<th width="250">제목</th>
					<th width="150">작성일</th>
					<th width="100">조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${notices }" var="notice">
					<tr onmouseover='this.style.background="#fcecae";'
						onmouseleave='this.style.background="#FFFFFF";'
						onclick="CallNotice(${notice.nid })">
						<td align="center">${notice.nid }</td>
						<td align="center">${notice.name }</td>
						<td align="center">${notice.title }</td>
						<td align="center">${notice.writeDate }</td>
						<td align="center">${notice.hit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button>
		&nbsp;&nbsp;&nbsp;
		<button type="button" onclick="location.href='home.do'">홈</button>
	</div>
	<div>
		<!-- 숨겨저 있는 폼 -->
		<form id="frm" action="noticeSelect.do" method="post">
			<input type="hidden" id="nid" name="nid">
		</form>
	</div>
</body>
</html>