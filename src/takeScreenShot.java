import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testBase.TestBase;

public class takeScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=TestBase.getInstance();
		
		driver.get("https://www.google.com");
		
		TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
		
		File file=takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File("/Users/jay/eclipse-workspace/SelenuimFirstProject/google.png")); 
		

	}

}
