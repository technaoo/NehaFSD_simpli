<%@page import="com.lms.structure.Student"%>
<%@page import="com.lms.structure.Teachers"%>
<%@page import="com.lms.structure.Classes"%>
<%@page import="com.lms.structure.Subject"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Report</title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Report Card </i></h3>
<table border="1">
<tr><th>Student id</th><th>Student Name</th><th>Age</th><th> Class</th><th> Subject</th></tr>

<% 
DbRetrieveDAO dbdao = new DbRetrieveDAO();
List<Student> slist = dbdao.display();
List<Classes> clist = dbdao.displayClass(1);
for(Student s:slist){
%>
<tr><td><%=s.getid()%></td><td><%=s.getSname()%></td><td><%=s.getSage()%></td><td><%=s.getSclass()%></td>
<% }%>
<% for(Classes c:clist){
%>
<td><%=c.getId()%></td><td><%=c.getSection()%></td><td><%=c.getTeacher()%></td><td><%=c.getSubject()%></td><td><%=c.getTime()%></td></tr>
		
<% }%>
</table>
</body>
</html>