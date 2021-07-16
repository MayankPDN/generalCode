package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopuphandeling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();

	      driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	      driver.findElement(By.name("proceed")).click();
	      
	      Thread.sleep(5000);
	      
	      Alert xyz= driver.switchTo().alert(); // need to remember this 4 lines for  interview and to handle alert or pop-ups.
	      System.out.println(xyz.getText());
	      
	      String text= xyz.getText();
	      
	      if(text.equals("Please enter a valid user name")) {
	    	  System.out.println("Correct Alert message");
	      }
	      else { 
	    	  System.out.println("inCorrect Alert message");
	      }
	      xyz.accept();// to click on OK button on pop-up
	      // xyz.dismiss(); to click on cancell button on pop-up.
	      
	}

}
