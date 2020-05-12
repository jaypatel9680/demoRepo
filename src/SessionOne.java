import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testBase.TestBase;
import utilities.TestUtility;

public class SessionOne {

	public static void main(String[] args) {
		
		WebDriver dr = TestBase.getInstance();
		
	 	dr.get("https://www.toolsqa.com/");
		
		WebElement fn = dr.findElement(By.xpath("//a[text()='SpecFlow']"));
		TestUtility.scrollFunc(fn);
		TestUtility.clickFunc(fn);

		
		
	}

}
