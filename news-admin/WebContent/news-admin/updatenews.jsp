<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻修改页面</title>
</head>
<hr size="9" color="red" noshade>
<body background="img/skin_/beijing.jpg">
	<form action="NewsUpdateServlet" method="post">
		<h3 align="center">新闻修改页面</h3>
		<table align="center">

			<tr>
				<td>新闻类别:</td>
				<td><c:choose>
						<c:when test="${Updatenews.category_id =='1'}">
							<input type="radio" name="category" value="时政" checked="checked">时政
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="时政">时政
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '2' }">
							<input type="radio" name="category" value="国际" checked="checked">国际
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="国际">国际
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '3' }">
							<input type="radio" name="category" value="军事" checked="checked">军事
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="军事">军事
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '4' }">
							<input type="radio" name="category" value="公益" checked="checked">公益
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="公益">公益
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '5' }">
							<input type="radio" name="category" value="汽车" checked="checked">汽车
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="汽车">汽车
				</c:otherwise>
					</c:choose></td>
			</tr>
			<tr>
				<td></td>
				<td><c:choose>
						<c:when test="${Updatenews.category_id == '6' }">
							<input type="radio" name="category" value="房产" checked="checked">房产
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="房产">房产
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '7' }">
							<input type="radio" name="category" value="教育" checked="checked">教育
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="教育">教育
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '8' }">
							<input type="radio" name="category" value="时尚" checked="checked">时尚
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="时尚">时尚
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '9' }">
							<input type="radio" name="category" value="科技" checked="checked">科技
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="科技">科技
				</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${Updatenews.category_id == '10' }">
							<input type="radio" name="category" value="娱乐" checked="checked">娱乐
				</c:when>
						<c:otherwise>
							<input type="radio" name="category" value="娱乐">娱乐
				</c:otherwise>
					</c:choose>
			</tr>


			<tr>
				<td><p style="line-height: 13px">新闻标题:</p></td>
				<td><input type="text" name="title" value="${Updatenews.title}"></td>
			</tr>
			<tr>
				<td><p style="line-height: 13px">新闻内容:</p></td>
				<td><textarea style="width: 400px; height: 200px;"
						name="content" >${Updatenews.content}</textarea></td>
			</tr>
			<%-- <tr>
				<td><p style="line-height: 13px">发布时间:</p></td>
				<td><input type="text" name="date"
					value="${Updatenews.create_date}"></td>
			</tr> --%>
			<tr>
				<td><p style="line-height: 13px">
						<input type="hidden" name="id" value="${Updatenews.id}">
						<input type="submit" value="提交">
					</p></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>
</body>
</html>