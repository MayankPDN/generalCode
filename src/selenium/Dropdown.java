package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;






public class Dropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
	       driver=new ChromeDriver();
	      
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.linkText("Create New Account")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.name("firstname")).sendKeys("Mango");
	      driver.findElement(By.name("lastname")).sendKeys("coco");
	      driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
	      driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
	      driver.findElement(By.name("reg_passwd__")).sendKeys("H30NBHtt*");
	      
	      WebElement month = driver.findElement(By.id("month")); //import webelement 
	      WebElement day  = driver.findElement(By.name("birthday_day"));
	      WebElement year = driver.findElement(By.name("birthday_year"));
	      

	      		String dob = "Jan-10-2000";
      			String dobArr[]= dob.split("-");
      			
     	      SelectValueFromDropDown(month, dobArr[0]);
     	      SelectValueFromDropDown(day, dobArr[1]);    
     	      SelectValueFromDropDown(year,dobArr[2]);
    	      
	      //instead hard coded velue we can split date and create array and do not have to write select program everytime date change 
	      
	     }
	public static void SelectValueFromDropDown(WebElement element, String value) {// 
			Select select = new Select (element);// create new method for select like this out side of main method , split date as above and use string array
			select.selectByVisibleText(value);
			
			List<WebElement>	months = select.getOptions();
			System.out.println(months.size());
			int Totalmonths= months.size()-1;
			System.out.println("total months are:"+ Totalmonths);
			
			for(int i=0; i<months.size(); i++) { // wanted to print months only but days ,month and years are printed.
				String everymonth = months.get(i).getText();
				System.out.println(everymonth);
				if(everymonth.equals("Oct")) {
					months.get(i).click();
					break;// printed everything
				}
				
			}
			
		
	}
}
