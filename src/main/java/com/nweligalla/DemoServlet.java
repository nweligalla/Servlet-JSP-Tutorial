package com.nweligalla;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		
		String name ="Nayana";
		
		//Student st = new Student("Sandun", 001);
		
		List<Student> studs = Arrays.asList(
				new Student("Batman", 1),
				new Student("Superman", 2),
				new Student("Arrow", 2)
				);	
				
		
		request.setAttribute("students", studs);
		//send value to jsp
		RequestDispatcher rd =request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

}
