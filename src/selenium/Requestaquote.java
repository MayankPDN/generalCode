package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Requestaquote {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.roicians.com/get-a-quote/");
		driver.findElement(By.cssSelector(".your-name > input:nth-child(1)")).sendKeys("mayank");
		driver.findElement(By.cssSelector(".wpcf7-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("checkbox-464")).click();
		
		driver.findElement(By.name("file-315")).sendKeys("‪‪C:\\xyz.txt");// upload file box element+path
//		driver.close(); // to close browser 

	}
//   	Select pick = new Select(month); // when use this DOB could not be entered.
//  	 pick.selectByVisibleText("Nov");
// 
//     Select pick1 = new Select(day);
//      pick.selectByVisibleText("1");
//     
//      Select pick2 = new Select(year);
//     pick.selectByVisibleText("1972");

}
