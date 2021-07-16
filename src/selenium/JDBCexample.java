package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCexample {

	public static void main(String[] args) throws SQLException {
		
		//step 1: create connection to database , code will not work as no correct info abput host /port /uername and password
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		//step 2: create statement to query
		
		Statement stmt= con.createStatement();
		
		// step 3: execute sql query
		String s="insert into users value(105,'mercury5','mercury5')" ;
				stmt.executeQuery(s);
				
		// step 4: close connection
				
				con.close();
				
				System.out.println("Query is executed");
		
	}

}
