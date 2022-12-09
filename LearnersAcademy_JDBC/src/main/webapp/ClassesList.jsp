<%@page import="com.lms.structure.Classes"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Classes List</title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Classes List </i></h3>
<table border="1">
<tr><th>Class id</th><th>Section Name</th><th>Teacher</th><th> Subject</th><th> Time</th></tr>
<%
DbRetrieveDAO dbdao = new DbRetrieveDAO();
List<Classes> clist = dbdao.displayClass(1);
for(Classes c:clist){
%>
<tr><td><%=c.getId()%></td><td><%=c.getSection()%></td><td><%=c.getTeacher()%></td><td><%=c.getSubject()%></td><td><%=c.getTime()%></td></tr>
		
<% }%>
</table>
</body>
</html>