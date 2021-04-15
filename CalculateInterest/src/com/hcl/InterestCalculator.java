package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterestCalculator
 */
@WebServlet("/interest")
public class InterestCalculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String amount = request.getParameter("amount");
		String time = request.getParameter("time"); 
		String rate = request.getParameter("rate"); 
		double interest = (Double.parseDouble(amount)*Double.parseDouble(time)*Double.parseDouble(rate))/100;
		
		out.println("<html><body><center>Interest info<h1></h1><hr>");
		out.println("<p>Amount:	Rs."+amount+"</p>");
		out.println("<p>Time:	"+time+"</p");
		out.println("<p>Rate:	"+rate+"</p>");
		out.println("<p>Interest Amount: Rs."+ String.format("%.2f", interest)+"</p>");
		out.println("</body></html>");
		out.close();
	
	}


}
