import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;
import utilities.TestUtility;

public class RadioButtonandCheckBox {

	public static void main(String[] args) {
		
		WebDriver dr= TestBase.getInstance();
		dr.get("https://demoqa.com/automation-practice-form/");
		
		WebElement pt=dr.findElement(By.xpath("//input[@id='exp-1']"));
		TestUtility.scrollFunc(pt,dr);
		
		boolean b = pt.isSelected();
		System.out.println(b);
		
		if (b==false) {
			
			pt.click();
		}
	
		b= pt.isSelected();
		System.out.println(b);
		
		
		
		

	}

}
