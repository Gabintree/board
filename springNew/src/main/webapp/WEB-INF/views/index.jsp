<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>index.jsp �Դϴ�.</title>
</head>
<body>
	<form action="student" method = "get">
		student id : <input type = "text" name = "id"> <br>
		<input type = "submit" value="����">
	</form>
	id : ${id }
</body>
</html>