package com.hcl;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Display extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if((username.equals("eventOwner") && password.equals("event@123"))||(username.equals("stallOwner") && password.equals("stall@123"))||(username.equals("hallOwner") && password.equals("hall@123"))) {
			out.println("<h3>Logged in successfully</h3>");
			request.getRequestDispatcher("./Index").include(request, response);
		}
		else {
			out.println("<center><p>Username or password is incorrect</p></center>");
	        request.getRequestDispatcher("./Index").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		}
	}

