import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class navigation {

	public static void main(String[] args) {
		
		WebDriver driver=TestBase.getInstance();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}

}
