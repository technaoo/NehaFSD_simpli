<%@page import="com.lms.structure.Teachers"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teachers List</title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Teacher's List </i></h3>
<table border="1">
<tr><th>Teacher id</th><th>Teacher Name</th><th>Teacher's Age</th></tr>
<% 
DbRetrieveDAO dbdao = new DbRetrieveDAO();
List<Teachers> tlist = dbdao.displayTeachers();
for(Teachers t:tlist){
%>
<tr><td><%=t.getId()%></td><td><%=t.getName()%></td><td><%=t.getAge()%></td></tr>
		
<% }%>
</table>
</body>
</html>