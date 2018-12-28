<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>新闻ID</td>
			<td>新闻分类</td>
			<td>新闻标题</td>
			<td>新闻内容</td>
			<td>新闻状态</td>
			<td>创建时间</td>
			<td>修改时间</td>
		</tr>
		<c:forEach items="${SearchResult }" var="result">
			<tr>
				<td>${result.id }</td>
				<td>${result.category_id }</td>
				<td>${result.title }</td>
				<td>${result.content }</td>
				<td>${result.state }</td>
				<td>${result.create_date }</td>
				<td>${result.update_date }</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>