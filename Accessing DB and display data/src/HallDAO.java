import java.sql.*;
import java.util.*;
public class HallDAO {
    public  List<Hall> obtainHall(int id)
    {
        Connection con = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	List<Hall> list = new ArrayList<>();
    	try {
    		con = DBConnection.getConnection();
    		String query = "SELECT hall_booking.id,hall_booking.hall_name,hall_booking.start_date,hall_booking.end_date,hall_booking.price "
    							+ "FROM hall_booking,event WHERE event.id=? AND hall_booking.event_id=event.id";
    		pstmt = con.prepareStatement(query);
    		pstmt.setInt(1, id);
    		rs = pstmt.executeQuery();
    		while(rs.next()) {
    			Hall h = new Hall(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getDate(4), rs.getDouble(5));
    			list.add(h);
    		}
    	}catch(ClassNotFoundException e1){
    		e1.getStackTrace();
    	}catch(SQLException e2){
    		e2.getStackTrace();
    	}finally {   		
				try {
					if(con!=null)
						con.close();
					if(pstmt!=null)
						pstmt.close();
					if(rs!=null)
						rs.close();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}
    	}
    	return list;
    }   
}
