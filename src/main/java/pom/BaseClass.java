package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	static public ChromeDriver driver = new ChromeDriver();

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

	public static WebDriver getWebDriver() {

		return driver;
	}

}
