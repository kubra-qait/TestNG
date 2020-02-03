package tatoc_Advanced_TestNG;

import java.io.IOException;


import org.openqa.selenium.WebDriver;

public class Abc_1  {
	
		void Task(WebDriver driver) throws IOException, InterruptedException {
		Task4_RestAssured t4 = new Task4_RestAssured();
		Task5_FIleHandle t5 = new Task5_FIleHandle();
			
		t4.restAssuredTask(driver);
		t5.fileHandlingTask(driver);
		
	}

}
