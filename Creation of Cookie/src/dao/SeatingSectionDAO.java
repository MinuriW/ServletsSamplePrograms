package dao;
import java.util.*;
import java.sql.*;
import domain.SeatingSection;
public class SeatingSectionDAO {
    public List<SeatingSection> getSeatingSectionList()
    {
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<SeatingSection> list = null;
        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();
            String query = "SELECT * FROM seating_section";         
            rs = stmt.executeQuery(query);
            list = new ArrayList<>();
            while(rs.next()) {
                SeatingSection seatingSection = new SeatingSection(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                list.add(seatingSection);
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