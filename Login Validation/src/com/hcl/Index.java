package com.hcl;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body><form action='Display' method='GET'><center>");
		out.println("<h1>Welcome to Carnival</h1><br>");
		out.println("Username:	<input type='text' name='username'> <br>");
		out.println("Password:	<input type='text' name='password'> <br>");
		out.println("<input type='submit' id='login' value='Login'>");
		out.println("</center></form></body></html>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	}

}
