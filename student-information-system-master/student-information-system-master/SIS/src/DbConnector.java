import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DbConnector {
	
	public static Connection con = null;
	public static String url = "jdbc:mysql://localhost/sis?autoReconnect=true&useSSL=false";
	public static String user = "root";
	public static String password = "root";

	public static Connection Connector() {
		try {
			Driver d = new Driver();
			DriverManager.registerDriver(d);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		

	}

}
