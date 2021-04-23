<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>calculator</title>
</head>
<body>
<center>
<h1>Addition Program </h1>
<form action="servadd" method="post">

<input type="text" name="txtnum1" placeholder="Enter First Number" />
<br>
<br>
<input type="text" name="txtnum2" placeholder="Enter Second Number" />
<br><br>
<input type="submit" name="btn" value="+"  />

<input type="submit" name="btn" value="-"  />

<input type="submit" name="btn" value="*"  />

<input type="submit" name="btn" value="/"  />
<br>
</form>
<%
if(request.getParameter("q")!=null)
{
	out.print("result is "+request.getParameter("q"));
}
%>
</center>

</body>
</html>
