import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.*;
import dao.SeatingSectionDAO;
import domain.SeatingSection;
@WebServlet(urlPatterns = {"/Confirm"})
public class Confirm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body><center><h1>Ticket Confirmation</h1><br/>");
        SeatingSectionDAO sDao = new SeatingSectionDAO();
        List<SeatingSection> list = sDao.getSeatingSectionList();
        Double cost = 0.0;
        String ticketTypeNo = request.getParameter("seatType");
        String ticketTypeName = null;
        if(ticketTypeNo.equals("1")){
            ticketTypeName = "Platinum";
        }else if(ticketTypeNo.equals("2")){
            ticketTypeName = "Gold";
        }else{
            ticketTypeName = "Silver";
        }
        int noOfTickets = Integer.parseInt(request.getParameter("ticketCount"));
        for(SeatingSection s:list){
            if(s.getSeatingType().equals(ticketTypeName)){
                cost = s.getTicketCost()*noOfTickets;
            }
        }
        Cookie c1 = new Cookie("ticketTypeName", ticketTypeName);
        Cookie c2 = new Cookie("noOfTickets", Integer.toString(noOfTickets));
        Cookie c3 = new Cookie("cost", Double.toString(cost));
        response.addCookie(c1);
        response.addCookie(c2);
        response.addCookie(c3);
        out.println("<div>The ticket cost is " + cost + "</div><br/><br/>");
        out.println("Do you want to confirm your ticket?");
        out.println("<form action='Display' method='GET'>");
        out.println("<input type='submit' id='confirm' value='Confirm'>");
        out.println("</form>");
        out.println("<form action='Index' method='GET'>");
        out.println("<input type='submit' id='cancel' value='Cancel'>");
        out.println("</form></center></body></html>");
        out.close();
    }  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}