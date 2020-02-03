package tatoc_Advanced_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task1_Hover {
	
	@Test (dependsOnGroups = "TatocAdvanced")
	public void hoverMenu(WebDriver driver) {

		Actions hoverMenu2 = new Actions(driver);
		hoverMenu2.moveToElement(driver.findElement(By.className("menutitle"))).perform();;
		driver.findElement(By.xpath("//span[text() = 'Go Next']")).click();
	}
}
