import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
@WebServlet("/Index")
public class Index extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
       PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<meta charset=\"ISO-8859-1\">"
                + "<title>Insert title here</title>"
                + "</head>"
                + "<body>"
                + "   <h1>Ticket Booking for events</h1>"
                + "   <form action='TicketBooking' >"
                + "       Eneter the type of event(Stage show/Exhibition) : "
                + "       <input type='text' name='eventType'><br>"
                + "       <input type='submit' id='bookEvent' value='Book event'>"
                + "   </form>"
                + "</body>"
                + "</html>");    
       
    }
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }


}