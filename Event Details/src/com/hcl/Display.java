package com.hcl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String option = request.getParameter("option");

		if (option.equals("Exhibition")) {
			out.println("<html><body><center><h1>Stall details</h1>");
			out.println("<table><tr><th>Stall Name</th><th>Minimum Price</th><th>Owner Name</th></tr>");
			out.println("<tr><td>PrintArt</td><td>2500</td><td>John</td></tr>");
			out.println("<tr><td>FashionCutz</td><td>2000</td><td>Sandra</td></tr>");
			out.println("<tr><td>ToeRinger</td><td>3000</td><td>Maria</td></tr>");
			out.println("</table></center></body></html>");
			
		} else if (option.equals("StageShow")) {
			out.println("<html><body><center><h1>Stage show details</h1>");
			out.println("<table><tr><th>Seat Type</th><th>Ticket Cost</th><th>Available Seats</th></tr>");
			out.println("<tr><td>platinum</td><td>300</td><td>15</td></tr>");
			out.println("<tr><td>gold</td><td>250</td><td>25</td></tr>");
			out.println("<tr><td>silver</td><td>200</td><td>55</td></tr>");
			out.println("</table></center></body></html>");
			
		}
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
