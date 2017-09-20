package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_003 {

	@Test
	public void testcase1()
	{
		/**
		 * @wi.implements HomeAutomation2000/HA-430 It should say facebook
		 */
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("h4j");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
}