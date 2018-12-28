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
	<center>
		<form action="UpdateAdminServlet" method="post">
			<input type="hidden" name="id" value="${admin_list.id }"><br/>
			用户名：<input type="text" name="username" value="${admin_list.username }"><br/>
			密码：<input type="password" name="password" value="${admin_list.password }"><br/>
			<input type="submit" value="提交修改">
		</form>
	</center>
</body>
</html>