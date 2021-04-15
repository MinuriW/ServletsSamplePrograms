import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import dao.SeatingSectionDAO;
import domain.SeatingSection;
@WebServlet("/Index")
public class Index extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body><center><h1>BookMyShow</h1>");
        out.println("<form action='Confirm' method='GET'>");
        out.println("Select ticket type");
        out.println("<select name='seatType'>");
        out.println("<option value='1'>Platinum</option>");
        out.println("<option value='2'>Gold</option>");
        out.println("<option value='3'>Silver</option></select><br/>");
        out.println("Enter the number of ticket <input type='text' name='ticketCount'><br/>");
        out.println("<input type='submit' id='book' value='Book Ticket'>");
        out.println("</form></center></body></html>");
        out.close();        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}