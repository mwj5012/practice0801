<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>문의</title>
</head>
<body>

	<div id="nav">
		<%@ include file="../include/nav.jsp" %>
	</div>
	
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${qnaList }" var="qnaList">
				<tr>
					<td>${qnaList.qNum }</td>
					
					<td>
					<a href="/qna/qnaDetail?qNum=${qnaList.qNum }">${qnaList.qTitle }</a>
					</td>
					
					<td>${qnaList.qWriter }</td>
					<td>
					<fmt:formatDate value="${qnaList.qRegDate }" pattern="yyyy-MM-dd" />
					</td>
					<td>${qnaList.qViewCount }</td>
				
				</tr>
			</c:forEach>
		
		</tbody>
		
	</table>
	
</body>
</html>