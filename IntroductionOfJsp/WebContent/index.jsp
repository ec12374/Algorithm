<%@page import="com.tus.ExampleOfDeclaration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Tushar World</title>
</head>
<body>
<!-- Expression tags -->
Hello Mr.<%= request.getParameter("first_name") %><br />
The time on the Server is: <%= new java.util.Date()  %><br /><br />

<!-- Scriptlets tags -->
<h3>Hello in the World of Java</h3>
<% 
for(int i=1;i<=3;++i){
	out.println("<br />"+"It's working good: "+i);
}
%>
<br /> <br /> <br />
<!-- Declaration tags -->
<%!
String makeitLower(String data){
	return data.toLowerCase();
}
%>
Lower case of "Tushar Verma: " <%= makeitLower("Tushar Verma") %><br />

Upper case of "tushar verma: " <%= ExampleOfDeclaration.makeUpperCase("tushar verma") %>
</body>
</html>