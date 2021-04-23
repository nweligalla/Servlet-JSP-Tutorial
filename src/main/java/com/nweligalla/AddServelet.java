package com.nweligalla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//anotations

@WebServlet("/add")
public class AddServelet extends HttpServlet{
	
	//for get methods use doGet()
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k =j+j;
		
//		//setting an attribute to req object
//		req.setAttribute("k", k);
		
	

		
		
//		//http session
//		
//		HttpSession session =req.getSession();
//		session.setAttribute("k", k);
		
		//cookies
		
		Cookie cookie =new Cookie("k", k+"");
		res.addCookie(cookie);
		
		
		//sendRedirect
		res.sendRedirect("sqr?k="+k); //url rewriting
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
