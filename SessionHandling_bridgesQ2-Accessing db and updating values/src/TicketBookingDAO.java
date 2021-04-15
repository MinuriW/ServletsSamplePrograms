import java.sql.*;

public class TicketBookingDAO {
    public List<TicketBooking> getTicketBookingDetails() 
    {
     Connection con = null;
     Statement stmt= null;
     ResultSet rs = null;
     
     List<TicketBooking> list= new ArrayList<>();
     try {
    	 con=DBConnection.getConnection();
    	 stmt = con.createStatement();
    	 String query = "SELECT * FROM "
     }
    }
    public boolean bookTicket(int seatingType,int ticketCount)  
    {
                          //fill your code here
    }
    
}
