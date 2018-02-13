package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_002 {
	// Adding comment here to simulate update to code update  n
	@Test
	/**
	 * @wi.implements HomeAutomation2000/HA-554 Implementing Function A
	 */
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		/**
		 * @wi.implements HomeAutomation2000/HA-604 Implementing WebApp Function E
		 */
		/**
		 * @wi.implements HomeAutomation2000/HA-605 Implementing WebApp Function E
		 */
		driver.get("http://äöläöläl.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
}