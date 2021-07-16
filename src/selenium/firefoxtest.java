package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxtest {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
	      FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.roicians.com/contact-us/");
		driver.findElement(By.name("your-name")).sendKeys("mayank");
		driver.findElement(By.name("your-email")).sendKeys("ayz@111");
		driver.findElement(By.name("your-message")).sendKeys(":)");
		driver.findElement(By.cssSelector(".your-subject > input:nth-child(1)")).sendKeys("info");
		driver.findElement(By.cssSelector(".wpcf7-submit")).click();
		
		Thread.sleep(5000); // this is to wait for 5 seconds after clicking on send.
		String actual = driver.findElement(By.cssSelector("html.wf-roboto-n3-active.wf-roboto-n4-active.wf-active body.page-template.page-template-page-templates.page-template-page_front-page.page-template-page-templatespage_front-page-php.page.page-id-76.siteorigin-panels.fully-background.sydney.siteScrolled div#page.hfeed.site div#content.page-wrap div.container.content-wrapper div.row div#primary.fp-content-area main#main.site-main div.entry-content div#pl-76.panel-layout div#pg-76-2.panel-grid.panel-has-style div.siteorigin-panels-stretch.panel-row-style.panel-row-style-for-76-2 div#pgc-76-2-0.panel-grid-cell div#panel-76-2-0-0.so-panel.widget.widget_black-studio-tinymce.widget_black_studio_tinymce.panel-first-child.panel-last-child div.panel-widget-style.panel-widget-style-for-76-2-0-0 div.textwidget div#wpcf7-f9-p76-o2.wpcf7 form.wpcf7-form.invalid p span.wpcf7-form-control-wrap.your-email span.wpcf7-not-valid-tip")).getText();
		
		System.out.println("Error received="+actual);
		
		String expected = " Error expected = email is not correct";
		System.out.println(expected);
		 
		if (actual.equals(expected)) {
			System.out.println("Test result : Pass");
			
		}
		else {
			System.out.println("Test result : Fail");
		}
			

	
	}
			
				
			
			
		
		
			
		
		
			
		

	
	}
		
	
		
		
		
		

	


