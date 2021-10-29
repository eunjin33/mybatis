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
		<div><h1>게시글 수정</h1></div>
		<div>
			<form id="frm" action="noticeUpdate.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="70">글번호</th>
							<td width="70" align="center">${notice.nid }</td>
							<th width="100">작성자</th>
							<td width="100" align="center">${notice.name }</td>
							<th width="100">작성일자</th>
							<td width="100" align="center">${notice.writeDate }</td>
							<th width="70">조회수</th>
							<td width="70" align="center">${notice.hit }</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="7"><textarea rows="2" cols="92" id="title" name="title">${notice.title }</textarea></td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="7"><textarea rows="10" cols="92" id="contents" name="contents">${notice.contents }</textarea></td>
						</tr>
					</table>
				</div><br>
				<br> 
				<input type="button" value="목록" onclick="location.href='noticeList.do'">&nbsp;&nbsp;&nbsp;
				<input type="submit" value="저장">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
					<input type="hidden" id="nid" name="nid" value="${notice.nid  }">
			</form>
		</div>
	</div>
</body>
</html>