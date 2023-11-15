package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseClass {
	static WebDriver driver;

	
	public static void setup(String browser) {
		if (browser == "C")
			driver = new ChromeDriver();
		else if (browser == "F")
			driver = new FirefoxDriver();

		driver.get("https://aloha.com.eg/");
		driver.manage().window().maximize();
	}

	public static  WebDriver getDriver() {
		return driver;
	}

	@AfterTest
	public void close() {
		
		driver.quit();
		
	}

}
