<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="/news-admin/UserUpdateServlet" method="post">
			<input type="hidden" name="userid" value="${update_user.id}"><br/>
			用户名：<input type="text" name="username" value="${update_user.name }"><br/>
			密码：<input type="password" name="password" value="${update_user.password }"><br/>
			邮箱：<input type="text" name="email" value="${update_user.email }"><br/>
			<input type="submit" value="提交修改"/>
		</form>
	</center>
</body>
</html>