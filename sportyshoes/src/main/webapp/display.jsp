<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.example.demo.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <%User u= (User)request.getAttribute("user");%>
<%="Welcome "+u.getUser() %> --%>

<a href ="AdminMainIndex.jsp"> Go to Main Admin Page</a>
<br>


<%List<Shoes> s=(List<Shoes>)request.getAttribute("list");%> 

 
  <table border="1">
<tr><th> Shoe Id </th><th> Name </th><th> Price </th></tr>

<%for(Shoes se:s){%>
<tr><td><%=se.getShoeid()%></td><td><%=se.getShoename() %></td><td><%=se.getPrice()%></td></tr>
<%}%>

</table>


</body>
</html>