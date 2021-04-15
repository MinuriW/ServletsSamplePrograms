package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Display")
public class Display extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String hallName = request.getParameter("name");
		String owner = request.getParameter("owner");
		String costPerDay = request.getParameter("costPerDay");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		out.println("<html><body><p>Halls within 30000.0</p><br>");
		
		//String hallname = myparser.
		
		out.println("<table id='hallDetails'><tr><th>Hall Name</th><th>Owner Name</th><th>Cost per day</th><th>Mobile no</th><th>Address</th></tr>");
		out.println("<tr><td>"+hallName+"</td><td>"+ owner + "</td><td>" + costPerDay + "</td><td>" + mobile + "</td><td>"+address+"</td></tr><br>");
		//out.println("<tr><th>Hall Name</th><th>Owner Name</th><th>Cost per day</th><th>Mobile no</th><th>Address</th></tr>");	
		out.println("</table></html>");
    }
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	}

}
