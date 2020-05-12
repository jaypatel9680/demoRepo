import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testBase.TestBase;

public class alertPopup {

	public static void main(String[] args) {
		
		WebDriver driver=TestBase.getInstance();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert alert= driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept(); 
		
		

	}

}
