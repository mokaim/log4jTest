package io.github.mokaim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDAOConnection {

	private static TestDAOConnection testDAOConnection;
	
	private TestDAOConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static TestDAOConnection getInstance() {
		if(testDAOConnection == null) {
			testDAOConnection = new TestDAOConnection();
		}
		
		return testDAOConnection;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("org.mariadb.jdbc.Driver");
		Connection con = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3333/mokaim",
                "root",
                "anstn132");
		
		return con;
	}

}
