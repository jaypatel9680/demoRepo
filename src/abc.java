import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.xls_reader;

public class abc {
	
	public static void main(String[] args) {
		
	
	WebDriver driver;
	
	String value="drivers/chromedriver";
	String key="webdriver.chrome.driver";
	
	System.setProperty(key,value);
	
	driver=new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/");
	
	WebElement username=driver.findElement(By.id("Email"));
	WebElement pasElement=driver.findElement(By.id("Password"));
	
	
	xls_reader filleReader=new xls_reader("/Users/jay/eclipse-workspace/SelenuimFirstProject/src/testBase/facebookData.xlsx");
	
	int rowCount=filleReader.getRowCount("login");
	
	for (int i = 2; i < rowCount; i++) {
		
	String user=filleReader.getCellData("login", "UserName", i);
	String password=filleReader.getCellData("login", "Pass", i);
	
	username.clear();
	username.sendKeys(user);
	pasElement.clear();
	pasElement.sendKeys(password);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
	}
	
}