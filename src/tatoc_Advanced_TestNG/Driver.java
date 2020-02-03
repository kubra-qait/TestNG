package tatoc_Advanced_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Driver {
	  
	static WebDriver driver;
	@Parameters ("browser")
	@BeforeTest 
	public  void setDriver(String browser) {
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kubraabbas\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\kubraabbas\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	@Parameters ("browser")
	@Test (groups = {"TatocAdvanced"})
	public void launchTatocAdvancedCourse() {
		driver.get("http://10.0.1.86/tatoc");
		driver.findElement(By.xpath("//a[text() = 'Advanced Course']")).click();
	}	
	
//	@AfterTest
//	public static void closeDriver() {
//		driver.quit();
//	}
}


