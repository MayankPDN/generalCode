package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreatePOM {
	
	WebDriver driver; // declare webdriver 
	By Name=By.name("your-name"); // declare objects
	By Email=By.name("your-email");
	By Subject=By.name("your-subject");
	By Yourmessage=By.name("your-message");
	By Send=By.cssSelector(".wpcf7-submit");

	public  CreatePOM(WebDriver driver) { // methods are being created with public

		this.driver=driver; // this is used to say which driver to use
		}
		public void typeUsername(String username) {
			driver.findElement(Name).sendKeys(username);}
		
		public void typeUseremail(String email) {
			driver.findElement(Email).sendKeys(email);}
		
		public void typeSubject(String subject) {
			driver.findElement(Subject).sendKeys(subject);}
		
		public void typeyourmessage(String message) {
			driver.findElement(Yourmessage).sendKeys(message);}
		
		public void clickSend() {
			driver.findElement(By.cssSelector(".wpcf7-submit")).click();}
			
}
