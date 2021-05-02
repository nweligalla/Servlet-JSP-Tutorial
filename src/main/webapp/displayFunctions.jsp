<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <c:set var="str" value="Hello World from jstl functions"></c:set>
	 
	 Length : ${fn:length(str)} <br>
	 
	 <c:forEach items="${fn:split(str,' ')}" var="s">
	 	<c:out value="${s}"></c:out> <br>
	 </c:forEach>
	 
	 index : ${fn:indexOf(str,'o')} <br>
	 is there : ${fn:contains(str,"from")} <br>
	 <c:if test="${fn:contains(str,'from')}">
	 	
	 	passed
	 </c:if>
	 
	 <c:if test="${fn:endsWith(str,'functions')}">
	 	
	 	passed
	 </c:if>
</body>
</html>