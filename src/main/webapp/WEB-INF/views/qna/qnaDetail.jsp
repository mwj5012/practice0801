<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문의 상세</title>
</head>
<body>
	
		<label>제목</label>
		${qnaDetail.qTitle } <br />
		
		<label>작성자</label>
		${qnaDetail.qWriter } <br />
		
		<label>내용</label>
		${qnaDetail.qContent } <br />

	
</body>
</html>