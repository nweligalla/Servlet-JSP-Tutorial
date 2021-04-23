package com.nweligalla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		
		
		
		
		PrintWriter out =response.getWriter();
		out.println("HI");
		
		
		//get values from servelet context
		
		ServletContext ctx =getServletContext();
		String str =ctx.getInitParameter("Phone");
		out.println(str);
		
		
		//get values from seevlet config
		
		ServletConfig cg =getServletConfig();
		String st =cg.getInitParameter("name");
		out.println(st);
	}

}
