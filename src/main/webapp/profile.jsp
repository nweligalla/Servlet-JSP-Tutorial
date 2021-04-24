<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//sql credentions
		String url = "jdbc:mysql://localhost:3306/School";
		String userName = "root";
		String passWord ="My$qL1234#";
	
		//connect jdbc
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
		Statement st =con.createStatement();
		String sql = "SELECT * FROM School.class WHERE id = 101;";
		
		//fetch data
		ResultSet result = st.executeQuery(sql);	
		result.next();
		
		
	%>
	<!-- use data  -->
	ID : <%= result.getString(1) %> <br>
	Marks : <%= result.getString(2) %> <br>
	Name : <%= result.getString(3) %> <br>
	

</body>
</html>