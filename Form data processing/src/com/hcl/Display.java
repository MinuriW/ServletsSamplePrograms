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
		String hallName = request.getParameter("hallName");
		String location = request.getParameter("location");
		String noOfDays = request.getParameter("noOfDays");;
		
		if(hallName.length()!= 0 && location.length()!=0 && noOfDays.length()!=0) {
		out.println("<html><body><center><h1>Hall details</h1>");
		out.println("<table><tr><td>Hall Name</td><td>"+hallName+"</td></tr>");
		out.println("<tr><td>Location</td><td>"+location+"</td></tr>");
		out.println("<tr><td>No of days</td><td>"+noOfDays+"</td></tr>");
		out.println("</table></center></body></html>");
		out.close();
		}
		else {
		out.println("<center><p style='color:red;' id='error'>Please enter all details</p></center>");
        request.getRequestDispatcher("Index").include(request, response);
		}
	}

	
}
