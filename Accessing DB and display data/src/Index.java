import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/Index")
public class Index extends HttpServlet {
    private static final long serialVersionUID = 1L;         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		EventDAO eventDao = new EventDAO();
		int id = 0;
		List<Event> eventList = eventDao.obtainEvent();
		out.println("<html><body><center><h1>List of Events</h1>");
		out.println("<table id='event'><tr><th>Id</th><th>Name</th><th>Detail</th><th>Type</th><th>Organizer</th></tr>");
		for(Event e:eventList) {
			id = e.getId();
			out.println("<tr><td>"+id+"</td>");
			out.println("<td><a href='Display?id="+id+"'>"+e.getEventName()+"</a></td>");
			out.println("<td>"+e.getEventDetail()+"</td>");
			out.println("<td>"+e.getEventType()+"</td>");
			out.println("<td>"+e.getEventOrganizerName()+"</td></tr>");
		}
		out.println("</table></center></body></html>");
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

	}
}
