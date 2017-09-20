package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_002 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		/**
		 * @wi.implements HomeAutomation2000/HA-440 It should say facebook
		 */
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("Holla");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
}