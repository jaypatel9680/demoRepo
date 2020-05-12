package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {

		
		public static WebDriver driver;
		
		 
		public static  WebDriver getInstance() {
			
		String value="drivers/chromedriver";
		String key="webdriver.chrome.driver";
		
		System.setProperty(key,value);
		 driver=new ChromeDriver();
		 return driver;
		 
		 
	}

}
