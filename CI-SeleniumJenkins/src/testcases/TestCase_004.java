package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_004 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElementById("email").sendKeys("HolaHola");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
		
	}
}