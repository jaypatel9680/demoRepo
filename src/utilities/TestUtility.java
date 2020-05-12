package utilities;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;




public class TestUtility{
	
	private static WebDriver dr;
		
	public static void scrollFunc(WebElement e) { 
		
		JavascriptExecutor je=(JavascriptExecutor) dr;
	//	je.executeScript("arguments[0].scrollIntoView(false);",e);
		je.executeScript("Windows.scrollBy(0,400);","");
	}
	public static void clickFunc(WebElement a) {
		
	JavascriptExecutor je=(JavascriptExecutor) dr;
	je.executeScript("arguments[0].click();",a);
}
	public static void screenShot() throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot) dr;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("images.jpg"));
		
	}
}