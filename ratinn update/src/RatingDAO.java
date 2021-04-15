import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RatingDAO {

	public void update(String name, int value) {
		Connection con=null;
		ResultSet rs=null;
		PreparedStatement ps=null;
		
		try {
			con=DbConnection.getConnection();
			String query="update event set value=? where name=?";
			
			ps = con.prepareStatement(query);
			ps.setInt(1,value);
			ps.setString(2,name);
			ps.executeUpdate();
		
		}
		catch(ClassNotFoundException ce) {ce.printStackTrace();}
		
		catch(SQLException se) {se.printStackTrace();}
		
		finally {
			try {
				if(ps!=null){
					ps.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(con!=null) {
					con.close();
				}
				}catch(SQLException se) {se.printStackTrace();}
			}
		}
	
	 public ArrayList<Rating> list(){
	        ArrayList<Rating> ratingList = new ArrayList<Rating>();
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;
	        
	        
	        try {
	            con = DbConnection.getConnection();
	            st = con.createStatement();
	            String query = "select * from rating";
	            rs = st.executeQuery(query);
	            
	            while(rs.next()) {
	                Rating rating = new Rating(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
	                ratingList.add(rating);
	            }
	            
	        }catch(ClassNotFoundException e) {
	            e.printStackTrace();
	        }catch(SQLException e) {
	            e.printStackTrace();
	        }finally {
	            try {
	                if(con!=null) {
	                    con.close();
	                }if(st!=null) {
	                    st.close();
	                }if(rs!=null) {
	                    rs.close();
	                }
	                
	            }catch(SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return ratingList;
	    }
	}