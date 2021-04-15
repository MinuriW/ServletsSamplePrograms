import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet(urlPatterns = {"/Display"})
public class Display extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Cookie[] cookies = request.getCookies();
        out.println("<html><body><center><h1>Ticket booked successfully!!</h1>");
        out.println("<table id='ticketDetails' border='1'>");
        out.println("<tr><td>Ticket Type</td><td>" + cookies[0].getValue() + "</td></tr>");
        out.println("<tr><td>Number of tickets</td><td>" + cookies[1].getValue() + "</td></tr>");
        out.println("<tr><td>Ticket cost</td><td>" + cookies[2].getValue() + "</td></tr>");      
        out.println("</table></center></body></html>");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}