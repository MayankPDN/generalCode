package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCexampleForSelectCommand {

	public static void main(String[] args) throws SQLException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
		 driver=new ChromeDriver();
   
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.kitchenerminorbaseball.ca/");
		
		//step 1: create connection to database , code will not work as no correct info abput host /port /uername and password
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		//step 2: create statement to query
		
		Statement stmt= con.createStatement();
		
		// step 3: execute sql query with select to pull data from database.
		String s="select username,password from users" ;
//		String s="update users set uname='mer2' where userid=102" ;
//		String s="delete users where userid=102";
//		stmt.executeQuery(s)	;
		
		//Step 4: pulled data will be stored in Result set when using select command 
		
		ResultSet rs=stmt.executeQuery(s);
		
		//while loop for that data to get from ResitSet and then print or enter in application
		
		while (rs.next())
		{
			String username= rs.getString("username");
			String password= rs.getString("password");
//			System.out.println(username);
//			System.out.println(password);
			
			// example of login test case using data from database
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a flight:Mercury Tours:"))
			{
				System.out.println("testcase pass");
			}
			else 
			{
				System.out.println("Test has failed");
			}
			
		}
				
		// step 5: close connection
				
				con.close();
				
				System.out.println("Query is executed");
		
	}

}
