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
<form action="Payment">

Pay Now <Input Type="submit" name="Go">
<%List<Shoes> s=(List<Shoes>)request.getAttribute("list");%> 

 
  <table border="1">
<tr><th> Shoe Id </th><th> Name </th><th> Price </th><th> Pay with cash </th></tr>

<%--  <%for(Shoes se:s){%> --%>
<tr><td><%=request.getAttribute("id")%></td><td><%=request.getAttribute("name") %></td><td><%=request.getAttribute("price")%></td><</tr>
<%-- <%}%> --%>

</table>
</form>
</body>
</html>