<%@ page import="loggin.aBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		javax.servlet.http.Cookie ck[] = request.getCookies();
	
	 	
		aBean obj = (aBean) request.getAttribute("bean");
		String message = ("message");
		out.print("Hello welcome to your page " + ck[0].getValue());
	%>




</body>
</html>