package io.github.mokaim;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDAO {

	private static TestDAO testDAO;
	private TestDAOConnection testDAOConnection = TestDAOConnection.getInstance();
	ResultSet rs;
	PreparedStatement pstmt;
	Connection con;
	StringBuffer query;
	
	private TestDAO() {
		
	}
	
	public static TestDAO getInstance() {
		
		if(testDAO == null) {
			testDAO = new TestDAO();
		}
		
		return testDAO;
	}
	
	public synchronized int testUpdate() throws ClassNotFoundException, SQLException {
		
		query = new StringBuffer();
		query.append("SELECT * FROM memberList");
		
		con = testDAOConnection.getConnection();
		pstmt = con.prepareStatement(query.toString());
		rs = pstmt.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getString(1));
		}
		
		return 1;
	}
	
	

}
