<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 조회</title>
</head>
<body>
<jsp:include page="../home/header.jsp"></jsp:include>
 <div align="center">
 	<div><h1>내 정보 조회</h1></div>
 	<div>
 		<table border="1">
 			<tr>
 				<th width="150">아이디</th>
 				<td width="200">${member.id }</td>
 			</tr>
 			<tr>
 				<th width="150">이름</th>
 				<td width="200">${member.name }</td>
 			</tr>
 			<tr>
 				<th width="150">주소</th>
 				<td width="200">${member.address }</td>
 			</tr>
 				<tr>
 				<th width="150">전화번호</th>
 				<td width="200">${member.tel }</td>
 			</tr>
 		</table>
 	</div>
 </div>
</body>
</html>