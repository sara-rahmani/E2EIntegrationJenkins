package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "/Users/sara/Downloads/chromedriver-mac-x64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Sara");
		driver.findElement(By.id("pass")).sendKeys("Sara");
		driver.quit();
	}
}
