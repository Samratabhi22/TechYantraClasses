package TyssHomework;

import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectDatabase {

	public static void main(String[] args) {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", null, null)

	}

}
