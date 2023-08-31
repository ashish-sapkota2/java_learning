<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello JSP</h1>
<%! public int x=22; %>

<%= new java.util.Date() %>
<br/>
<%= 25>4 %>

<%
int x= 10;
out.println(x);
if(x>25){
	out.println("X is greater than 25");
}else{
	out.println("x is not grater than 25");
}

%>
<%!
//declaration block <%!
	String message(){
	return "This is string";
}
%>
<%= message() %>
</body>
</html>