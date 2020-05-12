import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.xls_reader;

public class dataDrivernExcel {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		xls_reader reader=new xls_reader("/Users/jay/eclipse-workspace/SelenuimFirstProject/src/testBase/facebookData.xlsx");
		
		String firstname =reader.getCellData("Sheet1", "firstName", 2);
		System.out.println(firstname);
		
		String lastname =reader.getCellData("Sheet1", "lastName", 2);
		System.out.println(lastname);
		
		String email =reader.getCellData("Sheet1", "email", 2);
		System.out.println(email);
		
		String pass =reader.getCellData("Sheet1", "password", 2);
		System.out.println(pass);
		
		String month =reader.getCellData("Sheet1", "month", 2);
		System.out.println(month);
		
		String date =new String(reader.getCellData("Sheet1", "Date", 2));
		System.out.println(date);
		
		String year =reader.getCellData("Sheet1", "Year", 2);
		System.out.println(year);
		
		String gender =reader.getCellData("Sheet1", "gender", 2);
		System.out.println(gender);
		
		String value="drivers/chromedriver";
		String key="webdriver.chrome.driver";
		
		System.setProperty(key,value);
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pass);
		
		Select s1=new Select(driver.findElement(By.name("birthday_month")));
		s1.selectByVisibleText(month);

		Select s2=new Select(driver.findElement(By.name("birthday_day")));
		s2.selectByIndex(6);

		Select s3=new Select(driver.findElement(By.name("birthday_year")));
		s3.selectByValue("1992");
		
		WebElement s4 = driver.findElement(By.xpath("//input[@value='2']"));
		s4.click();
//		
		
	}

}
