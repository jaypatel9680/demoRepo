import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import testBase.TestBase;
import utilities.TestUtility;

public class DropDownOption {

	public static void main(String[] args) throws IOException {
		
		WebDriver dr = TestBase.getInstance();
		dr.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
		WebElement drop = dr.findElement(By.xpath("//select[@name='country']"));
		TestUtility.scrollFunc(drop);
		Select s1=new Select(drop);
		
		s1.selectByIndex(22);
		//dr.close();
		
		TestUtility.screenShot();
		

	}

}
