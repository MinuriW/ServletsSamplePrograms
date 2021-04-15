package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Index extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Enter hall details</h1><br>");
		out.println("<form action='Display' method='GET'>");
		out.println("Hall name:	<input type='text' name='hallName'> <br>");
		out.println("Location:	<input type='text' name='location'> <br>");
		out.println("No of days:	<input type='text' name='noOfDays'> <br>");
		out.println("<input type='submit' id='submit' value='proceed'>");
		out.println("</form></body></html>");
	
		
	}

	}

