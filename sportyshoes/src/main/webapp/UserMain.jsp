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

<h2> Welcome user </h2><br>
<br>
<h4>Select shoes to buy </h4><br><br>
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list");%> 

 
  <table border="1">
<tr><th> Shoe Id </th><th> Name </th><th> Price </th><th> Select </th></tr>

<%for(Shoes se:s){%>
<tr><td><%=se.getShoeid()%></td><td><%=se.getShoename() %></td><td><%=se.getPrice()%></td><td>
<form action="buynow">
 <input type="submit" name="reservebutton" value="select">
 <input type="hidden" name="shoeid" value="<%=se.getShoeid()%>">
 <input type="hidden" name="price" value="<%=se.getPrice() %>"></form></td></tr>
 
 
<%}%>




</table>
</body>
</html>