import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

 

@WebServlet("/TicketBooking")
public class TicketBooking extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        PrintWriter out = response.getWriter();
        String eventType = request.getParameter("eventType");

        out.println("<!DOCTYPE html>"
                    + "<html>"
                    + "<head>"
                    + "<meta charset=\"ISO-8859-1\">"
                    + "<title>Insert title here</title>"
                    + "</head>"
                    + "<body>"
                    + "   <h1>Welcome to "+eventType+"</h1>"
                    + "    <form method='GET' action='Display'>"
                    + "       Select seat type : "
                    + "       <select name='type' id='type'>"
                    + "           <option value='Platinum'>Platinum</option>"
                    + "           <option value='Gold'>Gold</option>"
                    + "           <option value='Silver'>Silver</option>"
                    + "       </select><br>"
                    + "       Eneter the no. of tickets "
                    + "       <input type='text' name='tickets'><br>"
                    + "     <input type='hidden' name='eventType' value='"+eventType+"'><br>"
                    + "       <input type='submit' id='getCost' value='Get amount'>"
                    +" </form>"
                    + "</body>"
                    + "</html>");    
//        }
        
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

 

}