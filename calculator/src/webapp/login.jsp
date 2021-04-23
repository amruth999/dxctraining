<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login here</title>
</head>
<body>
<%! String user="user",pass="pass"; %>
<center>
<h3>LOGIN</h3>
<form action="login.jsp" method="post">
<b>UserName</b>:<input type="text" name="uname">
<b>Pwd</b>:<input type="text" name="pwd">
<input type="submit" value="click here">
</form>
</center>

<% if(! (String.valueOf(request.getParameter("uname")).equals(user) && String.valueOf(request.getParameter("pwd")).equals(pass))){ %>
<p>NOT VALID</p>
<%}else{ %>
<jsp:forward page="selectjsp.jsp"/>
<% } %>
</body>
</html>
