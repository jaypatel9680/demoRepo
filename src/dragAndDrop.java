import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import testBase.TestBase;

public class dragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver=TestBase.getInstance();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);	//switch to frame when it present (right click and check if frame is present page source)
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
		
		

	}

}
