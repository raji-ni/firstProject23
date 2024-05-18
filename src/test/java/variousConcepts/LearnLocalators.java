package variousConcepts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocalators {

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunil\\eclipse-workspace\\Selenium\\Ses2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@Test
	public void testLocators() {

	}

}
