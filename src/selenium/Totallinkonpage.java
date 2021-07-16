package selenium;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Totallinkonpage {

	
		public static void main(String[] args) throws InterruptedException    {
			
			System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();

			driver.get("https://www.walmart.ca/en");
			
			 List<WebElement> abc= driver.findElements(By.tagName("a")); // a if for links on website and will give total number of link.
			 List<WebElement> xyz= driver.findElements(By.tagName("button"));
			 List<WebElement> xxz= driver.findElements(By.tagName("tag"));
		
			 System.out.println(abc.size()); // this is to print that number. 
			 //System.out.println(xyz.size());
			 //System.out.println(xxz.size());
			 
			 for(int i=0; i<abc.size(); i++) { //loop to get all number of link
				 String xxx=abc.get(i).getText();//  this is to make it  String value
				 System.out.println(xxx);// this is to print all links form website.
			 }
	}

}
