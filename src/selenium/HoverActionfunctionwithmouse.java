package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverActionfunctionwithmouse {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
		
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
		driver.get("http://www.roicians.com/");
		//for mouse hover we have to create Actions Class object
		
		Actions action=new Actions(driver);// passing Action object to driver
		action.moveToElement(driver.findElement(By.linkText("Services"))).build().perform(); 
		//.build and .perform is used to implement action.
		//Thread.sleep(5000); //to add wait time
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Software Testing")).click(); 



	}

}
