<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert DOB here</title>
</head>
<body>
<center>
<form action="age.jsp" method="post">

<b>date:</b> <input type="date" name="date" placeholder="DD-MM-YYYY"/>[day-month-year]
<button><intput type="submit" value="check" />check age</button>
</form>
</center>


<%    String dob = (String)request.getParameter("date");
int age;
         if(dob!=null){
            int yearDOB = Integer.parseInt(dob.substring(6, 10));
            int monthDOB = Integer.parseInt(dob.substring(3, 5));
            int dayDOB = Integer.parseInt(dob.substring(0, 2));
            DateFormat dateFormat = new SimpleDateFormat("yyyy");
            java.util.Date date = new java.util.Date();
            int thisYear = Integer.parseInt(dateFormat.format(date));
            dateFormat = new SimpleDateFormat("MM");
            date = new java.util.Date();
            int thisMonth = Integer.parseInt(dateFormat.format(date));
            dateFormat = new SimpleDateFormat("dd");
            date = new java.util.Date();
            int thisDay = Integer.parseInt(dateFormat.format(date));
            age = thisYear - yearDOB;
            if (thisMonth < monthDOB) {
                age = age - 1;
        }
          if (thisMonth == monthDOB && thisDay < dayDOB) {
                age = age - 1;
        }
         }
         else 
        	 age=0;        
%>
<center> Age=<%=age%></center>


</body>
</html>
