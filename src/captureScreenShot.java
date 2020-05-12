import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testBase.TestBase;
import utilities.TestUtility;

public class captureScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver dr = TestBase.getInstance();
		dr.get("http://newtours.demoaut.com/mercuryregister.php");
		
		TestUtility.screenShot();
		
		
		
		
	}

}
