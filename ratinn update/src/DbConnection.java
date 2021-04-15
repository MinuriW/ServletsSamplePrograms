import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class DbConnection {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {        
        ResourceBundle rb = ResourceBundle.getBundle("oracle");
        String url = rb.getString("db.url");
        String user = rb.getString("db.username");
        String pass = rb.getString("db.password");
       
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;
    }
}