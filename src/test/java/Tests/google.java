package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.baseClass;
import POM.homePage;
import POM.mainBar;

public class google extends baseClass {

	@BeforeTest
	void setup() {
		// for google chrome initialization set in setup function "C"
		// for firefox initialization set in setup function "F"
		
		baseClass.setup("C");
	}
	@Test(priority = 1)
	void search()
	{
		mainBar.changeLanguage("en");
		mainBar.navToTap("Brands");
		mainBar.navToHome();
	}
}
