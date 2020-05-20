import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.xls_reader;

public class dataDrivernExcel {

	public static void main(String[] args) {
		
		WebDriver driver;
		String value="drivers/chromedriver";
		String key="webdriver.chrome.driver";
		
		System.setProperty(key,value);
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[@role='button' and @class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		WebElement fname=driver.findElement(By.name("firstname"));
		WebElement lname=driver.findElement(By.name("lastname"));
		WebElement emai=	driver.findElement(By.name("reg_email__"));
		WebElement pas=	driver.findElement(By.name("reg_passwd__"));
		Select s1=new Select(driver.findElement(By.name("birthday_month")));
		Select s2=new Select(driver.findElement(By.name("birthday_day")));
		Select s3=new Select(driver.findElement(By.name("birthday_year")));
		WebElement s4 = driver.findElement(By.xpath("//input[@value='2']"));
		
		
		xls_reader reader=new xls_reader("/Users/jay/eclipse-workspace/SelenuimFirstProject/src/testBase/facebookData.xlsx");
		
		int rowCount=reader.getRowCount("Sheet1");
	
		
		for (int i = 2; i <= rowCount ; i++) {
			
			System.out.println("=======================");
		
		
		String firstname =reader.getCellData("Sheet1", "firstName", i);
		System.out.println(firstname);
		
		String lastname =reader.getCellData("Sheet1", "lastName", i);
		System.out.println(lastname);
		
		String email =reader.getCellData("Sheet1", "email", i);
		System.out.println(email);
		
		String pass =reader.getCellData("Sheet1", "password", i);
		System.out.println(pass);
		
		String month =reader.getCellData("Sheet1", "month", i);
		System.out.println(month);
		
		String date =new String(reader.getCellData("Sheet1", "Date", i));
		System.out.println(date);
		
		String year =reader.getCellData("Sheet1", "Year", i);
		System.out.println(year);
		
		String gender =reader.getCellData("Sheet1", "gender", i);
		System.out.println(gender);
		
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		emai.sendKeys(email);
		pas.sendKeys(pass);
		s1.selectByVisibleText(month);
		s2.selectByVisibleText(date);
		s3.selectByVisibleText(year);;
		s4.click();
		
		
		}
		
	
		
		
		
		
		

		
	
		
}

}
