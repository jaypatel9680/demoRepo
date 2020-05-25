import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class DyanamicElements {
	
public static void main(String[] args) throws IOException {
		
		WebDriver dr = TestBase.getInstance();
		
		dr.get("https://www.google.com/");
		
		
		dr.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("test");
		
		List<WebElement> list = dr.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbtc']/div/span"));
		int a= list.size();
		System.out.println(a);
		
//		for (int i = 0; i < listofList.size(); i++) {
//			System.out.println(listofList.get(i).getText());
//			
//		}
		
	//	dr.close();
} 



}

