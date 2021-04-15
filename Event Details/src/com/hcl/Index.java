package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Index extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><center><h1>Welcome To Events</h1>");
		out.println("<form action='Display' method='GET'><select name='option' id='option'><option value='Exhibition'>Exhibition</option><option value='StageShow'>StageShow</option></select>");
		out.println("<input type='submit' id='submit' value='Get Details'>");
		out.println("</form></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
