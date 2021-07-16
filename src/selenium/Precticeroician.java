package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Precticeroician {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
	      driver.get("https://www.roicians.com/contact-us/");
	      String titel=driver.getTitle();
	      System.out.print(titel);
// Navigate / browse command
	      
	      driver.navigate().to("https://www.yahoo.com");
	      
	      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(scrFile, new File("‪‪‪‪./screenshot/pick.png"));
			System.out.println("screenshot taken");
			
	      driver.navigate().back();
	     // driver.navigate().forward();
	      driver.navigate().refresh();
	      driver.getCurrentUrl();
	     // driver.getPageSource();
//Elements 
	      driver.findElement(By.name("your-name")).sendKeys("mayank");
	      driver.findElement(By.name("your-email")).sendKeys("ayz@.com");
			driver.findElement(By.name("your-message")).sendKeys(":)");
			driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-text']")).sendKeys("info");
			driver.findElement(By.cssSelector(".wpcf7-submit")).click();
	      Thread.sleep(5000); 
			String actual = driver.findElement(By.cssSelector("html.wf-roboto-n3-active.wf-roboto-n4-active.wf-active body.page-template.page-template-page-templates.page-template-page_front-page.page-template-page-templatespage_front-page-php.page.page-id-76.siteorigin-panels.fully-background.sydney.siteScrolled div#page.hfeed.site div#content.page-wrap div.container.content-wrapper div.row div#primary.fp-content-area main#main.site-main div.entry-content div#pl-76.panel-layout div#pg-76-2.panel-grid.panel-has-style div.siteorigin-panels-stretch.panel-row-style.panel-row-style-for-76-2 div#pgc-76-2-0.panel-grid-cell div#panel-76-2-0-0.so-panel.widget.widget_black-studio-tinymce.widget_black_studio_tinymce.panel-first-child.panel-last-child div.panel-widget-style.panel-widget-style-for-76-2-0-0 div.textwidget div#wpcf7-f9-p76-o2.wpcf7 form.wpcf7-form.invalid p span.wpcf7-form-control-wrap.your-email span.wpcf7-not-valid-tip")).getText();
			System.out.println(actual);
			
			String expected = "Empty Field";
			
			if (actual.equals("Empty Field")) {
	      
			System.out.println("Test case Passed");
	}
	else 
	{
		System.out.println("Test case Failed");
	}
	}
}
