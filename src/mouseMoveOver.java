import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


import testBase.TestBase;

public class mouseMoveOver {
	
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver=TestBase.getInstance();
		
		driver.get("https://www.scotiabank.com/ca/en/personal.html");
		
		Actions actions= new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[@id='nav-item-1']"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Canada Deposit Insurance Corporation")).click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
