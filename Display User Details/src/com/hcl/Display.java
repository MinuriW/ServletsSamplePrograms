package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		
		out.println("<html><body><h1>User Details</h1><br>");
		out.println("<table id='user' border='1'><tr><td>Name</td><td>"+name+"</td></tr>");
		out.println("<tr><td>Phone Number</td><td>"+phoneNumber+"</td></tr>");
		out.println("<tr><td>Email</td><td>"+email+"</td></tr>");
		out.println("<tr><td>Email</td><td>"+city+"</td></tr>");
		out.println("</table></body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
