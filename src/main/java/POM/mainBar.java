package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mainBar {

	static WebElement getBarElement() {
		return baseClass.getDriver().findElement(By.id("st-sc"));
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
}
