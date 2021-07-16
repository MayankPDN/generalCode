package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayedfunction {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		Boolean a= driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(a);
		
	      driver.navigate().to("https://www.ebay.ca/");
	      Boolean x= driver.findElement(By.id("gh-Alerts-i")).isDisplayed(); 
	      //verified bell icon is on page.
	      System.out.println(x); // prints boolean value true or false.
	      
	      // isEnabled() method:
	     boolean b= driver.findElement(By.id("gh-btn")).isEnabled();
	     System.out.print(b);//verify if search option is enabled or disabled on application.
	     
	     driver.findElement(By.cssSelector("#gh-ug > a:nth-child(1)")).click();
	     
	     boolean c = driver.findElement(By.id("kmsi-checkbox")).isSelected();
	     System.out.print(c);// verify if female option is selected or not.
	     
	      
	

	
	

	
	}

}
