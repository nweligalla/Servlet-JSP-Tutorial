package com.nweligalla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




//anotations

@WebServlet("/sqr")
public class SquareServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		//session methods
//		HttpSession session =req.getSession();
//		
//		int k = (int)session.getAttribute("k");
		
//		//delete session data
//		session.removeAttribute("k");
		
		
		int k=0;
		
		
		//accept cookie
		Cookie cookies[] =req.getCookies();
		
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		
		
		
		k*=k;
		
		PrintWriter out = res.getWriter();
		out.println("Square called"+k);
		
		
		
	}

}
