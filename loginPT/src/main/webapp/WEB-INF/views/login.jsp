<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
<head>
	<title>Login</title>
</head>
<body>
<h1>
	아이디와 비밀번호를 입력해주세요.  
</h1>

<form action="logined" method="post">
<table>
	<tr>
		<td>아이디<input type="text" name="id"></td>
	</tr>
	<tr>
		<td>비밀번호<input type="password" name="pw"></td>
	</tr>
	<tr>
		<td><input type="submit" value="로그인"></td>
	</tr>
	
</table>
</form>


</body>
</html>
