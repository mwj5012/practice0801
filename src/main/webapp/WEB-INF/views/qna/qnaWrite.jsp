<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문의 작성</title>
</head>
<body>
	
	<div id="nav">
		<%@ include file="../include/nav.jsp" %>
	</div>
	
	<form action="" method="post">
	
		<label>제목</label>
		<input type="text" name="qTitle" /> <br />
		
		<label>작성자</label>
		<input type="text" name="qWriter" /> <br />
		
		<label>내용</label>
		<textarea name="qContent" cols="50" rows="10"></textarea> <br />
		
		<button type="submit">작성</button>
		
	</form>
	
</body>
</html>