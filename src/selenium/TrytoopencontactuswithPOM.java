package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TrytoopencontactuswithPOM {

	public static void main(String[] args)  {
		

		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.roicians.com/contact-us/");
		CreatePOM obj=new CreatePOM(driver);
		obj.typeUsername("XYZ");
		obj.typeUseremail("xyz@gmail.com");
		obj.typeSubject("Prectice POM");
		obj.typeyourmessage("I can only copy from older codes, if have to write on my own then don't know were to start:)");
		obj.clickSend();
		
	
		 
	}

}
