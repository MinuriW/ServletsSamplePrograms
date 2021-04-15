package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StageShow")
public class StageShow extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		    out.println("<html><body><center><h1>New Year Eve</h1>");
	        out.println("<table id='stageShow'><tr><td>Name</td><td>New Year Eve</td></tr>");
	        out.println("<tr><td>Hall Name</td><td>PVR Lulu Mall</td></tr>");
	        out.println("<tr><td>Date</td><td>10-10-2020</td></tr>");
	        out.println("<tr><td>Start Time</td><td>10:00:00</td></tr>");
	        out.println("<tr><td>End Time</td><td>12:00:00</td></tr>");
	        out.println("</table></center></body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
