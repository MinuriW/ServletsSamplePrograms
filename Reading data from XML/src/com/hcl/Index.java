package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Index")
public class Index extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>User Details</h1><br>");
		out.println("<form action='Display' method='GET'>");
		out.println("Enter the hall budget per day: <input type='text' name='hallBudget'>");
		out.println("<input type='submit' id='getHalls' value='Get Halls'>");
		out.println("</form></body></html>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
	
	}

}
