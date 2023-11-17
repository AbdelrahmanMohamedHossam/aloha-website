package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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

	public static WebDriver getDriver() {
		return driver;
	}

	public static void hoverOn(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

//	@AfterTest
	public void close() {

		driver.quit();

	}

}
