package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_002 {
	// Adding comment here to simulate update to code update
	@Test
	/**
	 * @wi.implements HomeAutomation2000/HA-554 Implementing Function A
	 */
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://��l��l�l.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
}