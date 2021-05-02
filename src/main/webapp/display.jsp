<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//get value from servlet
		//String name = request.getAttribute("student").toString();
		//out.println(name);
	%>
	
	<!-- the following doing exact same thing as above -->
	${students} <br> <br>
	
	<c:forEach items="${students}" var="st">
		${st.name} --------- ${st.id} <br>
	</c:forEach>
	
	<!-- 
		<c:out value="Hello World from jstl"/> <br>
		<c:out value="${student.id}"/>
	
	 -->
	

</body>
</html>