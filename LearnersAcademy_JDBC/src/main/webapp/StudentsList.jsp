<%@page import="com.lms.structure.Student"%>
<%@page import="com.lms.dao.DbRetrieveDAO"%>
<%@page import="java.util.*" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Students</title>
</head>
<body>
<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Students List </i></h3>
<table border="1">
<tr><th>Student id</th><th>Student Name</th><th>Age</th><th> Class</th></tr>

<% 
DbRetrieveDAO dbdao = new DbRetrieveDAO();
List<Student> slist = dbdao.display();
for(Student s:slist){
%>
<tr><td><%=s.getid()%></td><td><%=s.getSname()%></td><td><%=s.getSage()%></td><td><%=s.getSclass()%></td></tr>
		
<% }%>
</table>
</body>
</html>