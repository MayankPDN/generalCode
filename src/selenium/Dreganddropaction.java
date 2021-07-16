package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dreganddropaction {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
		
		WebDriver  driver=new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		Actions action=new Actions(driver);
		driver.switchTo().frame(0); //only if frame is there
		
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		

	}

}
