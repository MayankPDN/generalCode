package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
	      
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.linkText("Create New Account")).click();
	      
//	      WebElement month = driver.findElement(By.id("month")); //import webelement 
//	      WebElement day  = driver.findElement(By.name("birthday_day"));
//	      WebElement year = driver.findElement(By.name("birthday_year"));
	      
	      List<WebElement> xyz= driver.findElements(By.xpath("//select[@id='Month']//option"));// option is child of select tab here
	      System.out.println(xyz.size());
	     
	      for(int i=0; i<xyz.size(); i++) { 
				String everymonth = xyz.get(i).getText();
				System.out.println(everymonth); //did not print month
	      }

	}

}
