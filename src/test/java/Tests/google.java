package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.baseClass;
import POM.cartSideBar;
import POM.clientData;
import POM.homePage;
import POM.loginForm;
import POM.mainBar;
import POM.registrationForm;

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
		// mainBar.openCart();
		// cartSideBar.close();
	}

	@Test(priority = 2)
	void regester() throws InterruptedException {
		Thread.sleep(10000);
		//mainBar.openRegistrationWindow();

		// clientData newClient = new clientData();
		// newClient.fullName = "abdelrahman hossam";
		// newClient.email = "abdelrahman@test.com";
		// newClient.phoneNumber = "01124393722";
		// newClient.password = "12345678";
		// newClient.passwordConfirmatiom = "12345678";
		// registrationForm.setRegistrationData(newClient);
		// registrationForm.agreeTerms();
		// registrationForm.clickRegister();
		// registrationForm.close();

		mainBar.openLoginWindow();
		loginForm.setLoginData("abdelrahman@test.com", "12345678");
		loginForm.clickLogin();
		//loginForm.close();

		
	}
}
