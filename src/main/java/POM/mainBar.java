package POM;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mainBar {

	static WebElement getBarElement() {
		return baseClass.getDriver().findElement(By.id("st-sc"));
	}

	static WebElement getAllCategoriesElement() {
		return getBarElement().findElement(By.cssSelector("div[class=navbar_all-categories-tab]"));
	}

	public static void changeLanguage(String newLang) {

		WebElement languageButton = getBarElement().findElement(By.cssSelector("div[class = lang]"));
		WebElement parent = languageButton.findElement(By.xpath(".."));

		String lang = parent.getAttribute("hreflang");

		if (lang.equals(newLang))
			languageButton.click();
		else if (lang.equals(null))
			System.out.println("=================>>>>> there is no languages in this div");
		else
			System.out.println("=================>>>>> the current language is already " + newLang);

	}

	public static void navToHome() {
		WebElement logo = getBarElement().findElement(By.cssSelector("div[class = 'col-lg-2 col-4 logo-tab']"));
		logo.click();
	}

	public static void navToTap(String tapName) {
		WebElement brandsButton = getBarElement().findElement(By.xpath("//a[text()='" + tapName + "']"));
		brandsButton.click();
	}

	public static void openCategory(String categoryName) {
		baseClass.hoverOn(getAllCategoriesElement());
		getAllCategoriesElement().findElement(By.xpath("//a[text()='" + categoryName + "']")).click();

	}

	public static void openSubCategory(String mainCategoryName, String subName) {

		baseClass.hoverOn(getAllCategoriesElement());
		baseClass.hoverOn(getAllCategoriesElement().findElement(By.xpath("//a[text()='" + mainCategoryName + "']")));

		getAllCategoriesElement().findElement(By.xpath("//a[text()='" + subName + "']")).click();

	}

	public static void openCart() {

		baseClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getBarElement().findElement(By.cssSelector("div[class='col-3 Cart-tab']")).click();
	}

	public static void openRegesterationWindow()
	{
		getBarElement().findElement(By.cssSelector("div[class='register-box']")).click();
	}
	
}
