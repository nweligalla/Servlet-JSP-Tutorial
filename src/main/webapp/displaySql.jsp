<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- connect jstl to mysql -->
	<sql:setDataSource 
	var="db" 
	driver="com.mysql.jdbc.Driver" 
	url="jdbc:mysql://localhost:3306/telshop"
	user="root"
	password="MySq1R00tPa$s#"
	/>
	
	<!-- querry -->
	<sql:query var="rs" dataSource="${db}">select * from gadgets</sql:query>
	
	<!-- fetch data from sql -->
	
	<c:forEach items="${rs.rows}" var="gadget">
		<c:out value="${gadget.gid}"></c:out> :
		<c:out value="${gadget.gname}"></c:out> :
		<c:out value="${gadget.price}"></c:out> <br>
	</c:forEach>

</body>
</html>