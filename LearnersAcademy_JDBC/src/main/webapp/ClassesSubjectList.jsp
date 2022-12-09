
<%@page import="com.lms.structure.Classes"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><br></title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Classes - Subjects List </i></h3>
<table border="1">
<<tr><th>Class id</th><th>Section Name</th><th>Teacher</th><th> Subject</th><th> Time</th></tr>
<% 
DbRetrieveDAO dbdao = new DbRetrieveDAO();
List<Classes> cslist = dbdao.displayClass(2);
for(Classes cs:cslist){
%>
<tr><td><%=cs.getId()%></td><td><%=cs.getSection()%></td><td><%=cs.getTeacher()%></td><td><%=cs.getSubject()%></td><td><%=cs.getTime()%></td></tr>

<% }%>
</table>
</body>
</html>