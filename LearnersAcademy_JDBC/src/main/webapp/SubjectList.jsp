<%@page import="com.lms.structure.Subject"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject List</title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Subjects List </i></h3>
<table border="1">
<tr><th>Subject id</th><th>Subject Name</th></tr>

<% 
DbRetrieveDAO dbdaos = new DbRetrieveDAO();
List<Subject> list = dbdaos.displaysub();
for(Subject sub:list){
%>
<tr><td><%=sub.getId()%></td><td><%=sub.getName()%></td><tr>
		
<% }%>
</table>
</body>
</html>