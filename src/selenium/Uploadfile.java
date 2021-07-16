package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();

	      driver.get("http://html.com/input-type-file/");
	      
	      driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Mayank Gohil\\Desktop\\Capture.JPG");
	}

}
