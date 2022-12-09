
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head> 
<body>

<body bgcolor = "LightCyan">
<h3 style="text-align:center;"><i> Administrator Login  </i></h3>
<h3>Go to... </h3>

<form action = StudentsList.jsp>
<button type = "submit"> Student's List  </button></form><br>
<form action = TeachersList.jsp>
<button type = "submit" > Teacher's List </button></form><br>
<form action = "ClassesList.jsp">
<button type = "submit"  > Classes List</button></form><br>
<form action = "SubjectList.jsp">
<button type = "submit" > Subject List</button></form><br>
<!-- <form action = "ClassesTeacherList.jsp">
<button type = "submit" > ClassesTeacher List</button></form><br> -->
<form action = "ClassesSubjectList.jsp">
<button type = "submit" > Classes - Subject List </button></form><br>
<form action = "ClassReport.jsp">
<button type = "submit" > Class Report card</button></form><br>



</body>
</html>