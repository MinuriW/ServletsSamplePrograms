package com.hcl;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

//have to use (http://localhost:8007/HelloServ/hello)

@WebServlet("/hello")
public class Helloserv extends HttpServlet {

	public void init(ServletConfig config) throws ServletException{
		System.out.println("Servlet is being initialized...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("Service is called...");
		out.println("<html><body><h1>Hello! How are you?</h1></body></html>");
		out.close();
		
	}
	
	public void destroy() {
		System.out.println("Servlet destroyed...");
	}


}
