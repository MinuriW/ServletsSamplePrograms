import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Display")
public class Display extends HttpServlet {    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		HallDAO hallDao = new HallDAO();
		List<Hall> hallList = hallDao.obtainHall(id);
		out.println("<html><body><center><h1>Hall details</h1>");
		out.println("<table id='hall'><tr><th>Id</th><th>Name</th><th>Start Date</th><th>End Date</th><th>Price</th></tr>");
		for(Hall h:hallList) {
			out.println("<tr><td>"+h.getId()+"</td>");
			out.println("<td>"+h.getHallName()+"</td>");
			out.println("<td>"+h.getStartDate()+"</td>");
			out.println("<td>"+h.getEndDate()+"</td>");
			out.println("<td>"+h.getPrice()+"</td></tr>");
		}
		out.println("</table></center></body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}
}
