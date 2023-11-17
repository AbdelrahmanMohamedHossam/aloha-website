package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.baseClass;
import POM.cartSideBar;
import POM.homePage;
import POM.mainBar;

public class google extends baseClass {

	@BeforeTest
	void setup() {
		// for google chrome initialization set in setup function "C"
		// for firefox initialization set in setup function "F"

		baseClass.setup("F");
	}

	@Test(priority = 1)
	void search() {
		mainBar.changeLanguage("en");
		// mainBar.navToTap("Brands");
		// mainBar.navToHome();
		// mainBar.openCategory("Supermarket");

		// mainBar.openSubCategory("Supermarket", "Breakfast");
		//mainBar.openCart();
		//cartSideBar.close();
		mainBar.openRegesterationWindow();
	}
}
