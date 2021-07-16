package selenium;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeaScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver(); 
	      
		driver.get("http://www.roicians.com/");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scrFile, new File("‪‪.//screenshot/screen.png"));
		
//		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver
//		FileUtils.copyFile(scrFile, new File("‪‪C:\\Users\\Mayank Gohil\\eclipse-workspace\\Website\\src\\screenshots")); //Add throw declaration

	// take screenshot//

	}

}
