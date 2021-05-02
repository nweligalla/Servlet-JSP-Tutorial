<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>

	<%
			//stop caching in browser for HTTP 1.1
			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
					
			//stop caching in browser for older 1.0
			response.setHeader("Pragma", "no-cache");
					
			//for Proxy servers
			response.setHeader("Expires", "0");
	
		if(session.getAttribute("useranme")==null){
			response.sendRedirect("login.jsp");
		}

	%>
	
	<iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>