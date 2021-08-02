	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문의 게시물 수정</title>
</head>
<body>
	
	<form action="" method="post">
	
		<label>제목</label>
		<input type="text" name="qTitle" value="${qnaDetail.qTitle }" /> <br />
		
		<label>작성자</label>
		<input type="text" name="qWriter" value="${qnaDetail.qWriter }" /> <br />
		
		<label>내용</label>
		<textarea name="qContent" cols="50" rows="10">${qnaDetail.qContent }</textarea> <br />
		
		<button type="submit">완료</button>
		
	</form>
	
</body>
</html>