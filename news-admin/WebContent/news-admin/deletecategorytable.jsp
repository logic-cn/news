<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>分类名称</td>
			<td>状态</td>
			<td>创建时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${cateGory_list }" var="cate">
			<tr>
				<td>${cate.id}</td>
				<td>${cate.getName()}</td>
				<td>${cate.getState()}</td>
				<td>${cate.getCreate_date()}</td>
				<td><a href="../DelectCategoryServlet?category_id=${cate.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>