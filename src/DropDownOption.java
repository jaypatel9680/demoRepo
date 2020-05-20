import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import testBase.TestBase;
public class DropDownOption{

	public static void main(String[] args) throws IOException {
		
		WebDriver dr = TestBase.getInstance();
		dr.get("http://newtours.demoaut.com/mercuryregister.php");
		
		WebElement country = dr.findElement(By.xpath("//select[@name='country']"));
		
		//WebElement drop = dr.findElement(By.xpath("//select[@name='country']"));
		//TestUtility.scrollFunc(drop,dr);
		Select s1=new Select(country);
		
		List<WebElement> list=s1.getOptions();
		
		System.out.println((list.size()));
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
		}
		
		
		
		
		//s1.selectByIndex(42);
		
	//	TestUtility.screenShot("Dro2pDown Menu",dr);
		
		dr.close();


	}

}
