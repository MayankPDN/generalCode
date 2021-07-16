package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      
		
		WebDriver driver=new FirefoxDriver();

		WebDriverWait wait = new WebDriverWait(driver, 100);
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&amp%3Bservice=mail&amp%3Bsacu=1&amp%3Brip=1&amp%3BflowName=GlifWebSignIn&amp%3BflowEntry=ServiceLogin&quot&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			
			driver.findElement(By.id("identifierId")).sendKeys("dummytesting48");
			driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			driver.findElement(By.name("password")).sendKeys("roicians");
			driver.findElement(By.cssSelector("#passwordNext >span:nth-child(3) >span:nth-child(1)")).click();
	
	}

}
