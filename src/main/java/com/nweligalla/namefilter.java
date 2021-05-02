package com.nweligalla;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class namefilter
 */
@WebFilter("/addAlien")
public class namefilter implements Filter {

    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		PrintWriter out = response.getWriter();

		HttpServletRequest req =(HttpServletRequest)request;
		
		String aname = req.getParameter("aname");
		
		System.out.println(aname.length());
		
		if(aname.length()>1)
			 //pass the request along the filter chain
			chain.doFilter(request, response);
		else
			out.println("Invalid Input");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
