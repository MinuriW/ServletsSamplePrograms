package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
	        out.println("<html><body><center><h1>TextFair expo</h1>");
	        out.println("<table id='exhibition'><tr><td>Name</td><td>TextFair expo</td></tr>");
	        out.println("<tr><td>Hall Name</td><td>PVR Superplex</td></tr>");
	        out.println("<tr><td>Start Date</td><td>10-10-2020</td></tr>");
	        out.println("<tr><td>End date</td><td>10-10-2030</td></tr>");
	        out.println("</table></center></body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
