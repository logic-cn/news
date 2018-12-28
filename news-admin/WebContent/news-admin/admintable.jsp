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
	<table border="1" align="center">
		<tr bgcolor="#ededed">
			<td width="40" style="text-align: center;"><input type="checkbox"/></td>
			<td width="40" style="text-align: center;">ID</td>
			<td width="120" style="text-align: center;">用户名</td>
			<td width="50" style="text-align: center;">状态</td>
			<td width="50" style="text-align: center;">操作</td>
		</tr>
		<c:forEach items="${admin_list}" var="admin">
			<tr>
				<td style="text-align: center;"><input type="checkbox" value="${admin.getId()}" name="adminid"/></td>
				<td style="text-align: center;">${admin.getId()}</td>
				<td style="text-align: center;">${admin.getUsername()}</td>
				<td style="text-align: center;">${admin.getState()}</td>
				<td style="text-align: center;"><a href="/news-admin/ShowUpdateAdminServlet?adminid=${admin.getId()}">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>