package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_001 {
// Add new comment here or here.
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		/**
		 * @wi.implements HomeAutomation2000/HA-601 Implementing Function D
		 */
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Pjotr");
		driver.quit();
		
	}
}