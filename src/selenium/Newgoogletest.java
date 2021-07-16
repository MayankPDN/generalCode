package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newgoogletest {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("mgmayankgohil@gmail.com");
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#password > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("password");
		driver.findElement(By.cssSelector(".VfPpkd-LgbsSe-OWXEXe-k8QpJ > div:nth-child(3)")).click();
		
		Thread.sleep(5000);
		String actual = driver.findElement(By.cssSelector(".OyEIQ > div:nth-child(2) > span:nth-child(1)")).getText();
		
		System.out.println(actual);
		
		String expected = " Wrong password. Try again or click Forgot password to reset it.";
		System.out.println(expected);
		
	}

}
