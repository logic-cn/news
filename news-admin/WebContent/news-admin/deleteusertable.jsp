<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr bgcolor="#ededed">
			<td width="40" style="text-align: center;"><input type="checkbox"/></td>
			<td width="40" style="text-align: center;">ID</td>
			<td width="120" style="text-align: center;">用户名</td>
			<td width="160" style="text-align: center;">邮箱</td>
			<td width="50" style="text-align: center;">状态</td>
			<td width="150" style="text-align: center;">创建时间</td>
			<td width="120" style="text-align: center;">操作</td>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td style="text-align: center;"><input type="checkbox" value="${user.getId()}" name="userid"/></td>
				<td style="text-align: center;">${user.getId()}</td>
				<td style="text-align: center;">${user.getName()}</td>
				<td style="text-align: center;">${user.getEmail()}</td>
				<td style="text-align: center;">${user.getState()}</td>
				<td style="text-align: center;">${user.getCreate_date()}</td>
				<td style="text-align: center;"><a href="/news-admin/DeleteUserServlet?userid=${user.getId()}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>