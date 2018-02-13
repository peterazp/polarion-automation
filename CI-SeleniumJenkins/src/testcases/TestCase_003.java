package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_003 {
	// Changing code by adding a comment here
	@Test
	public void testcase1()
	{
		/**
		 * @wi.implements HomeAutomation2000/HA-606 Testing RT
		 */
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("h4j");
		driver.findElementById("pass").sendKeys("Helo");
		driver.quit();
	
		
	}
}