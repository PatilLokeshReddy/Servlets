<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<body bgcolor="#D5DBDB">
	<%
	String name = (String) request.getAttribute("name");
	%>
	<font style="color: #1CD0EA" size="10px"> <%
		out.println(name);
		%>
	</font>
</body>
</html>