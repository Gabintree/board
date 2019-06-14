<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Student Score</title>
</head>
<body>
	<form action="scoreChk" method="get" >
		<table>
			<tr>
				<td>국어</td><td><input type="text" name ="kor"></td>
			</tr>
			<tr>
				<td>영어</td><td><input type="text" name ="eng"></td>
			</tr>
			<tr>
				<td>수학</td><td><input type="text" name ="math"></td>
			</tr>
		</table>
		<input type="submit" value="전송" >
	</form>
	
	
 	
</body>
</html>