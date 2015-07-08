<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action= "addpage" method="post">
		<h2>新写一篇文章</h2>
		标题：<input type="text" name="title">
		作者：<input type="text" name="author">
		时间：<input type="text" name="time">
		<textarea rows="" cols="" name="content"></textarea>
		<input type="submit" value="提交">
	</form>
	
</body>
</html>