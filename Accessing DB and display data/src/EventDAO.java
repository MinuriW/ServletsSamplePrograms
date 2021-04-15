import java.sql.*;
import java.util.*;
public class EventDAO  {
    public  List<Event> obtainEvent()
    {
        Connection con = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	List<Event> list = new ArrayList<>();
    	try {
    		con = DBConnection.getConnection();
    		stmt = con.createStatement();
    		String query = "SELECT * FROM event";   		
    		rs = stmt.executeQuery(query);
    		while(rs.next()) {
    			Event event = new Event(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
    			list.add(event);
    		}
    	}catch(ClassNotFoundException e1){
    		e1.getStackTrace();
    	}catch(SQLException e2){
    		e2.getStackTrace();
    	}finally {   		
				try {
					if(con!=null)
						con.close();
					if(stmt!=null)
						stmt.close();
					if(rs!=null)
						rs.close();
				} catch (SQLException e3) {
					e3.printStackTrace();
				}
    	}
    	return list;
    }   
}
